package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tef extends agps {
    public tef() {
        super("rbm_business_info");
    }

    @Override // defpackage.agps
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final agpr a() {
        ac();
        String str = this.c;
        agpt agptVar = this.e;
        return new agpr(str, this.a, this.b, this.d.g(), agptVar.a());
    }

    public final void c(long j) {
        this.a.put(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS, Long.valueOf(j));
    }

    public final void d(String str) {
        agnc.r(this.a, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, str);
    }
}
