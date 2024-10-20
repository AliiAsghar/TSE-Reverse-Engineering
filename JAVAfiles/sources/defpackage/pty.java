package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pty extends aglo {
    public static final String[] a = {"rcs_remote_capabilities_cache.msisdn", "rcs_remote_capabilities_cache.last_refresh_timestamp", "rcs_remote_capabilities_cache.rcs_capabilities"};
    public static final int[] b;
    public static final int[] c;
    public static final qya d;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("msisdn", "index_rcs_remote_capabilities_cache_msisdn");
        alokVar.b();
        d = new qya((int[]) null);
        b = new int[]{58110, 58420};
        c = new int[]{58130};
    }

    public static void a(agnw agnwVar, int i) {
        agnwVar.z(c("rcs_remote_capabilities_cache"));
        for (String str : b(i)) {
            agnwVar.z(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] b(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 58420) {
            arrayList.add("DROP INDEX IF EXISTS index_rcs_remote_capabilities_cache_msisdn");
            arrayList.add("CREATE INDEX index_rcs_remote_capabilities_cache_msisdn ON rcs_remote_capabilities_cache(msisdn);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String c(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("msisdn TEXT PRIMARY KEY NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_refresh_timestamp INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_capabilities BLOB NOT NULL");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static tmc d() {
        int i = nfz.a;
        return new tmc(null, null, null, null);
    }
}
