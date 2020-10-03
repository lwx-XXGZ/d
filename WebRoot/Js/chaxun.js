$(function(){
 $("#ai").click(function(){          //点击button按钮触发ajax函数
	 var name=$('#zx').val()
	 var sx=$('#mn').val()
	 $.ajax({
		 url:"findBook",
		 data:"BookName="+name+"&Status="+sx,
		 dataType:"json",
		 method:"get",
		 success:function(data){
			 var c=''
					$("table").html("<tr><th>书籍名称</th><th>出版社</th><th>出版状态</th><th>借出人</th><th>借出时间</th><th>操作</th></tr>")
					for(var i=0;i<data.length;i++){
						if(data[i].status==0){
							c="未借出"
							data[i].username=""
							data[i].borrowDate=""
						}
						if(data[i].status==1){
							c="已借出"
						}
						
						var $tr=$("<tr></tr>"); 
						var $td1=$("<td>"+data[i].bookname+"</td>");
						var $td2=$("<td>"+data[i].press+"</td>");
						var $td3=$("<td>"+c+"</td>");
						var $td4=$("<td>"+data[i].username+"</td>");
						var $td5=$("<td>"+data[i].borrowDate+"</td>");
						var xg=$("<p class='lwx'>修改</p>");
						var sc=$("<p class='xxgz'>删除</p>");
						var hidden=$("<input type='hidden' name='id' id='n' value="+data[i].bookid+">")
						$tr.append($td1).append($td2).append($td3).append($td4).append($td5).append(xg).append(sc).append(hidden);
						$("table").append($tr);
			 }
		 
     }	
 })   
})})