<%@ page contentType="text/plain" %>	
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page trimDirectiveWhitespaces="true" %>
		<c:choose>
			<c:when test="${(exception['class'].name == 'org.springframework.transaction.CannotCreateTransactionException')}">CAS Event: YES</c:when>
			 <c:otherwise>
		 		<c:choose>
					 	<c:when test="${(empty sessionScope.cas_status)}">CAS Event: NO</c:when>
						<c:otherwise>CAS Event: ${sessionScope.cas_status}</c:otherwise>
			 	</c:choose>
			 </c:otherwise>
		</c:choose>
		<c:choose>
	      <c:when test="${(exception['class'].name == 'org.springframework.transaction.CannotCreateTransactionException')}">
Database: DOWN
	      </c:when>
	      <c:otherwise>
	      	<c:choose>
         		<c:when test="${((sessionScope.database_status == 'UP') || (empty sessionScope.database_status))}">
Database: UP
				</c:when>
		    </c:choose>
	      </c:otherwise>
	    </c:choose>	