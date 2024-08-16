package example.enablexxx;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author wuzheng.yk
 * @date 2024/8/9
 */
public class ColorImportDeferredSelector implements DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{ Green.class.getName() };
    }
}
