package com.google.android.apps.messaging.ui.appsettings;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.aabr;
import defpackage.bd;
import defpackage.iix;
import defpackage.ksm;
import defpackage.mho;
import defpackage.yig;
import defpackage.zii;
import defpackage.zin;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FederatedLearningSettingsActivity extends zin {
    public ksm G;
    public mho H;

    @Override // defpackage.lzf
    protected final Integer D() {
        return Integer.valueOf(R.id.federated_learning_settings_container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lzf, defpackage.zgv, defpackage.zgu, defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setStatusBarColor(0);
        TextView textView = (TextView) findViewById(R.id.federated_learning_preference_fragment_container_text_view);
        String str = (String) yig.B.e();
        if (!TextUtils.isEmpty(str)) {
            textView.setOnClickListener(new iix(this, str, 16));
        }
        SpannableStringBuilder ad = aabr.ad(this, R.string.federated_learning_preference_info_text);
        textView.setText(ad);
        textView.setContentDescription(ad.toString());
        bd bdVar = new bd(a());
        bdVar.z(R.id.federated_learning_preference_fragment_container, new zii());
        bdVar.i();
    }

    @Override // defpackage.lzf
    protected final int z() {
        return R.layout.federated_learning_settings_activity_gm3;
    }
}
