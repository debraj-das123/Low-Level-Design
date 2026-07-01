package DesignPattern.BuilderPattern;
class User{
  private  String name;
  private String email;
  private int age;

  public User(String name, String email, int age){
    this.age = age;
    this.name = name;
    this.email = email;

  }

      public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

}
// step interface
interface Namestep{
  Emailstep name(String name);
}

interface Emailstep{
  Optionalstep email(String email);
}

interface Optionalstep{
  Optionalstep age(int age);
  User build();
}

// step builder
 class UserBuilder
        implements Namestep,
                   Emailstep,
                   Optionalstep {

    private String name;
    private String email;
    private int age;

    private UserBuilder() {
    }

    public static Namestep builder() {
        return new UserBuilder();
    }

    @Override
    public Emailstep name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Optionalstep email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public Optionalstep age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public User build() {
        return new User(name, email, age);
    }
}

public class StepBuilder {
  public static void main(String[] args) {
    User user = UserBuilder.builder()
          .name("debraj")
          .email("ascjbskc")
          .age(76)
          .build();
    System.out.println(user);      
  }
}
