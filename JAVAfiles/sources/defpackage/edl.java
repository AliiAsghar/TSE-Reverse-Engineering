package defpackage;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class edl extends dyg {
    private final View a;

    public edl(View view) {
        this.a = view;
    }

    @Override // defpackage.dyg
    public void c() {
        View view = this.a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
        }
    }

    @Override // defpackage.dyg
    public void d() {
        View view = this.a;
        if (view != null) {
            if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                view = view.getRootView().findFocus();
            } else {
                view.requestFocus();
            }
            if (view == null) {
                view = this.a.getRootView().findViewById(R.id.content);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new ou(view, 14, null));
            }
        }
    }
}
