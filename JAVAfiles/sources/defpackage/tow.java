package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tow extends aglo {
    public static final String[] a = {"verified_sms_blacklisted_senders.sender_id"};
    public static final int[] b;
    public static final uac c;

    static {
        new alok().b();
        new alok().b();
        c = new uac();
        b = new int[]{33080};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sender_id TEXT PRIMARY KEY");
        sb.insert(0, "CREATE TABLE verified_sms_blacklisted_senders (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
