package protocolbuffer;

public static void main(String[] args) throws Exception {
  
  User.Profile profile =
      User.Profile.newBuilder()
          .setName("Jack")
          .setAge(15)
          .build();

  System.out.println(profile.toString());
}
