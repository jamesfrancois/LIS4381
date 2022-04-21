<?php
//https://datatables.net/examples/basic_init/table_sorting.html
//database connection code goes here...
require_once "../global/connection.php";

$query = "SELECT * FROM petstore ORDER BY pst_id";


$statement = $db->prepare($query);
$statement->execute();
?>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="My online portfolio that illustrates skills acquired while working through various project requirements.">
	<meta name="author" content="James S. François">
	<link rel="icon" href="favicon.ico">

		<title>LIS 4381 - Project 2 </title>
		<?php include_once("../css/include_css.php"); ?>
</head>
<body>


</body>
</html>