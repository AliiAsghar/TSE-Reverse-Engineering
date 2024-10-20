package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcm extends agpc {
    public lcm(String[] strArr) {
        super("message_labels LEFT JOIN messages ON (messages._id=message_labels.message_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lcl b() {
        l();
        return new lcl(this.a.b());
    }
}
