package headfirst.decorator.starbuzz;
abstract class Beverage {
  String description="Unknown berverage";
  public String getDescription() {
    return  description;
  }
  public abstract double cost();
}

class Espresso extends Beverage {
  public Espresso() {
    description="Espresso";
  }
  public double cost() {
    return .99;
  }
}


class DarkRost extends Beverage {
  public DarkRost() {
    description="Dark Rost Coffee";
  }
  public double cost() {
    return .99;
  }
}


abstract class  CondimentDecortator extends Beverage {
 public abstract String getDescription();
}

class Mocha extends CondimentDecortator {
  Beverage beverage;
  public Mocha(Beverage b) {
    beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription()+",Mocha";
}
  public double cost() {
    return beverage.cost() + .20;
  }
}
class Whip extends  CondimentDecortator {
  Beverage beverage;
  public Whip(Beverage b) {
        beverage=b;
    }
  public String getDescription(){
  return beverage.getDescription() + ".Whip";
}
public double cost() {
    return beverage.cost() +.10;
  }
}
class Carame extends CondimentDecortator {
  Beverage beverage;
  public Carame(Beverage b) {
    beverage=b;
  }
  public String getDescription(){
  return beverage.getDescription() + ".Carame";
}
public double cost() {
    return beverage.cost() +.05;
  }
}
class Milk extends CondimentDecortator{
  Beverage beverage;
  public Milk(Beverage b) {
    beverage=b;
  }
  public String getDescription(){
  return beverage.getDescription() + ".Milk";
}
public double cost() {
    return beverage.cost() +.10;
  }
}
public class Makkiyatto {
  public static void main(String args[]) {
    Beverage b= new Espresso();
    
    Beverage md= new Milk(b);
    Beverage wmd= new Whip(md);
    Beverage mmd =new Carame(wmd);
   // Beverage wmd=new Whip(new Mocha(new DarkRost()));
    System.out.println(mmd.getDescription());
    System.out.println(mmd.cost());
  
  }
}