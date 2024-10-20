package com.google.android.apps.messaging.ui.vcard;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import defpackage.cg;
import defpackage.en;
import defpackage.xyl;
import defpackage.zgu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VCardDetailActivity extends zgu {
    @Override // defpackage.aitz, defpackage.cj
    public final void h(cg cgVar) {
        super.h(cgVar);
        if (cgVar instanceof VCardDetailFragment) {
            Uri uri = (Uri) getIntent().getParcelableExtra("vcard_uri");
            uri.getClass();
            xyl.k(!r3.a.g());
            ((VCardDetailFragment) cgVar).c = uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgu, defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.vcard_detail_activity);
        en j = j();
        if (j != null) {
            j.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override // defpackage.zgu, defpackage.aitz, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            c().d();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
