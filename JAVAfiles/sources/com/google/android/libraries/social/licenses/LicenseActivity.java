package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.ahmc;
import defpackage.aiqb;
import defpackage.ex;
import defpackage.wob;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class LicenseActivity extends ex {
    @Override // defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        aiqb aiqbVar = (aiqb) getIntent().getParcelableExtra("license");
        if (j() != null) {
            j().setTitle(aiqbVar.a);
            j().setDisplayShowHomeEnabled(true);
            j().setDisplayHomeAsUpEnabled(true);
            j().setLogo(null);
        }
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        String O = ahmc.O(this, "third_party_licenses", aiqbVar.b, aiqbVar.c);
        if (O == null) {
            finish();
        } else {
            textView.setText(O);
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

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new wob(this, i, scrollView, 10, (byte[]) null));
        }
    }

    @Override // defpackage.re, defpackage.dx, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}
