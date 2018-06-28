package com.bgb.logger.util;

import org.codehaus.jackson.map.ObjectMapper;


/**
 * @description 解决Date类型返回json格式为自定义格式
 * @author aokunsang
 * @date 2013-5-28
 */
public class CustomObjectMapper extends ObjectMapper {
	
	/*private Log log = LogFactory.getLog(this.getClass());

	public CustomObjectMapper() {
		final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

		
		// 年月日
		CustomSerializerFactory factory = new CustomSerializerFactory();
		factory.addGenericMapping(java.sql.Date.class, new JsonSerializer<Date>() {
			@Override
			public void serialize(Date value, JsonGenerator jsonGenerator, SerializerProvider provider)
					throws IOException, JsonProcessingException {
				// System.out.println("dateFormat");
				try{
					jsonGenerator.writeString(dateFormat.format(value));
				}catch(Exception e){
					jsonGenerator.writeString("");
				}
			}
		});

		// 时分秒
		factory.addGenericMapping(java.sql.Time.class, new JsonSerializer<Date>() {
			@Override
			public void serialize(Date value, JsonGenerator jsonGenerator, SerializerProvider provider)
					throws IOException, JsonProcessingException {
				// System.out.println("timeFormat");
				try{
					jsonGenerator.writeString(timeFormat.format(value));
				}catch(Exception e){
					jsonGenerator.writeString("");
				}
			}
		});

		// 年月日//时分秒
		factory.addGenericMapping(java.sql.Timestamp.class, new JsonSerializer<Date>() {
			@Override
			public void serialize(Date value, JsonGenerator jsonGenerator, SerializerProvider provider)
					throws IOException, JsonProcessingException {
				try{
					jsonGenerator.writeString(DateUtil.utc2Local(dateTimeFormat.format(value)));
				}catch(Exception e){
					jsonGenerator.writeString("");
				}
				 
				// System.out.println(">>>dateTimeFormat");
			}
		});

		// 年月日//时分秒
		factory.addGenericMapping(Date.class, new JsonSerializer<Date>() {
			@Override
			public void serialize(Date value, JsonGenerator jsonGenerator, SerializerProvider provider)
					throws IOException, JsonProcessingException {
				// System.out.println("dateTimeFormat");
				try{
					jsonGenerator.writeString(dateTimeFormat.format(value));
				}catch(Exception e){
					jsonGenerator.writeString("");
				}
				// System.out.println(">>>dateTimeFormat");
			}
		});

		this.setSerializerFactory(factory);
	}*/
}