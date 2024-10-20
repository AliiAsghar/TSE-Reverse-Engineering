package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sjx extends agmh {
    public sjx(agmk agmkVar) {
        super(agmkVar);
    }

    @Override // defpackage.agmh
    public final /* synthetic */ agoz a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(d.P().W().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = skb.a;
        } else {
            alob alobVar = new alob();
            alobVar.h("conversation_image_parts_view.conversation_id_messages");
            alobVar.h("conversation_image_parts_view.received_timestamp_messages");
            alobVar.h("conversation_image_parts_view.status_messages");
            alobVar.h("conversation_image_parts_view.uri_parts");
            alobVar.h("conversation_image_parts_view.content_type_parts");
            if (valueOf.intValue() >= 10021) {
                alobVar.h("conversation_image_parts_view.original_uri_parts");
            }
            alobVar.h("conversation_image_parts_view.display_destination_participants");
            alobVar.h("conversation_image_parts_view.full_name_participants");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new sjz(strArr).b();
    }
}
