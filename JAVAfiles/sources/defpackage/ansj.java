package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ansj implements ansc {
    private final ahmn a;

    public ansj(ahmn ahmnVar) {
        this.a = ahmnVar;
    }

    private final byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] O = aode.O(bArr2, bArr3);
        byte[] c = ansf.c(ansf.b);
        ahmn ahmnVar = this.a;
        return ahmnVar.s(bArr, O, c, ahmnVar.o());
    }

    @Override // defpackage.ansc
    public final byte[] a(byte[] bArr, ansd ansdVar) {
        return d(aode.c(ansdVar.a().c(), bArr), bArr, ansdVar.b().c());
    }

    @Override // defpackage.ansc
    public final byte[] b() {
        if (Arrays.equals(this.a.p(), ansf.f)) {
            return ansf.b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    @Override // defpackage.ansc
    public final ansy c(byte[] bArr) {
        byte[] d = aode.d();
        byte[] c = aode.c(d, bArr);
        byte[] e = aode.e(d);
        return new ansy(d(c, e, bArr), e);
    }
}
