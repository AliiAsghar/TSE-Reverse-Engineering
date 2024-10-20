package defpackage;

import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.analytics.consent.LoggingConsentSettingsActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibh implements ibg {
    @Override // defpackage.ibg
    public final void a(gfl gflVar, Optional optional) {
        if (optional.isPresent()) {
            ((Preference) optional.get()).L(R.string.logging_consent_settings_screen_title);
            ((Preference) optional.get()).t = lqn.f(gflVar.y(), LoggingConsentSettingsActivity.class, "android.intent.action.VIEW").a();
        }
    }
}
