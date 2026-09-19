package oops.assigment_problems;

public class AccessChecker {

    public static String classifyAccess(String fieldModifier,
                                        String accessorContext) {

        if (fieldModifier == null || accessorContext == null) {
            return "DENIED";
        }

        switch (fieldModifier.toLowerCase()) {

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
                        || accessorContext.equals(
                            "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE")
                        ? "ALLOWED" : "DENIED";

            case "public":
                return "ALLOWED";

            default:
                return "DENIED";
        }
    }

    public static String summarizeByModifier(String[][] attempts) {

        int privateAllowed = 0;
        int privateDenied = 0;

        int defaultAllowed = 0;
        int defaultDenied = 0;

        int protectedAllowed = 0;
        int protectedDenied = 0;

        int publicAllowed = 0;
        int publicDenied = 0;

        if (attempts != null) {
            for (String[] attempt : attempts) {

                if (attempt == null || attempt.length < 2) {
                    continue;
                }

                String modifier = attempt[0];
                String context = attempt[1];

                String result = classifyAccess(modifier, context);

                if ("private".equalsIgnoreCase(modifier)) {
                    if ("ALLOWED".equals(result)) {
                        privateAllowed++;
                    } else {
                        privateDenied++;
                    }
                } else if ("default".equalsIgnoreCase(modifier)) {
                    if ("ALLOWED".equals(result)) {
                        defaultAllowed++;
                    } else {
                        defaultDenied++;
                    }
                } else if ("protected".equalsIgnoreCase(modifier)) {
                    if ("ALLOWED".equals(result)) {
                        protectedAllowed++;
                    } else {
                        protectedDenied++;
                    }
                } else if ("public".equalsIgnoreCase(modifier)) {
                    if ("ALLOWED".equals(result)) {
                        publicAllowed++;
                    } else {
                        publicDenied++;
                    }
                }
            }
        }

        return "private: " + privateAllowed + " allowed / "
                + privateDenied + " denied | "
                + "default: " + defaultAllowed + " allowed / "
                + defaultDenied + " denied | "
                + "protected: " + protectedAllowed + " allowed / "
                + protectedDenied + " denied | "
                + "public: " + publicAllowed + " allowed / "
                + publicDenied + " denied";
    }

    public static String firstDeniedAttempt(String[][] attempts) {

        if (attempts == null) {
            return "None Denied";
        }

        for (int i = 0; i < attempts.length; i++) {

            String[] attempt = attempts[i];

            if (attempt == null || attempt.length < 2) {
                continue;
            }

            String modifier = attempt[0];
            String context = attempt[1];

            if ("DENIED".equals(classifyAccess(modifier, context))) {
                return modifier + " via "
                        + context
                        + " (attempt #" + (i + 1) + ")";
            }
        }

        return "None Denied";
    }
}