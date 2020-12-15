/**
 * PACKAGE_NAME
 * Nombre_project: ClaseCoche
 * CotxeSegonaPart_Marcos_Rabadan
 * Created by: MarcosRa
 * Date : 15/12/2020
 * Description:
 **/
public class CotxeSegonaPart_Marcos_Rabadan extends Cotxe_Marcos_Rabadan {

    public CotxeSegonaPart_Marcos_Rabadan(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estatsMotorCotxe) {
        super(marca, model, tipuscanvi, estatsMotorCotxe);
    }
    /** CANVIAR MARCHA COCHE AUTOMATICO **/
    public void CanviarMarxaAutomatic(char marcha){
        if (tipuscanvi == TipusCanvi.CanviAutomatic) {
            if (marcha == '+') {

            }else {

            }
        }
    }
}