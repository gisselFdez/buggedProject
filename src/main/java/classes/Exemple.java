package classes;

public class Exemple {

  public static String getSigne(Integer value) {
    if (value == null) {
      return "Value NULL";
    } else if (value >= 0) { // Remplacer >= par >
      return "Value POSITIVE";
    } else {
      return "Value NEGATIVE";
    }
  }

  public static String getSigne2(Integer value) {
    if (value == null) {
      return "Value NULL";
    } else {
      if (value >= 0) { // Remplacer >= par >
        return "Value POSITIVE";
      } else {
        return "Value NEGATIVE";
      }
    }
  }

  public static Integer compare(Integer x, Integer y) {
    if (x != y) { // Remplacer != par ==
      return 0;
    } else if (x == null || y == null) {
      return null;
    } else if (x > y) {
      return 1;
    } else {
      return -1;
    }
  }

  public static Boolean estModulo(Integer modulo, Integer x) {
    if (modulo == null || x == null) {
      return null;
    }
    if (modulo != 0) { // Remplacer != par ==
      return false;
    }
    if ((x % modulo) != 0) { // Remplacer != par ==
      return true;
    } else {
      return false;
    }
  }

  public static Boolean estModuloBis(Integer modulo, Integer x) {
    if (modulo == null || x == null) {
      return null;
    } else {
      if (modulo != 0) { // Remplacer != par ==
        return false;
      } else {
        if ((x % modulo) != 0) { // Remplacer != par ==
          return true;
        } else {
          return false;
        }
      }
    }
  }

  public static Boolean estDansIntervalle(Integer borneInf, Integer borneSup, Integer x) {
    if (borneInf >= borneSup) { // Remplacer >= par >
      return false;
    }
    if (x <= borneInf || x >= borneSup) { // Remplacer <= par < et >= par >
      return false;
    } else {
      return true;
    }
  }

  public static Boolean and(Integer a, Integer b) {
    if (a == b || a <= 0 || b <= 0) { // Remplacer == par !=
      return false;
    } else {
      return true;
    }
  }

  public static Boolean xor(Integer a, Integer b) {
    if (a != b && a < 0 && b < 0) { // Remplacer < par >=
      return true;
    } else {
      return false;
    }
  }

}
