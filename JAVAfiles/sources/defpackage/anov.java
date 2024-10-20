package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anov {
    public static final anov a = new anov("ASSUME_AES_GCM");
    public static final anov b = new anov("ASSUME_XCHACHA20POLY1305");
    public static final anov c = new anov("ASSUME_CHACHA20POLY1305");
    public static final anov d = new anov("ASSUME_AES_CTR_HMAC");
    public static final anov e = new anov("ASSUME_AES_EAX");
    public static final anov f = new anov("ASSUME_AES_GCM_SIV");
    public final String g;

    private anov(String str) {
        this.g = str;
    }

    public final String toString() {
        return this.g;
    }
}
