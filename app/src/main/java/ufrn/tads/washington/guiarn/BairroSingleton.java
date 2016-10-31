package ufrn.tads.washington.guiarn;

/**
 * Created by Washington on 31/10/2016.
 */
public class BairroSingleton {
    private static BairroSingleton bairroInstance;
    private String bairro="Jardim Planalto";
    private int id=1;
    private int bairro_img;
    private int[] bairro_galery;
    private int indice_seguranca;
    private int indice_educacao;
    private int indice_saude;
    private int indice_transporte;
    private int indice_desenvolvimento;
    private int indice_lazer;

    private BairroSingleton(){    };

    public static synchronized BairroSingleton getInstace(){
        if(bairroInstance == null)
            bairroInstance = new BairroSingleton();
        return bairroInstance;
    };
    //Getters and Setters
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
        switch (""){
            case "a":

            case "b":

            case "c":

            default:

        }
    }

    public int getBairro_img() {
        return bairro_img;
    }

    public int[] getBairro_galery() {
        return bairro_galery;
    }

    public int getIndice_seguranca() {
        return indice_seguranca;
    }

    public int getIndice_educacao() {
        return indice_educacao;
    }

    public int getIndice_saude() {
        return indice_saude;
    }

    public int getIndice_desenvolvimento() {
        return indice_desenvolvimento;
    }

    public int getIndice_transporte() {
        return indice_transporte;
    }

    public int getIndice_lazer() {
        return indice_lazer;
    }
}
