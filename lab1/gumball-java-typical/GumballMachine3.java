
/**
 * Write a description of class GumballMachine3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachine3 implements Gumball_Machine
{
    // instance variables - replace the example below with your own
    private int num_gumballs;
    private int coin_value;

    /**
     * Constructor for objects of class GumballMachine2
     */
    public GumballMachine3(int size)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.coin_value = 0;
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 )
            this.coin_value += 25 ;   
        else if ( coin == 5 )    
            this.coin_value += 5 ;
        else if ( coin == 10 )    
            this.coin_value += 10 ;
        else 
            this.coin_value += 0 ;
    }
    
    public void turnCrank()
    {
        if ( this.coin_value >= 50 )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.coin_value -= 50 ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }        
    }
}
