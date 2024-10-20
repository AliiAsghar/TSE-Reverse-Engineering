package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tfa extends aglo {
    public static final String[] a = {"read_reports._id", "read_reports.message_id", "read_reports.participant_id", "read_reports.receive_time", "read_reports.read_time", "read_reports.ftd_time"};
    public static final alor b;
    public static final int[] c;
    public static final wyp d;

    static {
        alok alokVar = new alok();
        alokVar.h("read_reports.ftd_time", 58880);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("message_id", "index_read_reports_message_id");
        alokVar2.b();
        d = new wyp(null, null);
        c = new int[]{10008, 58880};
    }

    public static tet a() {
        int i = tdb.a;
        return new tet();
    }

    public static final tex b() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("read_reports._id");
            alobVar.h("read_reports.message_id");
            alobVar.h("read_reports.participant_id");
            alobVar.h("read_reports.receive_time");
            alobVar.h("read_reports.read_time");
            if (valueOf.intValue() >= 58880) {
                alobVar.h("read_reports.ftd_time");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new tex(strArr);
    }

    public static void c(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("receive_time INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("read_time INT DEFAULT(0)");
        if (i >= 58880) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("ftd_time INTEGER DEFAULT(-1)");
        }
        sb.insert(0, "CREATE TABLE read_reports (");
        sb.append(", UNIQUE(message_id,participant_id) ON CONFLICT FAIL FOREIGN KEY (message_id) REFERENCES messages (_id) ON DELETE CASCADE FOREIGN KEY (participant_id) REFERENCES participants (_id) ON DELETE SET NULL);");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_read_reports_message_id");
        arrayList.add("CREATE INDEX index_read_reports_message_id ON read_reports(message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
