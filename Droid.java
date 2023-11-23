public class Droid{
    int battery_level;
    String name;
  
    public Droid(String droidName){
      name = droidName;
      battery_level = 100;
    }
    public String toString(){
    return "Hello, I'm the droid: " + name;  
    }
    public void performTask(String task){
      System.out.println(name + " is performing task: " + task);
      battery_level -= 10;
    }
    public static void main(String[] args){
      Droid Codey = new Droid("Codey");
      System.out.println(Codey);
      Codey.performTask("jump");
      System.out.println(Codey.battery_level);
    }
  }
  