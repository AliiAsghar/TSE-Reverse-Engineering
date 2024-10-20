package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgm {
    public static final /* synthetic */ int a = 0;
    private static final AtomicLong b = new AtomicLong();

    public fgm() {
    }

    public static long a() {
        return b.getAndIncrement();
    }

    public fgm(evl evlVar) {
        Uri uri = evlVar.a;
        Collections.emptyMap();
    }
}
