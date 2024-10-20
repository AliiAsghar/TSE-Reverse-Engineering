package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anzz {
    public static final anzz a = new anzz("SHA1");
    public static final anzz b = new anzz("SHA256");
    public static final anzz c = new anzz("SHA512");
    private final String d;

    private anzz(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
