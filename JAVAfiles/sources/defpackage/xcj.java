package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xcj {
    public static final xze a = xze.g("BugleStartup", "StartupHandler");
    public final AtomicBoolean b;
    public final andr c;
    public final Context d;
    public final ScheduledExecutorService e;
    public final ScheduledExecutorService f;
    public final aksr g;
    public final armf h;
    public final utz i;
    final uuf j;
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final AtomicBoolean l;
    private final AtomicBoolean m;
    private final Executor n;
    private final armf o;
    private final armf p;
    private final armf q;

    public xcj(Context context, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, armf armfVar, aksr aksrVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.b = new AtomicBoolean(false);
        this.c = new andr();
        this.i = uuh.e(uuh.b, "startup_interactive_wait_seconds", 15);
        this.j = uuh.o(161420308);
        this.d = context;
        this.e = scheduledExecutorService;
        this.f = scheduledExecutorService2;
        this.o = armfVar;
        this.g = aksrVar;
        this.p = armfVar2;
        this.q = armfVar3;
        this.h = armfVar4;
        this.n = new anew(scheduledExecutorService2);
    }

    private final akul g(xcg xcgVar, String str) {
        akrh e = aktp.e(str);
        try {
            akul ah = aktp.ah(new wnc(this, xcgVar, 8), this.n);
            e.close();
            return ah;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void h(akul akulVar) {
        if (((Boolean) this.j.e()).booleanValue()) {
            qiu.h(akulVar);
        } else {
            akulVar.k(qjc.a(new adoa(1)), andi.a);
        }
    }

    public final akul a(ajwt ajwtVar) {
        akul b;
        akrh e = aktp.e("StartupHandlerImpl#onAppInteractiveAccount");
        try {
            byte[] bArr = null;
            if (!f()) {
                b = aktp.ag(null);
            } else if (((Boolean) this.p.b()).booleanValue()) {
                b = b(false).h(new whh(this, ajwtVar, 9, bArr), this.n);
            } else {
                b = b(false);
            }
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

    public final akul b(boolean z) {
        akul ag;
        if (this.m.getAndSet(true)) {
            return aktp.ag(null);
        }
        akul h = c().h(new woc(19), andi.a);
        if (((yjf) this.o.b()).h()) {
            a.l("Starting onRequiredPermissionsAcquired tasks in onAppInteractive");
            ag = d();
        } else {
            ag = aktp.ag(null);
        }
        xyo a2 = a.a();
        a2.H("Starting onAppInteractive tasks");
        a2.A("From timer", z);
        a2.q();
        return aktp.an(h, ag, g(xcg.APP_INTERACTIVE, "StartupHandlerImpl#onAppInteractiveInternal")).j(new eyg(17), andi.a);
    }

    public final akul c() {
        if (this.k.getAndSet(true)) {
            return aktp.ag(new akip(false));
        }
        return g(xcg.APP_CREATED, "StartupHandlerImpl#onApplicationCreatedInternal").i(new wgb(this, 8), this.e).h(new woc(20), andi.a);
    }

    public final akul d() {
        akul g;
        akrh e = aktp.e("StartupHandlerImpl#onRequiredPermissionsAcquired");
        try {
            if (!f()) {
                g = aktp.ag(null);
            } else if (this.l.getAndSet(true)) {
                g = aktp.ag(null);
            } else {
                g = g(xcg.PERMISSIONS_ACQUIRED, "StartupTask#PermissionsAcquired");
            }
            e.close();
            return g;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(Set set, xcg xcgVar) {
        xyo a2 = a.a();
        a2.x("BG thread startup tasks count", set.size());
        a2.z("BG stage", xcgVar);
        a2.q();
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            xcf xcfVar = (xcf) it.next();
            Context context = this.d;
            int i = xcfVar.j;
            if (yhx.f(context) && (!xcfVar.fI() || ((yjv) this.q.b()).e())) {
                akul g = akul.g(this.c.b(akto.c(new vbo(xcfVar, 7)), this.f));
                arrayList.add(g);
                h(g);
            }
        }
        h(aktp.am(arrayList).j(new eyg(18), andi.a));
    }

    public final boolean f() {
        int i;
        if (!yhx.f(this.d)) {
            Context context = this.d;
            int i2 = yhx.k.get();
            if (i2 != 0) {
                if (i2 != 1) {
                    return false;
                }
            } else {
                boolean equals = yhx.a(context).equals(context.getPackageName().concat(":rcs"));
                if (true != equals) {
                    i = 2;
                } else {
                    i = 1;
                }
                yhx.k.set(i);
                if (!equals) {
                    return false;
                }
            }
        }
        return true;
    }
}
