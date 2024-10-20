package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zkx extends ecl {
    final /* synthetic */ efw a;
    final /* synthetic */ zky b;

    public zkx(zky zkyVar, efw efwVar) {
        this.a = efwVar;
        this.b = zkyVar;
    }

    @Override // defpackage.ecl
    public final void c(View view, efx efxVar) {
        super.c(view, efxVar);
        efxVar.h(this.a);
        efxVar.v(true);
    }

    @Override // defpackage.ecl
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            this.b.w.d();
            return true;
        }
        return super.i(view, i, bundle);
    }
}
