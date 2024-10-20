package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.setupdesign.items.ExpandableSwitchItem;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajvr extends ecl {
    final /* synthetic */ ExpandableSwitchItem a;

    public ajvr(ExpandableSwitchItem expandableSwitchItem) {
        this.a = expandableSwitchItem;
    }

    @Override // defpackage.ecl
    public final void c(View view, efx efxVar) {
        efw efwVar;
        super.c(view, efxVar);
        if (this.a.a) {
            efwVar = efw.g;
        } else {
            efwVar = efw.f;
        }
        efxVar.h(efwVar);
    }

    @Override // defpackage.ecl
    public final boolean i(View view, int i, Bundle bundle) {
        if (i != 262144 && i != 524288) {
            return super.i(view, i, bundle);
        }
        this.a.c(!r2.a);
        return true;
    }
}
