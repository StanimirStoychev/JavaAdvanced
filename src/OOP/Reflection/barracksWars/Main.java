package OOP.Reflection.barracksWars;

import OOP.Reflection.barracksWars.core.Engine;
import OOP.Reflection.barracksWars.core.factories.UnitFactoryImpl;
import OOP.Reflection.barracksWars.data.UnitRepository;
import OOP.Reflection.barracksWars.interfaces.Repository;
import OOP.Reflection.barracksWars.interfaces.Runnable;
import OOP.Reflection.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
