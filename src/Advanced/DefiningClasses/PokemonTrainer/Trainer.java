package Advanced.DefiningClasses.PokemonTrainer;

import java.util.List;

public class Trainer {
    private final String name;
    private int badges;
    private List<Pokemon> pokemonList;

    public Trainer(String name, List<Pokemon> pokemonList) {
        this.name = name;
        this.pokemonList = pokemonList;
        this.badges = 0;
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public int getBadges() {
        return badges;
    }

    public int getNumberOfPokemons() {
        return this.pokemonList.size();
    }

    public boolean hasElement(String element) {
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getElement().equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void takeDamage() {
        for (int i = 0; i < pokemonList.size(); i++) {
            if (pokemonList.get(i).isDead()) {
                pokemonList.remove(i--);
            }
        }
    }

    public void receiveBadge() {
        this.badges += 1;
    }
}