/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author neliloghmani
 */
public class LockerTest {
   
public static void main(String[] args) {
    
  
    Locker mickeyMouse = new Locker();
    mickeyMouse.name = ("Mickey Mouse");
    mickeyMouse.lockerNumber = (100);
    mickeyMouse.openLocker(28,17,39);
    mickeyMouse.putBookInLocker();
    
    System.out.printf(mickeyMouse.toString());
    
    Locker donaldDuck = new Locker();
    donaldDuck.name = ("Donald Duck");
    donaldDuck.lockerNumber = (275);
    donaldDuck.openLocker(35,16,27);
    donaldDuck.putBookInLocker();
    
    System.out.printf(donaldDuck.toString());

}
}
    
    


