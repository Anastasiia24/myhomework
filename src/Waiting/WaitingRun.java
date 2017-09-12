package Waiting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WaitingRun implements Runnable {
    @Override
    public void run() {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("input your name");

            String name=reader.readLine();
            System.out.print(name);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
