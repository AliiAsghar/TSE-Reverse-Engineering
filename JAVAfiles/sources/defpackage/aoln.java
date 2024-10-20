package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoln extends aqru {
    public final Executor a;
    public int d;
    public aolm e;
    public final aoll g;
    public aqru i;
    public apsd j;
    private final aqrs k;
    private final aqux l;
    private final alog m;
    private aqrr q;
    private int s;
    private aqut t;
    public final Set b = alzz.O();
    private final LinkedHashMap n = new LinkedHashMap();
    private final Set o = alzz.O();
    public boolean f = false;
    public boolean h = false;
    public final Deque c = new ArrayDeque();
    private final Queue r = new ArrayDeque();
    private final Queue p = new ArrayDeque();

    public aoln(aqrs aqrsVar, aqux aquxVar, aqrr aqrrVar, alog alogVar) {
        this.k = aqrsVar;
        this.l = aquxVar;
        this.q = aqrrVar;
        this.m = alogVar;
        this.e = new aolm(((alsx) alogVar).c, 1, 0, 0);
        Executor executor = aqrrVar.c;
        aoll aollVar = new aoll(executor == null ? andi.a : executor);
        this.g = aollVar;
        this.a = new ajzt((Object) this, (Executor) new anew(aollVar), 5);
    }

    private final void l() {
        while (!this.c.isEmpty()) {
            aolk aolkVar = (aolk) this.c.peek();
            if (aolkVar.b.isEmpty() && aolkVar.c == aolkVar.d.e.a) {
                Object obj = ((aolk) this.c.poll()).a;
                if (this.e.e == 4) {
                    this.i.f(obj);
                } else {
                    this.p.add(obj);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m(aolk aolkVar, int i, int i2) {
        aode aodeVar = new aode(aolkVar.a);
        while (i < i2) {
            alog alogVar = (alog) this.m.get(i);
            int size = alogVar.size();
            int i3 = 0;
            while (i3 < size) {
                aolh aolhVar = (aolh) alogVar.get(i3);
                aolq b = aolhVar.b();
                if (b.c == 4) {
                    ListenableFuture a = b.a();
                    aolkVar.b.put(aolhVar, a);
                    a.c(akto.j(new aofo((Object) this, (Object) aodeVar, (Object) aolkVar, 7)), this.a);
                }
                i3++;
                if (o(b)) {
                    return;
                }
            }
            i++;
        }
        aolkVar.c = i2;
        if (aolkVar.b.isEmpty()) {
            l();
            b();
        }
    }

    private final void n() {
        boolean z;
        aolm aolmVar;
        aolm aolmVar2 = this.e;
        if (aolmVar2.e != 4) {
            z = false;
        } else {
            z = true;
        }
        albo.U(!z, "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        int i = aolmVar2.e;
        if (i == 3) {
            aolmVar = new aolm(aolmVar2.a, 4, aolmVar2.b, aolmVar2.c);
        } else if (i == 1 && aolmVar2.d) {
            int i2 = aolmVar2.a;
            int i3 = aolmVar2.b;
            aolmVar = new aolm(i2, 2, i3, i3);
        } else {
            int i4 = aolmVar2.b;
            int i5 = i4 + 1;
            int i6 = aolmVar2.a;
            int i7 = aolmVar2.c;
            if (i5 < i6) {
                aolmVar = new aolm(i6, 1, i5, i7);
            } else {
                aolmVar = new aolm(i6, 3, i4, i7);
            }
        }
        this.e = aolmVar;
        int i8 = aolmVar.e - 1;
        if (i8 != 0) {
            if (i8 != 2) {
                g();
                return;
            }
            aqru a = this.k.a(this.l, this.q);
            this.i = a;
            a.a(this.j, this.t);
            int i9 = this.d;
            if (i9 > 0) {
                this.i.e(i9);
            }
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                this.i.f(it.next());
            }
            if (this.f && this.c.isEmpty()) {
                this.i.d();
            }
            n();
            return;
        }
        h(this.t);
    }

    private final boolean o(aolq aolqVar) {
        int i = aolqVar.c - 1;
        if (i != 0) {
            if (i != 1) {
                byte[] bArr = null;
                if (i == 3) {
                    ListenableFuture a = aolqVar.a();
                    this.b.add(a);
                    a.c(akto.j(new aofk(this, a, 10, bArr)), this.a);
                    return false;
                }
                throw null;
            }
            asmb asmbVar = aolqVar.d;
            this.j.a((Status) asmbVar.b, (aqut) asmbVar.a);
            if (this.e.e == 4) {
                this.i.c("Aborted RPC with exception", ((Status) asmbVar.b).r);
            }
            this.h = true;
            return true;
        }
        aqrr aqrrVar = aolqVar.b;
        if (aqrrVar != null) {
            if (this.e.e != 1) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot return proceedWithCallOptions() from message processing methods");
                this.j.a(Status.c(illegalStateException), new aqut());
                if (this.e.e == 4) {
                    this.i.c("Interceptor returned invalid outcome", illegalStateException);
                }
                return true;
            }
            this.q = aqrrVar;
        }
        return false;
    }

    private final atii p(aqrr aqrrVar, aqut aqutVar, String str) {
        aqrrVar.getClass();
        aqutVar.getClass();
        str.getClass();
        return new atii(this.l, aqrrVar, aqutVar, str);
    }

    private final atii q(atii atiiVar) {
        aqrr aqrrVar = this.q;
        if (aqrrVar == atiiVar.d) {
            return atiiVar;
        }
        return p(aqrrVar, (aqut) atiiVar.a, (String) atiiVar.b);
    }

    @Override // defpackage.aqru
    public final void a(apsd apsdVar, aqut aqutVar) {
        this.j = new aolj(this, new aolr(new aolo(apsdVar, this.m, this.o)));
        this.t = aqutVar;
        this.a.execute(akto.j(new aofk(this, aqutVar, 11)));
    }

    public final void b() {
        if (this.f) {
            aolk aolkVar = (aolk) this.c.peekLast();
            int i = this.e.e - 1;
            if (i != 1) {
                if (i == 3 && aolkVar == null) {
                    this.i.d();
                    return;
                }
                return;
            }
            if (aolkVar == null || (aolkVar.b.isEmpty() && aolkVar.c == aolkVar.d.e.c + 1)) {
                n();
            }
        }
    }

    @Override // defpackage.aqru
    public final void c(String str, Throwable th) {
        this.a.execute(akto.j(new aofo((aqru) this, (Object) str, (Object) th, 8)));
    }

    @Override // defpackage.aqru
    public final void d() {
        this.a.execute(akto.j(new akwm(this, 19)));
    }

    @Override // defpackage.aqru
    public final void e(int i) {
        synchronized (this.r) {
            this.s += i;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        synchronized (this.r) {
            if (!this.r.isEmpty()) {
                int i2 = this.s;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object poll = this.r.poll();
                    if (poll != null) {
                        arrayDeque.add(poll);
                        this.s--;
                    }
                }
                boolean isEmpty = this.r.isEmpty();
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    this.j.d(it.next());
                }
                if (isEmpty) {
                    this.j.a(Status.b, null);
                }
            }
        }
        this.a.execute(akto.j(new ajbz(this, i, 5)));
    }

    @Override // defpackage.aqru
    public final void f(Object obj) {
        this.a.execute(akto.j(new aofk(this, obj, 12)));
    }

    public final void g() {
        int i = this.e.e - 1;
        if (i != 1) {
            if (i == 3) {
                for (aolk aolkVar : this.c) {
                    m(aolkVar, aolkVar.c, this.e.a);
                }
                return;
            }
            return;
        }
        for (aolk aolkVar2 : this.c) {
            int i2 = aolkVar2.c;
            int i3 = this.e.c;
            if (i2 <= i3) {
                m(aolkVar2, i2, i3 + 1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(aqut aqutVar) {
        atii p = p(this.q, aqutVar, this.k.b());
        alog alogVar = (alog) this.m.get(this.e.b);
        int size = alogVar.size();
        for (int i = 0; i < size; i++) {
            aolh aolhVar = (aolh) alogVar.get(i);
            aolq g = aolhVar.g(q(p));
            if (g.c == 4) {
                ListenableFuture a = g.a();
                this.n.put(aolhVar, a);
                a.c(akto.j(new aofk(this, p, 13, null)), this.a);
            }
            if (!o(g)) {
                this.o.add(aolhVar);
            } else {
                return;
            }
        }
        if (this.n.isEmpty()) {
            n();
        }
    }

    public final void i(aode aodeVar, aolk aolkVar) {
        Iterator it = aolkVar.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((ListenableFuture) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            aolh aolhVar = (aolh) entry.getKey();
            aolq a = aolhVar.a();
            if (a.c == 4) {
                ListenableFuture a2 = a.a();
                aolkVar.b.put(aolhVar, a2);
                a2.c(akto.j(new aofo((Object) this, (Object) aodeVar, (Object) aolkVar, 9)), this.a);
            }
            if (o(a)) {
                return;
            }
        }
        if (aolkVar.b.isEmpty()) {
            l();
            b();
        }
    }

    public final void j(atii atiiVar) {
        if (!this.n.isEmpty()) {
            Iterator it = this.n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!((ListenableFuture) entry.getValue()).isDone()) {
                    break;
                }
                it.remove();
                aolh aolhVar = (aolh) entry.getKey();
                aolq f = aolhVar.f(q(atiiVar));
                if (f.c == 4) {
                    ListenableFuture a = f.a();
                    this.n.put(aolhVar, a);
                    a.c(akto.j(new aofk(this, atiiVar, 15, null)), this.a);
                }
                if (o(f)) {
                    return;
                }
            }
            if (this.n.isEmpty() && !this.h) {
                n();
            }
        }
    }
}
