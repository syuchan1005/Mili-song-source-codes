package goddrinksjava;

/**
 * Created by syuchan on 2016/10/17.
 */
public interface Sequence {
	void setLimit(Limit limit);

	Limit toLimit();
}
