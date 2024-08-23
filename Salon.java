// CLASE PRINCIPAL 
public class Salon {
    // ATRIBUTOS DE LA CLASE PRINCIPAL
    int id_salon;
    String tipo;
    int capacidad_maxima;
    int costo_por_hora;
    boolean disponibilidad;

    // CONSTRUCTOR DE LA CLASE PRINCIPAL
    public Salon(int id_salon, String tipo, int capacidad_maxima, int costo_por_hora, boolean disponibilidad) {
        this.id_salon = id_salon;
        this.tipo = tipo;
        this.capacidad_maxima = capacidad_maxima;
        this.costo_por_hora = costo_por_hora;
        this.disponibilidad = disponibilidad;
    }
    
    // METODO 1 DE LA CLASE PRINCIPAL:
