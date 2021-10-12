package structuralPattern.adapterPattern.objectAdapter;

import structuralPattern.adapterPattern.SocketAdapter;
import structuralPattern.adapterPattern.Sockets;
import structuralPattern.adapterPattern.Volt;

public class SocketObjectAdapterImpl implements SocketAdapter{

	private Sockets sock = new Sockets();

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return sock.getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		return convertVolt(sock.getVolt(), 10);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		return convertVolt(sock.getVolt(), 40);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
	
}
