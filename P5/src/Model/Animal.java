package Model;


public class Animal implements IAnimal {

    private String name;
    private double age;

    private AnimalType animalType;

    @Override
    public String setId(String id) { return id; }

    @Override
    public String getId() { return null; }

    @Override
    public void setAge(double age) { }

    @Override
    public double getAge() { return age; }

    public Animal() { initializeValues(); }
    public void initializeValues()
    {
        name = "No name ";
        animalType = AnimalType.Mammal;
    }
    public Animal (String name, double age){
        this.name = name;
        this.age = age;
        initializeValues();
    }
    public String getName(){ return name; }
    //"setter --> input"
    public void setName(String name1){
        if ( (name1 != null) && (name !=""))
            this.name = name1;
    }
    public String toShortString(){
        String strInfo =
                String.format("Name: %s \nAge: %d\nAnimalID: %s", name, age, animalType.toString());
        return strInfo;
    }

}
