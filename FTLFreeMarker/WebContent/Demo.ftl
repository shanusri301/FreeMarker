<html>
<head>
<title>Freemarker</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<table id ="table">
<thead id ="thead">
               <tr>
                  <th>FirstName</th>
                  <th>LastName</th>
                  <th>Email</th>
                  <th>Birth Date</th>
                  <th>Mobile</th>
                  <th>City</th>
                  <th>Qualification</th>
                  <th>Gender</th>
                  <th>Intrests</th>
                 
               </tr>
            </thead>
 <#list data as details>
 <tbody>          
<tr>
	<td> ${details.firstName}</td>
	<td> ${details.lastName }</td>
	<td> ${details.email}</td>
	<td> ${details.dob}</td>
	<td> ${details.mobile}</td>
	<td> ${details.address}</td>
	<td> ${details.qualification}</td>
	<td> ${details.gender}</td>
	<td> ${details.intrests}</td>
	</tr>
</#list>
</tbody>
</table>
</body>
</html>
	
	
	