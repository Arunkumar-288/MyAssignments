package assignment_week3_day1_polymorphism;

public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println("Send request to: " + endpoint);
	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Send request to: " + endpoint + " | Request Body: " + requestBody);
        if (requestStatus) {
            System.out.println("Request was successful ");
        } else {
            System.out.println("Request failed ");
        }
}
		public static void main(String[] args) {
			APIClient client = new APIClient();
			client.sendRequest("https://apiclient.com");
			System.out.println("-------------------------");
			client.sendRequest("https://apiclient.com",
            "{ \"name\": \"Arun\", \"role\": \"Tester\" }",true);
			
		
}
}