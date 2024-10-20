package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqth {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final amcn b = aqut.d;

    public static aquo a(String str, aqtg aqtgVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return new aqur(str, z, aqtgVar);
    }
}
