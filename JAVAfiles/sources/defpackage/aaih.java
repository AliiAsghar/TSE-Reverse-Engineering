package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaih implements aaim {
    public final ShareIntentActivity a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final apwt f;
    public final armf g;
    public final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private MessageCoreData l;

    public aaih(ShareIntentActivity shareIntentActivity, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, apwt apwtVar, armf armfVar7, armf armfVar8, armf armfVar9) {
        this.a = shareIntentActivity;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.i = armfVar5;
        this.j = armfVar6;
        this.f = apwtVar;
        this.g = armfVar7;
        this.h = armfVar8;
        this.k = armfVar9;
    }

    @Override // defpackage.aaim
    public final int a() {
        return R.string.share_intent_activity_label;
    }

    @Override // defpackage.aaim
    public final void b(rru rruVar) {
        boolean z;
        if (qrl.a()) {
            z = rruVar.R();
        } else {
            z = false;
        }
        e(0, new BugleConversationId(rruVar.L()), null, rruVar.F(), z);
        this.a.finish();
    }

    @Override // defpackage.aaim
    public final void c() {
        e(1, InvalidConversationId.a, 2, null, false);
        this.a.finish();
    }

    public final void d(Intent intent) {
        MessageCoreData a = ((rvq) this.i.b()).a(intent);
        this.l = a;
        if (a == null) {
            ((abbu) this.j.b()).k(R.string.attachment_load_failed_dialog_message);
            this.a.setResult(0);
            this.a.finish();
        }
    }

    public final void e(int i, ConversationId conversationId, Integer num, lrf lrfVar, boolean z) {
        boolean A;
        ((kor) this.k.b()).g(mgw.a, 0);
        if (qrl.a()) {
            A = ((qoq) this.e.b()).z(this.a, i, conversationId, null, num, this.l, lrfVar, z);
        } else {
            A = ((qoq) this.e.b()).A(this.a, i, conversationId, num, this.l, lrfVar, z);
        }
        if (!A) {
            ((abbu) this.j.b()).k(R.string.attachment_load_failed_dialog_message);
            this.a.setResult(0);
            this.a.finish();
        }
    }
}
