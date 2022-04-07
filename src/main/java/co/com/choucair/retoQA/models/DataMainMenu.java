package co.com.choucair.retoQA.models;

public class DataMainMenu {

    private String servicios,industrias,formacion,comunidad,empleos,nosotros,contactenos;

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getIndustrias() {
        return industrias;
    }

    public void setIndustrias(String industrias) {
        this.industrias = industrias;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public String getEmpleos() {
        return empleos;
    }

    public void setEmpleos(String empleos) {
        this.empleos = empleos;
    }

    public String getNosotros() {
        return nosotros;
    }

    public void setNosotros(String nosotros) {
        this.nosotros = nosotros;
    }

    public String getContactenos() {
        return contactenos;
    }

    public void setContactenos(String contactenos) {
        this.contactenos = contactenos;
    }

    @Override
    public String toString() {
        return "DataMainMenu{" +
                "servicios='" + servicios + '\'' +
                ", industrias='" + industrias + '\'' +
                ", formacion='" + formacion + '\'' +
                ", comunidad='" + comunidad + '\'' +
                ", empleos='" + empleos + '\'' +
                ", nosotros='" + nosotros + '\'' +
                ", contactenos='" + contactenos + '\'' +
                '}';
    }
}
