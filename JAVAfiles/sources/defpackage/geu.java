package defpackage;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class geu implements gfd {
    public static geu a;
    public static geu b;
    private final /* synthetic */ int c;

    public geu(int i) {
        this.c = i;
    }

    @Override // defpackage.gfd
    public final /* synthetic */ CharSequence a(Preference preference) {
        if (this.c != 0) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            if (TextUtils.isEmpty(editTextPreference.g)) {
                return editTextPreference.j.getString(R.string.not_set);
            }
            return editTextPreference.g;
        }
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(listPreference.l())) {
            return listPreference.j.getString(R.string.not_set);
        }
        return listPreference.l();
    }
}
