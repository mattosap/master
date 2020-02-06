package mattosap.prova.certi.resource;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JsonBean {

    public String extenso;

    public JsonBean() {
    }

    public JsonBean(String a) {
        this.extenso = a;
        
    }

    public String getA() {
        return extenso;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        JsonBean that = (JsonBean) o;
    
        if (extenso != null ? !extenso.equals(that.extenso) : that.extenso != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = extenso != null ? extenso.hashCode() : 0;
        
        return result;
    }
}