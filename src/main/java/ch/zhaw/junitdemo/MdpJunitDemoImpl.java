package ch.zhaw.junitdemo;

public class MdpJunitDemoImpl implements IMdpJunitDemo {
	@Override
	public boolean isEmpty(String s) {
		return s == null || s == "";
	}

	@Override
	public String capitalize(String s) {
		StringBuilder sb = new StringBuilder(s.toLowerCase());
		sb.replace(0, 1, sb.substring(0,1).toUpperCase());
		return sb.toString();
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		if (s == null) throw new NullPointerException();
		return new StringBuffer(s).reverse().toString();
	}

	@Override
	public String join(String... strings) {
		StringBuilder sb = new StringBuilder();
		for (String s: strings) {
			sb.append(" " + s);
		}

		return sb.toString().trim();
	}
}
