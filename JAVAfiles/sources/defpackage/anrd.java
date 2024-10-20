package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anrd extends anrb {
    public static final anrd a = new anrd("DHKEM_P256_HKDF_SHA256", 16);
    public static final anrd b = new anrd("DHKEM_P384_HKDF_SHA384", 17);
    public static final anrd c = new anrd("DHKEM_P521_HKDF_SHA512", 18);
    public static final anrd f = new anrd("DHKEM_X25519_HKDF_SHA256", 32);

    private anrd(String str, int i) {
        super(str, i);
    }
}
