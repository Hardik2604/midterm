/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm Exam
 * @author srinivsi
 */

public class StausUser 
{
    public enum val
    {zero,one,two,three}
   public void statusDetail(String code)
{
switch(code.toLowerCase())
        {
        case "zero": System.out.println("REJECTED");
        break;
        case "one": System.out.println("PENDING");
        break;
        case "two":
        System.out.println("PROCESSING");
        break;
        case "three": 
            System.out.println("APPROVED");
        break;
        case "four": 
            System.out.println("completed");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
 
}
