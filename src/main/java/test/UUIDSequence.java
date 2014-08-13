/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.UUID;
import java.util.Vector;
import org.eclipse.persistence.internal.databaseaccess.Accessor;
import org.eclipse.persistence.internal.sessions.AbstractSession;
import org.eclipse.persistence.sequencing.Sequence;

public class UUIDSequence extends Sequence {

    public UUIDSequence() {
        super();
    }

    public UUIDSequence(String name) {
        super(name);
    }

    @Override
    public Object getGeneratedValue(Accessor accessor,
            AbstractSession writeSession, String seqName) {

                System.out.println("seqName=" + seqName + " size=" + size);
        
                return UUID.randomUUID().toString().toUpperCase().hashCode();
    }

    @Override
    public Vector getGeneratedVector(Accessor accessor,
            AbstractSession writeSession, String seqName, int size) {
        return null;
    }

    @Override
    public void onConnect() {
    }

    @Override
    public void onDisconnect() {
    }

    @Override
    public boolean shouldAcquireValueAfterInsert() {
        return false;
    }

    public boolean shouldOverrideExistingValue(String seqName,
            Object existingValue) {
        return ((String) existingValue).isEmpty();
    }

    @Override
    public boolean shouldUseTransaction() {
        return false;
    }

    @Override
    public boolean shouldUsePreallocation() {
        return false;
    }

}
