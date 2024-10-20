package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yoo extends ContentObserver {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ SelfIdentityId b;
    final /* synthetic */ String c;
    final /* synthetic */ yop d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yoo(yop yopVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str) {
        super(null);
        this.a = conversationIdType;
        this.b = selfIdentityId;
        this.c = str;
        this.d = yopVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        synchronized (this.d.i) {
            if (this.d.f.f().toEpochMilli() - this.d.k >= TimeUnit.SECONDS.toMillis(((Integer) yop.a.e()).intValue())) {
                this.d.a(this);
                return;
            }
            if (uri != null && uri.getPathSegments().size() == upb.o(this.d.d).getPathSegments().size() + 2) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment == null) {
                    return;
                }
                MessageCoreData q = ((rwd) this.d.c.b()).q(rvc.b(lastPathSegment));
                if (q != null && q.cw()) {
                    yop yopVar = this.d;
                    String am = q.am();
                    if (am != null && yopVar.l.matcher(am).find()) {
                        this.d.e.b(this.d.h.g(this.a, this.b, this.c), false, tqc.SPAM_FOLDER).t();
                        if (!((Boolean) yop.b.e()).booleanValue()) {
                            this.d.g.c("Bugle.Spam.AutoReply.Counts");
                        }
                        this.d.a(this);
                        return;
                    }
                    this.d.a(this);
                }
            }
        }
    }
}
