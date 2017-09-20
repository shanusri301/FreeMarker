package com.fnp.FTL;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class Demo {
	 public static void main(String[] args) throws IOException, TemplateException {
		Configuration cfg = new Configuration();
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		cfg.setDirectoryForTemplateLoading(new File("."));
		Map<String,Object> model = new HashMap();
		model.put("string", "easy & fast "); 
		model.put("number", new BigDecimal("1234.5678"));
		model.put("boolean", true);
		model.put("object", Locale.US);
		Template template = cfg.getTemplate("FTLDemo.ftl");
		template.process(model,new OutputStreamWriter(System.out));
	}
	
	
}
