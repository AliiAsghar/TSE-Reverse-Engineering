package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageLinkPreviewView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ish implements View.OnLongClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ish(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View$OnLongClickListener, java.lang.Object] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View.OnLongClickListener onLongClickListener;
        switch (this.b) {
            case 0:
                ConversationMessageView conversationMessageView = (ConversationMessageView) view.getTag(R.id.conversation_message_view_clickable_tag);
                Object obj = this.a;
                if (conversationMessageView != null) {
                    itb itbVar = (itb) obj;
                    itbVar.z(conversationMessageView);
                    itbVar.I();
                    itbVar.u(conversationMessageView.e);
                    view.performHapticFeedback(0);
                } else {
                    if (!(view instanceof aacl)) {
                        return false;
                    }
                    if (view instanceof ConversationMessageView) {
                        itb itbVar2 = (itb) obj;
                        itbVar2.i();
                        itbVar2.j();
                    } else {
                        ((itb) obj).u(((aacl) view).c());
                    }
                }
                return true;
            case 1:
                AudioAttachmentView audioAttachmentView = (AudioAttachmentView) this.a;
                xuo xuoVar = audioAttachmentView.e;
                if (xuoVar == null) {
                    return false;
                }
                return xuoVar.h(audioAttachmentView);
            case 2:
                utz utzVar = itb.a;
                return this.a.onLongClick(view);
            case 3:
                VCardAttachmentView vCardAttachmentView = (VCardAttachmentView) this.a;
                if (vCardAttachmentView.i != null && vCardAttachmentView.e.g()) {
                    xux xuxVar = vCardAttachmentView.i;
                    xuxVar.d();
                }
                return false;
            case 4:
                ((zpj) this.a).d.performLongClick();
                return true;
            case 5:
                return ((ConversationMessageLinkPreviewView) this.a).r.onLongClick(view);
            case 6:
                Object obj2 = this.a;
                ConversationMessageLinkPreviewView conversationMessageLinkPreviewView = (ConversationMessageLinkPreviewView) obj2;
                if (conversationMessageLinkPreviewView.u.d() || (onLongClickListener = conversationMessageLinkPreviewView.r) == null) {
                    return false;
                }
                onLongClickListener.onLongClick((View) obj2);
                return true;
            default:
                ((ConversationMessageView) this.a).performLongClick();
                return true;
        }
    }
}
