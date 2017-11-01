package dlackovi2_zadaca_1.validation;

import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author dlackovi2
 */
public class ArgumentValidator
{
    private int seed;
    private String placesFile;
    private String sensorsFile;
    private String actuatorsFile;
    private String algorithm;
    private int cycleDuration;
    private int nCycle;
    private String outputFile;

    public ArgumentValidator(int seed, String placesFile, String sensorsFile, String actuatorsFile, String algorithm, int cycleDuration, int nCycle, String outputFile)
    {
        this.seed = seed;
        this.placesFile = placesFile;
        this.sensorsFile = sensorsFile;
        this.actuatorsFile = actuatorsFile;
        this.algorithm = algorithm;
        this.cycleDuration = cycleDuration;
        this.nCycle = nCycle;
        this.outputFile = outputFile;
    }

    public int getSeed()
    {
        return seed;
    }

    public void setSeed(int seed)
    {
        this.seed = seed;
    }

    public String getPlacesFile()
    {
        return placesFile;
    }

    public void setPlacesFile(String placesFile)
    {
        this.placesFile = placesFile;
    }

    public String getSensorsFile()
    {
        return sensorsFile;
    }

    public void setSensorsFile(String sensorsFile)
    {
        this.sensorsFile = sensorsFile;
    }

    public String getActuatorsFile()
    {
        return actuatorsFile;
    }

    public void setActuatorsFile(String actuatorsFile)
    {
        this.actuatorsFile = actuatorsFile;
    }

    public String getAlgorithm()
    {
        return algorithm;
    }

    public void setAlgorithm(String algorithm)
    {
        this.algorithm = algorithm;
    }

    public int getCycleDuration()
    {
        return cycleDuration;
    }

    public void setCycleDuration(int cycleDuration)
    {
        this.cycleDuration = cycleDuration;
    }

    public int getnCycle()
    {
        return nCycle;
    }

    public void setnCycle(int nCycle)
    {
        this.nCycle = nCycle;
    }

    public String getOutputFile()
    {
        return outputFile;
    }

    public void setOutputFile(String outputFile)
    {
        this.outputFile = outputFile;
    }
    
    public void validate()
    {
        boolean hasError = false;
        
        System.out.println("Validating arguments...\n-----------------------");
        
        System.out.println("Working directory: " + System.getProperty("user.dir") + "\n");
        
        System.out.print("Seed: ");
        if(seed == (int)seed && seed > 99)
            System.out.println("SUCCESS");
        else
        {
            System.out.println("FAILURE");
            hasError = true;
        }
        
        System.out.print("Places: ");
        if(Files.exists(Paths.get(placesFile)))
            System.out.println("SUCCESS");
        else
        {
            System.out.println("FAILURE");
            hasError = true;
        }
        
        System.out.print("Sensors: ");
        if(Files.exists(Paths.get(sensorsFile)))
            System.out.println("SUCCESS");
        else
        {
            System.out.println("FAILURE");
            hasError = true;
        }
        
        System.out.print("Actuators: ");
        if(Files.exists(Paths.get(actuatorsFile)))
            System.out.println("SUCCESS");
        else
        {
            System.out.println("FAILURE");
            hasError = true;
        }
        
        System.out.print("Algorithm: ");
        if(!algorithm.equals(""))
            System.out.println("SUCCESS");
        else
        {
            System.out.println("FAILURE");
            hasError = true;
        }
        
        System.out.print("Cycle duration: ");
        if(cycleDuration == (int)cycleDuration)
            System.out.println("SUCCESS");
        else
        {
            System.out.println("FAILURE");
            hasError = true;
        }
        
        System.out.print("Number of cycles: ");
        if(nCycle == (int)nCycle)
            System.out.println("SUCCESS");
        else
        {
            System.out.println("FAILURE");
            hasError = true;
        }
        
        System.out.print("Output: ");
        if(outputFile.endsWith(".txt"))
            System.out.println("SUCCESS");
        else
        {
            System.out.println("FAILURE");
            hasError = true;
        }
        
        if(hasError)
        {
            System.out.println("\nQuiting...");
            System.exit(0);
        }
        else
            System.out.println("\nArguments OK.");
    }
}
