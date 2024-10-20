package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axm extends arrp implements arqr<cps, Boolean> {
    final /* synthetic */ ayd a;
    final /* synthetic */ bfb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axm(ayd aydVar, bfb bfbVar) {
        super(1);
        this.a = aydVar;
        this.b = bfbVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        KeyEvent keyEvent = ((cps) obj).a;
        boolean z = false;
        if (this.a.c() == axq.b && keyEvent.getKeyCode() == 4 && a.bA(cpt.a(keyEvent), 1)) {
            this.b.i(null);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
