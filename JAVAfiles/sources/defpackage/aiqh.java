package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class aiqh {
    public static final Pattern a = Pattern.compile("^(((http(s)?):)?\\/\\/images(\\d)?-.+-opensocial\\.googleusercontent\\.com\\/gadgets\\/proxy\\?)");
    private static int b;

    public static synchronized int a() {
        int i;
        synchronized (aiqh.class) {
            i = b + 1;
            b = i % 3;
        }
        return i;
    }
}
