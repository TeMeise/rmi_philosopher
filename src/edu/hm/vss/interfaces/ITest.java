package edu.hm.vss.interfaces;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Created by Joncn on 13.05.2015.
 */
public interface ITest extends Remote
{
    double doSomethingExpensive();
}
