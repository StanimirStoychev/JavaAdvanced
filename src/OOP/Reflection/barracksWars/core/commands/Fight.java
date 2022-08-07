package OOP.Reflection.barracksWars.core.commands;

import OOP.Reflection.barracksWars.interfaces.Repository;
import OOP.Reflection.barracksWars.interfaces.UnitFactory;

public class Fight extends Command{

    public Fight(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
