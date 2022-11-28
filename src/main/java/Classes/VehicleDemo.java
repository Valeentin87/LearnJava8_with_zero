class Vehicle {
    int passendgers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // расход топлива
    double fuelneeded(int distanse) {
        double fuel = distanse/mpg;
        return fuel;
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.mpg = 9;
        int our_distanse = 200;
        System.out.println("Для того, чтобы проехать расстояние "+our_distanse+ " миль" +
                " нужно " + car.fuelneeded(our_distanse)+ " галонов топлива");
    }
}