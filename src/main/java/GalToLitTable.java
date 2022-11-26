public class GalToLitTable {
    public static void main(String[] args) {
        double galones;
        double liters;
        for(galones  = 1; galones<=100; galones++) {
            liters = galones*3.5357;
            System.out.println(galones + " галонов содержит " + liters + " литров воды");
            if (galones%10 == 0) System.out.println();
        }
    }
}
