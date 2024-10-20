package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akvl implements akta {
    private final apwt a;
    private final alhm b;

    public akvl(apwt apwtVar, alhm alhmVar) {
        this.a = apwtVar;
        this.b = alhmVar;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [armf, java.lang.Object] */
    @Override // defpackage.akta
    public final void b(aktq aktqVar, SparseArray sparseArray) {
        algw algwVar;
        algw algwVar2 = (algw) this.a.b();
        if (algwVar2.f() && ((ahqz) algwVar2.b()).b()) {
            ahqy ahqyVar = ((ahqz) algwVar2.b()).c;
            long j = aktqVar.d;
            float f = ahqyVar.a;
            if (aktp.b(j, f)) {
                algwVar = algw.i(Float.valueOf(f));
            } else {
                algwVar = alfd.a;
            }
        } else {
            algwVar = alfd.a;
        }
        if (algwVar.f()) {
            new SparseArray();
            akvq P = aktp.P(aktqVar, sparseArray, ((Float) algwVar.b()).floatValue());
            if (P.e) {
                if (((algw) this.a.b()).f()) {
                    return;
                }
                return;
            }
            alhm alhmVar = this.b;
            ((ahre) alhmVar.a.b()).a(P.f, P.g, P.b);
            if (((algw) this.a.b()).f() && ((ahqz) ((algw) this.a.b()).b()).b) {
                alhm alhmVar2 = this.b;
                long j2 = P.c;
                long j3 = P.d;
                ((ahqm) alhmVar2.b.b()).a(P.a, j2, j3, P.b);
            }
        }
    }
}
