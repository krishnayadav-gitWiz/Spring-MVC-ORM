<%@page import="java.util.List"%>
<html>
<body>
<h2>Hello World!</h2>
<h4 style="color: red;">this is home page..gagan</h4>

<%
Integer id=(Integer) request.getAttribute("id");
 String name=(String) request.getAttribute("name");
 List<String> frnds=(List<String>) request.getAttribute("f");
%>
<h1> Id = <%=id %></h1>
<h1> Name = <%=name %></h1>

<%
for (String f: frnds){
	out.println(f);
	%>
	<h1><%=f %></h1>
	<%
}
%>
</body>
</html>
