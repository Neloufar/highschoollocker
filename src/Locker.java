
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author neliloghmani
 */
public class Locker {
    
    int lockerNumber;
    int numberOfBooks;
    String name;
   private CombinationLock lockerCombination = new CombinationLock();
    
    
    public Locker()
    {
         
        lockerNumber = 0;
        numberOfBooks = 0;
        name = "";
        lockerCombination.resetDial();
        
    }
    public Locker(CombinationLock lockerCombinations, int lockerNumber, int numberOfBooks, String name)
    {
        this.lockerNumber = lockerNumber;
        this.name = name;
        this.numberOfBooks = numberOfBooks;
        this.lockerCombination = lockerCombinations;
    }
    
    public void setName ( String name )
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setLocker (int lockerNumber)
    {
        this.lockerNumber = lockerNumber;
    }
    public int getLocker()
    {
        return lockerNumber;
    }

    public void setCombo(int firstCombo, int secondCombo, int thirdCombo) {
        
        this.lockerCombination.setComboOne(firstCombo);
        this.lockerCombination.setComboTwo(secondCombo);
        this.lockerCombination.setComboThree(thirdCombo);

       
    }
    public String getLockerCombination()
    {
        return lockerCombination.toString();
    }
    public void putBookInLocker()
    {
      
        Scanner kbd = new Scanner(System.in);
        System.out.println("How many books would you like to put in your locker?");
        int books = kbd.nextInt();
        this.numberOfBooks = books;
        
    }
    public void removeBookFromLocker(int numberOfBooks)
    {
        this.numberOfBooks = numberOfBooks;
        numberOfBooks -=1;
    }
    public void openLocker(int firstCombo,int secondCombo,int thirdCombo)
    {
        System.out.println("Enter the three digit locker combination");
        Scanner kbd = new Scanner(System.in);
        firstCombo = kbd.nextInt();
        secondCombo = kbd.nextInt();
        thirdCombo = kbd.nextInt();
       
       if(lockerCombination.openLock())
       {
           
           System.out.println("The locker is opened");
       }
        else
       {
           
           System.out.println("Incorrect Combination");
       }
    }
    public String toString() 
    {
	return "\nLocker Numner :" + lockerNumber + ", \nStudent's name: " + name +
        ", \nNumber of books in locker: " + numberOfBooks +"\n"; 
    }
    
}
            
           
