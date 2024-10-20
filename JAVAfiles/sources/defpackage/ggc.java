package defpackage;

import android.widget.CompoundButton;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.material.chip.Chip;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggc implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ggc(TwoStatePreference twoStatePreference, int i) {
        this.b = i;
        this.a = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.a).c;
                            if (onCheckedChangeListener != null) {
                                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                                return;
                            }
                            return;
                        }
                        kuc kucVar = ((kuf) this.a).f;
                        if (kucVar != null) {
                            kucVar.a();
                            return;
                        }
                        return;
                    }
                    kuc kucVar2 = (kuc) this.a;
                    Iterator it = kucVar2.d.iterator();
                    while (it.hasNext()) {
                        ((kuf) it.next()).c.setChecked(z);
                    }
                    kucVar2.a();
                    return;
                }
                if (!((Preference) this.a).Q(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                    return;
                } else {
                    ((TwoStatePreference) this.a).k(z);
                    return;
                }
            }
            if (!((Preference) this.a).Q(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
                return;
            } else {
                ((TwoStatePreference) this.a).k(z);
                return;
            }
        }
        if (!((Preference) this.a).Q(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            ((TwoStatePreference) this.a).k(z);
        }
    }

    public /* synthetic */ ggc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
