package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class apxh implements apxq {
    private volatile Object a;
    private final Object b = new Object();
    private final cg c;
    private final apxi d;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        kra D();
    }

    public apxh(cg cgVar) {
        this.c = cgVar;
        this.d = new apxi(cgVar);
    }

    public static final Context d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static final void e(cg cgVar) {
        if (cgVar.m == null) {
            cgVar.ak(new Bundle());
        }
    }

    @Override // defpackage.apxq
    public final Object aS() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    d.aB(this.c.R(), "Hilt Fragments must be attached before creating the component.");
                    cg cgVar = this.c;
                    apzj.g(cgVar.R() instanceof apxq, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", cgVar.R().getClass());
                    c(this.c);
                    kra D = ((a) aovp.m(this.c.R(), a.class)).D();
                    D.c = this.d.aS();
                    D.b = this.c;
                    apzj.f(D.b, cg.class);
                    apzj.f(D.c, apwv.class);
                    this.a = new kqm(D.a, (kqk) D.d, (kqj) D.e, (cg) D.b);
                }
            }
        }
        return this.a;
    }

    protected void c(cg cgVar) {
    }
}
