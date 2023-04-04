public class Cliente {
    
    public static void main(String[] args) {
        Conta conta=new Conta();
        conta.setNumero(392);  
        conta.setSalario(10000);
        conta.setNome("Yara");

        System.out.println (conta.getNumero());
        System.out.println (conta.getSalario());
        System.out.println (conta.getNome());
        
    }

}
