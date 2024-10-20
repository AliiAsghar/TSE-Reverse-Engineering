package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gev extends gff {
    public int ag;
    private CharSequence[] ah;
    private CharSequence[] ai;

    private final ListPreference aS() {
        return (ListPreference) aR();
    }

    @Override // defpackage.gff
    public final void aN(boolean z) {
        int i;
        if (z && (i = this.ag) >= 0) {
            String charSequence = this.ai[i].toString();
            ListPreference aS = aS();
            if (aS.Q(charSequence)) {
                aS.o(charSequence);
            }
        }
    }

    @Override // defpackage.gff
    protected final void eT(eu euVar) {
        euVar.f(this.ah, this.ag, new ivs(this, 1, null));
        euVar.i(null, null);
    }

    @Override // defpackage.gff, defpackage.bw, defpackage.cg
    public final void g(Bundle bundle) {
        super.g(bundle);
        if (bundle == null) {
            ListPreference aS = aS();
            if (aS.g != null && aS.h != null) {
                this.ag = aS.k(aS.i);
                this.ah = aS.g;
                this.ai = aS.h;
                return;
            }
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.ag = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.ah = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.ai = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // defpackage.gff, defpackage.bw, defpackage.cg
    public final void j(Bundle bundle) {
        super.j(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.ag);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.ah);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.ai);
    }
}
