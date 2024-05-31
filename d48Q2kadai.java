// s23012
// ポリモフィズムの課題

//スーパークラスAnimalの定義
class Animal {
    public void makeSound() {
        System.out.println("動物の音");
   }
   public void test(){
       System.out.println("テスト出力");
   }
}

//継承したサブクラスDogの定義
class Dog extends Animal {
    public void makeSound() {
        System.out.println("ワンワン");
    }
}

class Cat extends Animal {
	public void makeSound() {
		System.out.println("ニャー");
	}
}

public class d48Q2kadai {
    public static void main(String[] args) {
        Animal a = new Dog(); //インスタンス化
	    Animal b = new Cat();
		Animal c = new Caw();
        a.makeSound(); //どのような処理になるか
        a.test(); //どのような処理になるか
	    b.makeSound();
		c.makeSound();
    }
}
