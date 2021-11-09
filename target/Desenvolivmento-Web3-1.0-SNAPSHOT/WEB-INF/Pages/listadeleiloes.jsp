<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wilso
  Date: 04/07/2021
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Leilao</title>


    <a href="http://localhost:8080/Desenvolivmento_Web3_war/">Inicio</a>
    <a href="entrada?acao=novoLeilao"> Cadastrar </a>

<body style="background-color: burlywood">
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Descriçao</th>
                <th>Status</th>
                <th>Ações</th>
            </tr>
        </thead>
    </table>



</head>

<tbody>

<form>
<table>

<c:forEach items="${list}" var="l">

    <tr>
        <td>${l.id}</td>
        <td>${l.nome}</td>
        <td>${l.descricao}</td>
        <td>${l.situacao}</td>
        <td><a href="entrada?acao=deleta&id=${l.id}"> excluir </a> </td>
    </tr>

</c:forEach>

</table>
</form>
</tbody>
</body>
</html>
