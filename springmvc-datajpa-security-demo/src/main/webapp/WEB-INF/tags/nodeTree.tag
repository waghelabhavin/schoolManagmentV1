<%@tag description="display the whole nodeTree" pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@attribute name="node" type="com.sivalabs.springapp.entities.Menu" required="true" %>
<%@include file="/WEB-INF/tags/taglib.jsp"%>
<%@taglib prefix="template" tagdir="/WEB-INF/tags" %>  
<li>
	<c:if test="${fn:length(node.getChildId()) > 0 }">
	<a href="#">${node.getName()}<i class="fa fa-angle-left pull-right"></i></a>
	    <ul class="treeview-menu">
		    <c:forEach var="child" items="${node.getChildId()}"> 
		        <template:nodeTree node="${child}"/>
		    </c:forEach>
	    </ul>
	</c:if>
	<c:if test="${fn:length(node.getChildId()) <= 0 }">
		<a href="${rootURL}${node.getPage()}">${node.getName()}<i class="fa fa-angle-left pull-right"></i></a>
 	</c:if>
</li> 