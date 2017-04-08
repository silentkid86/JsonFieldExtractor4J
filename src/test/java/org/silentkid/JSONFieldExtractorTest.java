package org.silentkid;
import javax.script.ScriptException;

import org.junit.Test;


public class JSONFieldExtractorTest {

	@Test
	public void testSimpleJson_singleField() {
		JSONFieldExtractor extractor = new JSONFieldExtractor();
		try {
			String jsonFieldValue = extractor.getJsonField("{\"a\":1,\"b\":2,\"c\":3}" , "b");
			System.out.println(jsonFieldValue);
		} catch (NoSuchMethodException | ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
