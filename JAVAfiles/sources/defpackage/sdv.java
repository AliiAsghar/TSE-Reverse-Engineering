package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sdv extends agpc {
    public sdv(String[] strArr) {
        super("rbm_business_info LEFT JOIN rbm_business_verifier_info ON (rbm_business_verifier_info.verifier_id=rbm_business_info.verifier_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sdu b() {
        l();
        return new sdu(this.a.b());
    }
}
