package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sib extends agmh {
    public sib(agmk agmkVar) {
        super(agmkVar);
    }

    @Override // defpackage.agmh
    public final /* synthetic */ agoz a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = sig.a;
        } else {
            alob alobVar = new alob();
            alobVar.h("cms_notifications.cms_id");
            alobVar.h("cms_notifications.cms_last_mod_seq");
            alobVar.h("cms_notifications.cms_correlation_id");
            alobVar.h("cms_notifications.from_address");
            alobVar.h("cms_notifications.to_address");
            alobVar.h("cms_notifications.correlation_text");
            alobVar.h("cms_notifications.modified_at_timestamp");
            if (valueOf.intValue() >= 46040) {
                alobVar.h("cms_notifications.message_received_timestamp");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new sif(strArr).b();
    }
}
