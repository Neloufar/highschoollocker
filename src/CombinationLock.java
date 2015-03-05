/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author neliloghmani
 */
public class CombinationLock {
    
    int comboOne;
    int comboTwo;       //states the variables
    int comboThree;
    int currentPosition;
 
public CombinationLock()
{
    this.comboOne = 0;
    this.comboTwo = 0;    // sets intial variable to zero
    this.comboThree = 0;
    
}

public CombinationLock(int comboOne, int comboTwo, int comboThree) // 
{
    this.comboOne = comboOne;
    this.comboTwo = comboTwo;
    this.comboThree = comboThree;
}
    public void setComboOne (int comboOne)
        {
        this.comboOne = comboOne;
        }
    public int getComboOne()
        {
            return comboOne;
        }
    public void setComboTwo (int comboTwo)
        {
        this.comboTwo = comboTwo;
        }
    public int getComboTwo()
        {
            return comboTwo;
        }
    public void setComboThree (int comboThree)
        {
        this.comboThree = comboThree;
        }
    public int getComboThree()
        {
            return comboThree;
        }
public void resetDial ()
{
    comboOne = 0;
    comboTwo = 0;
    comboThree = 0;
    currentPosition = 0;
}
public void turnLeft(int ticks)
{
    currentPosition -= ticks;
}
public void turnRight(int ticks)
{
    currentPosition += ticks;
}
public boolean openLock()
{
        return (comboOne == currentPosition) && (comboTwo == currentPosition) && (comboThree == currentPosition);
     
    
}
    
}
