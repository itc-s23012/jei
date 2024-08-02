// s23012
// ソート途中まで出力するプログラム

class d50Q5kadai2 {
	 public static void main(String[] args) {
        int[] num = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        int tmp;
        for (int i = 1; i < num.length; i++) {
            for (int j = i; j > 0 && num[j - 1] > num[j]; j--) {
                tmp = num[j];
                num[j] = num[j - 1];
                num[j - 1] = tmp;

		System.out.print("ソート途中:");
                printArray(num);
            }
        }

	System.out.println("-----------------");

        System.out.print("ソート途中:");
        printArray(num);
    }

    private static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
