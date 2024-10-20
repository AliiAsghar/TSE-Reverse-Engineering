package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arcr implements aqte {
    public final ScheduledExecutorService a;
    public final aqtc b;
    public final aqrt c;
    public final boolean d;
    public final List e;
    public final aqwe f;
    public final arco g;
    public volatile List h;
    public final alhp i;
    public aref j;
    public arau m;
    public volatile aref n;
    public Status p;
    public volatile aqrm q;
    public arbp r;
    public final atpk s;
    public asmb t;
    public asmb u;
    private final aqtf v;
    private final String w;
    private final String x;
    private final arao y;
    private final aqzx z;
    public final Collection k = new ArrayList();
    public final arcg l = new arck(this);
    public volatile aqse o = aqse.a(aqsd.IDLE);

    public arcr(aqto aqtoVar, String str, String str2, arao araoVar, ScheduledExecutorService scheduledExecutorService, aqwe aqweVar, atpk atpkVar, aqtc aqtcVar, aqzx aqzxVar, aqtf aqtfVar, aqrt aqrtVar, List list) {
        Object obj;
        List list2 = aqtoVar.a;
        d.t(!list2.isEmpty(), "addressGroups is empty");
        j(list2);
        List unmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list2));
        this.h = unmodifiableList;
        this.g = new arco(unmodifiableList);
        this.w = str;
        this.x = str2;
        this.y = araoVar;
        this.a = scheduledExecutorService;
        this.i = new alhp();
        this.f = aqweVar;
        this.s = atpkVar;
        this.b = aqtcVar;
        this.z = aqzxVar;
        this.v = aqtfVar;
        this.c = aqrtVar;
        this.e = list;
        aqtn aqtnVar = aqtz.c;
        int i = 0;
        while (true) {
            Object[][] objArr = aqtoVar.c;
            if (i < objArr.length) {
                if (aqtnVar.equals(objArr[i][0])) {
                    obj = aqtoVar.c[i][1];
                    break;
                }
                i++;
            } else {
                obj = aqtnVar.a;
                break;
            }
        }
        this.d = ((Boolean) obj).booleanValue();
    }

    public static /* bridge */ /* synthetic */ void i(arcr arcrVar) {
        arcrVar.m = null;
    }

    public static void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public static final String k(Status status) {
        StringBuilder sb = new StringBuilder();
        sb.append(status.getCode());
        if (status.getDescription() != null) {
            sb.append("(");
            sb.append(status.getDescription());
            sb.append(")");
        }
        if (status.r != null) {
            sb.append("[");
            sb.append(status.r);
            sb.append("]");
        }
        return sb.toString();
    }

    public final aram a() {
        aref arefVar = this.n;
        if (arefVar != null) {
            return arefVar;
        }
        this.f.execute(new arbg(this, 6));
        return null;
    }

    public final void b(aqsd aqsdVar) {
        this.f.c();
        d(aqse.a(aqsdVar));
    }

    @Override // defpackage.aqtk
    public final aqtf c() {
        return this.v;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [aqty, java.lang.Object] */
    public final void d(aqse aqseVar) {
        boolean z;
        this.f.c();
        if (this.o.a != aqseVar.a) {
            if (this.o.a != aqsd.SHUTDOWN) {
                z = true;
            } else {
                z = false;
            }
            albo.U(z, "Cannot transition out of SHUTDOWN to ".concat(aqseVar.toString()));
            if (this.d && aqseVar.a == aqsd.TRANSIENT_FAILURE) {
                this.o = aqse.a(aqsd.IDLE);
            } else {
                this.o = aqseVar;
            }
            atpk atpkVar = this.s;
            albo.U(true, "listener is null");
            atpkVar.b.a(aqseVar);
        }
    }

    public final void e() {
        this.f.execute(new arbg(this, 8));
    }

    public final void f(arau arauVar, boolean z) {
        this.f.execute(new ldv(this, arauVar, z, 8));
    }

    public final void g(Status status) {
        this.f.execute(new aqym(this, status, 19, (char[]) null));
    }

    public final void h() {
        boolean z;
        aqsy aqsyVar;
        this.f.c();
        if (this.t == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Should have no reconnectTask scheduled");
        arco arcoVar = this.g;
        if (arcoVar.b == 0 && arcoVar.c == 0) {
            alhp alhpVar = this.i;
            alhpVar.d();
            alhpVar.e();
        }
        SocketAddress b = this.g.b();
        if (b instanceof aqsy) {
            aqsy aqsyVar2 = (aqsy) b;
            aqsyVar = aqsyVar2;
            b = aqsyVar2.b;
        } else {
            aqsyVar = null;
        }
        aqrm a = this.g.a();
        String str = (String) a.a(aqsq.a);
        aran aranVar = new aran();
        if (str == null) {
            str = this.w;
        }
        str.getClass();
        aranVar.a = str;
        aranVar.b = a;
        aranVar.c = this.x;
        aranVar.d = aqsyVar;
        arcq arcqVar = new arcq();
        arcqVar.a = this.v;
        arcn arcnVar = new arcn(this.y.a(b, aranVar, arcqVar), this.z);
        arcqVar.a = arcnVar.c();
        aqtc.b(this.b.f, arcnVar);
        this.m = arcnVar;
        this.k.add(arcnVar);
        Runnable d = arcnVar.d(new arcp(this, arcnVar));
        if (d != null) {
            this.f.b(d);
        }
        this.c.b(2, "Started transport {0}", arcqVar.a);
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.g("logId", this.v.a);
        aj.b("addressGroups", this.h);
        return aj.toString();
    }
}
