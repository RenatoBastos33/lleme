package uff.ic.letstalk.corbaObjects.scs;

/**
 * corbaObjects/scs/ComponentAlreadyLoadedHolder.java . Generated by the
 * IDL-to-Java compiler (portable), version "3.2" from deployment.idl
 * Sexta-feira, 9 de Dezembro de 2005 18h26min28s BRST
 */

public final class ComponentAlreadyLoadedHolder implements
		org.omg.CORBA.portable.Streamable {
	public uff.ic.letstalk.corbaObjects.scs.ComponentAlreadyLoaded value = null;

	public ComponentAlreadyLoadedHolder() {
	}

	public ComponentAlreadyLoadedHolder(
			uff.ic.letstalk.corbaObjects.scs.ComponentAlreadyLoaded initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = uff.ic.letstalk.corbaObjects.scs.ComponentAlreadyLoadedHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		uff.ic.letstalk.corbaObjects.scs.ComponentAlreadyLoadedHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return uff.ic.letstalk.corbaObjects.scs.ComponentAlreadyLoadedHelper.type();
	}

}