package assignment_week3_day2_interface;

	public interface DatabaseConnection {
		public void connect();
		public void disconnect();
		public void executeUpdate(String query);
 
}
