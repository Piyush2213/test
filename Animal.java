public abstract class Animal {
    private String name;
    private int age;

    public Animal(){
        System.out.println("Animal contructor called..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void sayHello();
}