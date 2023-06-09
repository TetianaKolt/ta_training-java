package com.epam.training;

import static org.junit.Assert.assertTrue;

import com.epam.training.student_tetiana_koltunova.maven.App;
import com.epam.training.student_tetiana_koltunova.maven.EmptyClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

  @Test
  public void testShouldBePassed() {
    assertTrue(true);
  }

  @Test
  public void testShouldBeFailed() {
    assertTrue(false);
  }

  @Ignore("Not implemented yet")
  @Test
  public void testShouldBeSKipped() {
    assertTrue(true);
  }

  @Test
  public void testAnotherMethod() {
    App.doNothing();
  }

  @Test
  public void testAnotherClass() {
    EmptyClass.emptyMethod();
  }

}
