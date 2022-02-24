package pe.joelneyramos.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Data
@Document(collection="cliente")
public class Cliente {
	@Id
	private String id;
	private String nombre;
	private String apellido;
	private Integer edad;
	@DateTimeFormat(pattern="yyyy-MM-dd",iso=ISO.DATE)
	private LocalDate fechaNacimiento;
	
	

}
