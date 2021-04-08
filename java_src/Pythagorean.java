public class Pythagorean {

    public double findHypote(int side1, int side2){
    //solving for sideC, the hyopotenuse;
        int bigA = side1 * side1;
        
        int bigB = side2 * side2;    
        
        int sumOfBigs = bigA + bigB;
        
        double hyopotenuse = Math.sqrt(sumOfBigs);
        //Refactor this later

        return hyopotenuse;

    }
}