package problen3;

public class BookMyMovie {
	
	private int movieId;
	private int noOfTickets;
	private double discount;
	private double totalAmount;
	
	private static double discountPrice; 
	
    public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

     public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
    
	public BookMyMovie(int movieId, int noOfTickets) {
		super();
		this.movieId = movieId;
		this.noOfTickets = noOfTickets;
	}
	
	public double calculateDiscount() {
		if((movieId==101 || movieId ==102  || movieId== 103) && noOfTickets <5) {
			return 0;
		}
		
		else if ((movieId ==101 || movieId ==103) && (noOfTickets >=5 && noOfTickets<10)){
			return 15;
			
		}
		else if ((movieId ==101 || movieId ==103) && (noOfTickets >=10 && noOfTickets<=15)){
			return 20;
			
		}
		
		else if (movieId ==102 && (noOfTickets >=5 && noOfTickets<10)){
			return 15;
			
		}
		
		else if (movieId ==102 && (noOfTickets >=10 && noOfTickets<=15)){
			return 15;
			
		}
		
		else {
			
			return 0;
			
			}
		
			}
		

	
	public double calculateTicketAmount() {
		
		if(movieId == 101) {
			
			
			double amount =((120*noOfTickets) -(120*noOfTickets*discountPrice/100));
			return amount;
		}
		
		else if(movieId == 102) {
			
			
			double amount =((170*noOfTickets) -(170*noOfTickets*discountPrice/100));
			return amount;
		}
		else if(movieId == 103) {
	
	       
	       double amount =((150*noOfTickets) -(150*noOfTickets*discountPrice/100));
	       return amount;
        }
		
		
		return 0;
		
		 
		
	}
	
	//public class Check{

	public static void main(String[] args) {
		
		BookMyMovie bookmymovie=new BookMyMovie(101,5);
		discountPrice=bookmymovie.calculateDiscount();
		
		double amount=bookmymovie.calculateTicketAmount();
		
		if(amount ==0) {
			System.out.println("please enter valid movieid");
		}
		else {
			System.out.println("total amount of booking :"+ amount);
		}
		

	}
}
//}
