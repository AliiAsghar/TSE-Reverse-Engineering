package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sxl extends aglo {
    public static final String[] a = {"message_status._id", "message_status.message_id", "message_status.timestamp", "message_status.status", "message_status.custom_status", "message_status.data"};
    public static final alor b;
    public static final int[] c;
    public static final jat d;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        new alok().b();
        d = new jat((byte[]) null, (byte[]) null);
        c = new int[]{33010};
    }

    public static sxe a() {
        int i = swm.a;
        return new sxe();
    }

    public static void b(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("custom_status INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("data TEXT");
        sb.insert(0, "CREATE TABLE message_status (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
