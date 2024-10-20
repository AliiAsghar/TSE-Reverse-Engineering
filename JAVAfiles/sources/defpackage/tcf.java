package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tcf extends aglo {
    public static final String[] a = {"pending_incoming_message_rcs_table.rcs_message_id", "pending_incoming_message_rcs_table.remote_user_id", "pending_incoming_message_rcs_table.self_identity", "pending_incoming_message_rcs_table.raw_text", "pending_incoming_message_rcs_table.content_type", "pending_incoming_message_rcs_table.remote_instance", "pending_incoming_message_rcs_table.sent_timestamp", "pending_incoming_message_rcs_table.received_timestamp", "pending_incoming_message_rcs_table.sip_alias", "pending_incoming_message_rcs_table.spam_verdict", "pending_incoming_message_rcs_table.session_id", "pending_incoming_message_rcs_table.message_status", "pending_incoming_message_rcs_table.custom_headers", "pending_incoming_message_rcs_table.is_group", "pending_incoming_message_rcs_table.conversation_id", "pending_incoming_message_rcs_table.conference_uri", "pending_incoming_message_rcs_table.is_delivery_report_requested", "pending_incoming_message_rcs_table.is_display_report_requested"};
    public static final alor b;
    public static final tby c;
    public static final int[] d;

    static {
        alok alokVar = new alok();
        alokVar.h("pending_incoming_message_rcs_table.self_identity", 59410);
        alokVar.h("pending_incoming_message_rcs_table.custom_headers", 44020);
        alokVar.h("pending_incoming_message_rcs_table.is_group", 58820);
        alokVar.h("pending_incoming_message_rcs_table.conversation_id", 58820);
        alokVar.h("pending_incoming_message_rcs_table.conference_uri", 58820);
        alokVar.h("pending_incoming_message_rcs_table.is_delivery_report_requested", 58870);
        alokVar.h("pending_incoming_message_rcs_table.is_display_report_requested", 58870);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("remote_user_id", "index_pending_incoming_message_rcs_table_remote_user_id");
        alokVar2.h("received_timestamp", "index_pending_incoming_message_rcs_table_received_timestamp");
        alokVar2.b();
        c = new tby();
        d = new int[]{39050, 44020, 58820, 58870, 59270, 59410};
    }

    public static tbx a() {
        int i = taq.a;
        return new tbx();
    }

    public static final tcd b() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("pending_incoming_message_rcs_table.rcs_message_id");
            alobVar.h("pending_incoming_message_rcs_table.remote_user_id");
            if (valueOf.intValue() >= 59410) {
                alobVar.h("pending_incoming_message_rcs_table.self_identity");
            }
            alobVar.h("pending_incoming_message_rcs_table.raw_text");
            alobVar.h("pending_incoming_message_rcs_table.content_type");
            alobVar.h("pending_incoming_message_rcs_table.remote_instance");
            alobVar.h("pending_incoming_message_rcs_table.sent_timestamp");
            alobVar.h("pending_incoming_message_rcs_table.received_timestamp");
            alobVar.h("pending_incoming_message_rcs_table.sip_alias");
            alobVar.h("pending_incoming_message_rcs_table.spam_verdict");
            alobVar.h("pending_incoming_message_rcs_table.session_id");
            alobVar.h("pending_incoming_message_rcs_table.message_status");
            if (valueOf.intValue() >= 44020) {
                alobVar.h("pending_incoming_message_rcs_table.custom_headers");
            }
            if (valueOf.intValue() >= 58820) {
                alobVar.h("pending_incoming_message_rcs_table.is_group");
            }
            if (valueOf.intValue() >= 58820) {
                alobVar.h("pending_incoming_message_rcs_table.conversation_id");
            }
            if (valueOf.intValue() >= 58820) {
                alobVar.h("pending_incoming_message_rcs_table.conference_uri");
            }
            if (valueOf.intValue() >= 58870) {
                alobVar.h("pending_incoming_message_rcs_table.is_delivery_report_requested");
            }
            if (valueOf.intValue() >= 58870) {
                alobVar.h("pending_incoming_message_rcs_table.is_display_report_requested");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new tcd(strArr);
    }

    public static void c(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_message_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("remote_user_id TEXT");
        if (i >= 59410) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("self_identity TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("raw_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("content_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("remote_instance TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sent_timestamp INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("received_timestamp INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sip_alias TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("spam_verdict INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("session_id INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_status INTEGER");
        if (i >= 44020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("custom_headers BLOB");
        }
        if (i >= 58820) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_group INTEGER");
        }
        if (i >= 58820) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_id TEXT");
        }
        if (i >= 58820) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conference_uri TEXT");
        }
        if (i >= 58870) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_delivery_report_requested INTEGER DEFAULT(0) NOT NULL");
        }
        if (i >= 58870) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_display_report_requested INTEGER DEFAULT(0) NOT NULL");
        }
        sb.insert(0, "CREATE TABLE pending_incoming_message_rcs_table (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_pending_incoming_message_rcs_table_remote_user_id");
        arrayList.add("CREATE INDEX index_pending_incoming_message_rcs_table_remote_user_id ON pending_incoming_message_rcs_table(remote_user_id);");
        if (i >= 59270) {
            arrayList.add("DROP INDEX IF EXISTS index_pending_incoming_message_rcs_table_received_timestamp");
            arrayList.add("CREATE INDEX IF NOT EXISTS index_pending_incoming_message_rcs_table_received_timestamp ON pending_incoming_message_rcs_table(received_timestamp);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
