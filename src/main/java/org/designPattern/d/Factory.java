package org.designPattern.d;

public class Factory {
    public static void main(String[] args) {
        CarInstance factory = new CarInstance();
        car car = factory.createInstance("swift");
        car.start();
        car.end();
        car car1 = factory.createInstance("bmw");
        car1.start();
        car.end();

    }
}

interface car{
    void start();
    void end();
}

class  swift implements  car{
   public  void start(){
       System.out.println("car swift start");
   }

public void end(){
    System.out.println("car swift end");
}
}

class  Bmw implements  car{
    @Override
    public void end() {
        System.out.println("car end bmw");
    }

    public void start(){
        System.out.println("car start bmv");
    }
}

class CarInstance{
    public car createInstance(String instance) {

        return switch (instance.toLowerCase()) {
            case "swift" -> new swift();
            case "bmw" -> new Bmw();
            default -> {
                System.out.println("not valid input");
                yield null;
            }
        };

    }

}