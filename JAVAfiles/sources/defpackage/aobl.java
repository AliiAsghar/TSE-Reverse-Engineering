package defpackage;

import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aobl implements anmr {
    public final aobs a;
    public final anne b;
    public final int c;
    public final byte[] d;

    private aobl(aobs aobsVar, anne anneVar, int i, byte[] bArr) {
        this.a = aobsVar;
        this.b = anneVar;
        this.c = i;
        this.d = bArr;
    }

    public static anmr c(annp annpVar) {
        aoas aoasVar = new aoas(annpVar.h.y(), annpVar.e.g);
        String valueOf = String.valueOf(String.valueOf(annpVar.e.j));
        return new aobl(aoasVar, new aoby(new aobx("HMAC".concat(valueOf), new SecretKeySpec(annpVar.i.y(), "HMAC")), annpVar.e.h), annpVar.e.h, annpVar.f.c());
    }

    @Override // defpackage.anmr
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    @Override // defpackage.anmr
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
