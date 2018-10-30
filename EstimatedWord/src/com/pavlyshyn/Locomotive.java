package com.pavlyshyn;

enum EnergySource {KEROSENE, PETROL, DISEL, GAS, ELECTRIC}

public class Locomotive {
    private String name;
    private EnergySource energySource;
    public Locomotive(String name, EnergySource energySource) {
        this.name = name;
        this.energySource = energySource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnergySource getEnergySource() {
        return energySource;
    }

    public void setEnergySource(EnergySource energySource) {
        this.energySource = energySource;
    }

    @Override
    public String toString() {
        return "Locomotive {\n" +
                "\tname='" + name + '\'' +
                "\n\t, energySource=" + energySource +
                "}\n";
    }
}
