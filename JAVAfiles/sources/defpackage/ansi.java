package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ansi implements ansc {
    private final aobi a;
    private final ahmn b;

    private ansi(ahmn ahmnVar, aobi aobiVar) {
        this.b = ahmnVar;
        this.a = aobiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ansi d(aobi aobiVar) {
        int ordinal = aobiVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return new ansi(new ahmn("HmacSha512", null), aobi.NIST_P521);
                }
                throw new GeneralSecurityException("invalid curve type: ".concat(String.valueOf(String.valueOf(aobiVar))));
            }
            return new ansi(new ahmn("HmacSha384", null), aobi.NIST_P384);
        }
        return new ansi(new ahmn("HmacSha256", null), aobi.NIST_P256);
    }

    private final byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] O = aode.O(bArr2, bArr3);
        byte[] c = ansf.c(b());
        ahmn ahmnVar = this.b;
        return ahmnVar.s(bArr, O, c, ahmnVar.o());
    }

    @Override // defpackage.ansc
    public final byte[] a(byte[] bArr, ansd ansdVar) {
        return e(aode.J(aode.z(this.a, ansdVar.a().c()), aode.B(this.a, aobk.UNCOMPRESSED, bArr)), bArr, ansdVar.b().c());
    }

    @Override // defpackage.ansc
    public final byte[] b() {
        int ordinal = this.a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return ansf.e;
                }
                throw new GeneralSecurityException("Could not determine HPKE KEM ID");
            }
            return ansf.d;
        }
        return ansf.c;
    }

    @Override // defpackage.ansc
    public final ansy c(byte[] bArr) {
        aobi aobiVar = this.a;
        KeyPair w = aode.w(aobiVar);
        byte[] J = aode.J((ECPrivateKey) w.getPrivate(), aode.B(aobiVar, aobk.UNCOMPRESSED, bArr));
        byte[] K = aode.K(this.a, aobk.UNCOMPRESSED, ((ECPublicKey) w.getPublic()).getW());
        return new ansy(e(J, K, bArr), K);
    }
}
