package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sbh extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(MessageIdType messageIdType) {
        U(new agmd("messages._id", 1, Long.valueOf(rvc.a(messageIdType))));
    }

    public final void c() {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 30010) {
            agnc.t("is_hidden", intValue);
        }
        U(new agoi("messages.is_hidden", 1, 0));
    }

    public final void d(long j) {
        U(new agoi("messages.received_timestamp", 9, Long.valueOf(j)));
    }

    public final void e(Iterable iterable) {
        U(new agmf("messages.message_status", 3, X(iterable), true));
    }

    public final void f(int i) {
        U(new agoi("messages.message_status", 2, Integer.valueOf(i)));
    }
}
