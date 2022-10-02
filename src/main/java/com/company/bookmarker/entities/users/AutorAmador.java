
package com.company.bookmarker.entities.users;



public class AutorAmador extends user {
    public String Pseudonimo;
    public String Descricao;
    public String LivroMPop;
    
    public AutorAmador ( String Pseudonimo, String Descricao, String LivroMPop ){
        this.Pseudonimo = Pseudonimo;
        this.Descricao = Descricao;
        this.LivroMPop = LivroMpop
        
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
