package dio.academiadigital.infra.jackson;

import com.fasterxml.jackson.databind.SerializationFeature;
import dio.academiadigital.infra.jackson.deser.LocalDateDeserializer;
import dio.academiadigital.infra.jackson.deser.LocalDateTimeDeserializer;
import dio.academiadigital.infra.jackson.ser.LocalDateSerializer;
import dio.academiadigital.infra.jackson.ser.LocalDateTimeSerializer;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Venilton Falvo Jr
 */
@Configuration
public class ObjectMapperConfig implements Jackson2ObjectMapperBuilderCustomizer {
	
	@Override
	public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {
		jacksonObjectMapperBuilder.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		jacksonObjectMapperBuilder.serializerByType(LocalDate.class, new LocalDateSerializer());
		jacksonObjectMapperBuilder.serializerByType(LocalDateTime.class, new LocalDateTimeSerializer());
		jacksonObjectMapperBuilder.deserializerByType(LocalDate.class, new LocalDateDeserializer());
		jacksonObjectMapperBuilder.deserializerByType(LocalDateTime.class, new LocalDateTimeDeserializer());
	}
}
