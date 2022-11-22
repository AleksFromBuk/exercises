package initializer;

public class Initializer {
    static void initialize(final Upper anUpper)
    {
       //f (anUpper instanceof Lower)
        //
            Lower lower = (Lower)anUpper;
            lower.lowerString = "lowerInited";
       //
        anUpper.upperString = "upperInited";
    }
}
