
/**
 * The {@code GrandChild0201} class represents a grandchild of child 02.
 *
 * @author Iuliana Cosmina on 2/8/18
 */
public class GrandChild0201 {

    private String name;

    /**
     * Initializes a newly created {@code GrandChild0201} object so that it represents
     * a grandchild of child 02.
     *
     * @param name The name of the grandson
     */
    public GrandChild0201(String name) {
        this.name = name.substring(0, 3);

    }

    public String getName() {
        return name;
    }
}
