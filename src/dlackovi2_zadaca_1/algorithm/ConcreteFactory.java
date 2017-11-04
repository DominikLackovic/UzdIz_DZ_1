/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlackovi2_zadaca_1.algorithm;

/**
 *
 * @author foobar
 */
public class ConcreteFactory extends AlgorithmFactory
{

    public Algorithm createAlgorithm(String type)
    {
        if (type.equals("Oracle"))
        {
            //return new SecureOracleConnection();
        }
        else
        {
            if (type.equals("SQL Server"))
            {
                //return new SecureSqlServerConnection();
            }
            else
            {
                //return new SecureMySqlConnection();
            }
        }
        
        return null;
    }
}
