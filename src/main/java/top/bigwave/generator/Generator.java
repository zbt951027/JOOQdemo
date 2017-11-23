package top.bigwave.generator;

import org.jooq.util.GenerationTool;

public class Generator {
	public static void main(String[] args) throws Exception {
		GenerationTool.main(new String[] {"library.xml"});
	}
}
