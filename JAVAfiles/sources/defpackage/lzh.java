package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class lzh extends aiua {
    private static void aP(Preference preference) {
        preference.Z();
        preference.aa();
        if (preference instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            for (int i = 0; i < preferenceGroup.k(); i++) {
                aP(preferenceGroup.o(i));
            }
        }
    }

    @Override // defpackage.cg
    public void ag(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen d;
        this.am.k(bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (d = d()) != null) {
            d.x(bundle2);
        }
        if (this.d) {
            fS();
        }
        this.e = true;
        RecyclerView recyclerView = this.c;
        recyclerView.setImportantForAccessibility(2);
        recyclerView.aL(new lzg());
        if (ba()) {
            recyclerView.setOnApplyWindowInsetsListener(new abbl(new lze(2)));
        }
    }

    protected boolean ba() {
        return true;
    }

    @Override // defpackage.gfl
    public final void r(PreferenceScreen preferenceScreen) {
        gfu gfuVar;
        PreferenceScreen preferenceScreen2;
        if (preferenceScreen != null) {
            aP(preferenceScreen);
        }
        if (preferenceScreen != null && preferenceScreen != (preferenceScreen2 = (gfuVar = this.b).b)) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.D();
            }
            gfuVar.b = preferenceScreen;
            this.d = true;
            if (this.e && !this.ah.hasMessages(1)) {
                this.ah.obtainMessage(1).sendToTarget();
            }
        }
    }
}
