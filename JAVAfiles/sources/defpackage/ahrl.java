package defpackage;

import android.R;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahrl {
    public final short[] a;
    public final short[] b;
    public final int c;
    public long d;

    public ahrl(Random random) {
        d.s(true);
        this.a = new short[256];
        this.b = new short[256];
        this.c = (random.nextInt() & (-33686019)) | R.attr.cacheColorHint;
        this.d = 0L;
    }
}
