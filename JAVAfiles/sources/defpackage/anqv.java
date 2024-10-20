package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anqv {
    public static final anqv a = new anqv("COMPRESSED");
    public static final anqv b = new anqv("UNCOMPRESSED");
    public static final anqv c = new anqv("LEGACY_UNCOMPRESSED");
    private final String d;

    private anqv(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
