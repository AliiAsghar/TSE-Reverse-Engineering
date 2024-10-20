package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sdm extends agmh {
    public sdm(agmk agmkVar) {
        super(agmkVar);
    }

    @Override // defpackage.agmh
    public final /* synthetic */ agoz a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = sdp.a;
        } else {
            alob alobVar = new alob();
            alobVar.h("message_replies_view.message_id_message_replies");
            alobVar.h("message_replies_view._id_messages");
            alobVar.h("message_replies_view.received_timestamp_messages");
            alobVar.h("message_replies_view._id_participants");
            alobVar.h("message_replies_view.sub_id_participants");
            alobVar.h("message_replies_view.normalized_destination_participants");
            alobVar.h("message_replies_view.display_destination_participants");
            alobVar.h("message_replies_view.full_name_participants");
            alobVar.h("message_replies_view.first_name_participants");
            alobVar.h("message_replies_view._id_parts");
            alobVar.h("message_replies_view.text_parts");
            alobVar.h("message_replies_view.uri_parts");
            alobVar.h("message_replies_view.content_type_parts");
            if (valueOf.intValue() >= 26000) {
                alobVar.h("message_replies_view.file_name_parts");
            }
            if (valueOf.intValue() >= 26040) {
                alobVar.h("message_replies_view.duration_parts");
            }
            alobVar.h("message_replies_view.trigger_url_link_preview");
            alobVar.h("message_replies_view.expiration_time_millis_link_preview");
            alobVar.h("message_replies_view.link_title_link_preview");
            alobVar.h("message_replies_view.link_image_url_link_preview");
            if (valueOf.intValue() >= 22020) {
                alobVar.h("message_replies_view.link_preview_failed_link_preview");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new sdo(strArr).b();
    }
}
