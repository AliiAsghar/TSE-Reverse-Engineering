package defpackage;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.scheduledsend.conversation.ConversationScheduledMessageToggleView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageBubbleView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irp extends ecl {
    final /* synthetic */ irq a;

    public irp(irq irqVar) {
        this.a = irqVar;
    }

    @Override // defpackage.ecl
    public final void c(View view, efx efxVar) {
        alog alogVar;
        CharSequence charSequence;
        super.c(view, efxVar);
        irq irqVar = this.a;
        irqVar.e = true;
        if (((view instanceof ConversationMessageView) || (view instanceof ConversationMessageBubbleView)) && (alogVar = irqVar.f) != null) {
            int size = alogVar.size();
            for (int i = 0; i < size; i++) {
                MenuItem menuItem = (MenuItem) alogVar.get(i);
                if (menuItem.getTitle() != null) {
                    charSequence = menuItem.getTitle();
                } else {
                    charSequence = "";
                }
                int itemId = menuItem.getItemId();
                charSequence.getClass();
                efxVar.h(new efw(itemId, charSequence));
            }
        }
        if (view instanceof ConversationScheduledMessageToggleView) {
            efxVar.h(new efw(16, view.getResources().getString(R.string.toggle_view_expand_action)));
        }
    }

    @Override // defpackage.ecl
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768 && (viewGroup instanceof ConversationMessageView)) {
            irq irqVar = this.a;
            if (irqVar.e) {
                irqVar.e = false;
            } else {
                akrc b = irqVar.d.b("ConversationMessageView_sendAccessibilityEvent");
                try {
                    aktp.L(new irn((ConversationMessageView) viewGroup), viewGroup);
                    b.close();
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return super.h(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.ecl
    public final boolean i(View view, int i, Bundle bundle) {
        boolean test;
        if ((view instanceof ConversationMessageView) || (view instanceof ConversationMessageBubbleView)) {
            irq irqVar = this.a;
            if (irqVar.f != null) {
                test = irqVar.c.test(i);
                if (!test && !super.i(view, i, bundle)) {
                    return false;
                }
                return true;
            }
        }
        return super.i(view, i, bundle);
    }
}
