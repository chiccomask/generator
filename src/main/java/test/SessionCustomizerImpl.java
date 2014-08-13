/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
 
import java.util.UUID;
import java.util.Vector;
import org.eclipse.persistence.config.SessionCustomizer;
import org.eclipse.persistence.internal.databaseaccess.Accessor;
import org.eclipse.persistence.internal.sessions.AbstractSession;
import org.eclipse.persistence.sequencing.Sequence;
import org.eclipse.persistence.sequencing.TableSequence;
import org.eclipse.persistence.sessions.Session;

public class SessionCustomizerImpl  implements SessionCustomizer {
 
	
        @Override
	public void customize(Session session) throws Exception {
		UUIDSequence sequence = new UUIDSequence("system-uuid") ;
 
                MySequence sequence2 = new MySequence("simple") ;
                
		session.getLogin().addSequence(sequence);
                session.getLogin().addSequence(sequence2);
	}
 
}