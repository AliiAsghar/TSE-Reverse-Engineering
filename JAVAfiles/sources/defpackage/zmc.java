package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.settings.PreferenceWithDivider;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmc {
    public static final alwo a = alwo.o("Bugle");
    public final ajwt b;
    public final lzh c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final HashMap h = new HashMap();
    public final akgh i = new a();
    public PreferenceScreen j;
    public final armf k;

    public zmc(ajwt ajwtVar, zmb zmbVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.b = ajwtVar;
        this.c = zmbVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.k = armfVar5;
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class a implements akgh<List<zma>> {
        public a() {
        }

        @Override // defpackage.akgh
        public final void a(Throwable th) {
            ((alwl) ((alwl) ((alwl) zmc.a.i()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/SimSelectionSettingsFragmentPeer$OnLoadSettingsCallback", "onError", (char) 140, "SimSelectionSettingsFragmentPeer.java")).q("Error getting sim settings data");
        }

        @Override // defpackage.akgh
        public final /* synthetic */ void c(Object obj) {
            for (zma zmaVar : (List) obj) {
                if (zmc.this.h.containsKey(Integer.valueOf(zmaVar.a))) {
                    zmc zmcVar = zmc.this;
                    int i = zmaVar.a;
                    PreferenceScreen preferenceScreen = zmcVar.j;
                    Preference preference = (Preference) zmcVar.h.get(Integer.valueOf(i));
                    hwr.i(preference);
                    preferenceScreen.af(preference);
                }
                PreferenceWithDivider preferenceWithDivider = new PreferenceWithDivider(zmc.this.j.j);
                preferenceWithDivider.Z();
                preferenceWithDivider.aa();
                boolean booleanValue = ((Boolean) new mss(12).get()).booleanValue();
                msh mshVar = zmaVar.c;
                SpannableString spannableString = new SpannableString(((msk) zmc.this.k.b()).i(mshVar, !booleanValue).G(booleanValue).toString());
                if (!TextUtils.equals(spannableString, zmc.this.j.j.getString(R.string.sim_settings_unknown_number))) {
                    spannableString = ((xwr) zmc.this.g.b()).a(mshVar);
                }
                preferenceWithDivider.M(zmaVar.b);
                preferenceWithDivider.n(spannableString);
                preferenceWithDivider.t = ((lzv) zmc.this.f.b()).k(zmc.this.j.j, zmaVar.a, zmaVar.b);
                preferenceWithDivider.Z();
                preferenceWithDivider.aa();
                zmc.this.j.ae(preferenceWithDivider);
                zmc.this.h.put(Integer.valueOf(zmaVar.a), preferenceWithDivider);
            }
        }

        @Override // defpackage.akgh
        public final /* synthetic */ void b() {
        }
    }
}
