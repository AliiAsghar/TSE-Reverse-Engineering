package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pug implements qru {
    final /* synthetic */ pui a;
    private final arml b;

    public pug(pui puiVar) {
        this.a = puiVar;
        this.b = armd.a(new mtx(puiVar, 9));
    }

    private final List c() {
        return (List) this.b.a();
    }

    @Override // defpackage.qru
    public final void a(qrw qrwVar, Map map) {
        qrwVar.getClass();
        map.getClass();
        if (qrwVar == qrw.RCS && !map.isEmpty() && !Collections.disjoint(map.keySet(), c())) {
            this.a.e = true;
            pui puiVar = this.a;
            puiVar.h.q(aktp.ag(null), puiVar.c);
        }
    }

    @Override // defpackage.qru
    public final void b(qrw qrwVar, qei qeiVar) {
        if (qrwVar == qrw.RCS && qeiVar != null && c().contains(qeiVar)) {
            this.a.e = true;
            pui puiVar = this.a;
            puiVar.h.q(aktp.ag(null), puiVar.c);
        }
    }
}
