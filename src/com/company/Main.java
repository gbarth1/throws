package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Insert numbers:");
	    Scanner insert=new Scanner(System.in);


        try
        {
            int in=insert.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.print("I said numbers!");
        }
    }
}
