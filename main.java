public class main {
    public static void main(String[] args)  {
        Human daniil = new Human("beans","daniil");
        Food beans = new Food("beans");
        Food meat = new Food("meat");

        daniil.eat(meat);
        daniil.eat(beans);
    }
}

class Food{
 public  String name;

    Food(String n){
        name = n;
    }
}

class Human{

    public  String dontLikeFood;
    public  String name;

    Human (String f, String n){
        dontLikeFood = f;
        name = n;
    }

    public void eat(Food food){
        if(food.name == dontLikeFood){
            System.out.println(name + "doesnt like" + food.name);
        }
          else  System.out.println(name + "like eat" + food.name);
    }
}