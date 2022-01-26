/**
 * A class that maintains information about a binocular.
 * This might form part of a larger application such
 * as a optical shop, for instance.
 *
 * @author (Chiaha Christopher Izuchukwu)
 * @author (Keagan Crane)
 * @author (Insert name of group member 3)
 * 
 * @version (25th of January, 2022)
 */
public class Binocular
{
    // The fields.
    private String model;
    private int price;
    private int closeFocusDistance;
    private int magnification;
    private int diameter;
    private boolean imageStabilization;
    private String owner;

    /**
     * Set the model, price and focus fields when this object
     * is constructed.
     */
    public Binocular(String binocularModel, int binocularPrice,int binocularFocus, boolean binocularImageStabilization)
    {
        model = binocularModel;
        price = binocularPrice;
        closeFocusDistance = binocularFocus;
        imageStabilization = binocularImageStabilization;
    }

    // Add the methods here ...
    /**
     * Next three methods are accessor methods for model, price and closeFocusMagnification
     */
    public String getModel()
    {
        return model;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public int getCloseFocusDistance()
    {
        return closeFocusDistance;
    }
    
    /**
     * Next two methods are accessor methods for magnification and diameter
     */
    public int getMagnification()
    {
        return magnification;
    }
    
    public int getDiameter()
    {
        return diameter;
    }
    
    /**
     * Next two methods set the integer values for magnification and diameter
     */
    public void setMagnification(int newMagnification)
    {
        magnification = newMagnification;
    }
    
    public void setDiameter(int newDiameter)
    {
        diameter = newDiameter;
    }
    
    /**
     * getStablization method returns true or false depending on if whether the binocular
     * is equipped with an image stabilization system
     */
    public boolean getStabilization()
    {
        return imageStabilization;
    }
    
    /**
     * Next two methods are an accessor method for the owner of the binocular, and a mutator to
     * change the owner of the binocular respectfully
     */
    public String getOwnersName()
    {
        return owner;
    }
    
    public void changeOwner(String newOwner)
    {
        owner = newOwner;
    }
    
    /**
     * printBinocularInfo will print the model, price, magnification, diameter, image stabilization,
     * and owner of the binocular
     */
    public void printBinocularInfo()
    {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Magnification: " + magnification);
        System.out.println("Diameter: " + diameter);
        System.out.println("Image Stabilization: " + imageStabilization);
        System.out.println("Owner: " + owner);
    }
    
    /**
     * authorInfo will print out the name of the author who implemented each method in the assignment
     */
    public void authorInfo()
    {
        System.out.println("Method Author Info:");
        System.out.println("");
        System.out.println("getModel method author: Chiaha Christopher Izuchukwu");
        System.out.println("getPrice method author: Chiaha Christopher Izuchukwu");
        System.out.println("getCloseFocusDistance method author: Chiaha Christopher Izuchukwu");
        System.out.println("getMagnification method author: Chiaha Christopher Izuchukwu");
        System.out.println("getDiameter method author: Chiaha Christopher Izuchukwu");
        System.out.println("setMagnification method author: Chiaha Christopher Izuchukwu");
        System.out.println("setDiameter method author: Chiaha Christopher Izuchukwu");
        System.out.println("getStabilization method author: Chiaha Christopher Izuchukwu");
        System.out.println("getOwnersName method author: Chiaha Christopher Izuchukwu");
        System.out.println("changeOwner method author: Chiaha Christopher Izuchukwu");
        System.out.println("printBinocularInfo method author: Chiaha Christopher Izuchukwu, Keagan Crane");
        System.out.println("authorInfo method author: Keagan Crane");
    }
}















