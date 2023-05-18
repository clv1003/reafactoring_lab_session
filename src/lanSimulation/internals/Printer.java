package lanSimulation.internals;

import lanSimulation.Network;

public class Printer extends Node {

	public Printer(byte type, String name, Node nextNode) {
		super(type, name, nextNode);
	}
	
	public Printer(byte type, String name) {
		super(type, name);
	}
	
	public void send(StringBuffer buf, Network network) {
		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");
	}
	
	public void sendXML(StringBuffer buf, Network network) {
		buf.append("<printer>");
		buf.append(name_);
		buf.append("</printer>");
	}
	
}
