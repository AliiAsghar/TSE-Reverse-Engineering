package defpackage;

import defpackage.akr;
import defpackage.cfq;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alq extends cga.c implements czf {
    public cfq.b a;

    public alq(cfq.b bVar) {
        this.a = bVar;
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
        ampVar.c = new akr.a(this.a);
        return ampVar;
    }
}
