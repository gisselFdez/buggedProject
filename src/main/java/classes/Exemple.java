package classes;

public class Exemple {

	public static String getMessage(Integer value) {
	    if (value == null) {
	      return "Value NULL";
	    } else if (value >= 0) {
	      return "Value POSITIVE";
	    } else {
	      return "Value NEGATIVE";
	    }
	  }
}
