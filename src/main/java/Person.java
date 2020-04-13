public class Person {
    String name;
    int age;
    int height;

    public Person(String name, int age, int height){
        //set this object's name with the provided name
        this.name = name;
        //set this object's age with the provided age
        this.age = age;
        //set this object's height with the provided height
        this.height = height;
    }


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

/*
    public int getHeight(){
        return height;
    }
*/
}
