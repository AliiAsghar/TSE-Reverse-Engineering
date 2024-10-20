package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvl {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static boolean a(String str) {
        if (str != null && !str.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}
