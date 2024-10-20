package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbn {
    public final armf a;
    private boolean b;
    private boolean c;
    private boolean d;
    private Boolean e;
    private Boolean f;
    private final eoy g;

    public jbn(armf armfVar, eoy eoyVar) {
        armfVar.getClass();
        this.a = armfVar;
        this.g = eoyVar;
    }

    private final void c(ajwt ajwtVar, Activity activity) {
        if (!this.d && this.b && this.c) {
            this.d = true;
            akrh e = aktp.e("ConversationFragmentStartupTracker#onReady");
            try {
                ((mgv) this.a.b()).f(mgv.v);
                jbo jboVar = (jbo) this.g.a(jbo.class);
                Boolean bool = this.e;
                Boolean bool2 = this.f;
                jboVar.a = true;
                jboVar.d = bool;
                jboVar.e = bool2;
                jboVar.a(ajwtVar, activity);
                armd.i(e, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    armd.i(e, th);
                    throw th2;
                }
            }
        }
    }

    public final void a(ajwt ajwtVar, Activity activity, boolean z, boolean z2) {
        ajwtVar.getClass();
        this.b = true;
        this.e = Boolean.valueOf(z);
        this.f = Boolean.valueOf(z2);
        c(ajwtVar, activity);
    }

    public final void b(ajwt ajwtVar, Activity activity) {
        ajwtVar.getClass();
        this.c = true;
        c(ajwtVar, activity);
    }
}
