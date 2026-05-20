package dado;

import com.github.javafaker.Faker;

import modelo.Usuario;

public class UsuarioFalso {

    private static Faker faker = new Faker();

    public static Usuario criarUsuarioCompleto() {

        return new Usuario()

                .nomeCompleto(faker.name().fullName())
                .email(faker.internet().emailAddress())
                .tipoGenero("Mr")
                .senha(faker.internet().password())
                .dia(String.valueOf(
                        faker.number().numberBetween(1, 28)))
                .mes("October")
                .ano(String.valueOf(
                        faker.number().numberBetween(1970, 2000)))
                .primeiroNome(faker.name().firstName())
                .ultimoNome(faker.name().lastName())
                .empresa(faker.company().name())
                .endereco(faker.address().streetAddress())
                .endereco2(faker.address().secondaryAddress())
                .pais("Canada")
                .estado(faker.address().state())
                .cidade(faker.address().city())
                .cep(faker.address().zipCode())
                .celular(faker.phoneNumber().cellPhone());
    }
}