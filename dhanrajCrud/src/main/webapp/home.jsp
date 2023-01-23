<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="addjob" method="post">
Job title
<input type="text" name="job_title"><br>
Location
<input type="text" name="location"><br>
Job Type
<input type="text" name="job_type"><br>
Status
<input type="text" name="status"><br>
Created by
<input type="text" name="createdby"><br>
Updated by
<input type="text" name="updatedby"><br>
<input type="submit">
</form>
<br>
<form action="getjob" method="get">
id:
<input type="text" name="id"><br>
<input type="submit">
</form>

<br>
<form action="deljob">
Del id:
<input type ="text" name = "id"><br>
<input type ="submit">
</form>

<br>
To update
<form action="updatejob">
Id:
<input type="text" name="id"><br>
Job title
<input type="text" name="job_title"><br>
Location
<input type="text" name="location"><br>
Job Type
<input type="text" name="job_type"><br>
Status
<input type="text" name="status"><br>
Created by
<input type="text" name="createdby"><br>
Updated by
<input type="text" name="updatedby"><br>
<input type="submit"value="Update">
</form>


</body>
</html>