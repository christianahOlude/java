package Zones;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of a state: ");
        String state = sc.nextLine();

        for(GeopoliticalZones geopoliticalZones : GeopoliticalZones.values()) {
            for(String zone : geopoliticalZones.states ){
              if(zone.equals(state)){
                  System.out.println(geopoliticalZones);
              }
            }
        }


    }

}
