package com.nopCommercePOM;

import java.util.Random;

/**
 * Created by Ahmad on 19/01/2015.
 */
public class Utils {
    public static int generateRandomNumbers()
    {
        Random r = new Random();
        return r.nextInt(1000) + 1;
    }

    public static void waitForFiveSeconds()
    {
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e )
        {

        }
    }
}
