package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akgn {
    public final aegu a;
    public final akbl b;
    public final Executor c;
    public akfz d;
    public final AtomicReference e = new AtomicReference(null);
    public akgf f;
    public akge g;
    public akgi h;
    public final ahiy i;
    public final apuv j;
    public final apuv k;

    public akgn(akfb akfbVar, aegu aeguVar, ahiy ahiyVar, akbl akblVar, Executor executor) {
        akgh akghVar = akgi.a;
        alfd alfdVar = alfd.a;
        this.h = new akgi(0L, akghVar, false, alfdVar, alfdVar);
        this.j = new apuv(2, new akdg(4));
        this.k = new apuv(1, new akdg(5));
        this.a = aeguVar;
        this.i = ahiyVar;
        this.b = akblVar;
        akge akgeVar = new akge(akfbVar, akfbVar.c(), new akff(), 0L, 1, new akgf(akfbVar, Long.MIN_VALUE, new akfn(0L), new akfr(0L), 0, Instant.ofEpochMilli(Long.MIN_VALUE)));
        this.g = akgeVar;
        this.f = akgeVar.e;
        this.c = executor;
    }

    public static void f(akey akeyVar) {
        akrh e = aktp.e("BackgroundCallbacks.onBackgroundFetch");
        try {
            akeyVar.a();
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void g(akey akeyVar) {
        akrh e = aktp.e("BackgroundCallbacks.onBackgroundFetchSucceeded");
        try {
            akeyVar.b();
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static akgi j(akgi akgiVar, akfq akfqVar) {
        algw i;
        algw algwVar;
        akgi a;
        if (akgiVar.f.f() && akgiVar.f.b() == akfqVar) {
            i = alfd.a;
            a = akgiVar.a(akfqVar);
            algwVar = i;
        } else if (!akgiVar.f.f() && akgiVar.e.f() && akgiVar.e.b() == akfqVar) {
            i = algw.i(((akfq) akgiVar.e.b()).a().e());
            algwVar = alfd.a;
            a = akgiVar.a((akfq) akgiVar.e.b());
        } else if (akgiVar.f.f() && ((akfq) akgiVar.f.b()).a().e().equals(akfqVar.a().e())) {
            i = alfd.a;
            algwVar = algw.i(akfqVar);
            a = akgiVar;
        } else {
            i = algw.i(akfqVar.a().e());
            algwVar = akgiVar.e;
            a = akgiVar.a(akfqVar);
        }
        if (i.f()) {
            akrh e = aktp.e("SubscriptionCallbacks.onNewData");
            try {
                ubx a2 = akbe.a();
                try {
                    akgiVar.c.c(akfqVar.a().e());
                    a2.close();
                    e.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (algwVar.f()) {
            ((akfq) algwVar.b()).c();
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        akfz akfzVar = this.d;
        if (akfzVar != null) {
            this.i.t(this.g.b, akfzVar);
            this.d = null;
        }
        this.j.f();
        this.k.f();
        if (this.h.e.f()) {
            ((akfq) this.h.e.b()).c();
        }
        if (this.h.f.f()) {
            akgi akgiVar = this.h;
            if (!akgiVar.f.equals(akgiVar.e)) {
                ((akfq) this.h.f.b()).c();
            }
        }
    }

    public final void b(akgf akgfVar, akfq akfqVar) {
        albo.T(akfqVar.a().f());
        this.h = j(this.h, akfqVar);
        this.f = akgfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        akgi akgiVar = this.h;
        this.h = new akgi(akgiVar.b + 1, akgi.a, false, akgiVar.e, alfd.a);
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final void d(akgf akgfVar) {
        akrh e;
        aiut.c();
        boolean z = true;
        if (!this.h.e.f()) {
            akgh akghVar = this.h.c;
            e = aktp.e("SubscriptionCallbacks.onPending");
            try {
                ubx a = akbe.a();
                try {
                    akghVar.b();
                    a.close();
                    e.close();
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        } else if ((this.h.c instanceof akey) && this.j.g()) {
            akgi akgiVar = this.h;
            if (!akgiVar.d) {
                akgi b = akgiVar.b(true);
                this.h = b;
                f((akey) b.c);
            }
        }
        akfb akfbVar = akgfVar.a;
        long j = akgfVar.b;
        akfn akfnVar = akgfVar.c;
        if (akfnVar.a == Long.MAX_VALUE) {
            z = false;
        }
        albo.U(z, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        akgf akgfVar2 = new akgf(akfbVar, j, new akfn(akfnVar.a + 1), akgfVar.d, akgfVar.e, akgfVar.f);
        akfn akfnVar2 = akgfVar2.c;
        akfb akfbVar2 = akgfVar2.a;
        e = aktp.e("DataSource fetchAndStoreData()");
        try {
            ListenableFuture b2 = akfbVar2.b();
            e.b(b2);
            ahlp ahlpVar = new ahlp(b2, akfnVar2);
            e.close();
            this.j.i(ahlpVar);
            ahlpVar.a.c(akto.j(new adub((Object) this, (Object) akgfVar2, (Object) ahlpVar, 16, (byte[]) null)), andi.a);
        } finally {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
    }

    public final void e(akgf akgfVar) {
        boolean z;
        aiut.c();
        akfr akfrVar = akgfVar.d;
        if (akfrVar.a != Long.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        akgf akgfVar2 = new akgf(akgfVar.a, akgfVar.b, akgfVar.c, new akfr(akfrVar.a + 1), akgfVar.e + 1, akgfVar.f);
        akfr akfrVar2 = akgfVar2.d;
        akfb akfbVar = akgfVar2.a;
        akrh e = aktp.e("DataSource loadData()");
        try {
            andc a = akfbVar.a();
            e.a(a);
            akfq akfqVar = new akfq(a, akfrVar2);
            e.close();
            this.k.i(akfqVar);
            akfqVar.b().c(akto.j(new adub((Object) this, (Object) akgfVar2, (Object) akfqVar, 14, (byte[]) null)), andi.a);
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(Throwable th) {
        if (!this.h.e.f()) {
            akgh akghVar = this.h.c;
            akrh e = aktp.e("SubscriptionCallbacks.onError");
            try {
                ubx a = akbe.a();
                try {
                    akghVar.a(th);
                    a.close();
                    e.close();
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    e.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else {
            akgh akghVar2 = this.h.c;
            if (akghVar2 instanceof akgg) {
                akgg akggVar = (akgg) akghVar2;
                akrh e2 = aktp.e("RefreshCallbacks.onRefreshError");
                try {
                    akggVar.a();
                    e2.close();
                } catch (Throwable th4) {
                    try {
                        e2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
        }
        if (this.h.d && i()) {
            akey akeyVar = (akey) this.h.c;
            akrh e3 = aktp.e("BackgroundCallbacks.onBackgroundFetchError");
            try {
                akeyVar.c();
                e3.close();
                this.h = this.h.b(false);
            } catch (Throwable th6) {
                try {
                    e3.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        }
    }

    public final boolean i() {
        if ((this.h.c instanceof akey) && this.j.g() && this.k.g()) {
            albo.T(this.h.d);
            return true;
        }
        return false;
    }
}
