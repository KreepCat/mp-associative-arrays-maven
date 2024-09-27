package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import edu.grinnell.csc207.util.KeyNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Alexander Pollock
 */
public class TestsFromStudent {
  /**
   * A simple test.
   */
  @Test
  public void alwaysPass() throws Exception {
  } // alwaysPass()

    /**
   * Can we add an element, check that it's there, remove it and then check for it again.
   * 
   * @throws NullKeyException
   * @throws KeyNotFoundException
   */
  @Test
  public void pollockAlexTest1() throws NullKeyException, KeyNotFoundException {
    AssociativeArray<Integer, String> testArray = new AssociativeArray<Integer, String>();
    testArray.set(1, "Hello");
    assertEquals(true, testArray.hasKey(1));
    assertEquals("Hello", testArray.get(1));
    testArray.remove(1);
    assertEquals(false, testArray.hasKey(1));
    try {
      testArray.get(1);
      System.err.println("This key shouldn't exist.");
    } catch (KeyNotFoundException e) {
      // This is supposed to happen
    } // try/catch
  } // pollockAlexTest1()

  /**
   * Try removing non-existant elements. Then see if changing keys works as well as size. Then try
   * removing a valid element.
   * 
   * @throws NullKeyException
   * @throws KeyNotFoundException
   */
  @Test
  public void pollockAlexTest2() throws NullKeyException, KeyNotFoundException {
    AssociativeArray<String, String> testArray2 = new AssociativeArray<String, String>();
    testArray2.remove("Hello");
    assertEquals(0, testArray2.size());
    testArray2.set("Hello", "World");
    testArray2.set("Hello", "Samuel");
    assertEquals("Samuel", testArray2.get("Hello"));
    assertEquals(1, testArray2.size());
    testArray2.remove("Hello");
    assertEquals(0, testArray2.size());
    try {
      testArray2.get("Hello");
      System.err.println("Error: Value should not exist");
    } catch (KeyNotFoundException e) {
      // Supposed to happen
    } // try/catch
  } // pollockAlexTest2()

  /**
   * Check if you can properly remove the only value in a list. Certain implementations will fail.
   * 
   * @throws NullKeyException
   * @throws KeyNotFoundException
   */
  @Test
  public void pollockAlexEdge1() throws NullKeyException, KeyNotFoundException {
    AssociativeArray<String, String> edgeArray1 = new AssociativeArray<String, String>();
    edgeArray1.set("Edge", "Cases");
    edgeArray1.remove("Edge");
    try {
      edgeArray1.get("Edge");
      System.err.println("Error: Failed pollockAlexEdge1 ;)");
    } catch (KeyNotFoundException e) {
      // Supposed to happen
    } // try/catch
  } // pollockAlexEdge1()
} // class TestsFromSam
