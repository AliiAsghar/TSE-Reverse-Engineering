package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeam {
    public static final long a = TimeUnit.HOURS.toMillis(1);

    public static final gsi a(aecj aecjVar) {
        aecjVar.getClass();
        hgi hgiVar = new hgi((char[]) null);
        hgiVar.n("key_client_id", aecjVar.a());
        return hgiVar.j();
    }

    public static final aecj b(gsi gsiVar) {
        String d = gsiVar.d("key_client_id");
        if (d == null) {
            return null;
        }
        if (d.length() <= 0) {
            d = null;
        }
        if (d == null) {
            return null;
        }
        List ab = arsd.ab(d, new String[]{":"}, 2, 2);
        if (ab.size() == 1) {
            return new aecj(d, "");
        }
        return new aecj((String) ab.get(0), (String) ab.get(1));
    }

    public static final String c(String str, aecj aecjVar) {
        aecjVar.getClass();
        String format = String.format("%s:%s", Arrays.copyOf(new Object[]{str, aecjVar.a()}, 2));
        format.getClass();
        return format;
    }

    public static final int d(int i) {
        if (i - 1 != 1) {
            return 2;
        }
        return 3;
    }
}
