public class NumberGames {
    private double num;        // Keep track of the number
    
    public NumberGames(double startingNumber)     // Constructor
    {
        num = startingNumber;
    }
    
    public double getNumber()      // Returns the number
    {
        return num;
    }
    
    // Doubles the number and Returns the doubled number
    public double doubleNumber()
    {
        num *= 2;
        return num;
    }
    
    // Squares the number and Returns the squared number
    public double squareNumber()
    {
        num *= num;
        return num;
    }   

}
