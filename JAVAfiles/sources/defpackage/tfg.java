package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tfg extends aglo {
    public static final String[] a = {"received_message_phone_numbers.rcs_message_id", "received_message_phone_numbers.self_msisdn"};
    public static final int[] b;
    public static final iji c;

    static {
        new alok().b();
        new alok().b();
        c = new iji((char[]) null, (byte[]) null);
        b = new int[]{40020};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_message_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("self_msisdn TEXT NOT NULL");
        sb.insert(0, "CREATE TABLE received_message_phone_numbers (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
