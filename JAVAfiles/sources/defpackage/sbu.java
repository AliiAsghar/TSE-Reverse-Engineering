package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sbu extends agoz {
    public sbu(agpf agpfVar) {
        super(agpfVar);
    }

    @Override // defpackage.agoz
    protected final Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put("message_replies_view.message_id_message_replies", "message_replies.message_id");
        hashMap.put("message_replies_view._id_messages", "messages._id");
        hashMap.put("message_replies_view.received_timestamp_messages", "messages.received_timestamp");
        hashMap.put("message_replies_view._id_participants", "participants._id");
        hashMap.put("message_replies_view.sub_id_participants", "participants.sub_id");
        hashMap.put("message_replies_view.normalized_destination_participants", "participants.normalized_destination");
        hashMap.put("message_replies_view.display_destination_participants", "participants.display_destination");
        hashMap.put("message_replies_view.full_name_participants", "participants.full_name");
        hashMap.put("message_replies_view.first_name_participants", "participants.first_name");
        hashMap.put("message_replies_view._id_parts", "parts._id");
        hashMap.put("message_replies_view.text_parts", "parts.text");
        hashMap.put("message_replies_view.uri_parts", "parts.uri");
        hashMap.put("message_replies_view.content_type_parts", "parts.content_type");
        hashMap.put("message_replies_view.file_name_parts", "parts.file_name");
        hashMap.put("message_replies_view.duration_parts", "parts.duration");
        hashMap.put("message_replies_view.parts__ROWID_parts", "parts.parts__ROWID");
        hashMap.put("message_replies_view.trigger_url_link_preview", "link_preview.trigger_url");
        hashMap.put("message_replies_view.expiration_time_millis_link_preview", "link_preview.expiration_time_millis");
        hashMap.put("message_replies_view.link_title_link_preview", "link_preview.link_title");
        hashMap.put("message_replies_view.link_image_url_link_preview", "link_preview.link_image_url");
        hashMap.put("message_replies_view.link_preview_failed_link_preview", "link_preview.link_preview_failed");
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final boolean b() {
        return true;
    }

    @Override // defpackage.agoz
    protected final String[] c() {
        return d.aN();
    }

    @Override // defpackage.agoz
    protected final String[] d() {
        return d.aN();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final /* synthetic */ agmq e(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar) {
        return new lbz(agnwVar, cursor, strArr, agpjVarArr, agoxVar, akkwVar, this, 9);
    }
}
