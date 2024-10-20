package defpackage;

import com.google.android.rcs.client.messaging.data.FileInformation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pwc extends pvu {
    static final algf a = new pwb();

    @Override // defpackage.pvu
    public final void c(qep qepVar, ajqc ajqcVar) {
        if (qepVar.c.isEmpty()) {
            return;
        }
        ajqcVar.f(qepVar.c);
    }

    @Override // defpackage.pvu
    public final void d(qep qepVar, ajqc ajqcVar) {
        apct apctVar = qepVar.g;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        ajqcVar.i(aotl.l(apctVar));
    }

    @Override // defpackage.pvu
    public final void e(FileInformation fileInformation, aozy aozyVar) {
        apct j = aotl.j(fileInformation.d());
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        qep qepVar = (qep) aozyVar.b;
        qep qepVar2 = qep.a;
        j.getClass();
        qepVar.g = j;
        qepVar.b |= 2;
    }
}
