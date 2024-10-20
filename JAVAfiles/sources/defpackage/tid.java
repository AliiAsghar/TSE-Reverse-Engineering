package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tid extends aglo {
    public static final String[] a = {"remote_user_id_to_registration_id.remote_user_id", "remote_user_id_to_registration_id.tachyon_registration_id"};
    public static final alor b;
    public static final int[] c;
    public static final iji d;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        alok alokVar = new alok();
        alokVar.h("tachyon_registration_id", "index_remote_user_id_to_registration_id_tachyon_registration_id");
        alokVar.b();
        d = new iji((byte[]) null, (byte[]) null, (byte[]) null);
        c = new int[]{45000};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("remote_user_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("tachyon_registration_id TEXT REFERENCES remote_registrations_table(tachyon_registration_id) ON DELETE NO ACTION ON UPDATE NO ACTION");
        sb.insert(0, "CREATE TABLE remote_user_id_to_registration_id (");
        sb.append(", PRIMARY KEY (remote_user_id,tachyon_registration_id));");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_remote_user_id_to_registration_id_tachyon_registration_id");
        arrayList.add("CREATE INDEX index_remote_user_id_to_registration_id_tachyon_registration_id ON remote_user_id_to_registration_id(tachyon_registration_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }

    public static tpk b() {
        int i = tfq.a;
        return new tpk((char[]) null);
    }
}
