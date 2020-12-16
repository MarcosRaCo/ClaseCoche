/**
 * PACKAGE_NAME
 * Nombre_project: ClaseCoche
 * CotxeSegonaPart_Marcos_Rabadan
 * Created by: MarcosRa
 * Date : 15/12/2020
 * Description:
 **/
public class CotxeSegonaPart_Marcos_Rabadan extends Cotxe_Marcos_Rabadan {
    protected enum MarchaAutomatico { F, N, R;};
    protected MarchaAutomatico cambiarAutomatico;
    protected enum MarchaManual { R, N, Primera, Segunda, Tercera, Cuarta, Quinta, Sexta;};
    protected MarchaManual cambiarManual;
    public CotxeSegonaPart_Marcos_Rabadan(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estatsMotorCotxe, MarchaAutomatico cambiarAutomatico, MarchaManual cambiarManual) {
        super(marca, model, tipuscanvi, estatsMotorCotxe);
        this.cambiarAutomatico = cambiarAutomatico;
        this.cambiarManual = cambiarManual;

    }
    /** SETTERS GETTERS **/
    public MarchaAutomatico getCambiarAutomatico() {
        return cambiarAutomatico;
    }

    public void setCambiarAutomatico(MarchaAutomatico cambiarAutomatico) {
        this.cambiarAutomatico = cambiarAutomatico;
    }

    public MarchaManual getCambiarManual() {
        return cambiarManual;
    }

    public void setCambiarManual(MarchaManual cambiarManual) {
        this.cambiarManual = cambiarManual;
    }

    /** CAMBIAR MARCHA COCHE AUTOMATICO **/
    public void CanviarMarxaAutomatic(char marcha) throws Exception{
        if (tipuscanvi == TipusCanvi.CanviAutomatic) {
            switch (marcha) {
                case '+':
                    if (this.cambiarAutomatico.equals(MarchaAutomatico.N)) {
                        this.cambiarAutomatico = MarchaAutomatico.F;
                    }else if (this.cambiarAutomatico.equals(MarchaAutomatico.R)) {
                        this.cambiarAutomatico = MarchaAutomatico.N;
                        System.out.println("ahora Neutral");
                    } else {
                        throw new Exception("No puedes subir de marcha");
                    }
                    break;
                case '-':
                    if (this.cambiarAutomatico.equals(MarchaAutomatico.N)) {
                        this.cambiarAutomatico = MarchaAutomatico.R;
                    } else if (this.cambiarAutomatico.equals(MarchaAutomatico.R)) {
                        System.out.println("No puedes bajar de marcha");
                    }
                    break;
                default:
                    throw new Exception("Solo son validos + y -");
            }
        }else{
            System.out.println("Esto es un coche automatico");
        }
    }
    /** CAMBIAR MARCHA COCHE MANUAL **/
    public void CanviarMarxaManual(char marcha) throws Exception{
        if (tipuscanvi == TipusCanvi.CanviManual) {
            switch (marcha){
                case '+':
                    if (this.cambiarManual.equals(MarchaManual.N)) {
                        this.cambiarManual = MarchaManual.Primera;
                    } else if (this.cambiarManual.equals(MarchaManual.Primera)) {
                        this.cambiarManual = MarchaManual.Segunda;
                    } else if (this.cambiarManual.equals(MarchaManual.Segunda)) {
                        this.cambiarManual = MarchaManual.Tercera;
                    } else if (this.cambiarManual.equals(MarchaManual.Tercera)) {
                        this.cambiarManual = MarchaManual.Cuarta;
                    } else if (this.cambiarManual.equals(MarchaManual.Cuarta)) {
                        this.cambiarManual = MarchaManual.Quinta;
                    } else if (this.cambiarManual.equals(MarchaManual.Quinta)) {
                        this.cambiarManual = MarchaManual.Sexta;
                    } else if (this.cambiarManual.equals(MarchaManual.Sexta)) {
                        throw new Exception("No puedes subir marcha");
                    } else if (cambiarManual.equals(CanvioManual.R)) {
                        this.cambiarManual = MarchaManual.N;
                    }
                    break;
                case '-':
                    if (this.cambiarManual.equals(MarchaManual.N)) {
                        this.cambiarManual = MarchaManual.R;
                    } else if (this.cambiarManual.equals(MarchaManual.Primera)) {
                        this.cambiarManual = MarchaManual.N;
                    } else if (this.cambiarManual.equals(MarchaManual.Segunda)) {
                        this.cambiarManual = MarchaManual.Primera;
                    } else if (this.cambiarManual.equals(MarchaManual.Tercera)) {
                        this.cambiarManual = MarchaManual.Segunda;
                    } else if (this.cambiarManual.equals(MarchaManual.Cuarta)) {
                        this.cambiarManual = MarchaManual.Tercera;
                    } else if (this.cambiarManual.equals(MarchaManual.Quinta)) {
                        this.cambiarManual = MarchaManual.Cuarta;
                    } else if (this.cambiarManual.equals(MarchaManual.Sexta)) {
                        this.cambiarManual = MarchaManual.Quinta;
                    } else if (this.cambiarManual.equals(MarchaManual.R)) {
                        throw new Exception("No puedes bajar de marcha");
                    }
                    break;
                default:
                    throw new Exception("Solo son validos + y -");
            }
        }else{
            System.out.println("Esto es un coche manual");
        }
    }
}
