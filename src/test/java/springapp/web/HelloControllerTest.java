package springapp.web;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;


public class HelloControllerTest {

	@Test
	public void handleRequestViewTest() throws Exception {
		
		HelloController controller = new HelloController();
		ModelAndView modelAndView = controller.handleRequest(null, null);
		Assert.assertEquals("WEB-INF/jsp/hello.jsp", modelAndView.getViewName());
		Assert.assertNotNull(modelAndView.getModel());
		String nowValue = (String) modelAndView.getModel().get("now");
		Assert.assertNotNull(nowValue);
	}
}
