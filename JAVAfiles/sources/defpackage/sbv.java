package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sbv extends agpc {
    public sbv(String[] strArr) {
        super("messages LEFT JOIN message_replies_view ON (%REPLIES_VIEW_JOIN%)", strArr, null, null, "message_status = 3", "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sbu b() {
        l();
        return new sbu(this.a.b());
    }
}
