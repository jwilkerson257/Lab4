/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void fullConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal("Blue", "Whale", 100.0, 100.0);

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("Blue", animal.getColor());
        Assert.assertEquals("Whale", animal.getName());
        Assert.assertEquals(100.0, animal.getHeight(), 0.01);
        Assert.assertEquals(100.0, animal.getWeight(), 0.01);
    }
    
    public void getColorTest() throws AssertException
    {
    	Animal animal = new Animal("Blue", "Whale", 100.0, 100.0);
    	Assert.assertEquals("Blue", animal.getColor());
    }
    
    public void getNameTest() throws AssertException
    {
    	Animal animal = new Animal("Blue", "Whale", 100.0, 100.0);
    	Assert.assertEquals("Whale", animal.getName());
    }
    
    public void getHeightTest() throws AssertException
    {
    	Animal animal = new Animal("Blue", "Whale", 100.0, 100.0);
    	Assert.assertEquals(100.0, animal.getHeight());
    }
    
    public void getWeightTest() throws AssertException
    {
    	Animal animal = new Animal("Blue", "Whale", 100.0, 100.0);
    	Assert.assertEquals(100.0, animal.getWeight());
    }
    
    public void toStringTest() throws AssertException
    {
    	Animal animal = new Animal("Blue", "Whale", 100.0, 100.0);
    	Assert.assertEquals("Whale, a Blue-colored animal. 100.0 pounds, 100.0 inches\n", animal.toString());
    }

}

