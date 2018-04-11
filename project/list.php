<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"> </script>
	<script src="wordcloud2.js"></script>
	<script src="word1.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link href="cssstyle.css" rel="stylesheet" type="text/css">
    <title>Document</title>
</head>
<script>
    <!--console.log(tf);-->
    //var temp = document.cookie;
    //var array = [];
    //var array = temp.split(";");
    //document.write(array[0]);
    
    //console.log(temp);
</script>
<body>
    <?php
    include 'connect.php';
    $word = $_GET["word"];
    echo $word;
    //print_r($_COOKIE);
    //echo $_COOKIE['temp'];
    $sql="SELECT * FROM content,tmdetail WHERE Result like '%".$word."%'";
    $result=mysqli_query($conn,$sql);
    if(mysqli_num_rows($result)>0){
        //echo '</br>';
        echo '<table border=1>';
        while ($row = mysqli_fetch_assoc($result)) {
          echo '<tr>';
          echo "<td>".$row["Title"]."</td>";
          echo "<td>";
          echo "<a href=".$row["Url"].">".$row["Url"]."</a>";
          echo "</td>";
          echo '</tr>';
        }
        echo '</table>';
    }
    else {echo "0 results";}

    ?>
    <p id="list"></p>
</body>
</html>