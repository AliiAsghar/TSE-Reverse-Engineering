package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anqu {
    public static final anqu a = new anqu("SHA1");
    public static final anqu b = new anqu("SHA224");
    public static final anqu c = new anqu("SHA256");
    public static final anqu d = new anqu("SHA384");
    public static final anqu e = new anqu("SHA512");
    private final String f;

    private anqu(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
