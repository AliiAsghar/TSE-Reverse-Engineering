package defpackage;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ger extends gff {
    private EditText ag;
    private CharSequence ah;
    private final Runnable ai = new fyk(this, 8, null);
    private long aj = -1;

    private final EditTextPreference aS() {
        return (EditTextPreference) aR();
    }

    private final void aT(boolean z) {
        long j;
        if (z) {
            j = SystemClock.currentThreadTimeMillis();
        } else {
            j = -1;
        }
        this.aj = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gff
    public final void aM(View view) {
        super.aM(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.ag = editText;
        if (editText != null) {
            editText.requestFocus();
            this.ag.setText(this.ah);
            EditText editText2 = this.ag;
            editText2.setSelection(editText2.getText().length());
            aS();
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // defpackage.gff
    public final void aN(boolean z) {
        if (z) {
            String obj = this.ag.getText().toString();
            EditTextPreference aS = aS();
            if (aS.Q(obj)) {
                aS.i(obj);
            }
        }
    }

    @Override // defpackage.gff
    protected final void aO() {
        aT(true);
        aP();
    }

    public final void aP() {
        long j = this.aj;
        if (j != -1 && j + 1000 > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.ag;
            if (editText != null && editText.isFocused()) {
                if (((InputMethodManager) this.ag.getContext().getSystemService("input_method")).showSoftInput(this.ag, 0)) {
                    aT(false);
                    return;
                } else {
                    this.ag.removeCallbacks(this.ai);
                    this.ag.postDelayed(this.ai, 50L);
                    return;
                }
            }
            aT(false);
        }
    }

    @Override // defpackage.gff
    protected final boolean aQ() {
        return true;
    }

    @Override // defpackage.gff, defpackage.bw, defpackage.cg
    public final void g(Bundle bundle) {
        super.g(bundle);
        if (bundle == null) {
            this.ah = aS().g;
        } else {
            this.ah = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.gff, defpackage.bw, defpackage.cg
    public final void j(Bundle bundle) {
        super.j(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.ah);
    }
}
