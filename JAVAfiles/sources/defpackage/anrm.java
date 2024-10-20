package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class anrm implements anmv {
    final atii a;

    public anrm(atii atiiVar) {
        this.a = atiiVar;
        if (atiiVar.i()) {
            antn.a.a();
            anme.E(atiiVar);
        }
    }

    @Override // defpackage.anmv
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Object obj = this.a.d;
        if (obj != null) {
            byte[] a = ((anmv) ((anty) obj).a).a(bArr, bArr2);
            int i = ((anty) this.a.d).d;
            int length = bArr.length;
            return a;
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
