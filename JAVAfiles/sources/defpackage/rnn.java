package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rnn implements aglx {
    public static final rnn a = new rnn();
    public static final Map b = aqjn.m(new armo(c("_id"), d("_id")), new armo(c("message_persistence_id"), d("message_persistence_id")), new armo(c("my_identity"), d("my_identity_foreign_key")), new armo(c("message_status"), d("message_status")), new armo(c("seen"), d("seen")), new armo(c("read"), d("read")), new armo(c("conversation_id"), d("conversation_id")), new armo(c("sender_participant_id"), d("sender_id")), new armo(c("sender_send_destination"), d("sender_send_destination")), new armo(c("msisdn_receiving_rcs_message"), d("msisdn_receiving_rcs_message")), new armo(c("self_participant_id"), d("self_id")), new armo(c("mms_subject"), d("mms_subject")), new armo(c("received_timestamp"), d("received_timestamp")), new armo(c("sent_timestamp"), d("sent_timestamp")), new armo(c("protocol"), d("message_protocol")), new armo(c("message_priority"), d("sms_priority")), new armo(c("rcs_encryption_status"), d("etouffee_status")), new armo(c("cloud_sync_id"), d("cloud_sync_id")), new armo(c("correlation_id"), d("correlation_id")), new armo(c("sms_error_code"), d("sms_error_code")), new armo(c("sms_error_desc_map_name"), d("sms_error_desc_map_name")), new armo(c("mms_transaction_id"), d("mms_transaction_id")), new armo(c("mms_content_location"), d("mms_content_location")), new armo(c("is_hidden"), d("is_hidden")), new armo(c("rcs_message_id"), d("rcs_message_id_with_text_type")), new armo(c("custom_headers"), d("custom_headers")), new armo(c("cms_id"), d("cms_id")), new armo(c("cms_life_cycle"), d("cms_life_cycle")), new armo(c("cms_correlation_id"), d("cms_correlation_id")), new armo(c("cms_last_mod_seq"), d("cms_last_mod_seq")));

    private rnn() {
    }

    private static final rnf c(String str) {
        String str2;
        agmh[] l = uxi.l();
        for (int i = 0; i < 30; i++) {
            agmh agmhVar = l[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (rnf) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final sxp d(String str) {
        String str2;
        agmh[] d = tzx.d();
        for (int i = 0; i < 67; i++) {
            agmh agmhVar = d[i];
            String d2 = agmhVar.d();
            if (d2 != null) {
                str2 = arsd.I(d2, '.', d2);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (sxp) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.aglx
    public final void a() {
        rni rniVar = new rni();
        rniVar.e();
        rniVar.a().V();
    }

    @Override // defpackage.aglx
    public final void b() {
        agof agofVar = new agof("messages_backup", "backup");
        agofVar.d = 5;
        Map map = b;
        rnf[] rnfVarArr = (rnf[]) map.keySet().toArray(new rnf[0]);
        agofVar.b((agmh[]) Arrays.copyOf(rnfVarArr, rnfVarArr.length));
        sxy d = MessagesTable.d();
        d.q();
        sxp[] sxpVarArr = (sxp[]) map.values().toArray(new sxp[0]);
        d.c((sxp[]) Arrays.copyOf(sxpVarArr, sxpVarArr.length));
        agofVar.c = d.b();
        agofVar.a().a();
    }
}
