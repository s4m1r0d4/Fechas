/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fechas;

import FechaUtil.Fecha;

/**
 *
 * @author rc
 */
public class Fechas
{

    public static void main(String[] args)
    {

        try {
            var f = new Fecha();
            System.out.println(f);
            System.out.println(Integer.toBinaryString(f.getData()));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("---------------");
        }

        try {
            var f = new Fecha();
            f.setYear(2020);
            System.out.println(f);
            System.out.println(Integer.toBinaryString((int )f.getData()));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("---------------");
        }
        
        try {
            var f = new Fecha();
            int prevMont = f.getMonth();
            f.setMonth(2);
            System.out.println(f);
            System.out.println(Integer.toBinaryString(f.getData()));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("---------------");
        }
        
        try {
            var f = new Fecha();
            f.setDay(29);
            System.out.println(f);
            System.out.println(Integer.toBinaryString(f.getData()));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("---------------");
        }
        
        try {
            var f = new Fecha();
            f.setYear(2021);
            System.out.println(f);
            System.out.println(Integer.toBinaryString(f.getData()));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("---------------");
        }
        
        try {
            var hoy = new Fecha(2023, 8, 31);
            System.out.println(hoy);
            System.out.println(Integer.toBinaryString(hoy.getData()));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("---------------");
        }
        
        try {
            var hoy = new Fecha(2023, 2, 29);
            System.out.println(hoy);
            System.out.println(Integer.toBinaryString(hoy.getData()));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("---------------");
        }
        
        try {
            short data = 0;
            int iota = 0;
            var hoy = java.time.LocalDate.now();
            
            data |= hoy.getDayOfMonth() << iota;
            iota += 5;
            
            data |= hoy.getMonth().ordinal() << iota;
            iota += 4;
            
            data |= (hoy.getYear() - 1950) << iota;
            
            var f = new Fecha(data);
            System.out.println(f);
            System.out.println(Integer.toBinaryString(f.getData()));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("---------------");
        }

    }
}
