
	//修改
	$(function(){
		$("table").on("click",".lwx",function(){    // on是绑定单击事件（点击.lwx触发click事件）
			 $("#a").toggle();
			 var xg= $(this).next().next().val();
			 $("input[name=bookId]").val(xg);
		})

	 
	//修改时点击已借出/未借出时将不该出现的信息隐藏起来
		$("#jjx").change(function(){
			var cx =$(this).val()
			if(cx==1){
				$("#cy").show()
			}else{
				$("#cy").hide()
			}
		})

	//点击修改后的保存	
	//$(":submit").click(function(){
//		 var data=$("form").serialize();
//		 $.ajax({
//			 url:"BookServlet",
//			 data:"opr=update&"+data,
//			 success:function(num){
//				 if(num==1){
//					 alert("插入成功");
//				 }else{
//					 alert("插入失败")
//				 }
//			 }
//		 })
	//})

	//删除
		$("table").on("click",".xxgz",function(){
			var id=$('#n').val();
			$.ajax({
				url:"delectByIdBook",
				data:"Bookid="+id,
				method:"get",
				success:function(data){
					 if(data==1){
						 alert("删除成功");
						 window.location.href="http://localhost:8080/顶顶顶/books.html"
					 }else{
						 alert("删除失败");
						 window.locscation.href="http://localhost:8080/顶顶顶/books.html"
					 }
				 }
			})
		})
	})
