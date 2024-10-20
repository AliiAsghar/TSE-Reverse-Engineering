package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sek extends agpc {
    public sek(String[] strArr) {
        super("messages LEFT JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN conversations ON (conversations._id=messages.conversation_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sej b() {
        l();
        return new sej(this.a.b());
    }
}
