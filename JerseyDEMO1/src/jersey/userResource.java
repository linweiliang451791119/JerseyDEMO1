package jersey;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.User;
/**
 * 
 * 在web.xml配置的path的基础上
 * 相当于struts2的action
 * @author jonn
 *
 */
@Path("/userAction")
public class userResource {

	@GET
	@Path("/getUser")
	@Produces(MediaType.TEXT_PLAIN)
	public String getUser()
	{
		return "override the world";
	}
	/**
	 * 必须导入jersey-client.jar
	 * @return
	 */
	@GET
	@Path("/getUserXML")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public User getUserXML()
	{
		
		User user = new User();
		user.setName("林炜量");
		user.setAge("22");
		user.setSex("male");
		return user;		
	}
	
	
	@GET
	@Path("/getUserJSON")
	@Produces(MediaType.APPLICATION_JSON) 
	public User getUserJSON()
	{
		User user = new User();
		user.setName("林炜量");
		user.setAge("22");
		user.setSex("male");
		return user;		
	  	
	}
	
}
