package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anut {
    public static final anut a = new anut("SHA1");
    public static final anut b = new anut("SHA224");
    public static final anut c = new anut("SHA256");
    public static final anut d = new anut("SHA384");
    public static final anut e = new anut("SHA512");
    private final String f;

    private anut(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
