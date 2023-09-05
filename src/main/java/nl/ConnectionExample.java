package nl;

import com.whatsapp.proto.WA4Protos;
import nl.ben221199.wapi.Connection;
import nl.ben221199.wapi.FunInputStream;
import nl.ben221199.wapi.FunOutputStream;

import java.io.IOException;
import java.security.KeyPair;
import java.security.PublicKey;

public class ConnectionExample{

	public static void main(String... args) throws IOException {
		//Connection arguments
		byte[] edge_routing_info = null;
		KeyPair client_static_keypair = null;
		PublicKey server_static_key = null;
		WA4Protos.ClientPayload payload = null;

		//Create connection
		Connection conn = new Connection("g.whatsapp.net",443)
			.setEdgeRoutingInfo(edge_routing_info)
			.setS(client_static_keypair)
			.setRS(server_static_key)
			.setPayload(payload);

		//Start connection
		conn.start();

		//Get IO
		FunInputStream in = conn.getInputStream();
		FunOutputStream out = conn.getOutputStream();
	}

}