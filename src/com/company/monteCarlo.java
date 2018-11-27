package com.company;
import java.util.Random;

/**
 * Created by rd568 on 11/27/18.
 */
public class monteCarlo {
    //State variables
    public static double h, k, r;
    private Random rndm = new Random();

    public monteCarlo(double a, double b, double c){
        h = a;
        k = b;
        r = c;
    }

    public double nextRainDrop_x(){
        int rand_x = rndm.nextInt((int)h) + 1;
        return rand_x;
    }

    public double nextRainDrop_y(){
        int rand_y = rndm.nextInt((int)k) + 1;
        return rand_y;
    }

    public boolean insideCircle(){
        double x = nextRainDrop_x();
        double y = nextRainDrop_x();

            if(x <= h && y <= k){
                return true;
            }else{
                return false;
            }
    }

}
