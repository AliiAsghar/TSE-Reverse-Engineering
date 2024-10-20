package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aeb extends ada {
    public aeb(ajr ajrVar, afa afaVar, boolean z, String str, dgv dgvVar, arqg arqgVar) {
        super(ajrVar, afaVar, z, str, dgvVar, arqgVar);
    }

    @Override // defpackage.ada
    public final Object a(crk crkVar, arpe arpeVar) {
        Object c = aik.c(crkVar, new adz(this, null), new aea(this), arpeVar);
        if (c == arpl.a) {
            return c;
        }
        return arnb.a;
    }

    @Override // defpackage.ada
    protected final boolean r(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ada
    protected final void y(KeyEvent keyEvent) {
        this.d.a();
    }
}
