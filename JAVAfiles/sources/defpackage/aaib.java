package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.ui.conversationlist.ForwardMessageActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaib implements aaim {
    public final ForwardMessageActivity a;
    public final armf b;
    public MessageCoreData c;
    public IncomingDraft d;
    public boolean e;
    private final armf f;
    private final armf g;

    public aaib(ForwardMessageActivity forwardMessageActivity, armf armfVar, armf armfVar2, armf armfVar3) {
        this.a = forwardMessageActivity;
        this.f = armfVar;
        this.g = armfVar2;
        this.b = armfVar3;
    }

    private final void d(int i, ConversationId conversationId, Integer num, lrf lrfVar, boolean z) {
        boolean A;
        if (qrl.a()) {
            A = ((qoq) this.f.b()).z(this.a, i, conversationId, this.d, num, this.c, lrfVar, z);
        } else {
            A = ((qoq) this.f.b()).A(this.a, i, conversationId, num, this.c, lrfVar, z);
        }
        if (!A) {
            ((abbu) this.g.b()).k(R.string.attachment_load_failed_dialog_message);
            this.a.setResult(0);
            this.a.finish();
        }
    }

    @Override // defpackage.aaim
    public final int a() {
        if (((ohi) this.b.b()).a() && this.e) {
            return R.string.select_recipient_label;
        }
        return R.string.forward_activity_label;
    }

    @Override // defpackage.aaim
    public final void b(rru rruVar) {
        boolean z;
        if (qrl.a()) {
            z = rruVar.R();
        } else {
            z = false;
        }
        d(0, rruVar.J(), null, rruVar.F(), z);
    }

    @Override // defpackage.aaim
    public final void c() {
        d(1, InvalidConversationId.a, 2, null, false);
    }
}
