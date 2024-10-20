package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eyt implements esm {
    public final esl a;
    public final Executor b;
    public boolean c;
    public volatile boolean d;
    public int e;
    private final Context f;
    private final esi g;
    private final eqd h;
    private final eqg i;
    private final boolean j;
    private esk k;
    private erv l;
    private boolean m;

    public eyt(Context context, esi esiVar, eqd eqdVar, esl eslVar, eqg eqgVar, Executor executor, eyy eyyVar, boolean z) {
        dzg.e(eyy.a.equals(eyyVar), "SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings");
        this.f = context;
        this.g = esiVar;
        this.h = eqdVar;
        this.a = eslVar;
        this.i = eqgVar;
        this.b = executor;
        this.j = z;
        this.e = -1;
    }

    public final esk a(int i) {
        int i2 = this.e;
        boolean z = false;
        if (i2 != -1 && i2 == i) {
            z = true;
        }
        d.s(z);
        esk eskVar = this.k;
        dzg.h(eskVar);
        return eskVar;
    }

    public final void b(int i) {
        boolean z;
        if (this.e == -1) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        this.e = i;
        andi andiVar = andi.a;
        eys eysVar = new eys(this);
        boolean z2 = this.j;
        eqd eqdVar = this.h;
        eqg eqgVar = this.i;
        esk a = this.g.a(this.f, eqgVar, eqdVar, z2, andiVar, eysVar);
        this.k = a;
        erv ervVar = this.l;
        if (ervVar != null) {
            a.e(ervVar);
        }
    }

    public final void d(long j) {
        esk a = a(this.e);
        dzg.e(!r1.f, "Calling this method is not allowed when renderFramesAutomatically is enabled");
        ((exi) a).d.f(new exf(a, j, 0));
    }

    @Override // defpackage.esm
    public final void f() {
        if (this.m) {
            return;
        }
        esk eskVar = this.k;
        if (eskVar != null) {
            eskVar.d();
            this.k = null;
        }
        this.m = true;
    }

    @Override // defpackage.esm
    public final void g(erv ervVar) {
        this.l = ervVar;
        esk eskVar = this.k;
        if (eskVar != null) {
            eskVar.e(ervVar);
        }
    }

    @Override // defpackage.esm
    public final boolean h() {
        return this.d;
    }

    @Override // defpackage.esm
    public final void e() {
    }
}
