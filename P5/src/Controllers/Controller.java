package Controllers;

import View.*;
import Model.*;


public class Controller {
    MainFrame view;  //view
    AnimalRegister register; //model

    //constructor
    public Controller(){
        register = new AnimalRegister(200);
        view = new MainFrame(this);


    }

}
