package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anns {
    public static final anns a = new anns("SHA1");
    public static final anns b = new anns("SHA224");
    public static final anns c = new anns("SHA256");
    public static final anns d = new anns("SHA384");
    public static final anns e = new anns("SHA512");
    private final String f;

    private anns(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
