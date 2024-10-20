package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvt implements ieb {
    public final Context a;
    public final ConversationId b;
    public final zap c;
    public final ico d;
    private final arpi e;
    private final arwe f;
    private final iek g;

    public zvt(Context context, arpi arpiVar, arwe arweVar, ConversationId conversationId, zap zapVar, ico icoVar, iek iekVar) {
        context.getClass();
        arpiVar.getClass();
        arweVar.getClass();
        conversationId.getClass();
        icoVar.getClass();
        iekVar.getClass();
        this.a = context;
        this.e = arpiVar;
        this.f = arweVar;
        this.b = conversationId;
        this.c = zapVar;
        this.d = icoVar;
        this.g = iekVar;
    }

    @Override // defpackage.ieb
    public final ascv a() {
        zap zapVar = this.c;
        return akec.a(armd.n(new qkk(zapVar.b, zapVar, 19), this.e), this.f, new zty(this, 3, (short[]) null));
    }

    @Override // defpackage.ieb
    public final boolean b() {
        return true;
    }

    public final void c(ResolvedRecipient resolvedRecipient, int i) {
        amzu amzuVar;
        if (i == 4) {
            amzuVar = amzu.DISMISSED_WARNING_BANNER;
        } else {
            amzuVar = amzu.REPORTED_NOT_SPAM;
        }
        qjh.l(this.f, this.e, new wiu(this, resolvedRecipient, amzuVar, (arpe) null, 16), 2);
        this.g.a("spam_banner", iel.b);
    }
}
