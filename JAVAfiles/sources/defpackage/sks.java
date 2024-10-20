package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sks extends aglo {
    public static final String[] a = {"conversation_participants_audit_log._id", "conversation_participants_audit_log.operation_datetime", "conversation_participants_audit_log.operation_type", "conversation_participants_audit_log.conversation_participants_id", "conversation_participants_audit_log.conversation_id", "conversation_participants_audit_log.participant_id", "conversation_participants_audit_log.is_normalized", "conversation_participants_audit_log.rcs_group_join_status", "conversation_participants_audit_log.last_modified_by_key"};
    public static final int[] b;
    public static final uqu c;

    static {
        alok alokVar = new alok();
        alokVar.h("conversation_participants_audit_log.last_modified_by_key", 59440);
        alokVar.b();
        new alok().b();
        c = new uqu(null, null, null);
        b = new int[]{59370, 59440};
    }

    public static final skq a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("conversation_participants_audit_log._id");
            alobVar.h("conversation_participants_audit_log.operation_datetime");
            alobVar.h("conversation_participants_audit_log.operation_type");
            alobVar.h("conversation_participants_audit_log.conversation_participants_id");
            alobVar.h("conversation_participants_audit_log.conversation_id");
            alobVar.h("conversation_participants_audit_log.participant_id");
            alobVar.h("conversation_participants_audit_log.is_normalized");
            alobVar.h("conversation_participants_audit_log.rcs_group_join_status");
            if (valueOf.intValue() >= 59440) {
                alobVar.h("conversation_participants_audit_log.last_modified_by_key");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new skq(strArr);
    }

    public static void b(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("operation_datetime INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("operation_type INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_participants_id INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_normalized INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_join_status INT DEFAULT(0)");
        if (i >= 59440) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_modified_by_key TEXT");
        }
        sb.insert(0, "CREATE TABLE conversation_participants_audit_log (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
