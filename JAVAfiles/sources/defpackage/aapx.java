package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aapx extends View.AccessibilityDelegate {
    final /* synthetic */ int a;
    final /* synthetic */ aapy b;

    public aapx(aapy aapyVar, int i) {
        this.a = i;
        this.b = aapyVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.c2o_accessibility_offset);
            aapy aapyVar = this.b;
            int i = this.a;
            aapz aapzVar = aapyVar.d;
            ContentGridView contentGridView = aapzVar.e;
            if (contentGridView != null) {
                contentGridView.a(aapzVar.c, dimensionPixelSize / 2);
                aaqp aaqpVar = aapzVar.d;
                if (aaqpVar != null) {
                    aaqpVar.u(i, dimensionPixelSize);
                }
            }
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
