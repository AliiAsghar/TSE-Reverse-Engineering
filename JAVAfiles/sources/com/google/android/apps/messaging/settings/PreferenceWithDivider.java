package com.google.android.apps.messaging.settings;

import android.content.Context;
import androidx.preference.Preference;
import defpackage.gfx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PreferenceWithDivider extends Preference {
    public PreferenceWithDivider(Context context) {
        super(context);
    }

    @Override // androidx.preference.Preference
    public final void a(gfx gfxVar) {
        super.a(gfxVar);
        gfxVar.u = true;
    }
}
