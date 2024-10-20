package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class siy extends agmh {
    public siy(agmk agmkVar) {
        super(agmkVar);
    }

    @Override // defpackage.agmh
    public final /* synthetic */ agoz a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = sjc.a;
        } else {
            alob alobVar = new alob();
            alobVar.h("cms.key_index");
            alobVar.h("cms.encryption_key");
            alobVar.h("cms.key_type");
            if (valueOf.intValue() >= 42060) {
                alobVar.h("cms.cms_correlation_id");
            }
            if (valueOf.intValue() >= 35020) {
                alobVar.h("cms.cms_id");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new sjb(strArr).b();
    }
}
