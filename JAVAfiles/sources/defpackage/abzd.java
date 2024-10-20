package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum abzd implements abyy {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);

    public final int h;

    abzd(int i2) {
        this.h = i2;
    }

    @Override // defpackage.abyy
    public final int a() {
        return this.h;
    }
}
