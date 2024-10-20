package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arbq extends areo {
    private boolean b;
    private final Status c;
    private final arak d;
    private final aqrx[] e;

    public arbq(Status status, arak arakVar, aqrx[] aqrxVarArr) {
        d.t(!status.f(), "error must not be OK");
        this.c = status;
        this.d = arakVar;
        this.e = aqrxVarArr;
    }

    @Override // defpackage.areo, defpackage.araj
    public final void b(arch archVar) {
        archVar.b("error", this.c);
        archVar.b("progress", this.d);
    }

    @Override // defpackage.areo, defpackage.araj
    public final void m(aral aralVar) {
        albo.U(!this.b, "already started");
        this.b = true;
        int i = 0;
        while (true) {
            aqrx[] aqrxVarArr = this.e;
            if (i < aqrxVarArr.length) {
                aqrxVarArr[i].e();
                i++;
            } else {
                aralVar.a(this.c, this.d, new aqut());
                return;
            }
        }
    }

    public arbq(Status status, aqrx[] aqrxVarArr) {
        this(status, arak.PROCESSED, aqrxVarArr);
    }
}
