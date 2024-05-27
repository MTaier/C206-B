import Classes.*;
import Exceptions.*;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        try {
            // Criar redes sociais
            Facebook facebook = new Facebook();
            Instagram instagram = new Instagram();
            GooglePlus googlePlus = new GooglePlus();
            Twitter twitter = new Twitter();

            // Criar conjunto de redes sociais
            HashSet<RedeSocial> redes = new HashSet<>();
            redes.add(facebook);
            redes.add(instagram);

            // Criar usuário com redes sociais
            Usuario usuario = new Usuario("José", "jose@jose.com", redes);

            // Adicionar e remover rede social
            usuario.adicionarRedeSocial(twitter);
            usuario.adicionarRedeSocial(googlePlus);
            usuario.removerRedeSocial(facebook);
            usuario.removerRedeSocial(twitter);

            usuario.executarMetodosRedesSociais();

        } catch (CheckedException | UncheckedException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}