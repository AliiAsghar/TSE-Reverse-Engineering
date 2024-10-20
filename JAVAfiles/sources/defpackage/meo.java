package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class meo {
    public int a;
    public int b;
    public long c;
    public long d;
    public int e;

    public final String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
        return String.format(Locale.US, "Row count: %,d\nTable size estimate: %,d\nEarliest timestamp: %s\nLast cleanup time: %s\nRows deleted: %,d", Integer.valueOf(this.a), Integer.valueOf(this.b), simpleDateFormat.format(Long.valueOf(this.c)), simpleDateFormat.format(Long.valueOf(this.d)), Integer.valueOf(this.e));
    }
}
