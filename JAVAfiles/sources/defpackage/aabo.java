package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aabo implements aaca {
    public boolean l;
    protected final Context m;
    public final aabz n;
    public final aacb o;
    protected final da p;
    public final aabp q;

    public aabo(aabp aabpVar, aabz aabzVar, aacb aacbVar, da daVar, Context context, boolean z) {
        this.q = aabpVar;
        this.n = aabzVar;
        this.o = aacbVar;
        this.m = context;
        this.p = daVar;
        this.l = z;
    }

    @Override // defpackage.aaca
    public void q(Bundle bundle) {
        if (bundle.getBoolean(aabp.A(this))) {
            this.q.D(this, true, false);
        }
    }

    @Override // defpackage.aaca
    public boolean t(en enVar) {
        return false;
    }

    @Override // defpackage.aaca
    public final void w(boolean z) {
        if (this.l != z) {
            this.q.a();
            this.l = z;
            this.q.c();
        }
    }

    @Override // defpackage.aaca
    public final void x(Bundle bundle) {
        bundle.putBoolean(aabp.A(this), this.l);
    }

    @Override // defpackage.aaca
    public final boolean y() {
        return this.l;
    }
}
