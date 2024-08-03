package org.example.model;

public class Item {

  private int id;

  public int getId() {
    return id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  private String name;

  public void setName(final String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  private double cost;

  public void setCost(final double cost) {
    this.cost = cost;
  }

  public double getCost() {
    return cost;
  }

  private String type;

  public void setType(final String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  private double tax;

  public double getTax() {
    return tax;
  }

  public void setTax(double tax) {
    this.tax = tax;
  }

  @Override
  public String toString() {
    return "Item{" + "id=" + id + ", name='" + name + '\'' + ", cost=" + cost + ", type='" + type
        + '\'' + ", tax=" + tax + '}';
  }
}
