package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajlp extends ecl {
    final /* synthetic */ BaseTransientBottomBar a;

    public ajlp(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // defpackage.ecl
    public final void c(View view, efx efxVar) {
        super.c(view, efxVar);
        efxVar.g(1048576);
        efxVar.v(true);
    }

    @Override // defpackage.ecl
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            this.a.e();
            return true;
        }
        return super.i(view, i, bundle);
    }
}
