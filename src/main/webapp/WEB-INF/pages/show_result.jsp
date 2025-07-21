

<%@page isELIgnored="false"%>


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h1 style="background-color:yellow;color:red;text-align:center">show_result.jsp</h1>



<%-- 
<h1>Model Attributes</h1>
<b>Name :: ${Name}</b><br/>
<b>Age :: ${Age}</b><br/>
<b>FavColors :: <%=Arrays.toString((String[])request.getAttribute("FavColors")) %></b><br/>
<b>Friends :: ${Friends}</b><br/>
<b>PhoneNumbers :: ${PhoneNumbers}</b><br/>
<b>IdDetails :: ${IdDetails}</b><br/>
--%>

<b>Name :: ${Name}</b><br/>
<b>Age :: ${Age}</b><br/>


<b> FavColors :: </b><br/>
	<c:forEach var="col" items="${FavColors}">
		${col}<br/>
	</c:forEach>
	
<b> Friends :: </b><br/>
	<c:forEach var="fr" items="${Friends}">
		${fr}<br/>
	</c:forEach>

<b> PhoneNumbers :: </b><br/>
	<c:forEach var="phn" items="${PhoneNumbers}">
		${phn}<br/>
	</c:forEach>
	
<b> FavColors :: </b><br/>
	<c:forEach var="idd" items="${IdDetails}">
		${idd}<br/>
	</c:forEach>	

<b>ActorInfo :: ${ActorInfo}</b><br/>
<b>ActorRemuneration :: ${ActorInfo.actorRemuneration}</b><br/>


<b>ActorsInfo ::</b><br/>
<c:forEach var="actor" items="${ActorsInfo}">
	${actor}<br/>
</c:forEach>

	
	
	
	
	
	
	