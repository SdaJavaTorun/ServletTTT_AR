<%@ page import="pl.sdacademy.model.TicTacToe" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>tictactoe</title>
</head>
<body>
    <%
        TicTacToe ticTacToe = (TicTacToe) request.getAttribute("board");
    %>
    <table>
        <tr>
            <td style="border: 1px solid black"; >
                <% if (ticTacToe.getField(0, 0) == 0) { %>
                <a href="/nacisnijpole?x=0&y=0">&nbsp;</a>
                <% } %>
                <% if (ticTacToe.getField(0, 0) == 1) { %>
                O
                <% } %>
                <% if (ticTacToe.getField(0, 0) == 2) { %>
                X
                <% } %>
            </td>
        </tr>
    </table>

    <a href=\"tic?x=" <%=ticTacToe.getField(0, 0) == 1 ? "o" : "x"  %>
                "&y=" <%=ticTacToe.getField(0, 0) == 1 ? "o" : "x"  %> "\">&nbsp;</a>

</body>
</html>
