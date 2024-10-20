package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adpc implements aikm {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public adpc(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    @Override // defpackage.aikm
    public final void a(aikh aikhVar) {
        if (this.c != 0) {
            ((acyj) this.a).p(3);
            advr.h(((adhw) this.a).m, "SIP request canceled. method=%s, callId=%s", ((aion) this.b).z(), ((aion) this.b).y().h());
            ((acyj) this.a).s(2, new aild("SIP request canceled."));
        }
    }

    @Override // defpackage.aikm
    public final void b(aikh aikhVar) {
        if (this.c != 0) {
            ((acyj) this.a).p(3);
            aiom aiomVar = aikhVar.b;
            if (aiomVar != null) {
                ((acyj) this.a).s(2, aiomVar);
                return;
            }
            return;
        }
        ((aduk) ((ahjj) this.b).a).b((adpe) this.a);
    }

    @Override // defpackage.aikm
    public final void c(aikh aikhVar) {
        if (this.c != 0) {
            ((acyj) this.a).p(3);
            advr.h(((adhw) this.a).m, "SIP request timeout. method=%s, callId=%s", ((aion) this.b).z(), ((aion) this.b).y().h());
            ((acyj) this.a).s(3, aikhVar);
            return;
        }
        ((aduk) ((ahjj) this.b).a).b((adpe) this.a);
    }
}
