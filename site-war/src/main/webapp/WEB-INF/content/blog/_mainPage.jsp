<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<jsp:include page="/includes/script.html"/>
<script type="text/javascript" src="/js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="/js/jquery.mousewheel.js"></script>
<script type="text/javascript" src="/js/jquery.viewport.mini.js"></script>
<script type="text/javascript" src="/js/pageSlideNav.js"></script>
<script src="/js/processing-1.0.0.js"></script>
<jsp:include page="/includes/style.html"/>
	
	<body>
		<jsp:include page="_cartoonPage.jsp"/>
		<jsp:include page="_aboutPage.jsp"/>
		<jsp:include page="_projectPage.jsp"/>
		<jsp:include page="_contactPage.jsp"/>
		<jsp:include page="_blogPage.jsp"/>
		<jsp:include page="_navigationBar.jsp"/>
	</body>
</html>