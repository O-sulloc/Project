<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<c:forEach items="${qnaReply}" var="dto">
		<tr class="bg">
			<td id="up${dto.replyNum}">${dto.contents}</td>
			<td>${dto.id}</td>

		<td>
			<c:if test="${not empty member}">
				<button class="update" type="button" data-index="${dto.replyNum}">수정</button>
				<button class="del" type="button" data-num="${dto.replyNum}">삭제</button>
		</c:if>
		</td>
		</tr>
	</c:forEach>