package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qww extends aglo {
    public static final String[] a = {"subscriptions.sub_id", "subscriptions.sim_serial_number", "subscriptions.telephony_phone_number", "subscriptions.my_identity_token", "subscriptions.my_identity_token_with_foreign_key"};
    public static final alor b;
    public static final int[] c;
    public static final int[] d;
    public static final usk e;

    static {
        alok alokVar = new alok();
        alokVar.h("subscriptions.my_identity_token", 59450);
        alokVar.h("subscriptions.my_identity_token_with_foreign_key", 60160);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("my_identity_token", "index_subscriptions_my_identity_token");
        alokVar2.h("my_identity_token_with_foreign_key", "index_subscriptions_my_identity_token_with_foreign_key");
        alokVar2.b();
        e = new usk((int[]) null);
        c = new int[]{59230, 59450, 60160};
        d = new int[]{59250};
    }

    public static final qwt a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("subscriptions.sub_id");
            alobVar.h("subscriptions.sim_serial_number");
            alobVar.h("subscriptions.telephony_phone_number");
            if (valueOf.intValue() >= 59450) {
                alobVar.h("subscriptions.my_identity_token");
            }
            if (valueOf.intValue() >= 60160) {
                alobVar.h("subscriptions.my_identity_token_with_foreign_key");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new qwt(strArr);
    }

    public static String b(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sub_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_serial_number TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("telephony_phone_number TEXT");
        if (i >= 59450) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity_token TEXT");
        }
        if (i >= 60160) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity_token_with_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        }
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(", PRIMARY KEY (sub_id,sim_serial_number));");
        return sb.toString();
    }

    public static void c(agnw agnwVar, int i) {
        agnwVar.z(b(i, "subscriptions"));
        for (String str : d(i)) {
            agnwVar.z(str);
        }
    }

    public static String[] d(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 59450) {
            arrayList.add("DROP INDEX IF EXISTS index_subscriptions_my_identity_token");
            arrayList.add("CREATE INDEX index_subscriptions_my_identity_token ON subscriptions(my_identity_token);");
        }
        if (i >= 60160) {
            arrayList.add("DROP INDEX IF EXISTS index_subscriptions_my_identity_token_with_foreign_key");
            arrayList.add("CREATE INDEX index_subscriptions_my_identity_token_with_foreign_key ON subscriptions(my_identity_token_with_foreign_key);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static std e() {
        int i = qqe.a;
        return new std(null);
    }
}
