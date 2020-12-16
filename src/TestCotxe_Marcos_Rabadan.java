/**
 * PACKAGE_NAME
 * Nombre_project: TestCotxe_Marcos_Rabadan
 * Cotxe_Marcos_Rabadan
 * Created by: MarcosRa
 * Date : 07/12/2020
 * Description: Clase test
 **/
public class TestCotxe_Marcos_Rabadan {
    public static void main(String[] args) {
        //Creacion del objeto coche. Le pasamos los argumentos necesarios
        Cotxe_Marcos_Rabadan coche = new Cotxe_Marcos_Rabadan("Citroen", "Xsara", TipusCanvi.CanviManual, EstatsMotorCotxe.EnMarxa);
        CotxeSegonaPart_Marcos_Rabadan coche2 = new CotxeSegonaPart_Marcos_Rabadan("Citroen", "xasara", TipusCanvi.CanviAutomatic, EstatsMotorCotxe.EnMarxa, CotxeSegonaPart_Marcos_Rabadan.MarchaAutomatico.R, null);
        try {
            coche.arrancarMotor();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(coche.getRevolucions());

        try {
            coche2.CanviarMarxaAutomatic('-');
           // coche2.CanviarMarxaManual('-');
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
