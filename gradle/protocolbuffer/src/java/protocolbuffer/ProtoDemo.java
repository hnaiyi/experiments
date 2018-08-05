package protocolbuffer;

public class ProtoDemo {

  public static void main(String[] args) {
    
    User.Profile profile =
        User.Profile.newBuilder()
            .setName("Jack")
            .setAge(15)
            .build();
  
    System.out.println(profile.toString());
  }
}
