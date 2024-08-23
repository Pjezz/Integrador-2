import java.sql.Time;
import java.util.Date;

public class Evento {
   private String Encargado;
   private String Nombre_Evento;
   private String Tipo_Evento;
   private Date Fecha;
   private Time Hora_Inicio;
   private Time Hora_Fin;
   private Salon Salon_asignado;

public Evento(String Encargado, String Nombre_Evento, String Tipo_Evento, Date Fecha, Time Hora_Inicio, Time Hora_Fin, Salon Salon_asignado){
    this.Encargado = Encargado;
    this.Nombre_Evento = Nombre_Evento;
    this.Tipo_Evento = Tipo_Evento;
    this.Fecha = Fecha;
    this.Hora_Inicio = Hora_Inicio;
    this.Hora_Fin = Hora_Fin;
    this.Salon_asignado = Salon_asignado;
}

public String getEncargado (){
    return Encargado;
}

public String getNombre_Evento(){
    return Nombre_Evento;
}

public String getTipo_Evento(){
    return Tipo_Evento;
}

public Date getFecha (){
    return Fecha;
}

public Time getHora_Inicio(){
    return Hora_Inicio;
}
public Time getHora_Fin(){
    return Hora_Fin;
}

public Salon getSalon(){
    return Salon_asignado;
}
}
