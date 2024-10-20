package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aayb extends ecl {
    final /* synthetic */ Context a;

    public aayb(Context context) {
        this.a = context;
    }

    @Override // defpackage.ecl
    public final void c(View view, efx efxVar) {
        super.c(view, efxVar);
        efxVar.h(new efw(16, this.a.getResources().getString(R.string.google_tos_multisim_view_accessibility_description)));
    }
}
