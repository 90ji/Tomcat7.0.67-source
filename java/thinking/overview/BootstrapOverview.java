package thinking.overview;

/**
 * @Author MoonLion
 * @Date Create in 2018/4/26 0026
 * @Description
 */
public class BootstrapOverview {
    //初始化类加载器：                  主要初始化Tomcat加载自身类库的StandardClassLoader。
    //解析配置文件：                    使用Digester组件解析Tomcat的server.xml，初始化各个组件（包含各个web应用，解析对应的web.xml进行初始化）。
    //初始化Tomcat的各级容器Container,  当然最后会初始我们Web应用(我们熟悉的Listener,Filter,Servlet等初始化等在这里完成)。
    //初始化连接器Connector：           初始化配置的Connector，以指定的协议打开端口，等待请求。
}
