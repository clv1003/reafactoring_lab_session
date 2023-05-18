package lanSimulation.internals;

import lanSimulation.Network;

public class WorkStation extends Node {

	public WorkStation(String name, Node nextNode) {
		super(name, nextNode);
	}
	
	public WorkStation(String name) {
		super(name);
	}
	
	public void send(StringBuffer buf, Network network) {
		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");
	}
	
	public void sendXML(StringBuffer buf, Network network) {
		buf.append("<workstation>");
		buf.append(name_);
		buf.append("</workstation>");
	}
	
}
