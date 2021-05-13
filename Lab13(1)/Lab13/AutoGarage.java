public class AutoGarage {
   public AutoGarage() {
      System.out.println("Welcome to the auto garage");
   }
   
   public void fullService(Car c) {
      this.rotateTires(c);
      this.changeOil(c);
      c.refuel();
   }
   
   public void rotateTires(Car c) {
      System.out.println("Rotating tires on a " + c);
   }
      
   public void changeOil(Car c) {
      // task 3: put this next line in a try..catch block
      c.completeOilChange();
   }
}