package pokemon;

import sounds.SoundData;
import images.ImageData;

/**
 * 
 * A Pokemon, containing its stats and image data.<br>
 * Creation example: <blockquote> {@code Pokemon(PokemonData.Bulbasur,2);}
 * </blockquote> Creates a new level 2 Bulbasaur<br>
 * 
 * @author Alejandro
 * 
 */
public class Pokemon {

	private PokemonData data;
	private String nickname = null;
	private PokemonStatus status;
	private int currentHp;
	private boolean debilitated;
	private PokemonStats stats;
	private PokemonAttacks attacks;
	private int level;

	/**
	 * Creates a new Pokemon with a given enumerated value of PokemonData and
	 * the Pokemon's starting level<br>
	 * 
	 * @param data
	 *            A PokemonData enumeration
	 * @param level
	 *            The pokemon starting level
	 */

	public Pokemon(PokemonData data, int level) {
		this.data = data;
		this.level = level;
		this.status = PokemonStatus.NORMAL;
		this.stats = new PokemonStats(level, data.getBaseStats());
		this.currentHp = stats.getHp();
		this.attacks = new PokemonAttacks(data.getLearnAttackList(), level);
	}

	/**
	 * @return a String contatining Pokemon's id, name and types
	 */
	@Override
	public String toString() {
		return "Pokemon id:" + data.getId() + "\n" + "Nombre: " + data.getName() + "\nTipo: "
				+ data.getType1() + "/" + data.getType2() + "\nHp: "+stats.getHp();
	}

	/*
	 * Getters
	 */

	/**
	 * Returns the Pokemon's id
	 * 
	 * @return an integer containing the Pokemon's id
	 */
	public int getId() {
		return this.data.getId();
	}

	public int getLevel() {
		return level;
	}

	/**
	 * Returns the Pokemon's name
	 * 
	 * @return a String containing Pokemon's name
	 */
	public String getName() {
		return this.data.getName();
	}

	/**
	 * Returns the Pokemon's first type
	 * 
	 * @return a Type object containing Pokemon's first type
	 */
	public Type getType1() {
		return this.data.getType1();
	}

	/**
	 * Returns the Pokemon's second type
	 * 
	 * @return a Type object containing Pokemon's second type
	 */
	public Type getType2() {
		return this.data.getType2();
	}

	/**
	 * Returns the Pokemon's image data
	 * 
	 * @return an ImageData object containing the Pokemon's image data
	 */
	public ImageData getImageData() {
		return this.data.getImageData();
	}

	/**
	 * Returns the Pokemon's current stats
	 * 
	 * @return a PokemonStats object containing the Pokemon's current stats
	 *         values
	 */
	public PokemonStats getStats() {
		return this.stats;
	}

	public PokemonType getPokemonType() {
		return data.getType();
	}

	/*
	 * Setters
	 */

	/**
	 * 
	 * @param nickname
	 *            Nuevo apodo
	 * @return devuelve true si el nickname es valido, en caso contrario
	 *         devuelve false
	 */
	public boolean setNickname(String nickname) {
		if (nickname.length() > 14)
			return false;
		else {
			this.nickname = nickname;
			return true;
		}

	}

	public void levelUp() {
		if (this.level == 100)
			return;
		this.level++;
		this.stats.setNewStats(level, this.data.getBaseStats());
	}

	@Deprecated
	public void levelDown() {
		this.level--;
		this.stats.setNewStats(level, this.data.getBaseStats());
	}
	public void setStatus(PokemonStatus status)
	{
		this.status = status;
	}

	public boolean isDebilitated()
	{
		return debilitated;
	}
	
	public int getCurrentHp()
	{
		return currentHp;
	}
	public PokemonAttacks getAttacks()
	{
		return attacks;
	}
	public PokemonStatus getStatus()
	{
		return status;
	}
	public String getNickname()
	{
		return nickname;
	}
	public void dealDamage(int damage)
	{
		if(damage>currentHp)
			currentHp = 0;
		else
			currentHp -= damage;
	}
	public SoundData getSoundData(){
		return data.getSoundData();
	}
}
