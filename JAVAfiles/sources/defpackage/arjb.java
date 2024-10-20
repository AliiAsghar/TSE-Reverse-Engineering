package defpackage;

import io.grpc.Status;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arjb extends arce implements arjp {
    public static final /* synthetic */ int z = 0;
    private final int A;
    private int B;
    private int C;
    public final Object a;
    public List b;
    public final asqu c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final arir g;
    public final arjh h;
    public boolean i;
    public final armd u;
    public arjq v;
    public int w;
    final /* synthetic */ arjc x;
    public final adfg y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arjb(arjc arjcVar, int i, arhn arhnVar, Object obj, arir arirVar, adfg adfgVar, arjh arjhVar, int i2) {
        super(i, arhnVar, arjcVar.r);
        this.x = arjcVar;
        this.c = new asqu();
        this.d = false;
        this.e = false;
        this.f = false;
        this.i = true;
        this.w = -1;
        this.a = obj;
        this.g = arirVar;
        this.y = adfgVar;
        this.h = arjhVar;
        this.B = i2;
        this.C = i2;
        this.A = i2;
        this.u = armb.a;
    }

    @Override // defpackage.areg
    public final void a(int i) {
        int i2 = this.C - i;
        this.C = i2;
        int i3 = this.A;
        if (i2 <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.B += i4;
            this.C = i2 + i4;
            this.g.f(this.w, i4);
        }
    }

    @Override // defpackage.areg
    public final void b(Throwable th) {
        q(Status.c(th), true, new aqut());
    }

    @Override // defpackage.arce
    protected final void c(Status status, boolean z2, aqut aqutVar) {
        q(status, false, aqutVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqzh
    public final void d() {
        super.d();
        arhu arhuVar = this.l;
        arhuVar.b++;
        arhuVar.a.a();
    }

    @Override // defpackage.aqzk
    public final void e(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final arjq f() {
        arjq arjqVar;
        synchronized (this.a) {
            arjqVar = this.v;
        }
        return arjqVar;
    }

    @Override // defpackage.aqzh, defpackage.areg
    public final void k(boolean z2) {
        if (!this.s) {
            this.h.h(this.w, null, arak.PROCESSED, false, arkh.CANCEL, null);
        } else {
            this.h.h(this.w, null, arak.PROCESSED, false, null, null);
        }
        super.k(z2);
    }

    public final void q(Status status, boolean z2, aqut aqutVar) {
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.i) {
            arjh arjhVar = this.h;
            arjc arjcVar = this.x;
            arjhVar.u.remove(arjcVar);
            arjhVar.i(arjcVar);
            this.b = null;
            this.c.z();
            this.i = false;
            if (aqutVar == null) {
                aqutVar = new aqut();
            }
            l(status, true, aqutVar);
            return;
        }
        this.h.h(this.w, status, arak.PROCESSED, z2, arkh.CANCEL, aqutVar);
    }

    public final void r(asqu asquVar, boolean z2, int i) {
        int i2 = this.B - (((int) asquVar.b) + i);
        this.B = i2;
        this.C -= i;
        if (i2 < 0) {
            this.g.e(this.w, arkh.FLOW_CONTROL_ERROR);
            this.h.h(this.w, Status.m.withDescription("Received data size exceeded our receiving window size"), arak.PROCESSED, false, null, null);
        } else {
            super.n(new arjl(asquVar), z2);
        }
    }
}
