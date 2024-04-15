package ReplaceIfElseWithLamda;

/**
 * @author by woyuan  2023/11/3
 */
public class Vutils {
    public static ThrowExceptionFunction isTrue(boolean b){

        return (errorMessage) -> {
            if (b){
                throw new RuntimeException(errorMessage);
            }
        };
    }

    public static BranchHandle isTrueOrFalse(boolean b){

        return (trueHandle, falseHandle) -> {
            if (b){
                trueHandle.run();
            } else {
                falseHandle.run();
            }
        };
    }
}
