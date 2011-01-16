<div id="cartoonPage">
	<canvas data-processing-sources="/pde/sketch_dec05a.pde" style="position:fixed;z-index:-1;top:0px;left:0px;"></canvas>
	<div>
		<img id="sp-image" src="/images/transparent-cartoon.png" style="width:150px; height:150px; float:left;"/>
	</div>
	
	<div class="transBlackBackground" style="float:left; width:290px; padding:5px;" >
		<p style="line-height:1.5">
			Hey Guys, I am Vaibhav Gupta. Welcome to my website. This site portrays my musings and is my playground to try out new things in the field of javaScript, jQuery and User Interface.  
		</p>	
	
	</div>
</div>

<script>
	$(document).ready(function()
	{
		$("#sp-image").hover(
			function(){
				$(this).attr("src","/images/transparent-cartoonSad.png");
			},
			function()
			{
				$(this).attr("src","/images/transparent-cartoon.png");
			}

		)
	});

</script>