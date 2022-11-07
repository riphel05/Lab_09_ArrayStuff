import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int dataPoints = 100;
        int[] data = new int[dataPoints];

        for(int e = 0; e < data.length; e++)
        {
            data[e] = rnd.nextInt(100) + 1;
        }
        for(int e = 0; e < data.length; e++)
        {
            System.out.printf("%5d", data[e]);
            if(e % 20 == 0 && e > 0)
            {
                System.out.println("");
            }
        }
        System.out.printf("\n");

        for(int e = 0; e < data.length; e++)
        {
            System.out.print(" |" + data[e] + "| ");
            if(e % 20 == 0 && e > 0)
            {
                System.out.println("");
            }
        }
        System.out.println("");


        int sum = 0;
        for(int e = 0; e < data.length; e++)
        {
            sum = sum + data[e];
        }
        int ave = sum / data.length;
        System.out.println("The average of the dataPoints is " + ave);

        int min = data[0];
        int max = data[0];

        for(int e = 0; e < data.length; e++)
        {
            if(min > data[e])
            {
                min = data[e];
            }
            if(max < data[e])
            {
                max = data[e];
            }
        }
        System.out.println("The min in the dataPoint array is " + min);
        System.out.println("The max in the dataPoint array is " + max);
    }
}