package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class stk extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b() {
        U(new agoi("messages_annotations.annotation_type", 2, 8));
    }

    public final void c(MessageIdType messageIdType) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 20040) {
            agnc.t("message_id", intValue);
        }
        U(new agmd("messages_annotations.message_id", 1, Long.valueOf(rvc.a(messageIdType))));
    }
}
