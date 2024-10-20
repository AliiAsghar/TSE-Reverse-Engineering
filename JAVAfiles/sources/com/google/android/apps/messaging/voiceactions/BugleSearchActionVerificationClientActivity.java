package com.google.android.apps.messaging.voiceactions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import defpackage.uwf;
import defpackage.wnd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BugleSearchActionVerificationClientActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intent intent2 = new Intent(this, (Class<?>) BugleSearchActionVerificationClientService.class);
        intent2.putExtra("SearchActionVerificationClientExtraIntent", intent);
        uwf.a(new wnd(this, intent2, 2));
        if (!intent.getBooleanExtra("EXPECT_EXTERNAL_APP_UI", false)) {
            finish();
        }
    }
}
