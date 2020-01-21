package com.sg.lab.mybatis.generator.plugins;

import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;

public class CacheMapperIfacePlugin extends PluginAdapter{
	private static final String cacheNamespaceFQN = "org.apache.ibatis.annotations.CacheNamespace";
	public boolean validate(List<String> warnings) {
		return true;
	}
    @Override
    public boolean clientGenerated(Interface interfaze,
            IntrospectedTable introspectedTable) {
    	interfaze.addImportedType(new FullyQualifiedJavaType(cacheNamespaceFQN));
    	Properties prop = getProperties();
    	Set<Entry<Object, Object>> entrySet = prop.entrySet();
    	String cacheValue = "";
    	int size = entrySet.size();
    	int ii = 0;
    	for (Entry<Object, Object> entry : entrySet) {
			String name = (String)entry.getKey();
			String value = (String) entry.getValue();
			
			cacheValue+=name+"="+value;
			if(ii<size-1) {
				cacheValue+=",\n";
			}
			ii++;
		}
    	

    	
    	 StringBuilder sb = new StringBuilder();
		sb.append("@CacheNamespace(\n").append(cacheValue).append("\n)");
         interfaze.addAnnotation(sb.toString());
    	
        return true;
    }
}
