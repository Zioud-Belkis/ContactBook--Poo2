package poo2;

public interface Manageable {

	    public void add(Contact contact);
	    public Contact search(String name);
	    public boolean remove(String name);
	    public boolean shareContact(String name, ContactBook targetContactBook);
	}
