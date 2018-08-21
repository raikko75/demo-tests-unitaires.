package fr.pizzeria.dao;

import java.util.List;

import fr.pizzeria.model.Pizza;
import pizza.exception.DeleteException;
import pizza.exception.SaveException;
import pizza.exception.UpdateException;

public interface IPizzaDao {
	List<Pizza> findAllPizzas();
	void saveNewPizza(Pizza pizza) throws SaveException;
	void updatePizza(String codePizza, Pizza pizza) throws UpdateException;
	void deletePizza(String codePizza)throws DeleteException;
	Pizza findPizzaByCode(String codePizza);
	boolean pizzaExists(String codePizza);
	void pizzaToBdd();
}

