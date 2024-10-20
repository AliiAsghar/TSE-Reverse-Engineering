package defpackage;

import java.util.Locale;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class prr extends RuntimeException {
    public final CronetException a;
    public final int b;

    public prr(String str, int i) {
        this(str, i, null);
    }

    public static String a(int i) {
        return String.format(Locale.ENGLISH, "Business Info HTTP code was %d", Integer.valueOf(i));
    }

    public prr(String str, int i, CronetException cronetException) {
        super(str);
        this.b = i;
        this.a = cronetException;
    }
}
