package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aohp {
    public static final long a = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static aohp c;

    private aohp() {
    }

    public static aohp b() {
        if (aode.b == null) {
            aode.b = new aode();
        }
        if (c == null) {
            c = new aohp();
        }
        return c;
    }

    public final long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public final boolean c(aohu aohuVar) {
        if (TextUtils.isEmpty(aohuVar.b)) {
            return true;
        }
        if (aohuVar.e + aohuVar.d < a() + a) {
            return true;
        }
        return false;
    }
}
