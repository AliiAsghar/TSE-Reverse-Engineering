package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anrz {
    private static final byte[] d = new byte[0];
    public final anry a;
    public final byte[] b;
    public final byte[] c;
    private final BigInteger e;
    private final byte[] f;
    private BigInteger g = BigInteger.ZERO;

    private anrz(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, anry anryVar) {
        this.c = bArr;
        this.b = bArr2;
        this.f = bArr3;
        this.e = bigInteger;
        this.a = anryVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static anrz b(byte[] bArr, byte[] bArr2, byte[] bArr3, ansc anscVar, ahmn ahmnVar, anry anryVar, byte[] bArr4) {
        byte[] b = anscVar.b();
        byte[] p = ahmnVar.p();
        byte[] b2 = anryVar.b();
        byte[] bArr5 = ansf.a;
        byte[] O = aode.O(ansf.m, b, p, b2);
        byte[] bArr6 = ansf.l;
        byte[] bArr7 = d;
        byte[] O2 = aode.O(bArr, ahmnVar.r(bArr6, bArr7, "psk_id_hash", O), ahmnVar.r(ansf.l, bArr4, "info_hash", O));
        byte[] r = ahmnVar.r(bArr3, bArr7, "secret", O);
        return new anrz(bArr2, ahmnVar.q(r, O2, "key", O, anryVar.a()), ahmnVar.q(r, O2, "base_nonce", O, 12), BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), anryVar);
    }

    public final synchronized byte[] a() {
        byte[] P;
        P = aode.P(this.f, anme.x(this.g, 12));
        if (this.g.compareTo(this.e) < 0) {
            this.g = this.g.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return P;
    }
}
