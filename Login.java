import java.util.Scanner;

public class Login {
	private static String root;
	private static String masterpass;
	private String usuario;
	

	public Login() {
		root="Jose";
		masterpass="1234A";
	}

	public String GetUsuario() {
		return root;
	}

	public String GetPass() {
		return masterpass;
	}

	private void setUsuario(String usuario) {
		this.root = usuario;
	}

	private void setPass(String pass) {
		this.masterpass = pass;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Login log=new Login();
		String user;
		String clave;
		do {
			System.out.println("Ingresa el nombre de usuario");
			user=sc.next();
			System.out.println("Ingresa la contraseña");
			clave=sc.next();
			
			if(!(user.equals(log.GetUsuario()))) {
				System.out.println("El usuario es incorrecto");
			}
			if(!(clave.equals(log.GetPass()))) {
				System.out.println("La clave es incorrecta");
			}else if(clave.equals(log.GetPass()) && user.equals(log.GetUsuario()) ) {
				System.out.println("Ha iniciado sesion");
			}
		}while(!(clave.equals(log.GetPass()) && user.equals(log.GetUsuario())));
	}
}
