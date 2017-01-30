public class sample {
	public static void main(String[] args) {
		System.out.println(calc("gtg123b"));
		System.out.println(calc1("gtg123b"));
		System.out.println(calc2("abc123"));
		System.out.println(calc4("gtg123b"));
		System.out.println(calc3("gtg123b"));
		String s = "some text";
s.substring(0,4);
System.out.println(s); // still printing "some text"
String a = s.substring(0,4);
System.out.println(a); // prints "some"
	}
	private static String calc(String input) {
		return input.substring(2,input.length()) + input.substring(0,2);
	}
	private static String calc1(String input) {
	 	StringBuilder sb = new StringBuilder();
	 	for(int i = input.length() - 1; i >= 0 ; i--) {
	 		sb.append(input.charAt(i));
	  }
	  String value = sb.toString();
	  //Person 3 put your implementation here
	  return value;
	}

	 // private static String calc2(String input) {
  //     //Person 4 put your implementation here
  //       StringBuilder sb = new StringBuilder();
  //       for(int i = input.length() -1; i >= 0; i--) {
  //           sb.append((char)(input.charAt(i) + 1));
  //     }
  //     String value = sb.toString();
  //     //Person 3 put your implementation here
  //     return value;
  //   }
	private static String calc2(String input) {
		String fin = "";
	      char letter;
	      for (int i = 0; i < input.length(); i++) {
	          int number = (int)input.charAt(i);
	          letter = (char)(number + 1);
	          fin = fin + letter;
	      }
      return fin;
    }
    private static String calc4(String input) {
		StringBuilder build = new StringBuilder();
		build.append(input);
		build = build.reverse();
			return build.toString();
	}
	private static String calc3(String input) {
	  //Person 2 put your implementation here
	  	StringBuilder sb = new StringBuilder(input);
	  	StringBuilder result = new StringBuilder();
		for(int i = input.length(); i > 0; i--) {
			int index = (int)(Math.random() * i);
			result.append(sb.charAt(index));
			sb.deleteCharAt(index);
	  	}
	  	String fin = result.toString();
	  	return fin;
	}
}