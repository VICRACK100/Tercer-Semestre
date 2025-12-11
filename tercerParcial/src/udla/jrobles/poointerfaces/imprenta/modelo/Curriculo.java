package udla.jrobles.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja{
private String persona ;
private String profesion;
private List<String> conocimiento;


    public Curriculo(String persona, String profesion,String contenido) {
        super(contenido);
        this.persona = persona;
        this.profesion = profesion;
        this.conocimiento = new ArrayList<>();
    }

    public Curriculo addConocimiento(String conocimient){
        conocimiento.add(conocimient);
return this;
    }


    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre y Apellido");
        sb.append(this.persona).append("\n")
                .append("Resumen : ").append(this.contenido).append("\n")
                .append("Profesion : ").append(this.profesion).append("\n")
                .append("Conocimientos : ").append("\n");

        for (String conocimient: this.conocimiento) {
            sb.append("-").append(conocimient).append("\n");
        }
        return sb.toString();
    }
}
