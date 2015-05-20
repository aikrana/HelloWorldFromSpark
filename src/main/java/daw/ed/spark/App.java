package daw.ed.spark;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import static spark.Spark.get;
import spark.template.freemarker.FreeMarkerRoute;

public class App {

    public static void main(String[] args) {
        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello Spark MVC Framework!";
            }
        });
        
        
////freemarker
        /*get(new FreeMarkerRoute("/freemarker/hello") {
        @Override
        public ModelAndView handle(Request request, Response response) {
        return modelAndView(null, "hello.ftl");
        }
        });*/
        
        get(new FreeMarkerRoute("/freemarker/hello") {
            @Override
            public ModelAndView handle(Request request, Response response) {
                Map<String, Object> data = new HashMap<>();
                data.put("name","Fulanito");
                data.put("colores",Arrays.asList("rojo","naranja","verde","azul"));
                data.put("numero","1");
                return modelAndView(data, "hello_name.ftl");
            }
        });
        
        get(new FreeMarkerRoute("/freemarker/herencia") {
            @Override
            public ModelAndView handle(Request request, Response response) {
                Map<String, Object> data = new HashMap<>();
                data.put("name","Fulanito");
                data.put("colores",Arrays.asList("rojo","naranja","verde","azul"));
                data.put("numero","1");
                return modelAndView(data, "content.ftl");
            }
        });
    }
}
