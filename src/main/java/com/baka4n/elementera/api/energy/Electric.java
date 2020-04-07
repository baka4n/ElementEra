package com.baka4n.elementera.api.energy;

public interface Electric {
    int receiveEnergy(int maxenergy, boolean analog);

    int extraEnergy(int maxenergy, boolean analog);

    int getEnergyStorage();

    int getMaxEnergyStorage();
}
