package defpackage;

import android.content.Context;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wpm implements wpj {
    private static final alvi c = alvi.m("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl");
    public final Context a;
    public ascv b;
    private final arwe d;
    private final xyt e;
    private final Duration f;
    private final ascd g;

    public wpm(Context context, arwe arweVar, xyt xytVar, Duration duration) {
        context.getClass();
        arweVar.getClass();
        xytVar.getClass();
        this.a = context;
        this.d = arweVar;
        this.e = xytVar;
        this.f = duration;
        ascd a = ascy.a(wpn.a);
        this.g = a;
        armd.a(new vnq(this, 6));
        long k = arwi.k(arut.i(arsd.p(duration.getSeconds(), aruv.d), arsd.o(duration.getNano(), aruv.a)));
        asai aghwVar = a;
        if (k >= 0) {
            aghwVar = k != 0 ? new aghw(new asaq(new aeri(k, 3), a, null), 13) : aghwVar;
            int i = ascp.a;
            this.b = arrn.T(aghwVar, arweVar, asco.a, wpn.a);
            return;
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    @Override // defpackage.wpj
    public final void a(qwe qweVar) {
        qweVar.getClass();
        alvw d = c.d();
        d.X(alwp.a, "BugleSatellite");
        ((alvg) d.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "offDefaultDataSatelliteToNoConnection", 129, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("ConversationSatelliteConnectionChangeListener#offDefaultDataSatelliteNoConnection executed");
        this.g.f(wpn.f);
    }

    @Override // defpackage.wpj
    public final void b(qwe qweVar) {
        qweVar.getClass();
        alvw d = c.d();
        d.X(alwp.a, "BugleSatellite");
        ((alvg) d.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "offDefaultDataSatelliteToTerrestrial", 120, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("ConversationSatelliteConnectionChangeListener#offDefaultDataSatelliteOnTerrestial executed");
        this.g.f(wpn.f);
    }

    @Override // defpackage.wpj
    public final void c(qwe qweVar) {
        qweVar.getClass();
        alvw d = c.d();
        d.X(alwp.a, "BugleSatellite");
        ((alvg) d.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "onDefaultDataSatelliteEvent", 113, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("ConversationSatelliteConnectionChangeListener#onDefaultDataSatelliteEvent executed");
        this.g.f(wpn.b);
    }

    public final void f() {
        if (this.g.c() != wpn.a) {
            return;
        }
        if (((yaq) this.e.a()).o()) {
            this.g.f(wpn.b);
        } else {
            this.g.f(wpn.f);
        }
    }

    @Override // defpackage.wpj
    public final void d(qwe qweVar) {
    }

    @Override // defpackage.wpj
    public final void e(qwe qweVar) {
    }
}
