package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum adwl {
    UNKNOWN("UNKNOWN"),
    SINGLE_REG("SINGLE_REG"),
    DUAL_REG("DUAL_REG");

    public final String d;

    adwl(String str) {
        this.d = str;
    }

    public static adwl a(int i) {
        if (i == 2) {
            return SINGLE_REG;
        }
        if (i == 1) {
            return DUAL_REG;
        }
        return UNKNOWN;
    }
}
