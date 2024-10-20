package defpackage;

import android.app.Activity;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpx implements ajyk {
    public final armf b;
    public final armf c;
    public final Optional d;
    public final Activity e;
    private final armf g;
    private final armf h;
    public final xze a = xze.g("Lighter", "LighterAccountSwitchCallback");
    public Optional f = Optional.empty();

    public kpx(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, Optional optional, Activity activity) {
        this.b = armfVar;
        this.g = armfVar2;
        this.c = armfVar3;
        this.h = armfVar4;
        this.d = optional;
        this.e = activity;
    }

    @Override // defpackage.ajyk
    public final void d(agxw agxwVar) {
        if (uyh.a() && ((yjv) this.h.b()).d()) {
            if (((Boolean) ((utz) uyh.c.get()).e()).booleanValue() && oie.a() && this.d.isPresent()) {
                this.f.ifPresent(new ilf(this, agxwVar, 20));
            }
            qiu.h(((vco) this.g.b()).g().h(new ijq(this, agxwVar, 8), (Executor) this.c.b()));
        }
    }

    @Override // defpackage.ajyk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ajyk
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ajyk
    public final void b(ajxt ajxtVar) {
    }
}
