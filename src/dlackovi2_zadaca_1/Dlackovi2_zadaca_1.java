package dlackovi2_zadaca_1;

import dlackovi2_zadaca_1.validation.ArgumentValidator;

/**
 *
 * @author dlackovi2
 */
public class Dlackovi2_zadaca_1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int seed;
        String placesFile;
        String sensorsFile;
        String actuatorsFile;
        String algorithm;
        int cycleDuration;
        int nCycle;
        String outputFile;
        
        if(args.length != 8)
        {
            System.out.println("Invalid argument length.");
            System.exit(0);
        }
        else
        {
            seed = Integer.parseInt(args[0]);
            placesFile = args[1];
            sensorsFile = args[2];
            actuatorsFile = args[3];
            algorithm = args[4];
            cycleDuration = Integer.parseInt(args[5]);
            nCycle = Integer.parseInt(args[6]);
            outputFile = args[7];
            
            ArgumentValidator validator = new ArgumentValidator(seed, placesFile, sensorsFile, actuatorsFile, algorithm, cycleDuration, nCycle, outputFile);
            validator.validate();
        } 
    }  
}
