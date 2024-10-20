package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoae {
    public static final aoae a = new aoae("SHA1");
    public static final aoae b = new aoae("SHA256");
    public static final aoae c = new aoae("SHA512");
    private final String d;

    private aoae(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
