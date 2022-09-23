package function;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * @author by woyuan  2022/6/25
 */
@FunctionalInterface
public interface PredicateWy<T> {
    boolean test(T t);

    default PredicateWy<T> or(PredicateWy<? super T> other) {
        Objects.requireNonNull(other);
        return (e)->test(e) && other.test(e);
    }



}
