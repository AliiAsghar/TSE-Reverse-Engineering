package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajmw implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajmw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        if (this.b != 0) {
            ((agso) this.a).f(z);
            return;
        }
        ajmy ajmyVar = (ajmy) this.a;
        AutoCompleteTextView autoCompleteTextView = ajmyVar.a;
        if (autoCompleteTextView != null && !ajgl.m(autoCompleteTextView)) {
            CheckableImageButton checkableImageButton = ajmyVar.h;
            int i = 1;
            if (true == z) {
                i = 2;
            }
            checkableImageButton.setImportantForAccessibility(i);
        }
    }
}
