package defpackage;

import io.grpc.Status;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqzb implements arau {
    public final String a;
    public aree b;
    public final Object c = new Object();
    public final Set d = Collections.newSetFromMap(new IdentityHashMap());
    public final Executor e;
    public final int f;
    public final arhu g;
    public aqrm h;
    public final aqyu i;
    public boolean j;
    public Status k;
    public boolean l;
    private final aqtf m;
    private final InetSocketAddress n;
    private final String o;
    private boolean p;
    private boolean q;

    public aqzb(aqyu aqyuVar, InetSocketAddress inetSocketAddress, String str, String str2, aqrm aqrmVar, Executor executor, int i, arhu arhuVar) {
        inetSocketAddress.getClass();
        this.n = inetSocketAddress;
        this.m = aqtf.a(getClass(), inetSocketAddress.toString());
        this.o = str;
        this.a = arcb.e("cronet", str2);
        this.f = i;
        this.e = executor;
        this.i = aqyuVar;
        this.g = arhuVar;
        aqrm aqrmVar2 = aqrm.a;
        aqrk aqrkVar = new aqrk(aqrm.a);
        aqrkVar.b(arbx.a, aqvp.PRIVACY_AND_INTEGRITY);
        aqrkVar.b(arbx.b, aqrmVar);
        this.h = aqrkVar.a();
    }

    public final void a(aqyz aqyzVar, Status status) {
        synchronized (this.c) {
            if (this.d.remove(aqyzVar)) {
                boolean z = true;
                if (status.getCode() != Status.Code.CANCELLED && status.getCode() != Status.Code.DEADLINE_EXCEEDED) {
                    z = false;
                }
                aqyzVar.o.l(status, z, new aqut());
                e();
            }
        }
    }

    @Override // defpackage.aram
    public final /* bridge */ /* synthetic */ araj b(aqux aquxVar, aqut aqutVar, aqrr aqrrVar, aqrx[] aqrxVarArr) {
        return new aqza(this, "https://" + this.o + "/".concat(aquxVar.b), aqutVar, aquxVar, arhn.g(aqrxVarArr, this.h), aqrrVar).a;
    }

    @Override // defpackage.aqtk
    public final aqtf c() {
        return this.m;
    }

    @Override // defpackage.aref
    public final Runnable d(aree areeVar) {
        this.b = areeVar;
        synchronized (this.c) {
            this.l = true;
        }
        return new aomp(this, 12, null);
    }

    final void e() {
        synchronized (this.c) {
            if (this.j && !this.q && this.d.isEmpty()) {
                this.q = true;
                this.b.d();
            }
        }
    }

    @Override // defpackage.aref
    public final void o(Status status) {
        synchronized (this.c) {
            if (this.j) {
                return;
            }
            synchronized (this.c) {
                if (this.p) {
                    return;
                }
                this.p = true;
                this.b.c(status);
                synchronized (this.c) {
                    this.j = true;
                    this.k = status;
                }
                e();
            }
        }
    }

    @Override // defpackage.aref
    public final void p(Status status) {
        throw null;
    }

    @Override // defpackage.arau
    public final aqrm r() {
        return this.h;
    }

    public final String toString() {
        InetSocketAddress inetSocketAddress = this.n;
        return super.toString() + "(" + inetSocketAddress.toString() + ")";
    }
}
