package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiol {
    public static final Pattern a = Pattern.compile("(\\d+)\\s+(\\S+)\\s+\"(\\d+)\\s+.+\"");

    public static int a(aioo aiooVar) {
        String j = aiooVar.j("Retry-After");
        if (j != null) {
            try {
                return Integer.parseInt(j);
            } catch (NumberFormatException e) {
                advr.s(e, "Retry-After does not contain a parsable integer (%s).", j);
            }
        }
        return 0;
    }
}
