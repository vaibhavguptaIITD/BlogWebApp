<%@ taglib uri="/struts-tags" prefix="s"%>

<div id="blog_div" class="pagecontent">
			<div class="sectionHeading" style="width:100px; margin-left:275px;">
				<h2 style="padding:2px;">Blog</h2>
			</div>
			<div class="sectionContent">
				<br/>
				<s:iterator value="blogs">
					<div id='post<s:property value="id"/>' class="post">
					<div class="posttop">
						<h2 class="posttitle">
							<a title="Permanent Link to <s:property value="title"/>" rel="bookmark"><s:property value="title"/></a>
						</h2>
						<div class="postmetatop">
						<div class="categs">Filed Under: <a rel="category" title="View all posts in Uncategorized" href="http://wp-themes.com/?cat=1"><s:property value="category"/></a>  
							<span>Comments Off</span>
						</div>
						<div class="date"><span><s:property value="createdDateString"/></span></div>
						</div>
					</div>
					
					<div class="postcontent">
						<p>
							<s:property value="content"/>
						</p>
					</div>
					
					<div class="postmetabottom">
						<div class="tags">Tags: <a rel="tag" href="http://wp-themes.com/?tag=boat">boat</a>, <a rel="tag" href="http://wp-themes.com/?tag=lake">lake</a></div>
						<div class="readmore">
							<span>
								<a rel="bookmark" href="http://wp-themes.com/?p=19">Permalink </a>
							</span>
						</div>			
					</div>
				</div>
				
				</s:iterator>
				
			</div>
		</div>