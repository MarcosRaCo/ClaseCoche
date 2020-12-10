/**
 * PACKAGE_NAME
 * Nombre_project: ClaseCoche
 * Cotxe_Marcos_Rabadan
 * Created by: MarcosRa
 * Date : 07/12/2020
 * Description:
 **/
public class Cotxe_Marcos_Rabadan extends CotxeAbstracte {
    //Acceso misma clase, clases del mismo paquete y clases que hereden de ella
    protected EstatsMotorCotxe estatsMotorCotxe;
    //Constructor
    public Cotxe_Marcos_Rabadan(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estatsMotorCotxe) {
        super(marca, model, tipuscanvi);
        this.estatsMotorCotxe = estatsMotorCotxe;
    }

    @Override
    //Metodo Arrancar motor
    public void arrancarMotor() throws Exception {
        if (this.estatsMotorCotxe == EstatsMotorCotxe.Aturat) {
            //Si el estado del motor del coche es "parado" cambiamos el estado a "En marcha" e imprimimos el resultado
            this.estatsMotorCotxe = EstatsMotorCotxe.EnMarxa;
            System.out.println("Coche arrancado");
        }else {
            //Si el estado del motor del coche estaba "En marcha" desde un inicio lanza la excepcion indicando que el coche ya estaba arrancado
            throw new Exception("El coche ya esta arrancado");
        }
    }
    //Metodo que devuelve el estado del motor
    @Override
    public EstatsMotorCotxe comprovaMotor() {
        //return del estadoMotor coche
        return this.estatsMotorCotxe;
    }
    //Metodo que devuelve entero que corresponde a las revoluciones del coche
    @Override
    public int getRevolucions() {
        if (this.estatsMotorCotxe == EstatsMotorCotxe.Aturat) {
            //Si el coche esta parado devuelve 0
            return 0;
        } else{
            //Si esta encendido genera un numero aleatorio entre 1 y 6500
            return (int)(Math.random()*6500 + 1);
        }
    }
    //Metodo apagar motor
    @Override
    public void aturarMotor() throws Exception {
        if (this.estatsMotorCotxe == EstatsMotorCotxe.EnMarxa) {
            //Si el estado del motor del coche es "En marcha" cambiamos el estado a "parado" e imprimimos el resultado
            this.estatsMotorCotxe = EstatsMotorCotxe.Aturat;
            System.out.println("Coche arrancado");
        }else {
            //Si el estado del motor del coche estaba "parado" desde un inicio lanza la excepcion indicando que el coche ya estaba parado
            throw new Exception("El coche ya esta arrancado");
        }
    }
}
