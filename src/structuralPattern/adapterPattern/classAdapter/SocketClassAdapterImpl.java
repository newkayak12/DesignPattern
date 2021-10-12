package structuralPattern.adapterPattern.classAdapter;

import java.net.Socket;

import structuralPattern.adapterPattern.SocketAdapter;
import structuralPattern.adapterPattern.Sockets;
import structuralPattern.adapterPattern.Volt;

public class SocketClassAdapterImpl extends Sockets implements SocketAdapter {

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		return convertVolt(getVolt(), 10);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		return convertVolt(getVolt(), 40);
	}

	private Volt convertVolt(Volt v, int i ){
		return new Volt(v.getVolts()/i);
	}
	
}
