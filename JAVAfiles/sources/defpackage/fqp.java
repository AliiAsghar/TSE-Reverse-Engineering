package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqp extends fqw {
    private flz a;
    private fqo o;

    private static boolean d(byte[] bArr) {
        if (bArr[0] != -1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqw
    public final long a(euf eufVar) {
        if (d(eufVar.a)) {
            int i = (eufVar.a[2] & 255) >> 4;
            if (i != 6) {
                if (i == 7) {
                    i = 7;
                }
                int g = eef.g(eufVar, i);
                eufVar.J(0);
                return g;
            }
            eufVar.K(4);
            eufVar.t();
            int g2 = eef.g(eufVar, i);
            eufVar.J(0);
            return g2;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqw
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.a = null;
            this.o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqw
    public final boolean c(euf eufVar, long j, fqu fquVar) {
        byte[] bArr = eufVar.a;
        flz flzVar = this.a;
        if (flzVar == null) {
            flz flzVar2 = new flz(bArr, 17);
            this.a = flzVar2;
            fquVar.a = flzVar2.c(Arrays.copyOfRange(bArr, 9, eufVar.c), null);
            return true;
        }
        if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            fvq J = dxt.J(eufVar);
            flz e = flzVar.e(J);
            this.a = e;
            this.o = new fqo(e, J);
            return true;
        }
        if (!d(bArr)) {
            return true;
        }
        fqo fqoVar = this.o;
        if (fqoVar != null) {
            fqoVar.a = j;
            fquVar.b = fqoVar;
        }
        dzg.g(fquVar.a);
        return false;
    }
}
