package com.google.android.apps.messaging.diagnostics.ui;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import com.google.android.apps.messaging.R;
import defpackage.en;
import defpackage.klx;
import defpackage.kox;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DiagnosticsActivity extends kox {
    @Override // defpackage.zgv, defpackage.zgu, defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.diagnostics_activity);
        en j = j();
        if (j != null) {
            j.setDisplayHomeAsUpEnabled(true);
            j.setTitle(R.string.diagnostics_activity_title);
        }
        Toolbar eZ = eZ();
        if (eZ != null) {
            eZ.s(new klx(this, 4));
        }
    }
}
