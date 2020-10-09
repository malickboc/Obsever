
public class Main {
	
	public static void main(String[] args) {
		User us = new User("Malick");
	   Observer topic = new User("Bocoum");
		
		us.addFollower(us);
		//us.removeFollower("Malick");
		topic.update(us,"Testing!");
		System.out.println();
		Observer topic1 = new User(" Taylor Ripke");
			
		us.addFollower(us);
		topic1.update(us,"Testing!");

		User user1 = new User("Taylor Ripke");
		User user2 = new User("Alan Warner");
		User user3 = new User("Dylan Kelly");
		
		user1.addFollower(user2);
		user1.addFollower(user3);
		
		user1.tweet("Testing");
		
	  
  

	}


}
