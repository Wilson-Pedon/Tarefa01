<%@ page import="Enumeradores.SituacaoEnum" %><%--
  Created by IntelliJ IDEA.
  User: wilso
  Date: 04/08/2021
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-color: burlywood">


<a href="http://localhost:8080/Desenvolivmento_Web3_war/">Inicio</a>

<h1>Cadastro Do leilao</h1>
<form action="entrada?acao=cadastrarLeilao" method="post">
    <input type="text" placeholder="Objeto do leilao" name="objeto"/>
    <input type="text" placeholder="Descricao" name="descricao"/>
    <select name="status" >
        <option value="1">FECHADO</option>
        <option value="2">ABERTO</option>
        <option value="3">ENCERRADO</option>
        <option value="4">CANCELADO</option>
    </select>

    <input type="submit" value="Salvar"/>
</form>
</body>
</html>
