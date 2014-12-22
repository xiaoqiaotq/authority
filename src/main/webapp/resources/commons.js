           var commons=(function(){
        	   //复选框全选控制，o为jquery对象
        	   var checkAll=function(o){
        	          o.change(function () {
        	               var set = jQuery(this).attr("data-set");
        	               var checked = jQuery(this).is(":checked");
        	               jQuery(set).each(function () {
        	                   if (checked) {
        	                       $(this).attr("checked", true);
        	                   } else {
        	                       $(this).attr("checked", false);
        	                   }
        	               });
        	               jQuery.uniform.update(set);
        	           });
        	   }
        	   return {
        		   checkAll:checkAll
        	   }
           }())
           
