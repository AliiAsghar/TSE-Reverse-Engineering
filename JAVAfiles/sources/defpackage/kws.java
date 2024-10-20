package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kws implements kwq {
    public static final /* synthetic */ int m = 0;
    public final anen a;
    public final anen b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final uac k;
    public final ansy l;
    public final List h = new ArrayList();
    public final List i = new ArrayList();
    public final AtomicBoolean g = new AtomicBoolean(false);
    private boolean n = false;
    public boolean j = false;

    static {
        new akgc("TOUCH_EXPLORATION_ENABLED_DATASOURCE_KEY");
    }

    public kws(anen anenVar, anen anenVar2, uac uacVar, armf armfVar, armf armfVar2, ansy ansyVar, armf armfVar3, armf armfVar4) {
        this.a = anenVar;
        this.b = anenVar2;
        this.k = uacVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.l = ansyVar;
        this.e = armfVar3;
        this.f = armfVar4;
    }

    @Override // defpackage.kwq
    public final akul a(alog alogVar, tqc tqcVar, amfe amfeVar, ajwt ajwtVar) {
        return aktp.ai(new kwr(this, alogVar, tqcVar, amfeVar, ajwtVar, 0), this.a);
    }

    @Override // defpackage.kwq
    public final void b() {
        aiut.c();
        this.n = true;
        c();
    }

    public final void c() {
        if (this.j && this.n) {
            ((ahiy) this.f.b()).q(aktp.ag(null), "POPUP_KEY");
        }
    }
}
