package defpackage;

import android.app.Activity;
import android.view.View;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqj implements rv {
    public final xnv a;
    public final uvi b;
    public final amqh c;
    public final arqg d;
    public final iqh e;
    public final rw f;
    public Instant g;
    private final arwe h;
    private final se i;
    private final cj j;
    private final sb k;
    private final arml l = armd.a(new ifa(this, 16));

    public iqj(Activity activity, xnv xnvVar, uvi uviVar, arwe arweVar, amqh amqhVar, se seVar, arqg arqgVar, iqh iqhVar) {
        this.a = xnvVar;
        this.b = uviVar;
        this.h = arweVar;
        this.c = amqhVar;
        this.i = seVar;
        this.d = arqgVar;
        this.e = iqhVar;
        if (activity instanceof cj) {
            cj cjVar = (cj) activity;
            this.j = cjVar;
            sb sbVar = cjVar.g;
            this.k = sbVar;
            this.f = sbVar.a("compose_shortcut_".concat(String.valueOf(amqhVar.name())), seVar, this);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // defpackage.rv
    public final void a(Object obj) {
        qjh.l(this.h, null, new iqi(this, obj, (arpe) null, 0), 3);
    }

    public final amqj b() {
        return (amqj) this.l.a();
    }

    public final void c(View view) {
        this.g = this.a.f();
        qjh.l(this.h, null, new gbv(view, this, (arpe) null, 14), 3);
    }
}
