
package com.company.bookmarker.entities.users;

import java.time.LocalDate;



public class AutorAmador extends user {
    private String Pseudonimo;
    private String Descricao;
    private String LivroMPop;
    

    public AutorAmador(String name, String password, String email, String gender, String photo, LocalDate date, Long cpf, Long phone, String Pseudonimo, String Descricao, String LivroMPop) {
        super(name, password, email, gender, photo, date, cpf, phone);
        this.Pseudonimo = Pseudonimo;
        this.Descricao = Descricao;
        this.LivroMPop = LivroMPop;

    }

    public String getPseudonimo() {
        return Pseudonimo;
    }

    public void setPseudonimo(String Pseudonimo) {
        this.Pseudonimo = Pseudonimo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getLivroMPop() {
        return LivroMPop;
    }

    public void setLivroMPop(String LivroMPop) {
        this.LivroMPop = LivroMPop;
    }
    
    
}
