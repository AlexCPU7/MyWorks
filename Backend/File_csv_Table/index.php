<!DOCTYPE html>
<html lang="ru">
    <head>
        <meta charset="utf-8">
        <title>Задание Алексей</title>
        <style type="text/css">
            td {
                width: 91px;
            }
        </style>
    </head>
    
    <body>
                
       <?php
            $row = 1;
            $mas = array();        
            if (($handle = fopen("DB.csv", "r")) !== FALSE) {
                echo "<center><table border=2>";
                while (($data = fgetcsv($handle, 1000, ",")) !== FALSE) {

                    $page = $_GET["page"];
                    if($page == "" || $page == "1"){
                        $page1 = 0;
                        $page2 = 20;
                    }else{
                        $page1 = ($page*20)-20;
                        $page2 = $page*20;
                    }

                    //вывод через двухмерный массив
                    
                        $num = count($data);
                        for($l = 0; $l < $num; $l++){
                            $mas[$row][$l] = $data[$l];
                        };                    

                    //вывод по обычному
                    /*if ($row >= $page1 && $row <= $page2){
                    $num = count($data);
                    echo "<tr>";
                        for ($i = 0; $i < $num; $i++) {
                            echo "<td>" . $data[$i] . "</td>";
                        }
                     echo "</tr>";
                    }*/

                    $row++;

                }

                echo "</table></center>";

            }
        ?>
        <p>Редактор строки:</p>
        <form action="index.php" method="POST">
            <input type="text" style="width:90px" name="20" />
            <input type="text" style="width:90px" name="21" />
            <input type="text" style="width:90px" name="22" />
            <input type="text" style="width:90px" name="23" />
            <input type="text" style="width:90px" name="24" />
            <input type="text" style="width:90px" name="25" />
            <input type="text" style="width:90px" name="26" />
            <input type="text" style="width:90px" name="27" />
            <input type="text" style="width:90px" name="28" />
            <input type="text" style="width:90px" name="29" />
            <input type="text" style="width:90px" name="30" />
            <input type="text" style="width:90px" name="31" />
            
            <button type="submit">Klick</button>
        </form>
        
        <?php        
            //редактор строки
             if (! empty($_POST)){
                for($i = 20; $i <= 31; $i++){
                    if (!($_POST[$i] == null)){
                        $mas[2][($i-20)] = $_POST[$i];
                        echo $_POST[red0];
                    }
                }
             }
        ?>
        
        <?php
            echo "<br>";
            $rez = 1;
            $tameMas = 0;
            //вывод таблицы двухмерного массива
            echo "<table border=1>";
            while($tameMas < $row){
                $rez++;
                $tameMas++;
                if ($rez >= $page1 && $rez <= $page2){
                    echo "<tr>";
                    for($j = 0; $j < 12; $j++){
                        echo "<td>";
                        echo $mas[$tameMas][$j];
                        echo "</td>";
                    }
                    echo "</tr>";
                }
            }
            echo "</table>";


            $a = $row/20;
            $a = ceil($a);
            echo "<br>";

            for($j = 1; $j <= $a; $j++) {
                ?><a href="index.php?page=<?php echo $j; ?>" style="text-decoration:none"><?php echo $j . " "; ?></a> <?php
            }
       
        ?>
        <p>Поиск:</p>
        <form action="index.php" method="POST">
            <input type="text" style="width:90px" name="0" />
            <input type="text" style="width:90px" name="1" />
            <input type="text" style="width:90px" name="2" />
            <input type="text" style="width:90px" name="3" />
            <input type="text" style="width:90px" name="4" />
            <input type="text" style="width:90px" name="5" />
            <input type="text" style="width:90px" name="6" />
            <input type="text" style="width:90px" name="7" />
            <input type="text" style="width:90px" name="8" />
            <input type="text" style="width:90px" name="9" />
            <input type="text" style="width:90px" name="10" />
            <input type="text" style="width:90px" name="11" />
            
            <button type="submit">Klick</button>
        </form>
        
        <?php
        
            if (! empty($_POST)){
                
                print_r($_POST);
                echo "<br><br>";
                
                //названия столбцов
                echo "<table border=1>";
                    echo "<tr>";
                        for($p = 0; $p < 12; $p++){
                            echo "<td>";
                                echo $mas[1][$p];
                            echo "</td>";
                        }
                    echo "</tr>";
                
                echo "</table>";
                
                $summStrok = 0;
                //вывод если всё null
                if(
                    ($_POST[0] == null) && ($_POST[1] == null) && ($_POST[2] == null) && ($_POST[3] == null) && ($_POST[4] == null) && ($_POST[5] == null) && ($_POST[6] == null) && ($_POST[7] == null) && ($_POST[8] == null) && ($_POST[9] == null) && ($_POST[10] == null) && ($_POST[11] == null)){
                    echo "NULL";
                }else{                    
                    
                    //фильтр
                    echo "<table border=1>";
                    
                    //вывод таблицы с пейджингом
                    /*$rez1 = 0;
                    for($index = 0; $index < 12; $index++){
                        for($i = 2; $i < $row; $i++){
                            if($_POST[$index] == $mas[$i][$index]){
                                
                                $summStrok++;
                                if ($summStrok >= $page1 && $summStrok <= $page2){
                                    echo "<tr>";
                                        for($p = 0; $p < 12; $p++){
                                            echo "<td>";
                                                echo $mas[$i][$p];
                                            echo "</td>";
                                        }
                                    echo "</tr>";
                                }
                                
                            }
                        };
                    }*/

                     for($index = 0; $index < 12; $index++){
                        for($i = 2; $i < $row; $i++){
                            if($_POST[$index] == $mas[$i][$index]){
                                echo "<tr>";
                                $summStrok++;
                                for($p = 0; $p < 12; $p++){
                                    echo "<td>";
                                        echo $mas[$i][$p];
                                    echo "</td>";
                                }; 
                                echo "</tr>";
                            }
                        };
                    }

                    echo "</table>";
                    
                    
                    echo "<br> ";
                    $strok = $summStrok/20;
                    $strok = ceil($strok);

                    for($j = 1; $j <= $strok; $j++) {
                        ?><a href="index.php?page=<?php echo $j; ?>" style="text-decoration:none"><?php echo $j . " "; ?></a> <?php
                    }
                    echo "<br> ";
                    
                }
            }
        ?>
    
        
        <br><br><br><br><br>
        <p>Tame: <?php echo date('h:i'); ?> <br>
        Date: <?php echo date('d.m.Y'); ?></p>

    </body>
</html>