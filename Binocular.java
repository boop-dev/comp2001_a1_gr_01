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
    
    public int getMagnification()
    {
        return magnification;
    }
    
    public int getDiameter()
    {
        return diameter;
    }
    
    public void setMagnification(int newMagnification)
    {
        magnification = newMagnification;
    }
    
    public void setDiameter(int newDiameter)
    {
        diameter = newDiameter;
    }
    
    public boolean getStabilization()
    {
        return imageStabilization;
    }
    
    public String getOwnersName()
    {
        return owner;
    }
    
    public void changeOwner(String newOwner)
    {
        owner = newOwner;
    }
    
    public void printBinocularInfo()
    {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Magnification: " + magnification);
        System.out.println("Diameter: " + diameter);
        System.out.println("Image Stabilization: " + imageStabilization);
        System.out.println("Owner: " + owner);
    }
    
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















