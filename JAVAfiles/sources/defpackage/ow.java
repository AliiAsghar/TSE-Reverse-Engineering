package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ow implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ow(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        mh mhVar;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i >= 0) {
                    String charSequence = ((ListPreference) this.a).h[i].toString();
                    if (!charSequence.equals(((ListPreference) this.a).i) && ((Preference) this.a).Q(charSequence)) {
                        ((ListPreference) this.a).o(charSequence);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i != -1 && (mhVar = ((nd) this.a).e) != null) {
                mhVar.a = false;
                return;
            }
            return;
        }
        ((SearchView) this.a).onItemSelected(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
