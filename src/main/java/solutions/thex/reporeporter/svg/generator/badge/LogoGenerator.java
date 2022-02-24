package solutions.thex.reporeporter.svg.generator.badge;

import lombok.Builder;
import solutions.thex.reporeporter.svg.SvgGenerator;

import java.util.Map;

@Builder
public class LogoGenerator extends SvgGenerator {

    private String theme;
    private String size;
    private String logo;
    private String title;
    private String link;
    private String width;
    private String height;
    private String bg;
    private String color;

    @Override
    public Map<String, Object> getParameters() {
        return Map.of(//
                "logo", logo,//
                "title", title,//
                "link", link,//
                "width", width,//
                "height", height,//
                "bg", bg,//
                "color", color);
    }

    @Override
    public String getTemplatePath() {
        return "templates/logo/" + theme + "-" + size + ".svg.soy";
    }

}
