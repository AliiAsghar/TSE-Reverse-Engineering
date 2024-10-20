package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class szg extends agmh {
    public szg(agmk agmkVar) {
        super(agmkVar);
    }

    @Override // defpackage.agmh
    public final /* synthetic */ agoz a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = szl.a;
        } else {
            alob alobVar = new alob();
            alobVar.h("p2p_conversation_suggestion_event.id");
            if (valueOf.intValue() >= 51030) {
                alobVar.h("p2p_conversation_suggestion_event.message_id");
            }
            alobVar.h("p2p_conversation_suggestion_event.timestamp");
            alobVar.h("p2p_conversation_suggestion_event.event_type");
            alobVar.h("p2p_conversation_suggestion_event.reply_mode");
            alobVar.h("p2p_conversation_suggestion_event.rejection_reason");
            alobVar.h("p2p_conversation_suggestion_event.action_source");
            alobVar.h("p2p_conversation_suggestion_event.num_of_items");
            alobVar.h("p2p_conversation_suggestion_event.click_index");
            alobVar.h("p2p_conversation_suggestion_event.impression_id");
            alobVar.h("p2p_conversation_suggestion_event.suggestion_types");
            if (valueOf.intValue() >= 42030) {
                alobVar.h("p2p_conversation_suggestion_event.model_output_label");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new szk(strArr).b();
    }
}
