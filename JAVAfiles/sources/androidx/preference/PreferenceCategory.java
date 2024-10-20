package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.dyv;
import defpackage.gfx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, dyv.d(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }

    @Override // androidx.preference.Preference
    public final boolean T() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void a(gfx gfxVar) {
        super.a(gfxVar);
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        gfxVar.a.setAccessibilityHeading(true);
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        if (!super.T()) {
            return true;
        }
        return false;
    }
}
