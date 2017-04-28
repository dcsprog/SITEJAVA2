<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import = "java.util.ArrayList, model.Crianca " %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario Crian&ccedil;a</title>
</head>
<body>
	<h1>Dados da Crian&ccedil;a</h1>
	<form action="HandlerCrianca" method="post">
		<label>Nome
			<input type="text" name="nome" />	
		</label>
		<label>Data Nascimento
			<input type="text" name="data_nascimento" />	
		</label>
		<label>Cartao Cidad&atilde;o
			<input type="text" name="ccidadao" />	
		</label>
		<label>Observa&ccedil;&atilde;es
			<textarea rows="4" cols="10" name="observacoes">	
			</textarea>
		</label>
		<input type="submit" value="Enviar" />
	</form>
	
	<table>
		<tr>
			<th>Nome</th>
			<th>Data Nascimento</th>
			<th>Cartao Cidadao</th>
			<th>Observacoes</th>
		</tr>
		
		<%
		
		ArrayList<Crianca> arC = (ArrayList<Crianca>) request.getAttribute("listaCriancas");
		
		for(int i=0; i<arC.size(); i++){
			
			Crianca c = (Crianca) arC.get(i);
			out.append("  <tr><td>  "+c.getNome()+"  </td><td>  "+c.getData_nasc() +"  </td><td>  "+c.getCcidadao() +"  </td><td>  "+c.getObservacoes()+"  </td></tr>  ");
		}
		
		%>
		
	</table>
	<!--  
		<c:for item="{arcriancas}" var="crianca">
		<c:out value="crianca"/>
	</c:for>
	-->
	
</body>
</html>