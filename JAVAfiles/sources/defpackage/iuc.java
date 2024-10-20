package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iuc extends agpc {
    public iuc(String[] strArr) {
        super("messages LEFT JOIN message_reactions ON (message_reactions.message_id=messages._id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final iub b() {
        l();
        return new iub(this.a.b());
    }
}
