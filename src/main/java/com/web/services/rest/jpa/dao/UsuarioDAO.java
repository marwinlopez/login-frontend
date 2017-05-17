package com.web.services.rest.jpa.dao;

import com.web.services.rest.jpa.entities.Usuario;
import java.util.List;

public class UsuarioDAO {

    public String findUser(String email, String pass, List<Usuario> lista) {
        String resp = "";
        if (!email.equals("") && !pass.equals("")) {
            for (Usuario lista1 : lista) {
                if (email.equals(lista1.getCorreo())) {
                    if (pass.equals(lista1.getPassword())) {
                        resp = "Valido";
                        break;
                    } else {
                        resp = "Contraseña Invalida verifique !!!";
                    }
                } else {
                    resp = "Usuario invalido verifique !!!";
                }
            }
        }
        return resp;
    }

}
