package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class swj extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(MessageIdType messageIdType) {
        U(new agmd("message_send_receive_attempt.message_id", 1, Long.valueOf(rvc.a(messageIdType))));
    }
}
