package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aark {
    public final xyt b;
    public final aneo c;
    public final anen d;
    public boolean e;
    yao f;
    private final ykw h;
    private final anen i;
    private ListenableFuture j;
    private final rgj k;
    private static final xze g = xze.g("Bugle", "SetupExpressiveStickersManager");
    static final uuf a = uuh.q(166643423);

    public aark(rgj rgjVar, ykw ykwVar, xyt xytVar, anen anenVar, aneo aneoVar, anen anenVar2) {
        this.k = rgjVar;
        ykwVar.getClass();
        this.h = ykwVar;
        xytVar.getClass();
        this.b = xytVar;
        anenVar.getClass();
        this.i = anenVar;
        aneoVar.getClass();
        this.c = aneoVar;
        anenVar2.getClass();
        this.d = anenVar2;
    }

    public final void a() {
        if (this.f != null) {
            return;
        }
        wii wiiVar = new wii(this, 3);
        this.f = wiiVar;
        yaq yaqVar = (yaq) this.b.a();
        aozy createBuilder = yam.a.createBuilder();
        yal yalVar = yal.ALL_ACTIVE_SUBSCRIPTIONS;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        yam yamVar = (yam) createBuilder.b;
        yamVar.c = yalVar.e;
        yamVar.b |= 1;
        yaqVar.j(wiiVar, (yam) createBuilder.s());
        g.l("Register stickers setup connectivity state listener");
    }

    public final void b() {
        if (((Boolean) a.e()).booleanValue()) {
            if (!this.e) {
                aktp.aj(new aarj(this, 1), this.c).h(new aald(this, 4), this.c).k(qiu.b(), this.d);
                return;
            }
            return;
        }
        if (!e() && this.j == null) {
            g.l("Start initializing default stickers");
            ListenableFuture f = ((yaq) this.b.a()).f();
            this.j = f;
            albo.bR(f, qjc.a(new isn(this, 17)), this.i);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [apwt, java.lang.Object] */
    public final void c() {
        g.l("Schedule SetupExpressiveStickersAction");
        this.h.h("has_try_expressive_stickers_setup", true);
        rgj rgjVar = this.k;
        Context context = (Context) rgjVar.a.b();
        context.getClass();
        ykw ykwVar = (ykw) rgjVar.c.b();
        ykwVar.getClass();
        ((ydh) rgjVar.d.b()).getClass();
        xnv xnvVar = (xnv) rgjVar.e.b();
        xnvVar.getClass();
        ?? b = rgjVar.f.b();
        b.getClass();
        anen anenVar = (anen) rgjVar.g.b();
        anenVar.getClass();
        anen anenVar2 = (anen) rgjVar.h.b();
        anenVar2.getClass();
        aneo aneoVar = (aneo) rgjVar.i.b();
        aneoVar.getClass();
        airh airhVar = (airh) rgjVar.j.b();
        airhVar.getClass();
        agnq agnqVar = (agnq) rgjVar.k.b();
        agnqVar.getClass();
        ((rzx) rgjVar.l.b()).getClass();
        new SetupExpressiveStickersAction(context, rgjVar.b, ykwVar, xnvVar, b, anenVar, anenVar2, aneoVar, airhVar, agnqVar).F(Action.r);
    }

    public final void d() {
        yao yaoVar = this.f;
        if (yaoVar != null) {
            this.f = null;
            yaq yaqVar = (yaq) this.b.a();
            aozy createBuilder = yam.a.createBuilder();
            yal yalVar = yal.ALL_ACTIVE_SUBSCRIPTIONS;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            yam yamVar = (yam) createBuilder.b;
            yamVar.c = yalVar.e;
            yamVar.b |= 1;
            yaqVar.k(yaoVar, (yam) createBuilder.s());
            g.l("Unregister stickers setup connectivity state listener");
        }
    }

    public final boolean e() {
        if (!this.h.q("is_expressive_stickers_setup_done", false) && !this.h.q("has_try_expressive_stickers_setup", false)) {
            return false;
        }
        return true;
    }
}
