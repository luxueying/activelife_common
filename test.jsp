<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" type="text/css" href="js/easyui.css">
 <script type="text/javascript" src="js/jquery.min.js"></script>
 <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
开始日期：<input class="easyui-datebox" name="begindate" id="begindate"
data-options="formatter:myformatter,parser:myparser"></input>
&nbsp;
结束日期：<input class="easyui-datebox" name="enddate" id="enddate"
data-options="formatter:myformatter,parser:myparser"></input>
<script type="text/javascript">
function myformatter(date) {
var y = date.getFullYear();
var m = date.getMonth() + 1;
var d = date.getDate();
return y + '-' + (m < 10 ? ('0' + m) : m) + '-'
+ (d < 10 ? ('0' + d) : d);
}
function myparser(s) {
if (!s)
return new Date();
var ss = (s.split('-'));
var y = parseInt(ss[0], 10);
var m = parseInt(ss[1], 10);
var d = parseInt(ss[2], 10);
if (!isNaN(y) && !isNaN(m) && !isNaN(d)) {
return new Date(y, m - 1, d);
} else {
return new Date();
}


}
</script>
</body>
</html>