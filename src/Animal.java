public class Animal {
    private String name;
    private boolean dog; 

    public Animal (String name, boolean dog){
        this.name = name;
        this.dog = dog;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name; 
    }

    public boolean getDog() {
        return this.dog;
    }

    public void setDog(boolean dog){
        this.dog = dog; 

    }

    @Override

    public String toString(){
        return getName() + " is a dog = " + getDog();
    }


}
