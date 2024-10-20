package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class skf extends agmh {
    public skf(agmk agmkVar) {
        super(agmkVar);
    }

    @Override // defpackage.agmh
    public final /* synthetic */ agoz a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = skk.a;
        } else {
            alob alobVar = new alob();
            alobVar.h("conversation_labels._id");
            alobVar.h("conversation_labels.conversation_id");
            if (valueOf.intValue() >= 53020) {
                alobVar.h("conversation_labels.label");
            }
            alobVar.h("conversation_labels.message_id");
            if (valueOf.intValue() >= 53010) {
                alobVar.h("conversation_labels.snippet_text");
            }
            if (valueOf.intValue() >= 55040) {
                alobVar.h("conversation_labels.preview_uri");
            }
            if (valueOf.intValue() >= 55040) {
                alobVar.h("conversation_labels.preview_content_type");
            }
            if (valueOf.intValue() >= 57050) {
                alobVar.h("conversation_labels.message_status");
            }
            if (valueOf.intValue() >= 57050) {
                alobVar.h("conversation_labels.read");
            }
            if (valueOf.intValue() >= 57050) {
                alobVar.h("conversation_labels.received_timestamp");
            }
            if (valueOf.intValue() >= 57050) {
                alobVar.h("conversation_labels.message_protocol");
            }
            if (valueOf.intValue() >= 57050) {
                alobVar.h("conversation_labels.raw_telephony_status");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new skj(strArr).b();
    }
}
