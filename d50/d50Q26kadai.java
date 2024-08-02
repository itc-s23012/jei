// s23012 d50Q26kadai.java
// 列挙型の課題
// Q26をアレンジして、列挙型で定義したConditionの要素すべて
// を出力する課題
// その場合、Condition.values().lengthで要素の数を取得できる
// そして、Condition.values()[i]で要素の値を取得できます

enum Condition {ROAD, MUD, SNOW}

class d50Q26kadai {
	public static void main(String[] args) {
		for (int i= 0; i < Condition.values().length; i++) {
			System.out.println(Condition.values()[i]);
		}
	}
}

