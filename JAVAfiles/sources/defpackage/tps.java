package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tps extends aglo {
    public static final String[] a = {"verified_sms_senders.sender_id", "verified_sms_senders.brand_id"};
    public static final int[] b;
    public static final iji c;

    static {
        new alok().b();
        new alok().b();
        c = new iji((byte[]) null);
        b = new int[]{29110};
    }

    public static tpk a() {
        int i = toe.a;
        tpk tpkVar = new tpk();
        tpkVar.aD();
        return tpkVar;
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sender_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("brand_id TEXT");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void c(agnw agnwVar) {
        agnwVar.z(b("verified_sms_senders"));
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
