package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adow implements aikm {
    private final adoz a;

    public adow(adoz adozVar) {
        this.a = adozVar;
    }

    @Override // defpackage.aikm
    public final void a(aikh aikhVar) {
        c(aikhVar);
    }

    @Override // defpackage.aikm
    public final void b(aikh aikhVar) {
        if (aikhVar.g()) {
            aiom aiomVar = aikhVar.b;
            aiomVar.getClass();
            this.a.K((ainj) aiomVar.a);
        }
    }

    @Override // defpackage.aikm
    public final void c(aikh aikhVar) {
        aiom aiomVar = aikhVar.a;
        if (aiomVar != null) {
            adoz adozVar = this.a;
            Iterator it = adozVar.g.iterator();
            while (it.hasNext()) {
                adpb adpbVar = (adpb) it.next();
                try {
                    if (adpbVar instanceof acnn) {
                    }
                } catch (Exception e) {
                    advr.j(e, adoz.f, "timeout: Call to listener failed with error: ", new Object[0]);
                }
            }
        }
    }
}
