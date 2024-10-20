package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qsz extends aglo {
    public static final String[] a = {"destinations.token", "destinations.address", "destinations.address_type"};
    public static final int[] b;
    public static final qya c;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("address", "index_destinations_address");
        alokVar.b();
        c = new qya((char[]) null);
        b = new int[]{60280};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("token TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("address TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("address_type INT NOT NULL");
        sb.insert(0, "CREATE TABLE destinations (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_destinations_address");
        arrayList.add("CREATE UNIQUE INDEX index_destinations_address ON destinations(address);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
