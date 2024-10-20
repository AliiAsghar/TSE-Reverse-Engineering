package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tkf extends aglo {
    public static final String[] a = {"satellite_emergency_details.message_id", "satellite_emergency_details.help_state"};
    public static final int[] b;
    public static final int[] c;
    public static final iji d;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("message_id", "index_satellite_emergency_details_message_id");
        alokVar.b();
        d = new iji((char[]) null);
        b = new int[]{59950};
        c = new int[]{59960};
    }

    public static void a(agnw agnwVar, int i) {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append("message_id INTEGER NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append("help_state INT DEFAULT(1) NOT NULL");
        sb2.insert(0, "CREATE TABLE satellite_emergency_details (");
        sb2.append(");");
        if (i >= 59960) {
            sb = null;
        } else {
            sb = sb2.toString();
        }
        if (sb != null) {
            agnwVar.z(sb);
            ArrayList arrayList = new ArrayList();
            arrayList.add("DROP INDEX IF EXISTS index_satellite_emergency_details_message_id");
            arrayList.add("CREATE UNIQUE INDEX index_satellite_emergency_details_message_id ON satellite_emergency_details(message_id);");
            for (String str : (String[]) arrayList.toArray(new String[0])) {
                agnwVar.z(str);
            }
        }
    }
}
