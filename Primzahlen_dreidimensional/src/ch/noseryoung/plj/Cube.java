package ch.noseryoung.plj;

import java.math.BigInteger;

public class Cube {

  private int[][][] threeDimensional;

  public Cube() {
    this.threeDimensional = new int[20][20][20];
  }

  public void fillCube() {
    int max = 9;
    int min = 1;
    int range = max - min + 1;
    for (int i = 0; i < 20; i++) {
      for (int j = 0; j < 20; j++) {
        for (int k = 0; k < 20; k++) {
          this.threeDimensional[i][j][k] = (int) (Math.random() * range) + min;
        }
      }
    }
  }

  public boolean isNumberPrime(int number) {
    BigInteger bigInt = BigInteger.valueOf(number);
    return bigInt.isProbablePrime(100);
  }

  public boolean isSquareFilledWithPrimes(int x, int y, int z) {
    boolean isFilled = false;
    if (this.isNumberPrime(this.threeDimensional[x][y][z]) && this.isNumberPrime(this.threeDimensional[x + 1][y][z])
        && this.isNumberPrime(this.threeDimensional[x][y + 1][z])
        && this.isNumberPrime(this.threeDimensional[x + 1][y + 1][z])) {
      isFilled = true;
    }
    return isFilled;
  }

  public void printPrimeCube(int x, int y, int z) {
    System.out.println(
        threeDimensional[x][y][z] + " " + threeDimensional[x][y + 1][z] + " " + threeDimensional[x + 1][y + 1][z] + " "
            + threeDimensional[x + 1][y][z] + " " + threeDimensional[x + 1][y][z] + " " + threeDimensional[x][y][z + 1]
            + " " + threeDimensional[x][y + 1][z + 1] + " " + threeDimensional[x + 1][y + 1][z + 1]);

  }

  public void checkForPrimeCubes() {
    for (int x = 0; x < 19; x++) {
      for (int y = 0; y < 19; y++) {
        for (int z = 0; z < 19; z++) {
          if (this.isSquareFilledWithPrimes(x, y, z) && this.isSquareFilledWithPrimes(x, y, z + 1)) {
            System.out.println("X-Coordinate: " + x + ", Y-Coordinate: " + y + ", Z-Coordinate: " + z);
            this.printPrimeCube(x, y, z);
            return;
          }
        }
      }
    }
  }

  public int[][][] getThreeDimensional() {
    return threeDimensional;
  }

  public void setThreeDimensional(int[][][] threeDimensional) {
    this.threeDimensional = threeDimensional;
  }
}
