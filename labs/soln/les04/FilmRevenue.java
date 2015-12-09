
public class FilmRevenue {
    public long revenueValue  = 0L;
    public int movieGoers  = 1_700_000_272;
    public int ticketPrice = 10;
    
    public void calculateRevenue(){
        revenueValue  = (long) movieGoers * ticketPrice;
        System.out.println("Order total: "+ revenueValue);
    }
}
