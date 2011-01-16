
function Navigation(navObj)
{
	this.navBarParentObj = $("#"+navObj.navBar);
	this.navBarListObj = $("li[id$=_link]",this.navBarParentObj);
	this.scrollTops = new Object();
	this.init();
}

Navigation.prototype.init = function()
{
	var othat = this,
	hash="";
	this.bodyObj = $('html,body').attr('scrollTop',0);
	this.navBarListObj.each(function()
	{
		var othis = $(this);
		var targetDiv = $("#"+othis.attr("id").split("_")[0] + "_div");
		othat.scrollTops[othis.attr("id")] = targetDiv.offset().top;
		othis.click(function()
		{
			othis.data("animate",true);
			setTimeout(function()
			{
				animateUp(othis);
			},10);
			othat.animateDiv(othis);
			window.location.hash = $('a',othis).attr("href");
			return false;
		});
		
	});
	
	
	$(window).scroll(function()
	{
		
		var visibleDiv = $('div.pagecontent:in-viewport:last');
		var currentLink = $('.active');
		currentLink.removeClass("active");
		currentLink.data("animate", false);
		if(visibleDiv.length != 0)
		{
			var targetNavId = $(visibleDiv).attr('id').split("_")[0] + "_link";
			$("#"+targetNavId).addClass("active");
		}
	});
	
	hash = window.location.hash.substring(1);
	if(hash)
	{
		var targetNavObj = $("#"+hash+"_link");
		othat.animateDiv(targetNavObj);
	}
	
}

Navigation.prototype.animateDiv = function(navObj)
{
	var navId = navObj.attr("id");
	var newDivTop = this.scrollTops[navId];
	//var parentWindowTop = this.parentWindow.offset().top;
	//var animateHeight = newDivTop - parentWindowTop;
	this.bodyObj.stop().animate({scrollTop: newDivTop},1200,function(){navObj.data("animate",false)});

}

function animateUp(othis)
{
	if(othis.data("animate"))
	{
		othis.animate({top:"-20px"},900,function(){animateDown(othis);});
	}

}
function animateDown(othis)
{
	othis.animate({top:"0px"},1000, "easeOutBounce",function(){animateUp(othis);});
}
