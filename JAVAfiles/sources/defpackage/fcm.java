package defpackage;

import android.media.AudioTrack;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcm {
    public final fcl a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public fcm(AudioTrack audioTrack) {
        this.a = new fcl(audioTrack);
        d();
    }

    public final long a() {
        return this.a.e;
    }

    public final long b() {
        return this.a.a();
    }

    public final void c() {
        e(4);
    }

    public final void d() {
        e(0);
    }

    public final void e(int i) {
        this.b = i;
        long j = 10000;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    j = 500000;
                } else {
                    j = 10000000;
                }
            } else {
                this.d = 10000L;
                return;
            }
        } else {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
        }
        this.d = j;
    }
}
