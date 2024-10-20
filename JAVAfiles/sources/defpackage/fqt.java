package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqt extends fqw {
    public static final byte[] a = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] o = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean p;

    public static boolean d(euf eufVar, byte[] bArr) {
        if (eufVar.b() < 8) {
            return false;
        }
        int i = eufVar.b;
        byte[] bArr2 = new byte[8];
        eufVar.E(bArr2, 0, 8);
        eufVar.J(i);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqw
    public final long a(euf eufVar) {
        byte[] bArr = eufVar.a;
        byte b = 0;
        byte b2 = bArr[0];
        if (bArr.length > 1) {
            b = bArr[1];
        }
        return f(dxt.F(b2, b));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqw
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.p = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqw
    public final boolean c(euf eufVar, long j, fqu fquVar) {
        if (d(eufVar, a)) {
            byte[] copyOf = Arrays.copyOf(eufVar.a, eufVar.c);
            int i = copyOf[9] & 255;
            List G = dxt.G(copyOf);
            if (fquVar.a == null) {
                eqm eqmVar = new eqm();
                eqmVar.b("audio/opus");
                eqmVar.B = i;
                eqmVar.C = 48000;
                eqmVar.p = G;
                fquVar.a = new eqn(eqmVar);
                return true;
            }
        } else if (d(eufVar, o)) {
            dzg.h(fquVar.a);
            if (!this.p) {
                this.p = true;
                eufVar.K(8);
                erk A = dxt.A(alog.p((Object[]) dxt.K(eufVar, false, false).a));
                if (A != null) {
                    eqn eqnVar = fquVar.a;
                    eqm eqmVar2 = new eqm(eqnVar);
                    eqmVar2.k = A.d(eqnVar.l);
                    fquVar.a = new eqn(eqmVar2);
                }
            }
        } else {
            dzg.h(fquVar.a);
            return false;
        }
        return true;
    }
}
