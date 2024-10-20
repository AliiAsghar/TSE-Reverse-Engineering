package defpackage;

import defpackage.akr;
import defpackage.cfq;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anc extends cga.c implements czf {
    public cfq.c a;

    public anc(cfq.c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.czf
    public final /* bridge */ /* synthetic */ Object ea(Object obj) {
        amp ampVar;
        if (obj instanceof amp) {
            ampVar = (amp) obj;
        } else {
            ampVar = null;
        }
        if (ampVar == null) {
            ampVar = new amp(null);
        }
        ampVar.c = new akr.b(this.a);
        return ampVar;
    }
}
