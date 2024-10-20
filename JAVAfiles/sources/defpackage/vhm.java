package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vhm implements wnv, xth {
    public static final xze a = xze.g("BugleNetwork", "TachyonRefreshManagerImpl");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/net/tachyonrefresh/TachyonRefreshManagerImpl");
    public final Context c;
    public final anen d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    private final AtomicBoolean i = new AtomicBoolean();
    private final anen j;
    private final armf k;

    public vhm(Context context, anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.c = context;
        this.d = anenVar;
        this.j = anenVar2;
        this.k = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
    }

    private final akul a(boolean z) {
        znj znjVar = (znj) this.k.b();
        aiwl a2 = wus.a();
        a2.i(wuk.TACHYON_PHONE);
        a2.k(vee.a);
        a2.g(true);
        return znjVar.ab(a2.f()).g().h(new vej(19), andi.a).i(new led(this, z, 7), this.d);
    }

    @Override // defpackage.wnv
    public final akul d(boolean z) {
        if (z) {
            return aktp.ag(null);
        }
        a.o("No longer default SMS app. Update Tachyon registrations");
        return a(false).h(new vgd(this, 3), this.d);
    }

    @Override // defpackage.xth
    public final void f(xtg xtgVar) {
        if (!this.i.getAndSet(true)) {
            return;
        }
        alvw g = b.g();
        g.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/tachyonrefresh/TachyonRefreshManagerImpl", "onChatTransportChange", 122, "TachyonRefreshManagerImpl.java")).t("Chat Transport changed to %s. Triggering RegisterRefresh", xtgVar);
        if (xtgVar.equals(xtg.a)) {
            a(false).i(new vek(this, 7), this.j);
        } else {
            a(true);
        }
    }
}
