/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlackovi2_zadaca_1.algorithm;

/**
 *
 * @author dlackovi2
 */
public abstract class AlgorithmFactory
{
    public AlgorithmFactory()
    {
    }

    protected abstract Algorithm createAlgorithm(String type);
}
