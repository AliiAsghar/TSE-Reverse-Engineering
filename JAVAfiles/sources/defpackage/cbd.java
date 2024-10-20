package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbd implements bzi {
    final /* synthetic */ bxc a;
    final /* synthetic */ byi b;

    public cbd(bxc bxcVar, byi byiVar) {
        this.a = bxcVar;
        this.b = byiVar;
    }

    @Override // defpackage.bzi
    public final bxu a(bzf bzfVar, Object obj) {
        bzi bziVar;
        bxu bxuVar;
        bxc bxcVar = this.a;
        if (bxcVar instanceof bzi) {
            bziVar = (bzi) bxcVar;
        } else {
            bziVar = null;
        }
        if (bziVar == null || (bxuVar = bziVar.a(bzfVar, obj)) == null) {
            bxuVar = bxu.a;
        }
        if (bxuVar == bxu.a) {
            byi byiVar = this.b;
            byiVar.f = aqjn.ar(byiVar.f, new armo(bzfVar, obj));
            return bxu.b;
        }
        return bxuVar;
    }

    @Override // defpackage.bzi
    public final void u() {
    }

    @Override // defpackage.bzi
    public final void o(Object obj) {
    }
}
