package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajeh extends ecl {
    final /* synthetic */ ajek a;

    public ajeh(ajek ajekVar) {
        this.a = ajekVar;
    }

    @Override // defpackage.ecl
    public final void c(View view, efx efxVar) {
        super.c(view, efxVar);
        if (this.a.d) {
            efxVar.g(1048576);
            efxVar.v(true);
        } else {
            efxVar.v(false);
        }
    }

    @Override // defpackage.ecl
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            ajek ajekVar = this.a;
            if (!ajekVar.d) {
                i = 1048576;
            } else {
                ajekVar.cancel();
                return true;
            }
        }
        return super.i(view, i, bundle);
    }
}
