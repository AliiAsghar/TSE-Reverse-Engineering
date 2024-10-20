package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqxe implements arcj, aqxu {
    public static final Logger a = Logger.getLogger(aqxe.class.getName());
    public final aqwn b;
    public final aqxv c;
    private final arep d;
    private final arep e;
    private final alog f;
    private final aqwt g;
    private arhc h;
    private ScheduledExecutorService i;
    private Executor j;
    private boolean k;
    private final asqc l;

    /* JADX WARN: Type inference failed for: r0v2, types: [arep, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [arep, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Collection, java.lang.Object] */
    public aqxe(aqxc aqxcVar) {
        Object obj = aqxcVar.a;
        obj.getClass();
        this.b = (aqwn) obj;
        ?? r0 = aqxcVar.c;
        r0.getClass();
        this.e = r0;
        this.d = aqxcVar.d;
        ?? r02 = aqxcVar.b;
        r02.getClass();
        this.f = alog.n(r02);
        Object obj2 = aqxcVar.f;
        obj2.getClass();
        this.l = new asqc(obj2);
        this.g = (aqwt) aqxcVar.e;
        this.c = new aqxv(this);
    }

    @Override // defpackage.aqxu
    public final synchronized boolean a(int i, Parcel parcel) {
        IBinder readStrongBinder;
        if (i == 1) {
            if (this.k) {
                aqxd.a.a(1, parcel);
                return false;
            }
            if (parcel.readInt() > 0 && (readStrongBinder = parcel.readStrongBinder()) != null) {
                int callingUid = Binder.getCallingUid();
                aqrm aqrmVar = aqrm.a;
                aqrk aqrkVar = new aqrk(aqrm.a);
                aqrkVar.b(aqsw.b, this.b);
                aqrkVar.b(aqsw.a, new aqxn(callingUid));
                aqrkVar.b(aqxh.f, Integer.valueOf(callingUid));
                aqrkVar.b(aqxh.g, this.b.d());
                aqrkVar.b(aqxh.h, this.g);
                asqc asqcVar = this.l;
                Executor executor = this.j;
                executor.getClass();
                aqrkVar.b(aqxk.a, new aksr(callingUid, asqcVar, executor));
                aqrkVar.b(arbx.a, aqvp.PRIVACY_AND_INTEGRITY);
                arep arepVar = this.d;
                aqrm a2 = aqrkVar.a();
                alog alogVar = this.f;
                Logger logger = aqyc.a;
                aqxg aqxgVar = new aqxg(arepVar, a2, alogVar, readStrongBinder);
                arhc arhcVar = this.h;
                synchronized (arhcVar) {
                    albo.U(!((aqwy) arhcVar).b, "Illegal transportCreated() after serverShutdown()");
                    ((aqwy) arhcVar).c++;
                }
                arhc arhcVar2 = ((aqwy) arhcVar).a;
                synchronized (((argv) arhcVar2).a.l) {
                    ((argv) arhcVar2).a.n.add(aqxgVar);
                }
                argy argyVar = new argy(((argv) arhcVar2).a, aqxgVar);
                long j = argyVar.b.i;
                if (j != Long.MAX_VALUE) {
                    argyVar.a = argyVar.c.i.schedule(new arer(argyVar, 12), j, TimeUnit.MILLISECONDS);
                } else {
                    argyVar.a = new FutureTask(new akqg(8), null);
                }
                argz argzVar = argyVar.b;
                aqtc.b((aqtb) argzVar.q.g.get(Long.valueOf(aqtc.a(argzVar))), argyVar.c);
                aqxgVar.e(new aqwx((aqwy) arhcVar, argyVar));
                return true;
            }
        }
        return false;
    }

    public final synchronized void b() {
        this.e.b(this.j);
        this.j = null;
    }

    @Override // defpackage.arcj
    public final synchronized void c() {
        Runnable a2;
        if (!this.k) {
            this.k = true;
            this.c.a = aqxd.a;
            arhc arhcVar = this.h;
            arhc arhcVar2 = ((aqwy) arhcVar).a;
            synchronized (((argv) arhcVar2).a.l) {
                argz argzVar = ((argv) arhcVar2).a;
                if (!argzVar.k) {
                    ArrayList arrayList = new ArrayList(argzVar.n);
                    argz argzVar2 = ((argv) arhcVar2).a;
                    Status status = argzVar2.j;
                    argzVar2.k = true;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        aqxg aqxgVar = (aqxg) arrayList.get(i);
                        if (status == null) {
                            aqxgVar.f();
                        } else {
                            aqxgVar.k(status);
                        }
                    }
                    synchronized (((argv) arhcVar2).a.l) {
                        argz argzVar3 = ((argv) arhcVar2).a;
                        argzVar3.m = true;
                        argzVar3.b();
                    }
                }
            }
            synchronized (arhcVar) {
                ((aqwy) arhcVar).b = true;
                a2 = ((aqwy) arhcVar).a();
            }
            if (a2 != null) {
                a2.run();
            }
            this.d.b(this.i);
            this.i = null;
        }
    }

    @Override // defpackage.arcj
    public final synchronized void d(arhc arhcVar) {
        this.h = new aqwy(arhcVar, new aomp(this, 8));
        this.i = (ScheduledExecutorService) this.d.a();
        this.j = (Executor) this.e.a();
    }

    public final String toString() {
        return "BinderServer[" + this.b.toString() + "]";
    }
}
