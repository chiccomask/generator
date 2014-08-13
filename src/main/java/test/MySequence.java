/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.persistence.internal.databaseaccess.Accessor;
import org.eclipse.persistence.internal.sessions.AbstractSession;
import org.eclipse.persistence.sequencing.StandardSequence;

/**
 *
 * @author chiccomask
 */
public class MySequence extends StandardSequence {

    public MySequence(String simple) {
        super(simple);
    }

    public MySequence() {
        super();
    }

    final static AtomicInteger i = new AtomicInteger();

    @Override
    protected Number updateAndSelectSequence(Accessor accessor, AbstractSession writeSession, String seqName, int size) {

        System.out.println("seqName=" + seqName + " size=" + size);

        return i.getAndIncrement();
    }

    @Override
    public boolean shouldAcquireValueAfterInsert() {
        return true;
    }

    @Override
    public boolean shouldUseTransaction() {
        return false;
    }

}
