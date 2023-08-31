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
            System.out.println("---------------");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            var f = new Fecha();
            f.setYear(2020);
            System.out.println(f);
            System.out.println(Integer.toBinaryString((int )f.getData()));
            System.out.println("---------------");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            var f = new Fecha();
            int prevMont = f.getMonth();
            f.setMonth(2);
            System.out.println(f);
            System.out.println(Integer.toBinaryString(f.getData()));
            System.out.println("---------------");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            var f = new Fecha();
            f.setDay(29);
            System.out.println(f);
            System.out.println(Integer.toBinaryString(f.getData()));
            System.out.println("---------------");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            var f = new Fecha();
            f.setYear(2021);
            System.out.println(f);
            System.out.println(Integer.toBinaryString(f.getData()));
            System.out.println("---------------");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            var hoy = new Fecha(2023, 8, 31);
            System.out.println(hoy);
            System.out.println(Integer.toBinaryString(hoy.getData()));
            System.out.println("---------------");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            var hoy = new Fecha(2023, 2, 29);
            System.out.println(hoy);
            System.out.println(Integer.toBinaryString(hoy.getData()));
            System.out.println("---------------");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
