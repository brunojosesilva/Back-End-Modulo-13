public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setCpf(1234566);
        pessoaFisica.setNome("Fulano 01");

        System.out.println("Pessoa fisica : " + pessoaFisica.getNome() +  " cpf : " + pessoaFisica.getCpf());

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setCnpj((long) 121212133);
        pessoaJuridica.setNome("Fulano cnpj");

        System.out.println("Pessoa juridica : " + pessoaJuridica.getNome() +  " Cnpj : " + pessoaJuridica.getCnpj());
    }
}
