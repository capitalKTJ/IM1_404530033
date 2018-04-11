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
    $(function(){
    $(document).ready(function() {
    $.ajax({
        type: "GET",
        url: "count.json",
        dataType: "json",
        cache: false,
        success: function(data) {
            processData(data);
        },
    });
});

function processData(allText) {
    //var allTextwords = allText.split(/\r\n|\n/);
    //var headers = allTextwords[0].split(',');
    var words = [];
    $.each(allText,function(key,val){
         
         var temp = [];
         temp.push(key,val);
         //document.write(temp);
         //document.write("\n");
         words.push(temp);
    })
    //console.log(words);
    
    //console.log(allText);
    /*for (var i=1; i<allTextwords.length; i++) {
        var data = allTextwords[i].split(',');
        if (data.length == headers.length) {

            var tarr = [];
            for (var j=0; j<headers.length; j++) {
                tarr.push(data[j]);
            }
            words.push(tarr);
        }
    }*/
    //console.log(words);
    //document.write(words);

 var tf;
  WordCloud($('#wordCloud')[0], {
            list: words,
            classes: 'wordCloud',
            wait: 30,
            gridSize: 10,
            weightFactor: 20,
            fontFamily: 'Hiragino Mincho Pro, serif',
            color: 'random-dark',
            backgroundColor: '#FFFFFF',
            rotateRatio: 0,
            click: function (item) {
                 tf = confirm(item[0] + ': ' + item[1]);
                 if (tf == true){
                     //var click_word = item[0];
                     //document.cookie = click_word;
                     location.href = ("list.php?word=" + item[0]);
                 }
             }
        });
        //文字雲特殊效果
        $(document).on('mouseenter','.wordCloud',function(){
            var font_size = parseFloat($(this).css("font-size"));
            var newSize = font_size + 10;
            $(this).css("font-size",newSize + 'px');
        }).on('mouseout','.wordCloud',function(){
            var font_size = parseFloat($(this).css("font-size"));
            var newSize = font_size - 10;
            $(this).css("font-size",newSize + 'px');
        });
        //document.getElementById("list").innerHTML = "123";
    }
            
  });
    </script>
    <body>
        <div class="container">
            <ul class="stepbar">
                <li class="step">Step1<div class="steps">輸入網址</div></li>
                <li class="step">Step2<div class="steps">取得資料</div></li>
                <li class="step">Step3<div class="steps">資料分析</div></li>
                <li class="step">Step4<div class="steps">產生文字雲</div></li>
            </ul>    
        </div>
        <div id="wdcontainer" style="width:1000px;margin-left:-485px;">
            <div id="wordCloud" style="width:998px;height:550px;border:thin solid #DBDBDB;background-color:#DBDBDB">
            </div>
        </div>
        <div id="footer">
                  
        </div>
    </body>
    
</html>