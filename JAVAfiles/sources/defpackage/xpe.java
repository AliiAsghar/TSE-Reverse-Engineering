package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xpe extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(MessageIdType messageIdType) {
        U(new agmd("file_transfer.message_id", 1, Long.valueOf(rvc.a(messageIdType))));
    }

    public final void c(String str) {
        U(new agmd("file_transfer.transfer_id", 1, String.valueOf(str)));
    }

    public final void d(xpg xpgVar) {
        int ordinal;
        if (xpgVar == null) {
            ordinal = 0;
        } else {
            ordinal = xpgVar.ordinal();
        }
        U(new agoi("file_transfer.transfer_type", 1, Integer.valueOf(ordinal)));
    }
}
