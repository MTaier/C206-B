package Classes;

import Exceptions.CheckedException;
import Exceptions.UncheckedException;

import java.util.HashSet;

public class Usuario {
    private String nome;
    private String email;
    private HashSet<RedeSocial> redesSociais;

    public Usuario(String nome, String email, HashSet<RedeSocial> redesSociais) throws CheckedException {
        this.nome = nome;
        this.email = email;
        this.redesSociais = new HashSet<>();
        for (RedeSocial redeSocial : redesSociais) {
            if (redeSocial == null) {
                throw new CheckedException("Rede Social não pode ser nula");
            }
            this.redesSociais.add(redeSocial);
        }
        System.out.println("Usuário " + nome + " cadastrado com sucesso nas redes sociais.");
    }

    public void adicionarRedeSocial(RedeSocial redeSocial) throws CheckedException {
        if (redeSocial == null) {
            throw new CheckedException("Rede Social não pode ser nula");
        }

        if (redesSociais.add(redeSocial)) {
            if (redeSocial instanceof Facebook) {
                System.out.println("---Usuário cadastrado no Facebook---");
            } else if (redeSocial instanceof Instagram) {
                System.out.println("---Usuário cadastrado no Instagram---");
            } else if (redeSocial instanceof GooglePlus) {
                System.out.println("---Usuário cadastrado no GooglePlus---");
            } else if (redeSocial instanceof Twitter) {
                System.out.println("---Usuário cadastrado no Twitter---");
            }
        } else {
            System.out.println("Usuário já está cadastrado nessa rede social.");
        }
    }

    public void removerRedeSocial(RedeSocial redeSocial) {
        if (!redesSociais.contains(redeSocial)) {
            throw new UncheckedException("Rede Social não encontrada");
        }
        redesSociais.remove(redeSocial);
        System.out.println("Rede Social removida com sucesso");
    }

    public void mostrarRedesSociais() {
        for (RedeSocial redeSocial : redesSociais) {
            System.out.println(redeSocial.senha);
        }
    }

    public void executarMetodosRedesSociais() {
        for (RedeSocial redeSocial : redesSociais) {
            if (redeSocial instanceof GooglePlus googlePlus) {
                googlePlus.curtirPublicacao();
                googlePlus.compartilhar();
                googlePlus.fazStreaming();
            } else if (redeSocial instanceof Facebook facebook) {
                facebook.curtirPublicacao();
                facebook.compartilhar();
                facebook.fazStreaming();
            } else {
                redeSocial.postarFoto();
                redeSocial.postarComentario();
                redeSocial.postarVideo();
            }
        }
    }
}