package Bridgelabz;
class Animal1 {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal1 {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal1 {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Animal {
  public static void main(String[] args) {
    Animal1 a1 = new Animal1();
    Animal1 a2 = new Pig();
    Animal1 a3 = new Dog();
        
    a1.animalSound();
    a2.animalSound();
    a3.animalSound();
  }
}
