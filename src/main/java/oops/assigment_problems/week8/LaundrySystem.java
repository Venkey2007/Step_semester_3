package oops.assigment_problems.week8;

import java.util.ArrayList;
import java.util.List;

public class LaundrySystem {

    private List<WashingMachine> machines;
    private List<WashCycle> washCycles;

    public LaundrySystem() {
        machines = new ArrayList<>();
        washCycles = new ArrayList<>();
    }

    public void addMachine(WashingMachine machine) {
        machines.add(machine);
    }

    public WashCycle startWash(Student student, String machineId, WashType washType) {

        WashingMachine machine = findMachine(machineId);

        if (machine == null) {
            System.out.println("Machine " + machineId + " not found.");
            return null;
        }

        if (!machine.isAvailable()) {
            System.out.println(
                    "Wash denied: Machine " + machineId + " is currently busy."
            );
            return null;
        }

        machine.startWash();

        WashCycle cycle = new WashCycle(student, machine, washType);
        washCycles.add(cycle);

        System.out.println(
                student.getName() + " started " + washType.getName()
                        + " wash on " + machineId
        );

        System.out.println(
                "Duration: " + washType.getDurationMinutes()
                        + " minutes, Charge: ₹" + washType.getCharge()
        );

        return cycle;
    }

    private WashingMachine findMachine(String machineId) {
        for (WashingMachine machine : machines) {
            if (machine.getMachineId().equals(machineId)) {
                return machine;
            }
        }

        return null;
    }
}
