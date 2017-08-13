<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Задание №2</title>
        <style type="text/css">
            div {
                border: solid 1px black; 
                margin-bottom: 10px;
                margin-top: 10px;
            }
        </style>
    </head>
    <body>
        <?php
            $string = file_get_contents('http://tass.ru/rss/v2.xml');

            $xml = new SimpleXMLElement($string);

            $result = $xml->xpath('/rss/channel/item/pubDate');
            $masDate = array();
            $limit = 5;
            for($i = 0; $i < $limit; $i++){
                list( , $node) = each($result);
                $masDate[$i] = $node;
            }

            $result = $xml->xpath('/rss/channel/item/guid');
            $masLink = array();
            for($i = 0; $i < $limit; $i++){
                list( , $node) = each($result);
                $masLink[$i] = $node;
            }

            $result = $xml->xpath('/rss/channel/item/title');
            $masTitle = array();
            for($i = 0; $i < $limit; $i++){
                list( , $node) = each($result);
                $masTitle[$i] = $node;
            }
        
            for($i = 0; $i < $limit; $i++){
                echo "<div>";
                echo $masTitle[$i];
                echo "<br>" . $masDate[$i];
                echo "<br>" . $masLink[$i];
                echo "</div>";
            }
        
        ?>
    </body>
</html>