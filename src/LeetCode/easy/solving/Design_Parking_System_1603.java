package LeetCode.easy.solving;

/**
 * Date-3/22/2023
 * Time-4:26 AM
 */
public class Design_Parking_System_1603 {
    public static void main(String[] args) {
          ParkingSystem obj = new ParkingSystem(1, 1, 0);
          System.out.println(obj.addCar(1));
          System.out.println(obj.addCar(2));
          System.out.println(obj.addCar(3));
          System.out.println(obj.addCar(1));
    }

  static   class ParkingSystem {

        int small;
        int medium;
        int big;

        public ParkingSystem(int big, int medium, int small) {
            this.small = small;
            this.medium = medium;
            this.big = big;
        }

        public boolean addCar(int carType) {
            if(carType==3){
                small--;
                return small>=0;
            }
            else if(carType==2){
                medium--;
                return medium>=0;
            }
            else{
                big--;
                return big>=0;
            }
        }
    }

}
