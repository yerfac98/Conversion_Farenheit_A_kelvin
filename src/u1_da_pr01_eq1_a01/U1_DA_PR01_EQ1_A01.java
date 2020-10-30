package u1_da_pr01_eq1_a01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gerardo Fac
 */
public class U1_DA_PR01_EQ1_A01 {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        double f;
        double k;
        double k1;
        System.out.println("Ingrese la temperatura en Farenheit");
        f = Double.parseDouble(bufEntrada.readLine());
        k = f + 459.67;
        k1 = k * 5 / 9;
        System.out.println("los grados farenheit:" + f + "°f");
        System.out.println("son en kelvin:" + k1 + "°k");
    }

}
