package whiteship.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebAppIntializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext context) throws ServletException {
//        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
//        applicationContext.register(AppConfig.class);
//        applicationContext.refresh();
//
//        AnnotationConfigWebApplicationContext dispatcherServeltContext = new AnnotationConfigWebApplicationContext();
//        dispatcherServeltContext.setParent(applicationContext);
//        dispatcherServeltContext.register(WebConfig.class);
//        dispatcherServeltContext.refresh();
//
//        ServletRegistration.Dynamic dispatcher = context.addServlet("spring", new DispatcherServlet(dispatcherServeltContext));
//        dispatcher.setLoadOnStartup(1);
//        dispatcher.addMapping("/");

        context.setInitParameter("contextConfigLocation", "whiteship");

		AnnotationConfigWebApplicationContext contextLoaderContext = new AnnotationConfigWebApplicationContext();
		context.addListener(new ContextLoaderListener(contextLoaderContext));

		AnnotationConfigWebApplicationContext dispatcherServletContext = new AnnotationConfigWebApplicationContext();
		dispatcherServletContext.setConfigLocation("");
		ServletRegistration.Dynamic dispatcher = context.addServlet("appServlet", new DispatcherServlet(dispatcherServletContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
    }
}
