/* じゃんけんに関する例外 */
public class JankenException extends Exception {
    public JankenException() {
	super();
    }

    public JankenException(String msg) {
	super(msg);
    }
}
