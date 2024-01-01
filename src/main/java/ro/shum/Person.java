package ro.shum;

import java.io.Serializable;

public class Person implements Serializable {

  private String name;
  private int age;


  public void setName(String john) {
  }

  public void setAge(int i) {
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
