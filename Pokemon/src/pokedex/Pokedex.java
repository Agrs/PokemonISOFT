package pokedex;

import java.util.Arrays;
import java.util.Iterator;

import pokemon.*;


public class Pokedex {
	private static Pokedex mPokedex = new Pokedex();
	private PokedexData pokemonList[]=
	{
			new PokedexData(PokemonData.Bulbasaur,"Este Pok�mon nace con una semilla en\nel lomo. Con el tiempo, la semilla brota."),
			new PokedexData(PokemonData.Ekans ,"Es f�cil encontrarlo en praderas y zonas\nsimilares. A este Pok�mon le basta con\nsacar la lengua para detectar el peligro."),
			new PokedexData(PokemonData.Diglett,"Este Pok�mon se entierra a gr�n\nprofundidad, pero como levanta tierra\nal cavar, es f�cil localizarlo."),
			new PokedexData(PokemonData.Rattata,"Tiene unos largos y afilados colmillos\nque no dejan de crecer. Le resultan\nmuy �tiles para destruir cosas."),
			new PokedexData(PokemonData.Weedle,"Suele habitar bosques y praderas.\nTiene un afilado y venenoso aguij�n\nde unos 5 cm encima de la cabeza."),
			new PokedexData(PokemonData.Abra,"Duerme 18 horas al d�a y mientras\nlo hace es capaz de usar una serie\nde poderes extrasensoriales."),
			new PokedexData(PokemonData.Dodrio,"Pertenece a una rara especie dif�cil de\nencontrar. Las tres cabezas simbolizan\nla alegr�a, la tristeza y la ira."),
			new PokedexData(PokemonData.Pidgey,"A este Pok�mon no le gusta luchar. Suele\npermanecer escondido en zonas de hierba\nalta. Se alimenta de peque�os insectos."),
			new PokedexData(PokemonData.Arcanine,"Un Pok�mon muy admirado desde la\nantig�edad por su belleza. Corre\n�gilmente como si tuviera alas."),
			new PokedexData(PokemonData.Mew,"Varios cient�ficos lo consideran el\nantecesor de los Pok�mon porque usa\ntodo tipo de movimientos."),
	
	};
	private Iterator<PokedexData> iterator = Arrays.asList(pokemonList).iterator();
	private Pokedex() {}
	public static Pokedex getPokedex() {
		return mPokedex;
	}
	public PokedexData getPokemon(int index)
	{
		if(index==-1)
			return pokemonList[pokemonList.length-1];
	    return pokemonList[index];
	}
	public int size()
	{
		return pokemonList.length;
	}
	
	
}
