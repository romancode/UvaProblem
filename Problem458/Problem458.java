package p458;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;


public class Problem458 {

	public static void main(String[] args) throws IOException {

		DataInputStream in = new DataInputStream(System.in);
		DataOutputStream output = new DataOutputStream(System.out) ;
		byte ch;
		try {
			while (true) {
				ch = decode(in.readByte());
				output.writeByte(ch);
				output.flush();
			}
		} catch (EOFException eof) {}
	}

	public static byte decode(byte ch){

		if (ch != 10 && ch != 13)
			ch = (byte)(ch - 7);

		return ch;
	}
}


