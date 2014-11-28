package ro.softvision.svu.spring4.rest.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Special {@link DispatcherServlet} subclass that certain exporter components
 * can recognize.
 * 
 * Customized from
 * {@link org.springframework.data.rest.webmvc.RepositoryRestDispatcherServlet}
 */
public class RepositoryRestDispatcherServlet extends DispatcherServlet {

	private static final long serialVersionUID = 5761346441984290240L;

	public RepositoryRestDispatcherServlet() {
		configure();
	}

	public RepositoryRestDispatcherServlet(WebApplicationContext webApplicationContext) {
		super(webApplicationContext);
		configure();
	}

	private void configure() {
		setContextClass(AnnotationConfigWebApplicationContext.class);
		setContextConfigLocation(RepositoryRestMvcConfiguration.class.getName());
	}

}
