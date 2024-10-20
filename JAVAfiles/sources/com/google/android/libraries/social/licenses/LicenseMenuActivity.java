package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import defpackage.aiqd;
import defpackage.bd;
import defpackage.da;
import defpackage.ex;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class LicenseMenuActivity extends ex {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        if (j() != null) {
            j().setDisplayHomeAsUpEnabled(true);
        }
        da a = a();
        if (!(a.d(R.id.license_menu_fragment_container) instanceof aiqd)) {
            aiqd aiqdVar = new aiqd();
            bd bdVar = new bd(a);
            bdVar.q(R.id.license_menu_fragment_container, aiqdVar);
            bdVar.b();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
