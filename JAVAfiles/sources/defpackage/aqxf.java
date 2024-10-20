package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqxf extends aqxh implements arau {
    public final aqww a;
    public final aqwz b;
    public final long c;
    public ScheduledFuture d;
    private final arep n;
    private final Executor o;
    private final AtomicInteger p;
    private aree q;
    private int r;
    private final aqam s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aqxf(defpackage.aqxb r7, defpackage.aqwn r8, defpackage.aran r9) {
        /*
            r6 = this;
            arep r0 = r7.c
            aqrm r9 = r9.b
            android.content.Context r1 = r7.a
            aqwt r2 = r7.g
            aqrm r3 = defpackage.aqrm.a
            aqrk r3 = new aqrk
            aqrm r4 = defpackage.aqrm.a
            r3.<init>(r4)
            aqrl r4 = defpackage.arbx.a
            aqvp r5 = defpackage.aqvp.NONE
            r3.b(r4, r5)
            aqrl r4 = defpackage.arbx.b
            r3.b(r4, r9)
            aqrl r9 = defpackage.aqsw.b
            aqwn r1 = defpackage.aqwn.b(r1)
            r3.b(r9, r1)
            aqrl r9 = defpackage.aqsw.a
            r3.b(r9, r8)
            aqrl r9 = defpackage.aqxf.h
            r3.b(r9, r2)
            aqrm r9 = r3.a()
            android.content.Context r1 = r7.a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = java.lang.String.valueOf(r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "->"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.lang.Class<aqxf> r2 = defpackage.aqxf.class
            aqtf r1 = defpackage.aqtf.a(r2, r1)
            r6.<init>(r0, r9, r1)
            r9 = 1001(0x3e9, float:1.403E-42)
            r6.r = r9
            arep r9 = r7.d
            r6.n = r9
            aqww r0 = r7.e
            r6.a = r0
            java.lang.Object r9 = r9.a()
            java.util.concurrent.Executor r9 = (java.util.concurrent.Executor) r9
            r6.o = r9
            r0 = 60000(0xea60, double:2.9644E-319)
            r6.c = r0
            java.util.concurrent.atomic.AtomicInteger r9 = new java.util.concurrent.atomic.AtomicInteger
            r9.<init>()
            r6.p = r9
            aqam r9 = new aqam
            r9.<init>()
            r6.s = r9
            aqyo r9 = new aqyo
            java.util.concurrent.Executor r0 = r7.b
            android.content.Context r7 = r7.a
            android.content.Intent r8 = r8.a
            android.content.Intent r8 = r8.cloneFilter()
            r9.<init>(r0, r7, r8, r6)
            r6.b = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqxf.<init>(aqxb, aqwn, aran):void");
    }

    private static araj B(Status status, aqrm aqrmVar, aqrx[] aqrxVarArr) {
        arhn.g(aqrxVarArr, aqrmVar).a();
        return new arbq(status, aqrxVarArr);
    }

    @Override // defpackage.aram
    public final synchronized araj b(aqux aquxVar, aqut aqutVar, aqrr aqrrVar, aqrx[] aqrxVarArr) {
        Status withDescription;
        if (!A(3)) {
            if (x()) {
                withDescription = this.l;
            } else {
                withDescription = Status.m.withDescription("newStream() before transportReady()");
            }
            return B(withDescription, this.k, aqrxVarArr);
        }
        int i = this.r;
        int i2 = i + 1;
        this.r = i2;
        if (i2 == 16777215) {
            this.r = 1001;
        }
        arhn g = arhn.g(aqrxVarArr, this.k);
        aqxp aqxpVar = new aqxp(this, this.k, i, arcb.i(aqrrVar));
        if (this.j.putIfAbsent(Integer.valueOf(i), aqxpVar) == null) {
            if (aqxpVar.a && this.p.getAndIncrement() == 0) {
                this.q.a(true);
            }
            aqyd aqydVar = new aqyd(this, i, aquxVar, aqutVar, g);
            if (aquxVar.a.a()) {
                return new aqyp(aqxpVar, aqydVar);
            }
            return new aqxy(aqxpVar, aqydVar);
        }
        Status withDescription2 = Status.m.withDescription("Clashing call IDs");
        u(withDescription2, true);
        return B(withDescription2, this.k, aqrxVarArr);
    }

    @Override // defpackage.aref
    public final synchronized Runnable d(aree areeVar) {
        this.q = areeVar;
        return new aomp(this, 10);
    }

    public final synchronized void e(Throwable th) {
        u(Status.m.withDescription("Could not evaluate SecurityPolicy").d(th), true);
    }

    public final synchronized void f(IBinder iBinder, Status status) {
        if (A(2)) {
            if (!status.f()) {
                u(status, true);
                return;
            }
            if (!y(aqyc.b(iBinder, this.o))) {
                u(Status.n.withDescription("Failed to observe outgoing binder"), true);
                return;
            }
            if (!x()) {
                z(3);
                aree areeVar = this.q;
                aqrm aqrmVar = this.k;
                areeVar.e();
                this.k = aqrmVar;
                this.q.b();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                }
            }
        }
    }

    @Override // defpackage.aqxh
    protected final void g(Parcel parcel) {
        parcel.readInt();
        this.s.l();
    }

    @Override // defpackage.aqxh
    protected final void h(Parcel parcel) {
        aqvp aqvpVar;
        ListenableFuture bM;
        int callingUid = Binder.getCallingUid();
        aqrk aqrkVar = new aqrk(this.k);
        aqrkVar.b(f, Integer.valueOf(callingUid));
        aqrl aqrlVar = arbx.a;
        if (callingUid == Process.myUid()) {
            aqvpVar = aqvp.PRIVACY_AND_INTEGRITY;
        } else {
            aqvpVar = aqvp.INTEGRITY;
        }
        aqrkVar.b(aqrlVar, aqvpVar);
        this.k = aqrkVar.a();
        if (A(2)) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readInt != 1) {
                u(Status.n.withDescription("Wire format version mismatch"), true);
                return;
            }
            if (readStrongBinder == null) {
                u(Status.n.withDescription("Malformed SETUP_TRANSPORT data"), true);
                return;
            }
            aqww aqwwVar = this.a;
            if (aqwwVar instanceof aqwo) {
                bM = ((aqwo) aqwwVar).b(callingUid);
            } else {
                bM = albo.bM(new ijt(this, callingUid, 13), this.o);
            }
            albo.bR(bM, new vbr(this, readStrongBinder, 18, null), this.o);
        }
    }

    @Override // defpackage.aqxh
    public final void i(Status status) {
        this.q.c(status);
    }

    @Override // defpackage.aqxh
    public final void j() {
        if (this.p.getAndSet(0) > 0) {
            this.q.a(false);
        }
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.d = null;
        }
        ((aqyo) this.b).c(Status.c);
        this.q.d();
    }

    public final synchronized void k(IBinder iBinder) {
        s(aqyc.b(iBinder, this.o));
    }

    public final synchronized void l() {
        if (A(2)) {
            this.d = null;
            long j = this.c;
            u(Status.f.withDescription("Connect timeout " + j + "ms lapsed"), true);
        }
    }

    public final synchronized void m(Status status) {
        u(status, true);
    }

    @Override // defpackage.aqxh
    public final void n() {
        super.n();
        this.n.b(this.o);
    }

    @Override // defpackage.aref
    public final synchronized void o(Status status) {
        status.getClass();
        u(status, false);
    }

    @Override // defpackage.aref
    public final synchronized void p(Status status) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqxh
    public final void q(aqxt aqxtVar) {
        if (aqxtVar.e() && this.p.decrementAndGet() == 0) {
            this.q.a(false);
        }
        super.q(aqxtVar);
    }
}
