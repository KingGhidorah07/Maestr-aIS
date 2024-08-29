public class MyDate {

    private byte dia;
    private byte mes;
    private int anio;

    public MyDate(byte dia, byte mes, int anio) {
        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        if (dia > 0 && dia <= 31) {
            this.dia = dia;
        } else {
            System.out.println("No es un día válido");
        }
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("No es un mes válido");
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio > 1994 && anio <= 2024) {
            this.anio = anio;
        } else {
            System.out.println("El año no es válido");
        }
    }

    @Override
    public String toString() {
        String diaStr = dia < 10 ? "0" + dia : String.valueOf(dia);
        String mesStr = mes < 10 ? "0" + mes : String.valueOf(mes);
        return diaStr + "/" + mesStr + "/" + anio;
    }
}
