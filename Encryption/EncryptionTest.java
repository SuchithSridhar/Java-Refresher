import java.io.File;
import java.util.Scanner;

public class EncryptionTest {
	public static void main(String[] args){
		String key;
		Scanner sc;
		File in;
		File encrypted;
		File decrypted;

		sc = new Scanner(System.in);
		System.out.print("Enter passcode for encryption:");
		key = sc.nextLine();
		in = new File("document.txt");
		encrypted = new File("document.enc");
		decrypted = new File("document.dec");

		try{
			Encryption.encrypt(key, in, encrypted);
			Encryption.decrypt(key, encrypted, decrypted);
		} catch (CryptoException ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}

