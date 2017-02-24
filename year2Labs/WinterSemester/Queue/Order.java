public class Order {

        private String customer;

	private int qtty;

		public Order(int qtty, String customer) {

			this.customer=customer;

			this.qtty = qtty;

		}

		public void print (){

			System.out.println("     Customer: " + this.getCustomer());

			System.out.println("     Quantity: " + this.getQtty());

			System.out.println("     ------------");

		}

		public int getQtty(){

			return this.qtty;

		}

		public String getCustomer(){

			return this.customer;

		}

}


	  
