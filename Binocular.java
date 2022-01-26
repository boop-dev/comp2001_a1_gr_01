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
        System.out.println(model);
        System.out.println(price);
        System.out.println(magnification);
        System.out.println(diameter);
        System.out.println(imageStabilization);
        System.out.println(owner);
    }
}















