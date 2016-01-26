package jersey;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

import com.google.gson.Gson;



/**
 * 资源加载器
 * @author jonn
 *
 */

public class RestApplication extends ResourceConfig{

	public RestApplication() {
		super();
		
		//服务类所在包路径
		
		packages("jersey");
		//打印访问日志
		register(LoggingFilter.class);
		
		register(Gson.class);
		
	}


	
	

}
