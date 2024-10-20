package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixw extends ixy {
    public final int a;

    public ixw(int i) {
        this.a = i;
    }

    @Override // defpackage.ixy
    public final int a() {
        return R.dimen.conversation_scroll_to_bottom_button_background_height_in_text_mode_new_messages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ixw) && this.a == ((ixw) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "NewMessages(newMessageCount=" + this.a + ")";
    }
}
