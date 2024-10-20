package defpackage;

import android.view.View;
import com.google.android.apps.messaging.conversation.messagelist.MessageListRecyclerView;
import com.google.android.apps.messaging.ui.appsettings.RcsMultiSimStatusCheckboxView;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.message.ClickFixingEmojiAppCompatTextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkh implements aklp {
    final /* synthetic */ View a;
    private final /* synthetic */ int b;

    public zkh(View view, int i) {
        this.b = i;
        this.a = view;
    }

    @Override // defpackage.aklp
    public final void a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ClickFixingEmojiAppCompatTextView clickFixingEmojiAppCompatTextView = (ClickFixingEmojiAppCompatTextView) this.a;
                    clickFixingEmojiAppCompatTextView.a = (aacd) obj;
                    clickFixingEmojiAppCompatTextView.a.b = clickFixingEmojiAppCompatTextView;
                    return;
                } else {
                    ComposeMessageView composeMessageView = (ComposeMessageView) this.a;
                    composeMessageView.d = (zrb) obj;
                    composeMessageView.d.a = composeMessageView;
                    return;
                }
            }
            MessageListRecyclerView messageListRecyclerView = (MessageListRecyclerView) this.a;
            messageListRecyclerView.ab = (itf) obj;
            messageListRecyclerView.ab.b = messageListRecyclerView;
            return;
        }
        RcsMultiSimStatusCheckboxView rcsMultiSimStatusCheckboxView = (RcsMultiSimStatusCheckboxView) this.a;
        rcsMultiSimStatusCheckboxView.a = (zki) obj;
        rcsMultiSimStatusCheckboxView.a.d = rcsMultiSimStatusCheckboxView;
    }
}
