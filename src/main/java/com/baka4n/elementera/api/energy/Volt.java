package com.baka4n.elementera.api.energy;

import net.minecraft.nbt.CompoundNBT;

public class Volt implements Electric {
    protected int energy;
    protected int capacity;
    protected int maxReceive;
    protected int maxExtract;

    public Volt(int capacity, int maxReceive, int maxExtract) {
        this.capacity = capacity;
        this.maxReceive = maxReceive;
        this.maxExtract = maxExtract;
    }

    public Volt(int capacity, int maxTransfer) {
        this(capacity, maxTransfer, maxTransfer);
    }

    public Volt(int capacity) {
        this(capacity, capacity, capacity);
    }

    public  Volt readNbt(CompoundNBT nbt) {
        this.energy = nbt.getInt("volt");
        if (energy > capacity)
                energy = capacity;
        return this;
    }

    public CompoundNBT wirteNbt(CompoundNBT nbt) {
        if (energy < 0)
                energy = 0;
        nbt.putInt("volt", energy);
        return nbt;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
        if (energy > capacity)
                energy = capacity;
    }

    public void setMaxReceive(int maxReceive) {
        this.maxReceive = maxReceive;
    }

    public void setMaxExtract(int maxExtract) {
        this.maxExtract = maxExtract;
    }

    public void setMaxTransfer(int maxTransfer) {
        setMaxReceive(maxReceive);
        setMaxExtract(maxExtract);
    }

    public int getMaxReceive() {
        return maxReceive;
    }

    public int getMaxExtract() {
        return maxExtract;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
        if (this.energy > capacity)
                this.energy = capacity;
        else if (this.energy < 0)
                this.energy = 0;
    }

    public void modifyEnergyStorage(int energy) {
        this.energy += energy;
        if (this.energy > capacity)
                this.energy = capacity;
        else if (this.energy < 0)
                this.energy = 0;
    }

    @Override
    public int receiveEnergy(int maxenergy, boolean analog) {
        int receive = Math.min(capacity-this.energy, Math.min(this.maxReceive, energy));
        if (!analog)
                this.energy += receive;
        return receive;
    }

    @Override
    public int extraEnergy(int maxenergy, boolean analog) {
        int extracte = Math.min(this.energy, Math.min(this.maxExtract, energy));
        if (!analog)
                this.energy -= extracte;
        return  extracte;
    }

    @Override
    public int getEnergyStorage() {
        return energy;
    }

    @Override
    public int getMaxEnergyStorage() {
        return capacity;
    }
}
