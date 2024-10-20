package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rva {
    public static final Date a = new Date(0);

    public static long a(Date date) {
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    public static Date b(long j) {
        if (j == 0) {
            return a;
        }
        return new Date(j);
    }
}
