package acao;

import DAO.LeilaoDaoSession;
import Model.LeilaoTeste;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DeletarLeilao {

    private final HttpServletRequest req;
    private final HttpServletResponse resp;

    public DeletarLeilao(HttpServletResponse resp, HttpServletRequest req){
        this.resp = resp;
        this.req = req;
    }

    public void executa() throws ServletException, IOException {
        LeilaoDaoSession dao = new LeilaoDaoSession();
        String id = req.getParameter("id");
        System.out.println("O id é: " + id);
        LeilaoTeste l = dao.get(Integer.parseInt(id));
        dao.remove(l);
        ListarLeilao listarLeilao = new ListarLeilao(resp,req);
        listarLeilao.executa();
    }

}
