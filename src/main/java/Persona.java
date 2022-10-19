public class Persona {

    private String nombre;
    private Long id;
    private String dni;
    private int edad;
    private float salario;


    public Persona(String nombre, Long id, String dni, int edad, float salario) {
        this.nombre= nombre;
        this.id = id;
        this.dni = dni;
        this.edad = edad;
        this.salario = salario;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

}
