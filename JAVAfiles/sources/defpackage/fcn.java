package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcn {
    private Method A;
    private long B;
    private int C;
    private int D;
    private long E;
    private long F;
    private boolean G;
    private long H;
    private long I;
    public AudioTrack a;
    public int b;
    public fcm c;
    public int d;
    public boolean e;
    public long f;
    public float g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public boolean s;
    public long t;
    public eti u;
    public final qdq v;
    private final long[] w;
    private boolean x;
    private long y;
    private long z;

    public fcn(qdq qdqVar) {
        this.v = qdqVar;
        try {
            this.A = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.w = new long[10];
        this.u = eti.a;
    }

    private final long e() {
        return eul.v(b(), this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
    
        if (r2 != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f8 A[Catch: Exception -> 0x0206, TRY_LEAVE, TryCatch #0 {Exception -> 0x0206, blocks: (B:26:0x01cf, B:28:0x01f8), top: B:25:0x01cf }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(boolean r22) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcn.a(boolean):long");
    }

    public final long b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.o != -9223372036854775807L) {
            AudioTrack audioTrack = this.a;
            dzg.g(audioTrack);
            if (audioTrack.getPlayState() == 2) {
                return this.q;
            }
            return Math.min(this.r, this.q + eul.r(eul.s(eul.u(elapsedRealtime) - this.o, this.g), this.d));
        }
        if (elapsedRealtime - this.B >= 5) {
            AudioTrack audioTrack2 = this.a;
            dzg.g(audioTrack2);
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                if (eul.a <= 29) {
                    if (playbackHeadPosition == 0) {
                        if (this.l > 0 && playState == 3) {
                            if (this.p == -9223372036854775807L) {
                                this.p = elapsedRealtime;
                            }
                        } else {
                            playbackHeadPosition = 0;
                        }
                    }
                    this.p = -9223372036854775807L;
                }
                if (this.l > playbackHeadPosition) {
                    this.m++;
                }
                this.l = playbackHeadPosition;
            }
            this.B = elapsedRealtime;
        }
        return this.l + this.t + (this.m << 32);
    }

    public final void c() {
        this.y = 0L;
        this.D = 0;
        this.C = 0;
        this.z = 0L;
        this.F = 0L;
        this.I = 0L;
        this.x = false;
    }

    public final boolean d(long j) {
        if (j <= eul.r(a(false), this.d)) {
            return false;
        }
        return true;
    }
}
