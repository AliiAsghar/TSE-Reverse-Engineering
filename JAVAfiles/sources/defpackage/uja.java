package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uja implements uiz {
    public final uiz a;

    public uja(ujc ujcVar) {
        this.a = ujcVar;
    }

    public final void a(MessagePartCoreData messagePartCoreData, uji... ujiVarArr) {
        messagePartCoreData.getClass();
        Uri v = messagePartCoreData.v();
        v.getClass();
        ConversationIdType z = messagePartCoreData.z();
        CoreBuglePartialMessageId coreBuglePartialMessageId = new CoreBuglePartialMessageId(messagePartCoreData.A(), Long.parseLong(messagePartCoreData.Z()));
        ((ujc) this.a).b(z, coreBuglePartialMessageId, v, messagePartCoreData.p(), ujiVarArr);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final boolean b(String str) {
        return ((ujc) this.a).e.a.containsKey(Uri.parse(str));
    }
}
