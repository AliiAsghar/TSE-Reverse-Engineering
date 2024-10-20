package defpackage;

import io.grpc.Status;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aolo extends aqvh {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public boolean c;
    public Status d;
    public aqut e;
    private final alog k;
    private final Queue l;
    private final Set m;
    private int n;
    private boolean o;
    private boolean p;
    private aqut q;

    public aolo(apsd apsdVar, alog alogVar, Set set) {
        super(apsdVar);
        this.a = new LinkedHashMap();
        this.l = new ArrayDeque();
        this.b = new LinkedHashMap();
        this.k = alogVar;
        this.n = ((alsx) alogVar).c;
        this.m = set;
    }

    private final void u() {
        if (!h() && this.l.isEmpty() && this.p && !this.c) {
            g();
        }
    }

    @Override // defpackage.aqvh, defpackage.apsd
    public final void a(Status status, aqut aqutVar) {
        this.d = status;
        this.e = aqutVar;
        this.p = true;
        u();
    }

    @Override // defpackage.aqvh, defpackage.apsd
    public final void c(aqut aqutVar) {
        this.q = aqutVar;
        new aotl(aqutVar);
        Iterator it = alzz.ar(this.k.subList(0, this.n)).iterator();
        while (it.hasNext()) {
            this.n--;
            for (aolh aolhVar : alzz.ar((List) it.next())) {
                if (this.m.contains(aolhVar)) {
                    try {
                        aolhVar.c();
                    } catch (Throwable th) {
                        this.d = Status.c(th);
                        this.e = new aqut();
                        g();
                        return;
                    }
                }
            }
            if (h()) {
                return;
            }
        }
        this.j.c(this.q);
        this.o = true;
        f();
    }

    @Override // defpackage.aqvh, defpackage.apsd
    public final void d(Object obj) {
        this.l.add(new arrt(obj, ((alsx) this.k).c));
        f();
    }

    public final void f() {
        if (this.o) {
            for (arrt arrtVar : this.l) {
                Iterator it = alzz.ar(this.k.subList(0, arrtVar.a)).iterator();
                while (it.hasNext()) {
                    for (aolh aolhVar : alzz.ar((List) it.next())) {
                        if (this.m.contains(aolhVar)) {
                            new aotl(arrtVar.c);
                            try {
                                aolhVar.d();
                            } catch (Throwable th) {
                                this.d = Status.c(th);
                                this.e = new aqut();
                                g();
                                this.c = true;
                                return;
                            }
                        }
                    }
                    if (arrtVar.c()) {
                        return;
                    } else {
                        arrtVar.a--;
                    }
                }
            }
            while (!this.l.isEmpty()) {
                arrt arrtVar2 = (arrt) this.l.peek();
                if (arrtVar2.c() || arrtVar2.a != 0) {
                    break;
                } else {
                    this.j.d(((arrt) this.l.poll()).c);
                }
            }
            u();
        }
    }

    public final void g() {
        Iterator it = alzz.ar(this.k).iterator();
        while (it.hasNext()) {
            for (aolh aolhVar : alzz.ar((List) it.next())) {
                aojh aojhVar = new aojh(this.d, this.e);
                if (this.m.contains(aolhVar)) {
                    try {
                        aolhVar.e(aojhVar);
                    } catch (Throwable th) {
                        this.d = Status.c(th);
                        this.e = new aqut();
                    }
                }
            }
        }
        if (this.b.isEmpty()) {
            this.j.a(this.d, this.e);
        }
    }

    public final boolean h() {
        if (!this.a.isEmpty()) {
            return true;
        }
        return false;
    }
}
