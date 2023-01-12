package question9;

public class BookMyMovie {
	
	 private int movieId;
	    private int noOfTickets;
	    private double discount;
	    private double totalAmount;

	    public BookMyMovie(int movieId, int noOfTickets) {
	        this.movieId = movieId;
	        this.noOfTickets = noOfTickets;
	    }

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

	 

	    public double calculateDiscount() {

	 

	        if (this.movieId == 101 || this.movieId == 103) {
	            if (this.noOfTickets < 5) {
	                return 0;
	            } else if (this.noOfTickets >= 5 && this.noOfTickets < 10) {
	                return 15;
	            } else if (this.noOfTickets  >=10 && this.noOfTickets <= 15) {
	                return 20;
	            }
	        } else if (this.movieId == 102) {
	            if (this.noOfTickets < 5) {
	                return 0;
	            } else if (this.noOfTickets >= 5 && this.noOfTickets < 10) {
	                return 10;
	            } else if (this.noOfTickets  >=10 && this.noOfTickets <= 15) {
	                return 15;
	            }
	        } 
	        return 0;
	    }

	    public void calculateTicketAmount(){
	        int baseFare = 0;
	        double discount;

	        switch(this.movieId) {
	            case 101: 
	                baseFare = 120;
	                break;
	            case 102: 
	                baseFare = 170;
	                break;
	            case 103: ;
	                baseFare = 150;
	                break;
	            default: 
	                break;
	            }
	        discount = this.calculateDiscount();

	        this.totalAmount = 
	                baseFare * this.noOfTickets - (baseFare * this.noOfTickets * (discount/100)) ;
	        System.out.println("Total amount for booking: " + this.totalAmount);
	    }
}
	   
	   