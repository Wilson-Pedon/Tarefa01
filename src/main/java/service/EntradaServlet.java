package service;

import acao.CadastrarLeilao;
import acao.DeletarLeilao;
import acao.ListarLeilao;
import acao.NovoLeilao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(urlPatterns = "/entrada")
public class EntradaServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String acao = req.getParameter("acao");

        if(acao.equals("novoLeilao")) {
            NovoLeilao novoLeilao = new NovoLeilao(req, resp);
            novoLeilao.executa();
        }
        if(acao.equals("cadastrarLeilao")) {
            CadastrarLeilao cadastrarLeilao = new CadastrarLeilao(resp, req);
            cadastrarLeilao.executa();
        }
        if(acao.equals("listarLeilao")){
            ListarLeilao listarLeilao = new ListarLeilao(resp,req);
            listarLeilao.executa();
        }
        if(acao.equals("deleta")){
            DeletarLeilao listarLeilao = new DeletarLeilao(resp,req);
            listarLeilao.executa();
        }
    }
}
