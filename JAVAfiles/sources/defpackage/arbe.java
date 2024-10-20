package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arbe extends arbi {
    public final aqtu a;
    public final aqsm b = aqsm.k();
    public final aqrx[] c;
    final /* synthetic */ arbf d;

    public arbe(arbf arbfVar, aqtu aqtuVar, aqrx[] aqrxVarArr) {
        this.d = arbfVar;
        this.a = aqtuVar;
        this.c = aqrxVarArr;
    }

    @Override // defpackage.arbi, defpackage.araj
    public final void b(arch archVar) {
        if (this.a.a.g()) {
            archVar.a("wait_for_ready");
        }
        super.b(archVar);
    }

    @Override // defpackage.arbi, defpackage.araj
    public final void c(Status status) {
        super.c(status);
        synchronized (this.d.a) {
            arbf arbfVar = this.d;
            if (arbfVar.e != null) {
                boolean remove = arbfVar.g.remove(this);
                if (!this.d.e() && remove) {
                    arbf arbfVar2 = this.d;
                    arbfVar2.b.b(arbfVar2.d);
                    if (this.d.h.a != null) {
                        arbf arbfVar3 = this.d;
                        arbfVar3.b.b(arbfVar3.e);
                        this.d.e = null;
                    }
                }
            }
        }
        this.d.b.a();
    }

    @Override // defpackage.arbi
    protected final void p() {
        int i = 0;
        while (true) {
            aqrx[] aqrxVarArr = this.c;
            if (i < aqrxVarArr.length) {
                aqrxVarArr[i].e();
                i++;
            } else {
                return;
            }
        }
    }
}
