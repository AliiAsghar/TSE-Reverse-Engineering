package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum acpg {
    FULL("full"),
    PARTIAL("partial"),
    DELETED("deleted"),
    NONE("none");

    public final String e;

    acpg(String str) {
        this.e = str;
    }

    public static acpg a(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (acpg acpgVar : values()) {
            if (acpgVar.e.equals(lowerCase)) {
                return acpgVar;
            }
        }
        return NONE;
    }
}
