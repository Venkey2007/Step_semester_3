package oops.assigment_problems.week8;

public class LaundryDemo {

    public static void main(String[] args) {

        LaundrySystem laundrySystem = new LaundrySystem();

        WashingMachine m1 = new WashingMachine("M1");
        WashingMachine m2 = new WashingMachine("M2");

        laundrySystem.addMachine(m1);
        laundrySystem.addMachine(m2);

        Student asha = new Student("Asha");
        Student ravi = new Student("Ravi");
        Student neha = new Student("Neha");

        // Asha starts Quick wash on M1
        WashCycle ashaCycle =
                laundrySystem.startWash(asha, "M1", new QuickWash());

        System.out.println();

        // Ravi tries Heavy wash on busy M1
        laundrySystem.startWash(ravi, "M1", new HeavyWash());

        System.out.println();

        // Ravi starts Heavy wash on M2
        WashCycle raviCycle =
                laundrySystem.startWash(ravi, "M2", new HeavyWash());

        System.out.println();

        // M1 completes
        ashaCycle.completeCycle();
        System.out.println("Asha's wash completed on M1.");
        System.out.println();

        // Neha starts Normal wash on now-free M1
        WashCycle nehaCycle =
                laundrySystem.startWash(neha, "M1", new NormalWash());

        System.out.println();

        System.out.println("Wash charges:");
        System.out.println(
                asha.getName() + ": ₹" + ashaCycle.calculateCharge()
        );
        System.out.println(
                ravi.getName() + ": ₹" + raviCycle.calculateCharge()
        );
        System.out.println(
                neha.getName() + ": ₹" + nehaCycle.calculateCharge()
        );
    }
}
