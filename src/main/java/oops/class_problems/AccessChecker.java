package oops.class_problems;

public class AccessChecker {

    public static String classifyAccess(String fieldModifier,
                                        String accessorContext) {

        if (fieldModifier == null || accessorContext == null) {
            return "DENIED";
        }

        fieldModifier = fieldModifier.toLowerCase();
        accessorContext = accessorContext.toUpperCase();

        switch (fieldModifier) {

            case "private":
                return accessorContext.equals("SAME_CLASS")
                        ? "ALLOWED" : "DENIED";

            case "default":
                return accessorContext.equals("SAME_CLASS")
                        || accessorContext.equals("SAME_PACKAGE")
                        ? "ALLOWED" : "DENIED";

            case "protected":
                return accessorContext.equals("SAME_CLASS")
                        || accessorContext.equals("SAME_PACKAGE")
                        || accessorContext.equals("SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE")
                        ? "ALLOWED" : "DENIED";

            case "public":
                return "ALLOWED";

            default:
                return "DENIED";
        }
    }

    public static String summarizeBatch(String[][] attempts) {

        int allowed = 0;
        int denied = 0;

        if (attempts == null) {
            return "Allowed: 0 | Denied: 0";
        }

        for (String[] attempt : attempts) {

            if (attempt == null || attempt.length < 2) {
                denied++;
                continue;
            }

            String modifier = attempt[0];
            String context = attempt[1];

            if ("ALLOWED".equals(classifyAccess(modifier, context))) {
                allowed++;
            } else {
                denied++;
            }
        }

        return "Allowed: " + allowed + " | Denied: " + denied;
    }
}