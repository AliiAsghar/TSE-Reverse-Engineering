package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfb implements jcu {
    public final ConversationId a;
    public final asai b;
    public final lkd c;
    private final Context d;
    private final Optional e;
    private final arwe f;
    private final Set g;

    public jfb(Context context, ConversationId conversationId, lkd lkdVar, Optional optional, arwe arweVar) {
        context.getClass();
        conversationId.getClass();
        lkdVar.getClass();
        optional.getClass();
        arweVar.getClass();
        this.d = context;
        this.a = conversationId;
        this.c = lkdVar;
        this.e = optional;
        this.f = arweVar;
        String string = context.getString(R.string.search_action);
        string.getClass();
        this.b = new aghw(new aehz(string, aerb.cG, false, true, optional.isPresent(), false, null, null, qkf.e(new ixz(this, 14), arweVar), 996), 9);
        this.g = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.g;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.b;
    }
}
