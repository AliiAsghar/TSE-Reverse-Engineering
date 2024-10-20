package defpackage;

import android.media.AudioFormat;
import android.media.AudioRecord;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoxk {
    public final int a;
    public final int c;
    public final int d;
    public AudioRecord e;
    public AudioFormat f;
    public Thread g;
    private final int j;
    public boolean h = false;
    public final CopyOnWriteArraySet i = new CopyOnWriteArraySet();
    public final int b = 16;

    public aoxk(int i) {
        this.a = i;
        int minBufferSize = AudioRecord.getMinBufferSize(i, 16, 2);
        this.j = minBufferSize;
        double d = i;
        int ceil = (int) Math.ceil(((d + d) * 10000.0d) / 1000000.0d);
        this.d = ceil;
        int max = Math.max(ceil, minBufferSize);
        this.c = max + max;
    }
}
