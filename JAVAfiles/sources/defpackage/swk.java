package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class swk extends aglo {
    public static final String[] a = {"message_send_receive_attempt._id", "message_send_receive_attempt.message_id", "message_send_receive_attempt.timestamp", "message_send_receive_attempt.message_sending_attempt", "message_send_receive_attempt.message_protocol", "message_send_receive_attempt.current_sim_network_country", "message_send_receive_attempt.current_sim_country", "message_send_receive_attempt.current_sim_carrier_country", "message_send_receive_attempt.settings_country", "message_send_receive_attempt.default_sms_sim_country", "message_send_receive_attempt.locale_country", "message_send_receive_attempt.default_sms_sim_network_country", "message_send_receive_attempt.default_sms_sim_carrier_country"};
    public static final int[] b;
    public static final vid c;

    static {
        new alok().b();
        new alok().b();
        c = new vid((byte[]) null);
        b = new int[]{59360};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id TEXT PRIMARY KEY NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_sending_attempt INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_protocol INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("current_sim_network_country TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("current_sim_country TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("current_sim_carrier_country TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("settings_country TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("default_sms_sim_country TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("locale_country TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("default_sms_sim_network_country TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("default_sms_sim_carrier_country TEXT");
        sb.insert(0, "CREATE TABLE message_send_receive_attempt (");
        sb.append(", CHECK (" + new agpk("$R > 0", new Object[]{"message_sending_attempt"}).ad(agpo.b()) + ")");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_send_receive_attempt_message_id");
        arrayList.add("CREATE INDEX index_message_send_receive_attempt_message_id ON message_send_receive_attempt(message_id);");
        arrayList.add("DROP INDEX IF EXISTS message_id_and_message_sending_attempt_index");
        arrayList.add("CREATE UNIQUE INDEX message_id_and_message_sending_attempt_index ON message_send_receive_attempt(message_id, message_sending_attempt);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
