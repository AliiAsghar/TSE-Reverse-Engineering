package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akhj {
    public static final alvi a = alvi.m("com/google/apps/tiktok/dataservice/local/LocalSubscriptionMixinUpdater");
    public final alnr b;
    public final Executor c;
    public final Executor d;
    public final akbl e;
    public final Set f = new to();
    public Set g = new to();
    public int h = 2;

    public akhj(alnr alnrVar, Executor executor, Executor executor2, akbl akblVar) {
        this.b = alnrVar;
        this.c = executor;
        this.d = executor2;
        this.e = akblVar;
    }

    public static void a(akgs akgsVar, akho akhoVar) {
        akrh e;
        ubx a2;
        aiut.c();
        if (akhoVar.b()) {
            e = aktp.e("LocalSubscription onLoaded()");
            try {
                a2 = akbe.a();
                try {
                    akgsVar.b(akhoVar.a());
                    a2.close();
                    e.close();
                    return;
                } finally {
                }
            } finally {
            }
        }
        e = aktp.e("LocalSubscription onLoadError()");
        try {
            a2 = akbe.a();
            try {
                akgsVar.a(akhoVar.c());
                a2.close();
                e.close();
            } finally {
                try {
                    a2.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } finally {
        }
    }

    private final void e(ListenableFuture listenableFuture) {
        aiut.c();
        this.g.add(listenableFuture);
        listenableFuture.c(akto.j(new ajnt(this, listenableFuture, 13, (byte[]) null)), this.d);
    }

    public final void b(aodz aodzVar, ListenableFuture listenableFuture) {
        e(aktp.T(aktp.Y(albo.bJ(listenableFuture), new ajzr(this, aodzVar, 2), this.d), Throwable.class, new ajzr(this, aodzVar, 3), this.d));
    }

    public final void c(aodz aodzVar) {
        aiut.c();
        this.f.add(aodzVar);
        if (this.h == 2) {
            this.h = 1;
            e(aktp.V(new akhg(this, 3), this.e));
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [akgr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final void d(aodz aodzVar) {
        akhh akhhVar = new akhh(this, aodzVar, 0);
        aiut.c();
        Object obj = aodzVar.a;
        obj.getClass();
        akhl akhlVar = new akhl(aodzVar, 0);
        akhk akhkVar = (akhk) obj;
        if (akhkVar.b.f()) {
            akhkVar.b.b().cancel(false);
        }
        algw algwVar = akhkVar.a;
        akrh e = aktp.e("LocalSubscription newLoad");
        try {
            ListenableFuture b = ((alha) ((akhk) obj).a).a.b();
            e.b(b);
            akhlVar.a(new akhk(((akhk) obj).a, algw.i(b), ((akhk) obj).c, ((akhk) obj).d));
            akhhVar.a(b);
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
}
