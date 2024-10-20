package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.dyv;
import defpackage.gfs;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean e;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, dyv.d(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.e = true;
    }

    @Override // androidx.preference.PreferenceGroup
    public final boolean ad() {
        return false;
    }

    public final void ag() {
        if (!((PreferenceGroup) this).c) {
            this.e = false;
            return;
        }
        throw new IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        gfs gfsVar;
        if (this.t == null && this.u == null && k() != 0 && (gfsVar = this.k.e) != null) {
            gfsVar.aO();
        }
    }
}
