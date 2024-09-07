package com.guanhf.test;

import java.util.Scanner;

public class BikeBuild {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        BikeDirector bikeDirector = new BikeDirector();

        for (int i = 0; i < n; i++) {
            String type = scanner.nextLine();
            BikeBuilder bikeBuilder = null;
            if(type.equals("mountain")){
                bikeBuilder = new MountainBikeBuilder();
            }else if(type.equals("road")){
                bikeBuilder = new RoadBikeBuilder();
            }

            Bike bike = bikeDirector.construct(bikeBuilder);
            System.out.println(bike);
        }
    }

}

class Bike{
    private String frame;
    private String tires;
    public void setFrame(String frame){
        this.frame = frame;
    }
    public void setTires(String tires){
        this.tires = tires;
    }
    public String toString(){
        return frame + " " + tires;
    }
}

interface BikeBuilder{
    void buildFrame();
    void buildTires();
    Bike getResult();
}

// 山地车
class MountainBikeBuilder implements BikeBuilder{
    private Bike bike;

    MountainBikeBuilder(){
        bike = new Bike();
    }
    @Override
    public void buildFrame() {
        bike.setFrame("Aluminum Frame");
    }

    @Override
    public void buildTires() {
        bike.setTires("Knobby Tires");
    }

    @Override
    public Bike getResult() {
        return bike;
    }
}

// 公路车
class RoadBikeBuilder implements BikeBuilder{
    private Bike bike;
    RoadBikeBuilder(){
        bike = new Bike();
    }
    @Override
    public void buildFrame() {
        bike.setFrame("Carbon Frame");
    }

    @Override
    public void buildTires() {
        bike.setTires("Slim Tires");
    }

    @Override
    public Bike getResult() {
        return bike;
    }
}


class BikeDirector{
    public Bike construct(BikeBuilder bikeBuilder){
        bikeBuilder.buildFrame();
        bikeBuilder.buildTires();
        return bikeBuilder.getResult();
    }
}







