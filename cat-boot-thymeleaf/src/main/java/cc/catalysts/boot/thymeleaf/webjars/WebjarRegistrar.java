package cc.catalysts.boot.thymeleaf.webjars;

import java.util.Map;

/**
 * <p>Use this interface to register the vrsion of your WebJars for the {@link WebjarsDialect}.</p>
 * <p>Somewhere in one of your Spring-ApplicationContext @Configuration classes you would then have something like: </p>
 * <pre class="code">
 * &#064;Bean
 * public WebjarRegistrar myWebjars() {
 *    return () -&gt; Webjars.webjars;
 * }
 * </pre>
 * <p>The class <code>Webjars</code> must be generated by the gradle plugin <code>cc.catalysts.webjars</code></p>
 *
 * @author Klaus Lehner
 */
public interface WebjarRegistrar {

    /**
     * @return the webjar map, generated by the gradle plugin <code>cc.catalysts.webjars</code>
     */
    Map<String, ?> getWebjarMap();
}