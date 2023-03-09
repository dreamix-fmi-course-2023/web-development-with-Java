package com.fmi.inheritence;

import java.math.BigDecimal;

public abstract class Animal {
  protected BigDecimal weight;

  public Animal() {
  }

  public Animal(BigDecimal weight) {
    this.weight = weight;
  }

  public abstract void makeSound();

  @Override
  public String toString() {
    return "Animal{" +
        "weight=" + weight +
        '}';
  }
}
