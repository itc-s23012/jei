// s23012
//
// 変数controlへはコマンドラインから与えられた整数を指定するよう変更してください (実行例を参考に)与えられた引数を整数に変換するにはInteger.parseInt()メソッドを使うと良いでしょう。
//
// コマンドライン引数「1」のとき「warm」
// コマンドライン引数 「2」のとき「Cool」
// コマンドライン引数「3」のとき「Wind」と出力されるようにする

class d50Q27kadai {
	public static void main(String[] args) {
		if (args.length > 0) {
				int control = Integer.parseInt(args[0]);
				switch (control) {
					case 1:
						System.out.println("Warm");
						break;
					case 2:
						System.out.println("Cool");
						break;
					case 3:
						System.out.println("Wind");
						break;
					default:
						System.out.println("Invalid input");	
						break;
			}
		}
	}
}
