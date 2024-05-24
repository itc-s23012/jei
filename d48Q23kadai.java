class d48Q23kadai {
    public static void main(String[] args) {
        int i = 1;
        for (;;) {
            i = i + 3;
			System.out.println(i);
            if (i < 10) {
                continue;
            } else {
                break;
            }
        }
    }
}

