<?php
$firstName = $_GET["firstName"];
$height    = $_GET["height"   ];
$weight    = $_GET["weight"   ];

$result = $weight / ($height * $height);
?>
<!doctype html>
<html>
  <head>
    <meta charset="utf-8">
    <title>BMI Results</title>
  </head>
  <body>
    <h1>Your BMI is:&nbsp;<?php echo $result; ?></h1>
  </body>
</html>

<!-- Put me into: c:\xampp\htdocs\ -->
