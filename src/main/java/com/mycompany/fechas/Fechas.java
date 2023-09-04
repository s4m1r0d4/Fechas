/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fechas;

import FechaUtil.Fecha;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rc
 */
public class Fechas
{
    static Scanner scanner;

    public static void main(String[] args)
    {

        scanner = new Scanner(System.in);
        System.out.print("Número de fechas: ");
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            solve();
        }
        

    }
    
    public static void solve()
    {
        System.out.print("Ingresa una fecha comprimida: ");
        short data = (short) scanner.nextInt();
        try {
            var f = new Fecha(data);
            System.out.println(f);
        } catch (Exception ex) {
            Logger.getLogger(Fechas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
