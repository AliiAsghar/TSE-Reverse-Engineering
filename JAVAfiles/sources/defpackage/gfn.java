package defpackage;

import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfn implements gfb {
    final /* synthetic */ PreferenceGroup a;
    final /* synthetic */ gfp b;

    public gfn(gfp gfpVar, PreferenceGroup preferenceGroup) {
        this.b = gfpVar;
        this.a = preferenceGroup;
    }

    @Override // defpackage.gfb
    public final boolean a(Preference preference) {
        this.a.ac(Integer.MAX_VALUE);
        this.b.G();
        return true;
    }
}
