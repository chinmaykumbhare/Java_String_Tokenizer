

/*
Problem Statement:
Given an equation of the form A+B=C,
Find the missing one out.
Eg: 1+x=7 -> x=6
    3+6=X -> x=9
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ParseStringEqn {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the String Equations without space: (a+b=c)");

        //Init: Empty String

        String eqn = new String();

        try {

            eqn = br.readLine();
        } catch (IOException ioException) {

            System.out.println(ioException);
        }

        StringTokenizer st = new StringTokenizer(eqn);

        String var1 = st.nextToken("+");

        //Input: +x. charAt(1) -> skip
        String var2 = String.valueOf(st.nextToken("=").charAt(1));

        String var3 = st.nextToken();

        int ans = 0;

        if(var1.contains("x") || var1.contains("X")) ans = Integer.parseInt(var3) - Integer.parseInt(var2);

        else if (var2.contains("x") || var2.contains("X")) ans = Integer.parseInt(var3) - Integer.parseInt(var1);

        else ans = Integer.parseInt(var1) + Integer.parseInt(var2);

        System.out.println("Missing Value (X): " +ans);

    }
}