/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrative_tools;

/**
 *
 * @author Sukky
 */
public class Fees {
    public static void main(String[] args) {
       
    }
    
}
class fee{
   
        String tutionfee="19999";
        String transport="24999";
        String miscelaneous="10100";
    
}
class cse extends fee{
    
       String LabEntryCard="500";
       String librarymembership="499";
       String bootcamp="1999";

    public String getLabEntryCard() {
        return LabEntryCard;
    }

    public String getLibrarymembership() {
        return librarymembership;
    }

    public String getBootcamp() {
        return bootcamp;
    }

    public String getTutionfee() {
        return tutionfee;
    }

    public String getTransport() {
        return transport;
    }

    public String getMiscelaneous() {
        return miscelaneous;
    }

    
   
    
    
}

class ece extends fee{
    
       String circuitLabEntryCard="500";
       String workshop1="499";
       String workshop2="1999";

    public String getCircuitLabEntryCard() {
        return circuitLabEntryCard;
    }

    public String getWorkshop1() {
        return workshop1;
    }

    public String getWorkshop2() {
        return workshop2;
    }

    public String getTutionfee() {
        return tutionfee;
    }

    public String getTransport() {
        return transport;
    }

    public String getMiscelaneous() {
        return miscelaneous;
    }

    
    
}

class civil extends fee{
    
       String LabEntryCard="500";
       String SiteVisit="499";
       String EngineeringStuff="1999";

    public String getLabEntryCard() {
        return LabEntryCard;
    }

    public String getSiteVisit() {
        return SiteVisit;
    }

    public String getEngineeringStuff() {
        return EngineeringStuff;
    }

    public String getTutionfee() {
        return tutionfee;
    }

    public String getTransport() {
        return transport;
    }

    public String getMiscelaneous() {
        return miscelaneous;
    }
    
}

class eee extends fee{
   
       String LabEntryCard="500";
       String librarymembership="499";
       String circuitStuff="1999";

    public String getLabEntryCard() {
        return LabEntryCard;
    }

    public String getLibrarymembership() {
        return librarymembership;
    }

    public String getCircuitStuff() {
        return circuitStuff;
    }

    public String getTutionfee() {
        return tutionfee;
    }

    public String getTransport() {
        return transport;
    }

    public String getMiscelaneous() {
        return miscelaneous;
    }
    
}
