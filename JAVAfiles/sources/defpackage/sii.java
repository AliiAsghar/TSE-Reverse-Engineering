package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sii extends agmh {
    public sii(agmk agmkVar) {
        super(agmkVar);
    }

    @Override // defpackage.agmh
    public final /* synthetic */ agoz a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = sim.a;
        } else {
            alob alobVar = new alob();
            alobVar.h("cms_restore_dependency_cache_table._id");
            alobVar.h("cms_restore_dependency_cache_table.dependent_id");
            alobVar.h("cms_restore_dependency_cache_table.dependent_cms_id");
            alobVar.h("cms_restore_dependency_cache_table.dependency_cms_id");
            if (valueOf.intValue() >= 59660) {
                alobVar.h("cms_restore_dependency_cache_table.cms_data_provider_type");
            }
            alobVar.h("cms_restore_dependency_cache_table.payload");
            alobVar.h("cms_restore_dependency_cache_table.inserted_at_timestamp");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new sil(strArr).b();
    }
}
