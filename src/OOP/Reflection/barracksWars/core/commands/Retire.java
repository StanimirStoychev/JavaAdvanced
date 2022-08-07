package OOP.Reflection.barracksWars.core.commands;

import OOP.Reflection.barracksWars.interfaces.Repository;
import OOP.Reflection.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class Retire extends Command{

    public Retire(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        String unitType = super.getData()[1];
        try {
            super.getRepository().removeUnit(unitType);
            return unitType + " retired!";
        } catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }
}
