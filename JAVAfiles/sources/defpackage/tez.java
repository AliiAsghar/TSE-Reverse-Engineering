package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tez extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(MessageIdType messageIdType) {
        U(new agmd("read_reports.message_id", 1, Long.valueOf(rvc.a(messageIdType))));
    }

    public final void c(long j) {
        U(new agoi("read_reports.participant_id", 1, Long.valueOf(j)));
    }
}
