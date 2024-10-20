package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class srn extends aglo {
    public static final int[] a = {59610};
    public static final int[] b = {59680};

    public static void a(agnw agnwVar, int i) {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append("operation_datetime INT NOT NULL");
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append("operation_type INTEGER NOT NULL");
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append("conversation_id INT NOT NULL");
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append("participant_id INT NOT NULL");
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append("rcs_group_join_status INT DEFAULT(0)");
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append("last_modified_by_key TEXT");
        sb2.insert(0, "CREATE TABLE group_conversation_participants_audit_log (");
        sb2.append(");");
        if (i >= 59680) {
            sb = null;
        } else {
            sb = sb2.toString();
        }
        if (sb != null) {
            agnwVar.z(sb);
            for (String str : d.at()) {
                agnwVar.z(str);
            }
        }
    }
}
