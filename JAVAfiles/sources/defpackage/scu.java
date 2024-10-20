package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class scu extends agpc {
    public scu(String[] strArr) {
        super("messages INNER JOIN messages AS b", strArr, null, "%TIMESTAMP_COLUMN_VAL% %ORDER_DIRECTION%, messages._id %ORDER_DIRECTION%", "messages.conversation_id=%CONVERSATION_ID% AND %EXCLUDE_DRAFTS% AND messages.is_hidden <> 1  AND messages.message_status <> 16", "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sct b() {
        l();
        return new sct(this.a.b());
    }
}
