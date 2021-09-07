package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestMain {

  private MyResource myResource;

  @Before
  public void setup() {
    myResource = new MyResource();
  }

  @Test
  public void CheckWord() {
    String someone = "Hello World!";

    assertThat(MyResource.getit(), containsString(someone));
  }


}
