package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alhe {
    public static final SecureRandom a;
    public static final ThreadLocal b;

    static {
        new alhc();
        a = a();
        new alhd();
        b = new alhb();
    }

    public static SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
