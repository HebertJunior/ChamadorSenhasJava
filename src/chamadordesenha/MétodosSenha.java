
package chamadordesenha;

//Essa classe sera responsável pela atribuição, geração, adição e chamadas de senha.
public class MétodosSenha {
    
    int senha = 0;
    int anterior;
    int inicial = 0;
    int guiche = 0;

    public boolean VerificarGui()
    {
        if (guiche <= 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    
    public MétodosSenha() {
    }

    public MétodosSenha(int anterior) {
        this.anterior = anterior;
    }
    
    
}
