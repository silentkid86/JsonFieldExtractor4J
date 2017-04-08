package org.silentkid;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSONFieldExtractor {

	static ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
	private Invocable invocable;
	
	public JSONFieldExtractor(){
		ClassLoader classLoader = getClass().getClassLoader();
		try {
			engine.eval(new FileReader(classLoader.getResource("function.js").getFile()));
			invocable = (Invocable) engine;
		} catch (FileNotFoundException | ScriptException e) {
			e.printStackTrace();
		} 
	}

	public String getJsonField(String jsonStr,String fieldname) throws NoSuchMethodException, ScriptException {
		Object result = invocable.invokeFunction("getFieldName", jsonStr,fieldname);
		System.out.println(result);
		System.out.println(result.getClass());
		
		return String.valueOf(result);

		
	}
	
}
