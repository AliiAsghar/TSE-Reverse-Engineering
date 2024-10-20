package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class stb extends aglo {
    public static final String[] a = {"linked_account.account_id"};
    public static final alor b;
    public static final int[] c;
    public static final uie d;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        new alok().b();
        d = new uie((byte[]) null, (byte[]) null);
        c = new int[]{35080};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("account_id INT PRIMARY KEY");
        sb.insert(0, "CREATE TABLE linked_account (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
