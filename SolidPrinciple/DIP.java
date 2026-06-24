package SolidPrinciple;
interface Database{
  void connect();
}

class Mysql implements Database{
  public void connect(){
    System.out.println("connect mysql databse");
  }
}
class postgresql implements Database{
  public void connect(){
    System.out.println("connect postgreSql");
  }

}
class UserService{
  private Database database;
  public UserService(Database database){
    this.database = database;
  }
  public void  saveuser(){
    database.connect();
    System.out.println(" user saved");

  }

}



public class DIP {
  public static void main(String[] args) {
    
  }
  
}
