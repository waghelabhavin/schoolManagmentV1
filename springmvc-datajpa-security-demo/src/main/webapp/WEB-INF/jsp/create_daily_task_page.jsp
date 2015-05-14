<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="/WEB-INF/tags/taglib.jsp"%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>





<form:form action="submitDailyTask" modelAttribute="dailyTask" method="post">
	<table>
            <tr>
            	<td></td>
                <td colspan="3"> ${result} </td>
            	<td></td>
            </tr>
            <tr>
            	<td>Name:</td>
                <td><form:input path="name" /></td>
                <td><form:errors path="name" cssClass="error" /></td>
            </tr>
            <tr>
            	<td>Description:</td>
                <td><form:input path="describeDailyTask" /></td>
                <td><form:errors path="describeDailyTask" cssClass="error" /></td>
            </tr>
            <tr>
            	<td></td>
                <td colspan="3"><input type="submit" value="Add"/></td>
            	<td></td>
            </tr>
        </table>  
</form:form>
         
