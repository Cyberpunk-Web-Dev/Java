interface Activity {
  void doActivity();
}

interface Sleep {
  void sleep();
}

interface Eat {
  void eat();
}

class Person implements Activity, Sleep, Eat {
  public void doActivity() {
    System.out.println("Exercising...");
  }

  public void sleep() {
    System.out.println("Sleeping...");
  }

  public void eat() {
    System.out.println("Eating healthy Food...");
  }
}

public class DailyRoutine {
  public static void main(String[] args) {
    Person p = new Person();
    System.out.println("Starting the day:");
    p.sleep();
    p.eat();
    System.out.println("During the day:");
    p.doActivity();
    p.eat();
    System.out.println("Ending the day:");
    p.sleep();
  }
}
