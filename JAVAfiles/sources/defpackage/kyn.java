package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.android.apps.messaging.conversation.badges.BadgesRecyclerView;
import com.google.android.apps.messaging.shared.ui.attachment.MessageAttachmentContainer;
import com.google.android.apps.messaging.ui.common.ListEmptyView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageLinkPreviewView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageTransferView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.message.MessageAttachmentsView;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;
import com.google.android.apps.messaging.ui.conversation.suggestions.shortcuts.SuggestionShortcutView;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewPager;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kyn implements xvx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kyn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [aacr, xuo, java.lang.Object] */
    @Override // defpackage.xvx
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((kyp) this.a).c = (LinearLayout) ((ConversationSuggestionsView) obj).findViewById(R.id.suggestion_list_container);
                return;
            case 1:
                ListEmptyView listEmptyView = (ListEmptyView) obj;
                Object obj2 = this.a;
                kvw kvwVar = (kvw) obj2;
                kvwVar.x(listEmptyView);
                if (kvwVar.aE.equals(uye.ARCHIVED)) {
                    kvw.t(listEmptyView, R.string.archived_conversation_list_empty_text);
                } else if (kvwVar.aE.equals(uye.SPAM_FOLDER)) {
                    kvw.t(listEmptyView, R.string.spam_folder_conversation_list_empty_text_v2);
                } else {
                    kvw.t(listEmptyView, R.string.conversation_list_empty_text);
                }
                if (!((wzp) kvwVar.h.b()).s()) {
                    aksa m = ((ahmn) kvwVar.V.b()).m("HomeFragmentPeer#onEmptyListViewInflated");
                    try {
                        if (((Boolean) ((utz) wzp.a.get()).e()).booleanValue()) {
                            ((wzp) ((kvw) obj2).h.b()).l(amvm.EMPTY_CONVERSATION_LIST_VIEW);
                        } else {
                            ((wzp) ((kvw) obj2).h.b()).h();
                        }
                        kuy.a.o("Conversation list sync not completed, re-trigger sync");
                        m.close();
                    } catch (Throwable th) {
                        try {
                            m.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                listEmptyView.a.setAccessibilityLiveRegion(1);
                return;
            case 2:
                View view = (View) obj;
                TextView textView = (TextView) view.findViewById(R.id.subject_label);
                aacp aacpVar = (aacp) this.a;
                aacpVar.o = textView;
                aacpVar.p = (TextView) view.findViewById(R.id.subject_text);
                return;
            case 3:
                MessageAttachmentsView messageAttachmentsView = (MessageAttachmentsView) obj;
                ?? r0 = this.a;
                ConversationMessageView conversationMessageView = (ConversationMessageView) r0;
                messageAttachmentsView.c(conversationMessageView.e);
                messageAttachmentsView.b = conversationMessageView;
                MessageAttachmentContainer messageAttachmentContainer = messageAttachmentsView.c;
                messageAttachmentContainer.b = r0;
                for (int i = 0; i < messageAttachmentContainer.getChildCount(); i++) {
                    xyl.k(messageAttachmentContainer.getChildAt(i) instanceof ViewGroup);
                    ViewGroup viewGroup = (ViewGroup) messageAttachmentContainer.getChildAt(i);
                    if (viewGroup.getChildAt(0) instanceof AudioAttachmentView) {
                        ((AudioAttachmentView) viewGroup.getChildAt(0)).b(r0);
                    }
                }
                ConversationMessageTransferView conversationMessageTransferView = messageAttachmentsView.d;
                conversationMessageTransferView.b = r0;
                conversationMessageTransferView.a(messageAttachmentsView.a);
                return;
            case 4:
                ija E = ((BadgesRecyclerView) obj).E();
                ConversationMessageView conversationMessageView2 = (ConversationMessageView) this.a;
                Stream flatMap = Collection.EL.stream(conversationMessageView2.I).flatMap(new zkf(16));
                int i2 = alog.d;
                E.a((alog) flatMap.collect(alls.a), (alor) conversationMessageView2.ad.a);
                return;
            case 5:
                SuggestionShortcutView suggestionShortcutView = (SuggestionShortcutView) obj;
                ConversationMessageView conversationMessageView3 = (ConversationMessageView) this.a;
                alog alogVar = conversationMessageView3.u;
                if (alogVar != null && !alogVar.isEmpty()) {
                    suggestionShortcutView.E().a(conversationMessageView3.u, conversationMessageView3.s, conversationMessageView3.e.u());
                    return;
                }
                return;
            case 6:
                ConversationMessageLinkPreviewView conversationMessageLinkPreviewView = (ConversationMessageLinkPreviewView) obj;
                ConversationMessageView conversationMessageView4 = (ConversationMessageView) this.a;
                conversationMessageLinkPreviewView.o = conversationMessageView4;
                conversationMessageLinkPreviewView.p = conversationMessageView4.g;
                return;
            default:
                MediaViewPager mediaViewPager = (MediaViewPager) obj;
                aaxd aaxdVar = (aaxd) this.a;
                mediaViewPager.d(new aaxe(aaxdVar));
                mediaViewPager.i(aaxdVar.x);
                return;
        }
    }
}
