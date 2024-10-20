package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqq implements flu {
    private flw a;
    private fqw b;
    private boolean c;

    private final boolean a(flv flvVar) {
        fqr fqrVar = new fqr();
        if (fqrVar.b(flvVar, true) && (fqrVar.a & 2) == 2) {
            int min = Math.min(fqrVar.e, 8);
            euf eufVar = new euf(min);
            flvVar.j(eufVar.a, 0, min);
            b(eufVar);
            if (eufVar.b() >= 5 && eufVar.j() == 127 && eufVar.r() == 1179402563) {
                this.b = new fqp();
            } else {
                b(eufVar);
                try {
                    if (dxt.B(1, eufVar, true)) {
                        this.b = new fqx();
                    }
                } catch (erm unused) {
                }
                b(eufVar);
                if (fqt.d(eufVar, fqt.a)) {
                    this.b = new fqt();
                }
            }
            return true;
        }
        return false;
    }

    private static void b(euf eufVar) {
        eufVar.J(0);
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        int i = alog.d;
        return alsx.a;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        this.a = flwVar;
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        fqw fqwVar = this.b;
        if (fqwVar != null) {
            gad gadVar = fqwVar.n;
            ((fqr) gadVar.d).a();
            ((euf) gadVar.e).F(0);
            gadVar.b = -1;
            gadVar.c = false;
            if (j == 0) {
                fqwVar.b(!fqwVar.l);
                return;
            }
            if (fqwVar.h != 0) {
                fqwVar.e = fqwVar.f(j2);
                fqs fqsVar = fqwVar.d;
                int i = eul.a;
                fqsVar.c(fqwVar.e);
                fqwVar.h = 2;
            }
        }
    }

    @Override // defpackage.flu
    public final boolean g(flv flvVar) {
        try {
            return a(flvVar);
        } catch (erm unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARN: Type inference failed for: r1v4, types: [fqs, java.lang.Object] */
    @Override // defpackage.flu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(defpackage.flv r21, defpackage.vtk r22) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqq.i(flv, vtk):int");
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
