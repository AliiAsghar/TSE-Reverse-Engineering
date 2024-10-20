package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class ryg {
    public final Object a;

    public ryg(Object obj) {
        this.a = obj;
    }

    public static boolean l(ParticipantsTable.BindData bindData) {
        if (bindData.p() != -2) {
            return true;
        }
        return false;
    }

    public static boolean m(tap tapVar) {
        if (tapVar.d != -2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final int a() {
        qxb qxbVar = (qxb) this.a.b();
        qxbVar.j.lock();
        try {
            int i = 0;
            for (int i2 = qxbVar.i.d - 1; i2 >= 0; i2--) {
                qwm qwmVar = (qwm) qxbVar.i.g(i2);
                if (!qwmVar.j() && qwmVar.i()) {
                    i++;
                }
            }
            return i;
        } finally {
            qxbVar.j.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final qwm b() {
        qxb qxbVar = (qxb) this.a.b();
        akrh e = aktp.e("getDefaultSubscription");
        try {
            qwm b = qxbVar.b(((yjy) qxbVar.c.b()).c());
            e.close();
            return b;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final qwm c(SelfIdentityId selfIdentityId) {
        return ((qxb) this.a.b()).a(selfIdentityId);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final qwm d() {
        qxb qxbVar = (qxb) this.a.b();
        akrh e = aktp.e("loadDefaultSubscription");
        try {
            qwm d = qxbVar.d(((yjy) qxbVar.c.b()).c());
            e.close();
            return d;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final qwm e(SelfIdentityId selfIdentityId) {
        return ((qxb) this.a.b()).c(selfIdentityId);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final qwm f(int i) {
        return ((qxb) this.a.b()).d(i);
    }

    public final alog g() {
        return alog.n(h());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final List h() {
        return ((qxb) this.a.b()).e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void i(List list) {
        ((qxb) this.a.b()).i(list);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void j() {
        ((qxb) this.a.b()).j();
    }

    public final boolean k(msh mshVar) {
        return Collection.EL.stream(g()).map(new rxo(10)).filter(new rsi(13)).anyMatch(new qxp(mshVar, 15));
    }

    @Deprecated
    public final psv n(msh mshVar) {
        if (mshVar.e().isEmpty()) {
            return psv.c();
        }
        return psv.a(o((qei) mshVar.e().get()).a());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [puu, java.lang.Object] */
    public final pto o(qei qeiVar) {
        try {
            return (pto) albo.bQ(this.a.b(qeiVar));
        } catch (ExecutionException e) {
            qiu.d(e);
            throw new AssertionError("RcsCapabilitiesSyncGetter should have crashed.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void p(Runnable runnable) {
        this.a.execute(runnable);
    }

    public final boolean q(MotionEvent motionEvent) {
        return ((GestureDetector) this.a).onTouchEvent(motionEvent);
    }

    public ryg(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ryg(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public ryg(Context context, GestureDetector.OnGestureListener onGestureListener, byte[] bArr) {
        this.a = new GestureDetector(context, onGestureListener, null);
    }
}
