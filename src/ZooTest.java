public class ZooTest
{
	private Animal whale = new Animal("Blue", "Whale", 100.0, 100.0);
	private Animal cat = new Animal("Green", "Cat", 50.0, 50.0);
	private Animal mouse = new Animal("Red", "Mouse", 10.0, 10.0);
	private Zoo zoo = new Zoo(3);
	public void addZoo()
	{
		zoo.addAnimal(whale);
		zoo.addAnimal(cat);
		zoo.addAnimal(mouse);
	}
	
	public void getTotalHeightTest() throws AssertException
	{
		Assert.assertEquals(160.0, zoo.getTotalHeight());
	}
	
	public void getCapacityTest() throws AssertException
	{
		Assert.assertEquals(3, zoo.getCapacity());
	}
	public void toStringTest() throws AssertException
	{
		Assert.assertEquals("These animals live in the zoo: \nWhale, a Blue-colored animal. 100.0 pounds, 100.0 inches\nCat, a Green-colored animal. 50.0 pounds, 50.0 inches\nMouse, a Red-colored animal. 10.0 pounds, 10.0 inches\n", zoo.toString());
	}
}