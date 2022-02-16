<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
${customer.firstName} ${customer.lastName} is confirmed!
<br>
Free passes: ${customer.freePasses}
<br>
Zip Code: ${customer.zipCode }
</body>
</html>