package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import j$.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class acaj implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public acaj(aciv acivVar, Callable callable, int i) {
        this.c = i;
        this.b = acivVar;
        this.a = callable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, acig] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, acig] */
    /* JADX WARN: Type inference failed for: r0v9, types: [aciq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, acim] */
    /* JADX WARN: Type inference failed for: r1v13, types: [acil, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, acij] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, acim] */
    /* JADX WARN: Type inference failed for: r1v35, types: [acil, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, acij] */
    /* JADX WARN: Type inference failed for: r1v72, types: [acik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v76, types: [acil, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v80, types: [java.lang.Object, acim] */
    @Override // java.lang.Runnable
    public final void run() {
        algw algwVar;
        int i = 8;
        switch (this.c) {
            case 0:
                ((Activity) ((acak) this.a).a).startActivity((Intent) this.b);
                return;
            case 1:
                abzu.e.p("start reading cache", new Object[0]);
                abzu abzuVar = (abzu) this.b;
                zfm zfmVar = abzuVar.d;
                long nanoTime = System.nanoTime();
                algw b = ((adve) zfmVar.a).b();
                if (!b.f()) {
                    algwVar = alfd.a;
                } else {
                    aovk aovkVar = (aovk) b.b();
                    try {
                        aovj aovjVar = (aovj) apag.parseFrom(aovj.a, aovkVar.c, aozs.a());
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(abzuVar.b.f().toEpochMilli());
                        apct apctVar = aovjVar.f;
                        if (apctVar == null) {
                            apctVar = apct.a;
                        }
                        if (seconds >= apctVar.b) {
                            algwVar = alfd.a;
                        } else {
                            algwVar = algw.i(aovkVar);
                        }
                    } catch (apba unused) {
                        algwVar = alfd.a;
                    }
                }
                Object obj = this.a;
                abzt a = abzx.a(algwVar);
                abzu.e.p("finished reading cache in %f ms", Double.valueOf((System.nanoTime() - nanoTime) / 1000000.0d));
                if (a.a()) {
                    abzu.e.p("responding based on cache", new Object[0]);
                    ((acit) obj).d(a);
                }
                int i2 = 2;
                acir g = agkx.g(ancj.f(anee.o(albo.bN(new aarj(abzuVar.c, i2), abzuVar.a)), new abes(i2), abzuVar.a));
                g.p(abzuVar.a, new kos(obj, i));
                g.o(abzuVar.a, new ktn(obj, 10));
                return;
            case 2:
                ((Activity) this.b).startActivityForResult((Intent) this.a, 123);
                return;
            case 3:
                ((Activity) this.b).startActivityForResult((Intent) this.a, 123);
                return;
            case 4:
                ((acbr) this.b).d(((acbs) this.a).a);
                return;
            case 5:
                if (((aciv) this.a).c) {
                    ((aciv) ((acii) this.b).a).w();
                    return;
                }
                try {
                    ((aciv) ((acii) this.b).a).u(((acii) this.b).b.a((acir) this.a));
                    return;
                } catch (acip e) {
                    if (e.getCause() instanceof Exception) {
                        ((aciv) ((acii) this.b).a).t((Exception) e.getCause());
                        return;
                    } else {
                        ((aciv) ((acii) this.b).a).t(e);
                        return;
                    }
                } catch (Exception e2) {
                    ((aciv) ((acii) this.b).a).t(e2);
                    return;
                }
            case 6:
                try {
                    acir acirVar = (acir) ((acin) this.b).b.a((acir) this.a);
                    if (acirVar == 0) {
                        ((acin) this.b).d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    acirVar.p(aciu.b, this.b);
                    acirVar.o(aciu.b, this.b);
                    acirVar.m(aciu.b, this.b);
                    return;
                } catch (acip e3) {
                    if (e3.getCause() instanceof Exception) {
                        ((acin) this.b).a.t((Exception) e3.getCause());
                        return;
                    } else {
                        ((acin) this.b).a.t(e3);
                        return;
                    }
                } catch (Exception e4) {
                    ((acin) this.b).a.t(e4);
                    return;
                }
            case 7:
                synchronized (((acii) this.b).a) {
                    ((acii) this.b).b.a((acir) this.a);
                }
                return;
            case 8:
                synchronized (((acii) this.b).a) {
                    ?? r1 = ((acii) this.b).b;
                    Exception g2 = ((acir) this.a).g();
                    abhg.m(g2);
                    r1.d(g2);
                }
                return;
            case 9:
                synchronized (((acii) this.b).a) {
                    ((acii) this.b).b.e(((acir) this.a).h());
                }
                return;
            case 10:
                try {
                    acir a2 = ((acin) this.b).b.a(((acir) this.a).h());
                    a2.p(aciu.b, this.b);
                    a2.o(aciu.b, this.b);
                    a2.m(aciu.b, this.b);
                    return;
                } catch (acip e5) {
                    if (e5.getCause() instanceof Exception) {
                        ((acin) this.b).d((Exception) e5.getCause());
                        return;
                    } else {
                        ((acin) this.b).d(e5);
                        return;
                    }
                } catch (CancellationException unused2) {
                    ((acin) this.b).b();
                    return;
                } catch (Exception e6) {
                    ((acin) this.b).d(e6);
                    return;
                }
            case 11:
                try {
                    ((aciv) this.b).u(this.a.call());
                    return;
                } catch (Exception e7) {
                    ((aciv) this.b).t(e7);
                    return;
                } catch (Throwable th) {
                    ((aciv) this.b).t(new RuntimeException(th));
                    return;
                }
            case 12:
                acke ackeVar = new acke((DataHolder) this.b, 1, null);
                try {
                    ((ackn) this.a).a.l(ackeVar);
                    return;
                } finally {
                    ackeVar.b();
                }
            case 13:
                ((ackn) this.b).a.j((MessageEventParcelable) this.a);
                return;
            case 14:
                ((ChannelEventParcelable) this.a).a(((ackn) this.b).a);
                ((ChannelEventParcelable) this.a).a(((ackn) this.b).a.K);
                return;
            case 15:
                ContentValues contentValues = acqy.a;
                ((SQLiteDatabase) this.a).update("Subscribers", (ContentValues) this.b, null, null);
                return;
            case 16:
                ((adhv) ((adgw) this.a).a.a).b.s(20, this.b);
                return;
            case 17:
                Object obj2 = this.b;
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused3) {
                    advr.d(((adgz) obj2).a, "Interrupted while waiting for deregistration on the old registration.", new Object[0]);
                }
                Object obj3 = this.a;
                advr.d(((adgz) obj2).a, "Stopping old state machine %s", obj3);
                ((acyj) obj3).n();
                return;
            case 18:
                Collection.EL.stream(((adhw) this.b).L).forEach(new adgr(this.a, i));
                return;
            case 19:
                Collection.EL.stream(((adhw) this.a).L).forEach(new adgr(this.b, 7));
                return;
            default:
                Collection.EL.stream(((adhw) this.a).K).forEach(new adgr(this.b, 6));
                return;
        }
    }

    public acaj(ackn acknVar, DataHolder dataHolder, int i) {
        this.c = i;
        this.b = dataHolder;
        this.a = acknVar;
    }

    public /* synthetic */ acaj(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ acaj(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public acaj(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }
}
