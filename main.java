class main{
    public static void main(String[] args) {

    }
}

class Food{
 public String name;
    
    Food(String n){
        name = n;   
    }
}

class Human{

    public String dontLikeFood;
    public String name;

    Human (String f, String n){
        dontLikeFood = food;
        name = n;
    }

    public static void eat(Food food){
        if(food.name == dontLikeFood){
            System.out.println(name + "doesnt like" + food.name);
        }
          else  System.out.println(name + "like eat" + food.name);
    }
}