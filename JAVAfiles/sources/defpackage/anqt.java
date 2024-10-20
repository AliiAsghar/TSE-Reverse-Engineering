package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anqt {
    public static final anqt a = new anqt("NIST_P256");
    public static final anqt b = new anqt("NIST_P384");
    public static final anqt c = new anqt("NIST_P521");
    public static final anqt d = new anqt("X25519");
    private final String e;

    private anqt(String str) {
        this.e = str;
    }

    public final String toString() {
        return this.e;
    }
}
