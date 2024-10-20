package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.messaging.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrh extends View.AccessibilityDelegate {
    final /* synthetic */ zri a;

    public zrh(zri zriVar) {
        this.a = zriVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        int i;
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 2) {
            accessibilityEvent.getText().clear();
            if (this.a.Y()) {
                if (true != this.a.ag()) {
                    i = R.string.send_button_long_click_description_no_sim_selector;
                } else {
                    i = R.string.send_button_long_click_description_with_sim_selector;
                }
            } else if (this.a.ag()) {
                i = R.string.send_button_long_click_description_with_sim_selector_in_widget;
            } else {
                i = 0;
            }
            if (i != 0) {
                accessibilityEvent.getText().add(this.a.ar.getResources().getText(i));
                accessibilityEvent.setEventType(16384);
            }
        }
    }
}
