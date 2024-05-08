public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.err.println("O cep não corresponde com as regras de negocio");
        }
        
    }
public static String formatarCep(String cep) throws CepInvalidoException{
    if(cep.length() !=8){
        throw new CepInvalidoException();
    }
    return "23.765-064";
}
}
