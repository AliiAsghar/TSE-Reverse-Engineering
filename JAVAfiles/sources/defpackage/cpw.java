package defpackage;

import android.view.KeyEvent;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpw extends cga.c implements cpv {
    public arqr a;
    public arqr b;

    public cpw(arqr arqrVar, arqr arqrVar2) {
        this.a = arqrVar;
        this.b = arqrVar2;
    }

    @Override // defpackage.cpv
    public final boolean t(KeyEvent keyEvent) {
        arqr arqrVar = this.a;
        if (arqrVar != null) {
            return ((Boolean) arqrVar.a(new cps(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.cpv
    public final boolean v(KeyEvent keyEvent) {
        arqr arqrVar = this.b;
        if (arqrVar != null) {
            return ((Boolean) arqrVar.a(new cps(keyEvent))).booleanValue();
        }
        return false;
    }
}
