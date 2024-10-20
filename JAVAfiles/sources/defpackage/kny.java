package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kny extends ContentObserver {
    final /* synthetic */ Context a;
    final /* synthetic */ knz b;
    final /* synthetic */ jxv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kny(knz knzVar, Context context, jxv jxvVar) {
        super(null);
        this.a = context;
        this.c = jxvVar;
        this.b = knzVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        MessageCoreData q;
        if (this.b.d.getCount() != 0 || this.b.f.getCount() != 0) {
            if (uri != null && uri.getPathSegments().size() == upb.o(this.a).getPathSegments().size() + 2) {
                knl h = this.c.h();
                h.H("messageObserver:");
                h.H("checking change from uri");
                h.H(uri);
                h.q();
                MessageIdType b = rvc.b(uri.getLastPathSegment());
                knz knzVar = this.b;
                MessageCoreData messageCoreData = null;
                if (!b.b() && (q = ((rwd) knzVar.b.b()).q(b)) != null) {
                    ConversationIdType z2 = q.z();
                    String am = q.am();
                    if (am != null && am.equals(knzVar.c.am())) {
                        knl h2 = knzVar.i.h();
                        h2.H("found message");
                        h2.z("conversationId", z2);
                        h2.z("messageId", b);
                        h2.z("messageText", am);
                        h2.z("messageStatus", qkv.a(q.j()));
                        h2.q();
                        if (!z2.equals(knzVar.c.z())) {
                            knzVar.i.j("message found in an incorrect conversation");
                        }
                    }
                    messageCoreData = q;
                }
                if (messageCoreData != null) {
                    int j = messageCoreData.j();
                    if (MessageData.cx(j)) {
                        this.b.g = messageCoreData;
                        if (rvx.h(j)) {
                            this.b.f.countDown();
                            return;
                        }
                        return;
                    }
                    this.b.e = messageCoreData;
                    if (rvx.v(j)) {
                        this.b.d.countDown();
                        return;
                    }
                    return;
                }
                knl g = this.c.g();
                g.H("messageObserver:");
                g.H("unable to find message from bugle db");
                g.z("messageId", b);
                g.q();
                return;
            }
            knl h3 = this.c.h();
            h3.H("skipping");
            h3.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            h3.q();
        }
    }
}
