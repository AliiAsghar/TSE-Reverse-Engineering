package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sqo extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(MessageIdType messageIdType) {
        U(new agmd("flagged_messages.flagged_message_id", 1, Long.valueOf(rvc.a(messageIdType))));
    }

    public final void c(Iterable iterable) {
        alob alobVar = new alob();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            alobVar.h(String.valueOf(rvc.a((MessageIdType) it.next())));
        }
        U(new agmf("flagged_messages.flagged_message_id", 3, X(alobVar.g()), true));
    }

    public final void d(tqg tqgVar) {
        int ordinal;
        if (tqgVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqgVar.ordinal();
        }
        U(new agoi("flagged_messages.flagging_reason", 1, Integer.valueOf(ordinal)));
    }
}
