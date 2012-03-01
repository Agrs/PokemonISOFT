package pokedex;

import pokemon.*;


public class Pokedex {
	private static Pokedex mPokedex = new Pokedex();
	private PokedexData pokemonList[]=
	{
			new PokedexData(PokemonData.Bulbasaur,"Este Pok�mon nace con una semilla en el lomo.\n Con el tiempo, la semilla brota."),
			new PokedexData(PokemonData.Ekans ,"Es f�cil encontrarlo en praderas y zonas similares.\n A este Pok�mon le basta con sacar la lengua para detectar el peligro."),
			new PokedexData(PokemonData.Diglett,"Este Pok�mon se entierra a gran profundidad,\n pero como levanta tierra al cavar, es f�cil localizarlo."),
			new PokedexData(PokemonData.Rattata,"Tiene unos largos y afilados colmillos que no dejan de crecer. Le resultan muy �tiles para destruir cosas."),
			new PokedexData(PokemonData.Weedle,"Suele habitar bosques y praderas. Tiene un afilado y venenoso aguij�n de unos 5 cm encima de la cabeza."),
			new PokedexData(PokemonData.Abra,"Duerme 18 horas al d�a y mientras lo hace es capaz de usar una serie de poderes extrasensoriales."),
			new PokedexData(PokemonData.Dodrio,"Pertenece a una rara especie dif�cil de encontrar. Las tres cabezas simbolizan la alegr�a, la tristeza y la ira."),
			new PokedexData(PokemonData.Pidgey,"A este Pok�mon no le gusta luchar. Suele permanecer escondido en zonas de hierba alta. Se alimenta de peque�os insectos."),
			new PokedexData(PokemonData.Arcanine,"Un Pok�mon muy admirado desde la antig�edad por su belleza. Corre �gilmente como si tuviera alas."),
			new PokedexData(PokemonData.Mew,"Varios cient�ficos lo consideran el antecesor de los Pok�mon porque usa todo tipo de movimientos."),
	
	};
	private Pokedex() {}
	public static Pokedex getPokedex() {
		return mPokedex;
	}
	public PokedexData getPokemon(int index)
	{
	    return pokemonList[index];
	}
	
	
}
