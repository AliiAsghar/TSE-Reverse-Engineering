package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tnx extends agpc {
    public tnx(String[] strArr) {
        super("conversation_suggestions INNER JOIN messages ON (messages._id=conversation_suggestions.message_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tnw b() {
        l();
        return new tnw(this.a.b());
    }
}
