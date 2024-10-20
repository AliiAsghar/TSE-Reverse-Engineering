package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sgy extends agmh {
    public sgy(agmk agmkVar) {
        super(agmkVar);
    }

    @Override // defpackage.agmh
    public final /* synthetic */ agoz a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = shd.a;
        } else {
            alob alobVar = new alob();
            alobVar.h("cms_dead_letter_queue._id");
            alobVar.h("cms_dead_letter_queue.cms_id");
            alobVar.h("cms_dead_letter_queue.cms_data_type");
            alobVar.h("cms_dead_letter_queue.abandoned_action");
            alobVar.h("cms_dead_letter_queue.failure_reason");
            if (valueOf.intValue() >= 57090) {
                alobVar.h("cms_dead_letter_queue.bugle_table_type");
            }
            if (valueOf.intValue() >= 57090) {
                alobVar.h("cms_dead_letter_queue.bugle_id");
            }
            if (valueOf.intValue() >= 57090) {
                alobVar.h("cms_dead_letter_queue.cms_backup_parameters");
            }
            if (valueOf.intValue() >= 57090) {
                alobVar.h("cms_dead_letter_queue.backup_flags");
            }
            if (valueOf.intValue() >= 57090) {
                alobVar.h("cms_dead_letter_queue.backup_dependency_table_type");
            }
            if (valueOf.intValue() >= 57090) {
                alobVar.h("cms_dead_letter_queue.backup_dependency_bugle_id");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new shc(strArr).b();
    }
}
