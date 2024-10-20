package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ser extends agpc {
    public ser(String[] strArr) {
        super("verified_sms_senders LEFT JOIN verified_sms_brands ON (verified_sms_brands.brand_id=verified_sms_senders.brand_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final seq b() {
        l();
        return new seq(this.a.b());
    }
}
