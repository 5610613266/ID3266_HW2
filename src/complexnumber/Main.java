/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package complexnumber;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter complex number : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.print("Enter complex number : ");
        int c = scan.nextInt();
        int d = scan.nextInt();
        
        ComplexNumber m = new ComplexNumber(a,b);
        ComplexNumber n = new ComplexNumber(c,d);
        
        System.out.println("Real part of complex number 1 is : " +m.getRealPart());
        System.out.println("Real part of complex number 2 is : " +n.getRealPart());
        
        System.out.println("Imaginary part of complex number 1 is : " +m.getImaginaryPart());
        System.out.println("Imaginary part of complex number 2 is : " +n.getImaginaryPart());
        
        ComplexNumber o = m.add(n);
        System.out.println(m + " + " + n + "=" + o);
        
        ComplexNumber p = m.substract(n);
        System.out.println(m + " - " + n + "=" + p);        
       
        
        ComplexNumber q = m.Multiplication(n);
        System.out.println(m + " * " + n + "=" + q);
        
        double r = m.Magnitude(n);
        System.out.println("Magnitude is : " + r);
        
        System.out.println(m.Compare(n));
       
        
    }
}
