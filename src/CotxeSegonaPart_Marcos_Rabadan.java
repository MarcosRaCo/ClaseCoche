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
    public CotxeSegonaPart_Marcos_Rabadan(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estatsMotorCotxe, MarchaAutomatico cambiarAutomatico) {
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
                    if (this.cambiarAutomatico == MarchaAutomatico.N) {
                        this.cambiarAutomatico = MarchaAutomatico.F;
                    }else if (this.cambiarAutomatico == MarchaAutomatico.R) {
                        this.cambiarAutomatico = MarchaAutomatico.N;
                        System.out.println("ahora Neutral");
                    } else {
                        throw new Exception("Marcha mal");
                    }
                    break;
                case '-':
                    if (this.cambiarAutomatico == MarchaAutomatico.N) {
                        this.cambiarAutomatico = MarchaAutomatico.R;
                    } else if (this.cambiarAutomatico == MarchaAutomatico.R) {
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

                    break;
                case '-':

                    break;
                default:
                    throw new Exception("Solo son validos + y -");
            }
        }else{
            System.out.println("Esto es un coche manual");
        }
    }
}
