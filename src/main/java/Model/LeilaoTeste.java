package Model;

import Enumeradores.SituacaoEnum;
import javax.persistence.*;

@Entity
@Table(name = "leilaotarefa")
public class LeilaoTeste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String descricao;
    private SituacaoEnum situacao;

//    public LeilaoTeste(int id, String nome, String descricao, SituacaoEnum situacao) {
//        this.id = id;
//        this.nome = nome;
//        this.descricao = descricao;
//        this.situacao = situacao;
//    }
//
    public LeilaoTeste(String nome, String descricao, SituacaoEnum situacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.situacao = situacao;
    }

    public LeilaoTeste(String campoNome) {
        this.nome = campoNome;
    }

    public LeilaoTeste() {

    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public SituacaoEnum getSituacao() {
        return situacao;
    }
    public void setSituacao(SituacaoEnum situacao) {
        this.situacao = situacao;
    }
}
