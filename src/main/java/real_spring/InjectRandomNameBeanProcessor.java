package real_spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InjectRandomNameBeanProcessor implements BeanPostProcessor {
    private InjectRandomNameAnnotationObjectConfigurator configurator = new InjectRandomNameAnnotationObjectConfigurator();
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        configurator.configure(bean);
        return bean;
    }
}
