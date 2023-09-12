package goddrinksjava;

import java.util.HashSet;

/**
 * Created by syuchan on 2016/10/17.
 */
public class OriginalSet<T> extends HashSet {

	public Attribute toAttribute() {
		return new Attribute();
	}
}
