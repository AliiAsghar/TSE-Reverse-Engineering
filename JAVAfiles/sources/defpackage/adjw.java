package defpackage;

import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageMetadataView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adjw {
    public Object a;

    public adjw() {
    }

    public final Optional a() {
        return Optional.ofNullable(this.a);
    }

    public final boolean b() {
        acjk acjkVar = (acjk) this.a;
        abhg.m(acjkVar.a);
        if (acjkVar.a.a == 1) {
            return true;
        }
        return false;
    }

    public final abaq c() {
        Object obj = this.a;
        if (obj != null) {
            return new abap((abas) obj);
        }
        throw new IllegalStateException("Missing required properties: reminderDialogData");
    }

    public final void d(abas abasVar) {
        if (abasVar != null) {
            this.a = abasVar;
            return;
        }
        throw new NullPointerException("Null reminderDialogData");
    }

    public final void e(int i, int i2, int i3, int i4) {
        Object obj = this.a;
        if (obj == null) {
            arro.b("messageMetadataView");
            obj = null;
        }
        ((ConversationMessageMetadataView) obj).layout(i, i2, i3, i4);
    }

    public final void f(boolean z, boolean z2) {
        Object obj = this.a;
        if (obj == null) {
            arro.b("messageMetadataView");
            obj = null;
        }
        ((ConversationMessageMetadataView) obj).d(z, z2);
    }

    public adjw(abrm abrmVar) {
        this.a = abrmVar;
    }
}
