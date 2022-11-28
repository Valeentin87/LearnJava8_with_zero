class Vehicle{
    int passendgers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // расход топлива
    void range() {
        System.out.println("Дальность - "+ fuelcap*mpg+ " миль");
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        int range; // дистанция
        Vehicle minivan = new Vehicle();
        minivan.passendgers = 5;
        minivan.fuelcap = 60;
        minivan.mpg = 6;
        range = minivan.fuelcap* minivan.mpg;
        System.out.println("Минивэн вместимостью "+minivan.passendgers+
                " человек на одном баке проедет "+range+" миль");
    }
}