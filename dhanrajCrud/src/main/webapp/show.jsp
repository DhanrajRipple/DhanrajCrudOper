<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<br>
id:
${jobs.id}
<br>
job title:
${jobs.job_title}
<br>
job location:
${jobs.location}
<br>
job type:
${jobs.job_type}
<br>
job status:
${jobs.status}
<br>
Job created by:
${jobs.createdby}
<br>
job updated by:
${jobs.updatedby}

</body>
</html>