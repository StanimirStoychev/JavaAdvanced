package OOP.Reflection.barracksWars.core.factories;

import OOP.Reflection.barracksWars.interfaces.Unit;
import OOP.Reflection.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"OOP.Reflection.barracksWars.units.";

	@Override
	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

		Class<?> reflection = Class.forName(UNITS_PACKAGE_NAME + unitType);


		return (Unit) reflection.getDeclaredConstructor().newInstance();
	}
}
