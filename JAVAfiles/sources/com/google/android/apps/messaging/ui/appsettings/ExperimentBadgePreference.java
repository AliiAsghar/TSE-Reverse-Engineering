package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import defpackage.gfx;
import defpackage.zif;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ExperimentBadgePreference extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentBadgePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    @Override // androidx.preference.Preference
    public final void a(gfx gfxVar) {
        gfxVar.getClass();
        super.a(gfxVar);
        View D = gfxVar.D(R.id.experiment_badge);
        D.getClass();
        ((ComposeView) D).a(zif.b);
    }
}
