// s23012
// ->のswitch構文を使いoneのみを表示

class Q26kadai {
		public static void main(String[] args) {
				int n = 1;
				String s = " ";
				switch (n) {
						case 1 -> s += "one";
						case 2 -> s += "two";
								default -> s += "?";
				}
				System.out.println(s);
		}
}

