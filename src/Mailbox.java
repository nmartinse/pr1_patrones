import java.util.ArrayList;

public class Mailbox {

	private Criterio criterio;
	private ArrayList<Email> email;

	public Mailbox() {
		email = new ArrayList<Email>();
	}

	public void show() {
	}

	private void sort() {
		for (int i = 2; i <= email.size(); i++)
			for (int j = email.size(); j >= i; j--)
				if (before(email.get(j), email.get(j-1))) {
					// intercambiar los mensajes j y j-1
				}
	}

	private boolean before(Email m1, Email m2) {
		return criterio.before(m1, m2);
	}

	public void setCriterio(Criterio c) {
		this.criterio = c;
	}
}

