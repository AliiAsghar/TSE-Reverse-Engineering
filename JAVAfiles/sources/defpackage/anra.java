package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anra extends anrb {
    public static final anra a = new anra("AES_128_GCM", 1);
    public static final anra b = new anra("AES_256_GCM", 2);
    public static final anra c = new anra("CHACHA20_POLY1305", 3);

    private anra(String str, int i) {
        super(str, i);
    }
}
