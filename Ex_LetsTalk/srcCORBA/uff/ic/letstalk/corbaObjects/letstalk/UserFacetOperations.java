package uff.ic.letstalk.corbaObjects.letstalk;

/**
 * corbaObjects/letstalk/UserFacetOperations.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from letstalk.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min29s BRST
 */
public interface UserFacetOperations {

    void subscribe(String login, String password)
            throws uff.ic.letstalk.corbaObjects.letstalk.InvalidSubscriptionValues,
            uff.ic.letstalk.corbaObjects.scs.InternalError;

    int connect(String login, String password, org.omg.CORBA.Object host)
            throws uff.ic.letstalk.corbaObjects.scs.InvalidName,
            uff.ic.letstalk.corbaObjects.scs.InvalidConnection,
            uff.ic.letstalk.corbaObjects.scs.AlreadyConnected,
            uff.ic.letstalk.corbaObjects.scs.ExceededConnectionLimit,
            uff.ic.letstalk.corbaObjects.scs.InternalError;

    void disconnect(String login) throws uff.ic.letstalk.corbaObjects.scs.InvalidConnection, uff.ic.letstalk.corbaObjects.scs.NoConnection, uff.ic.letstalk.corbaObjects.scs.InternalError;

    String[] listUsers() throws uff.ic.letstalk.corbaObjects.scs.InternalError;
} // interface UserFacetOperations