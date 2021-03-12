package Model;

import java.util.ArrayList;

public class AnimalRegister
{
    private Animal [] animalList; //deklaration
    private int numOfElem = 0; //antal registrerade

    public AnimalRegister(int maxElems)
    {
        animalList = new Animal[maxElems];
    }

    public int Count() { return numOfElem; }
    public Animal getElementAt(int index) { return animalList[index]; }
    public boolean addAnimal(Animal animalIn)
    {
        boolean ok = true;
        if ( (numOfElem < animalList.length) && (animalIn != null) ) {
            animalList[numOfElem++] = animalIn;
        }
        else
            ok = false;
        return ok;
    }

    public boolean addAnimal(String name, String species,
        String gender, double weight, double age, String id )
    {
        boolean ok = true;

        if ( numOfElem < animalList.length){
            Animal animal1 = new Animal();
            animal1.setName(name);
            animal1.setAge(age);
            animal1.setId(id);
            animalList[numOfElem++] = animal1;
        }
        else
            ok = false;
        return ok;
    }
    public String [] getInfoStrings(){
        int size = numOfElem; //.length;
        String [] infoStrings = new String [size];

        int i = 0;
        for (i = 0; i < infoStrings.length; i++)
        {
            infoStrings[i] = animalList[i].toShortString();
        }
        return infoStrings;
    }

    public void changeAt(int index, Animal animal) {
        if (checkIndex(index)) {
            if (animal != null)
                animalList[index] = null;
            numOfElem--;
            moveElementsToLeft(index);
        }
    }
    private void moveElementsToLeft(int index){
        for (int i = index+1; i< animalList.length; i++){
            if (i > 0)
                animalList[i-1] = animalList[i];
        }
    }

    public boolean checkIndex(int index)
    {
        if (( index >= 0) && (index < animalList.length) )
            return true;
        return false;
    }
/**
    ArrayList arrayList = new ArrayList();


    ArrayList(){

    }*/
}
