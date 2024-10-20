package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gey extends gff {
    final Set ag = new HashSet();
    boolean ah;
    CharSequence[] ai;
    CharSequence[] aj;

    private final MultiSelectListPreference aS() {
        return (MultiSelectListPreference) aR();
    }

    @Override // defpackage.gff
    public final void aN(boolean z) {
        if (z && this.ah) {
            MultiSelectListPreference aS = aS();
            if (aS.Q(this.ag)) {
                aS.k(this.ag);
            }
        }
        this.ah = false;
    }

    @Override // defpackage.gff
    protected final void eT(eu euVar) {
        int length = this.aj.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.ag.contains(this.aj[i].toString());
        }
        CharSequence[] charSequenceArr = this.ai;
        gex gexVar = new gex(this);
        er erVar = euVar.a;
        erVar.q = charSequenceArr;
        erVar.y = gexVar;
        erVar.u = zArr;
        erVar.v = true;
    }

    @Override // defpackage.gff, defpackage.bw, defpackage.cg
    public final void g(Bundle bundle) {
        super.g(bundle);
        if (bundle == null) {
            MultiSelectListPreference aS = aS();
            if (aS.g != null && aS.h != null) {
                this.ag.clear();
                this.ag.addAll(aS.i);
                this.ah = false;
                this.ai = aS.g;
                this.aj = aS.h;
                return;
            }
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.ag.clear();
        this.ag.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.ah = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.ai = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.aj = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // defpackage.gff, defpackage.bw, defpackage.cg
    public final void j(Bundle bundle) {
        super.j(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.ag));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.ah);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.ai);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.aj);
    }
}
