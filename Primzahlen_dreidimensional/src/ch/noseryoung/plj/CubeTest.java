package ch.noseryoung.plj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CubeTest extends Cube {

  @Test
  void testFillCube() {
    this.fillCube();
    int[][][] test = getThreeDimensional();
    if (test[0][0][0] == 0) {
      fail("Fehler");
    }
    ;
    if (test[19][19][19] == 0) {
      fail("Fehler");
    }
    ;

  }

  @Test
  void testIsNumberPrime() {
    boolean numberPrime = this.isNumberPrime(3);
    if (!numberPrime) {
      fail("Fehler");
    }
  }

  @Test
  void testIsSquareFilledWithPrimes() {
    int[][][] test = new int[3][3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          test[i][j][k] = 3;
        }
      }
    }
    setThreeDimensional(test);
    if (!isSquareFilledWithPrimes(0, 0, 0)) {
      fail("Fehler.");
    }
    if (!isSquareFilledWithPrimes(0, 1, 0)) {
      fail("Fehler.");
    }
    if (!isSquareFilledWithPrimes(1, 1, 0)) {
      fail("Fehler.");
    }
  }

  void testcheckForPrimeCubes() {
    int[][][] test = new int[3][3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          test[i][j][k] = 3;
        }
      }
    }

    if (!isSquareFilledWithPrimes(0, 0, 1)) {
      fail("Fehler.");
    }
    if (!isSquareFilledWithPrimes(0, 1, 1)) {
      fail("Fehler.");
    }
    if (!isSquareFilledWithPrimes(1, 1, 1)) {
      fail("Fehler.");
    }
  }
}
