package DAO;

import Enumeradores.SituacaoEnum;
import Interface.IRepository;
import Model.LeilaoTeste;
import controler.BancoDeDados;

import java.util.*;

public class LeilaoDaoSession implements IRepository<LeilaoTeste, Integer> {

    private final BancoDeDados conexao = new BancoDeDados();
    //Model.LeilaoTeste leilao = new Model.LeilaoTeste();

    @Override
    public void salva(LeilaoTeste leilao) {
        conexao.session.beginTransaction();
        conexao.session.save(leilao);
        conexao.session.getTransaction().commit();
    }

    @Override
    public void remove(LeilaoTeste leilao) {
        conexao.session.getTransaction().begin();
        Model.LeilaoTeste leilao1 = conexao.session.find(Model.LeilaoTeste.class, leilao.getId());
        conexao.session.remove(leilao1);
        conexao.session.getTransaction().commit();
    }

    @Override
    public LeilaoTeste get(Integer id) {
        return conexao.session.find(LeilaoTeste.class, id);
    }

    @Override
    public List<LeilaoTeste> list() {
        return BancoDeDados.session.createQuery("FROM " + LeilaoTeste.class.getName()).getResultList();
    }

    public static void main(String[] args) {

        LeilaoDaoSession dao = new LeilaoDaoSession();
        //LeilaoTeste l = new LeilaoTeste("Wilson", "FOi", SituacaoEnum.ABERTO);

        //dao.salva(l);
    }
}
