package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wmg implements wnw {
    static final uuf a = uuh.i(uuh.b, "run_reverse_sync_after_heuristics_in_oobe_permissions_handler", false);
    private static final xze b = xze.g("Bugle", "BootAndPackageReplacedReceiver");
    private final Context c;
    private final ykw d;
    private final yjf e;
    private final armf f;
    private final armf g;
    private final rgl h;
    private final lpg i;

    public wmg(Context context, ykw ykwVar, yjf yjfVar, rgl rglVar, lpg lpgVar, armf armfVar, armf armfVar2) {
        this.c = context;
        this.d = ykwVar;
        this.e = yjfVar;
        this.h = rglVar;
        this.i = lpgVar;
        this.f = armfVar;
        this.g = armfVar2;
    }

    private final void d(boolean z) {
        this.h.a(z).j();
        if (yhx.h(this.c)) {
            this.i.G();
        }
        e(false);
    }

    private final void e(boolean z) {
        this.d.g("pending_tasks_after_reboot", z);
    }

    @Override // defpackage.wnw
    public final void a() {
        if (this.d.q("pending_tasks_after_reboot", false)) {
            b.o("after SMS permission granted, run pending tasks");
            d(true);
        }
    }

    @Override // defpackage.wnw
    public final void b() {
        if (this.d.q("pending_tasks_after_reboot", false)) {
            d(false);
        }
    }

    @Override // defpackage.wnw
    public final void c() {
        if (!this.e.m()) {
            b.o("not running oobe tasks, no sms permission");
            e(true);
            return;
        }
        Optional a2 = ((xhe) this.g.b()).a(amnf.OOBE_PERMISSIONS_HANDLER);
        if (((Boolean) a.e()).booleanValue()) {
            if (a2.isPresent() && ((Boolean) a2.get()).booleanValue()) {
                b.o("Not starting oobe tasks immediately. Postponing it after reverse sync and starting the reverse sync immediately. Has permissions, but wipeout was detected");
                ((xhl) this.f.b()).a();
                e(true);
                return;
            }
            b.l("Wipeout was not detected in OobePermisionsHandler");
        }
        if (((xhl) this.f.b()).b()) {
            b.o("Not running oobe tasks, has permissions, but reverse sync is in progress. Oobe task will run after reverse sync completes.");
            e(true);
        } else {
            b.o("run post-reboot oobe tasks");
            d(false);
        }
    }
}
