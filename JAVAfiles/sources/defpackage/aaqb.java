package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.messaging.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqb extends View.AccessibilityDelegate {
    final /* synthetic */ aaqc a;

    public aaqb(aaqc aaqcVar) {
        this.a = aaqcVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.c2o_accessibility_category_offset);
            aaqc aaqcVar = this.a;
            aaqcVar.g.a(aaqcVar.j, dimensionPixelSize);
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
