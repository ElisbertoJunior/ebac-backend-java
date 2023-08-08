package anotacao;

import java.lang.annotation.*;

/**
 * @author elisberto.junior
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
