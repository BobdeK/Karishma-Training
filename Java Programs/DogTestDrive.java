class Dognew {
    int size;
    String name;

void bark() {
    if(size > 60){
        System.out.println("Woof! Woof!");
    } else if(size > 14){
        System.out.println("Ruff! Ruff!");
    } else {
        System.out.println("Yip! Yip!");
    }
}
}

class DogTestDrive {

        public static void main (String [] args){
        Dognew one = new Dognew();
        one.size = 70;
        Dognew two = new Dognew();
        two.size = 7;
        Dognew three = new Dognew();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
}
}