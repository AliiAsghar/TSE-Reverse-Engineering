package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ges extends Preference {
    private long a;

    public ges(Context context, List list, long j) {
        super(context);
        this.y = R.layout.expand_button;
        H(d.f(this.j, R.drawable.ic_arrow_down_24dp));
        this.r = R.drawable.ic_arrow_down_24dp;
        L(R.string.expand_button_title);
        I(999);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        CharSequence charSequence = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence t = preference.t();
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(t)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.A)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(t)) {
                if (charSequence == null) {
                    charSequence = t;
                } else {
                    charSequence = this.j.getString(R.string.summary_collapsed_preference_list, charSequence, t);
                }
            }
        }
        n(charSequence);
        this.a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final void a(gfx gfxVar) {
        super.a(gfxVar);
        gfxVar.u = false;
    }

    @Override // androidx.preference.Preference
    public final long eS() {
        return this.a;
    }
}
