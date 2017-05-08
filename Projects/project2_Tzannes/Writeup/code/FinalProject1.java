// Katerina Tzanenes
// Dr. Rivas
// Final Project
// Version 1
// May 8, 2017

import javax.swing.JOptionPane;
import java.util.*;

public class FinalProject1 {

  public static void main(String[] args) {
    
    System.out.println("Welcome to the Happy Retirment Calculator!");
    System.out.println("You will be asked a series of questions that will be"
        + " calculated ");
    System.out.println("to help determine if you will be able to retire "
        + "comfortably or not.");
    System.out.println("Please read each question carefully and enter the value"
        + " that is asked for.");
    System.out.println("When entering a number please omit any commas and/or"
        + " dollar signs.");
    System.out.println("This is just an estimate and you make choices at "
        + "your own risk");
    System.out.println("I am not liable for any homelessness due to "
        + "early retirment.");
    System.out.println("_____________________________________________________");
    
    Scanner input = new Scanner (System.in);
    
    int age;
    // avoid all next line change to next
    do{
    System.out.println("How old are you?");
    age = input.nextInt();
    
    if (age <= 0 || age >= 122)     
      System.out.println("Invalid Entry");
    // oldest person alive is 122
    }while (age <= 0 || age >= 122);
      
      
    int years = 62 - age;
    
    // check if currently elidgble to retire
    if (age >= 62){
      // to prevent a negative number from appearing at the end of the program
      years = 0;
      System.out.println("You are legally able to retire.");
      System.out.println("Now you will be asked furhter questions to estimate "
        + "if your financially able to retire.");
    }
    
      

    System.out.println("Do you currently have a paying job? (yes/no)");
    String jobStat = input.next();

    // further questions for those who work
    if (jobStat.equals("yes") || jobStat.equals("Yes") || jobStat.equals("y") 
        || jobStat.equals("Y")){
      System.out.println("Will you be a homeowner when you retire? (yes/no)");
      String homeowner = input.next();
        
      // further questions for homeowners 
      if (homeowner.equals("yes") || homeowner.equals("Yes") || homeowner.equals("y")
          || homeowner.equals("Y")){
        System.out.println("When you retire will you upgrade(1), downgrade(2), "
            + "renovate(3), or same living conditions(4)?");
        int home = input.nextInt();
      
        // further questions about your house cost plans
        switch (home){
        case 3:
          int timeToRenovate = JOptionPane.showConfirmDialog(null, "Will the "
              + "home renovation be complete in 1 year?", "Home Renovation", 
              JOptionPane.YES_NO_OPTION);
          if (timeToRenovate == JOptionPane.YES_OPTION){
            System.out.println("How much money does your home cost yearly?");
            double homeCostYearly = input.nextDouble();
            System.out.println("How many years are you expecting to live there?");
            int homeYears = input.nextInt();
            System.out.println("How much money will the renovation cost?");
            double homeRenovationCost = input.nextDouble();
            double renovateHomeTotal = homeRenovationCost + (homeYears * 
                homeCostYearly);
            // rounds 2 decimal places and skips to next line
            System.out.printf("You will spend a total of $%.2f if you plan to d"
                + "  this.\n", renovateHomeTotal);
          }
          else{
            System.out.println("How much money does your home cost yearly?");
            double homeCostYearly = input.nextDouble();
            System.out.println("How many years are you expecting to live there?");
            int homeYears = input.nextInt();
            System.out.println("How many years will the renovation take?");
            double yearsHomeRenovationCost = input.nextDouble();
            System.out.println("How much will your home renovation cost per"
                + " year?");
            double homeRenovationCostPerYear = input.nextDouble();
            double homeRenovationTotal = (yearsHomeRenovationCost * 
                homeRenovationCostPerYear) + (homeCostYearly * homeYears);
            System.out.printf("You will spend a total of $%.2f if you plan to "
                + "do this.\n",homeRenovationTotal);
          } break;
        case 1:
          int upgrade = JOptionPane.showConfirmDialog(null, "Will your upgraded"
              + " home be a one time cost?", "Home Upgrade", 
              JOptionPane.YES_NO_OPTION);
          if (upgrade == JOptionPane.YES_OPTION){
            System.out.println("How much money will your upgraded home cost "
                + "per year?");
            double homeUpgradeCostYearly = input.nextDouble();
            System.out.println("How many years are you expecting to live there?");
            int homeYears = input.nextInt();
            System.out.printf("You will spend a total of $%.2f to live in an "
                + "upgraded home.\n",  (homeUpgradeCostYearly * homeYears));
          }
          else{
            System.out.println("How many years will you have to pay for your "
                + "home upgrade?");
            double yearsHomeUpgradeCost = input.nextDouble();
            System.out.println("How much will your home upgrade cost per year?");
            double homeUpgradeCostPerYear = input.nextDouble();
            double homeUpgradeCostTotal = yearsHomeUpgradeCost * homeUpgradeCostPerYear;
            System.out.printf("You will spend a total of $%.2f to to upgrade "
                + "your home.\n", homeUpgradeCostTotal);
          } break;
        case 2:
          System.out.println("How much will your downgraded home cost yearly?");
          double homeDowngradeCost = input.nextDouble();
          System.out.println("How many years do you expect to live there?");
          int homeDowngradeYears = input.nextInt();
          double homeDowngradeTotal = homeDowngradeYears * homeDowngradeCost;
          System.out.printf("Your downgraded home will cost you a total of $%.2f"
              + "\n", homeDowngradeTotal);
          break;
        case 4:
          System.out.println("How much does your home currently cost?");
          double homeCostPerYear = input.nextDouble();
          System.out.println("Do you expect inflation to increase/decrease "
              + "your cost per year?");
          String inflate = input.next();       
          if (inflate.equals("yes")){
            System.out.println("How much % do you expect it to increase?");
            double percentInflate = input.nextDouble();
            double homeInflatedCost = homeCostPerYear + (percentInflate/100); 
            System.out.printf("Your home will cost $%.2f per year\n", 
                homeInflatedCost);
          }
          else{
            System.out.printf("You will continue to pay $%.2f yearly\n", 
                homeCostPerYear);
          }
          break;
        }
      }
      // further questions for non-homeowners
      else{
        System.out.println("Where will you live when you retire? (with friends(1), "
            + "with family(2), nursing home(3), assisted living(4), homeless(5))");
        int livingPlace = input.nextInt();
          
        // questions regarding ones situation
        switch(livingPlace){
          case 1: // same as with family so no break
          case 2:
            System.out.println("Do you pay anything while living with them? "
                + "(yes/no)");
            String friendFamilyPay = input.next();
              
            // if you pay while living with friends or family
            if (friendFamilyPay.equals("yes") || friendFamilyPay.equals("Yes") 
                || friendFamilyPay.equals("Y") || friendFamilyPay.equals("y")){
              System.out.println("About how many years will you live with them?");
              int yearsFriendFamily = input.nextInt();
              System.out.println("How much do you pay a year to live with them?");
              double priceFriendFamily = input.nextDouble();
              double totalPriceFriendFamily = yearsFriendFamily * priceFriendFamily;
              System.out.printf("You will spend about $%.2f while living with them."
                  + "\n", totalPriceFriendFamily);
            }
            else{
              System.out.println("You wont be spending any money for housing, "
                  + "nice!");
            }
            break;
          case 3:
          case 4:
            System.out.println("How many years do you think you will live here?");
            int yearsInstitution = input.nextInt();
            System.out.println("How much are you paying this institution?");
            double priceOfInstitution = input.nextDouble();
            double totalPriceOfInstitution = priceOfInstitution * yearsInstitution;
            System.out.printf("You will pay about $%.2f for living here.\n", 
                totalPriceOfInstitution);
            break;
          case 5:
            System.out.println("Results: ");
            System.out.println("YOU WANT TO BE HOMELESS?!?!?!? \n Bad news: \n"
                + "Your going to live on the streets... \n Good news: \n  You"
                + " don't have to pay for any housing!");
            System.out.println("In case you were wondering, in " + years 
                + " years you will be 66 and legally able to retire.");
            System.exit(0);
            break;
        }
      }

    System.out.print("How much money do you already have saved up? -  $");
    double saved = input.nextDouble();
    // System.out.println(saved);
      
    System.out.println("What's your yearly salary?");
    double salary = input.nextDouble();
        
    // find precent of salary put aside to retire
    System.out.println("What percent of that salary do you put aside for retirement? (401K)");
    double percent = input.nextDouble();
    double percentSalaryYear = percent/100 * salary;
    
    System.out.println("How many more years do you expect to work?");
    int workYears = input.nextInt();
       
    // total money saved up
    double savedUpTotal = percentSalaryYear + saved + (workYears * percentSalaryYear);
    System.out.printf("You have a total estimate of $%.2f saved up in total for "
        + "you to use when you retire.\n", savedUpTotal);
    System.out.println("In " + years + " years you will be 66 and able to retire.");
    
    System.out.println("Now you can estimate if you will be able to afford retiring.");
    System.out.println("Work hard in order to prevent homelessness");
    System.out.println("Good Luck!");
    }
      
    // for those who dont have a job
    else{
      System.out.println("Results: ");
      System.out.println("In " + years + " years you will be 66 and able to retire.");
      System.out.println("Please come back again for a more advanced and accurate"
          + " estimate \nof your financial stability  for retirment when you have a job");
    }    
  }
}