package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvp {
    public final eqn a;
    public final MediaCodec b;
    public final Surface c;
    public final int d;
    public final AtomicBoolean e;
    private final MediaCodec.BufferInfo f;
    private final MediaFormat g;
    private final boolean h;
    private final boolean i;
    private eqn j;
    private ByteBuffer k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;

    public fvp(Context context, eqn eqnVar, MediaFormat mediaFormat, String str, boolean z, Surface surface) {
        Exception exc;
        MediaCodec mediaCodec;
        int i;
        this.a = eqnVar;
        this.g = mediaFormat;
        this.h = z;
        String str2 = eqnVar.o;
        dzg.g(str2);
        boolean j = erl.j(str2);
        this.i = j;
        this.f = new MediaCodec.BufferInfo();
        this.l = -1;
        this.m = -1;
        this.e = new AtomicBoolean();
        int i2 = ewx.a;
        boolean m = m(mediaFormat);
        Surface surface2 = null;
        try {
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                Trace.beginSection("configureCodec");
                mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, !z ? 1 : 0);
                Trace.endSection();
                if (m) {
                    d.t(m(mediaCodec.getInputFormat()), "Tone-mapping requested but not supported by the decoder.");
                }
                if (j && !z) {
                    surface2 = mediaCodec.createInputSurface();
                }
                Trace.beginSection("startCodec");
                mediaCodec.start();
                Trace.endSection();
                this.b = mediaCodec;
                this.c = surface2;
                this.d = eul.l(context);
            } catch (Exception e) {
                exc = e;
                eub.h(exc);
                if (surface2 != null) {
                    surface2.release();
                }
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                if (!(exc instanceof IOException) && !(exc instanceof MediaCodec.CodecException)) {
                    if (exc instanceof IllegalArgumentException) {
                        if (true != z) {
                            i = 4003;
                        } else {
                            i = 3003;
                        }
                    } else {
                        i = 1001;
                    }
                } else if (true != z) {
                    i = 4001;
                } else {
                    i = 3001;
                }
                throw l(mediaFormat, this.i, z, exc, i, str);
            }
        } catch (Exception e2) {
            exc = e2;
            mediaCodec = null;
        }
    }

    private static fwo l(MediaFormat mediaFormat, boolean z, boolean z2, Exception exc, int i, String str) {
        return fwo.b(exc, i, new fwn(mediaFormat.toString(), z, z2, str));
    }

    private static boolean m(MediaFormat mediaFormat) {
        if (eul.a < 31 || dzh.f(mediaFormat, "color-transfer-request", 0) != 3) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01d8 A[LOOP:0: B:39:0x0167->B:41:0x01d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0173 A[EDGE_INSN: B:42:0x0173->B:43:0x0173 BREAK  A[LOOP:0: B:39:0x0167->B:41:0x01d8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean n(boolean r23) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fvp.n(boolean):boolean");
    }

    public final MediaCodec.BufferInfo a() {
        if (n(false)) {
            return this.f;
        }
        return null;
    }

    public final eqn b() {
        n(false);
        return this.j;
    }

    public final fwo c(Exception exc) {
        int i;
        boolean z = this.h;
        if (true != z) {
            i = 4002;
        } else {
            i = 3002;
        }
        int i2 = i;
        return l(this.g, this.i, z, exc, i2, d());
    }

    public final String d() {
        String canonicalName;
        if (eul.a < 29) {
            return this.b.getName();
        }
        canonicalName = this.b.getCanonicalName();
        return canonicalName;
    }

    public final ByteBuffer e() {
        if (!n(true)) {
            return null;
        }
        long j = this.f.presentationTimeUs;
        int i = this.f.size;
        int i2 = ewx.a;
        return this.k;
    }

    public final void f(ewl ewlVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        boolean z = true;
        dzg.e(!this.n, "Input buffer can not be queued after the input stream has ended.");
        ByteBuffer byteBuffer = ewlVar.d;
        if (byteBuffer != null && byteBuffer.hasRemaining()) {
            i = ewlVar.d.position();
            i2 = ewlVar.d.remaining();
        } else {
            i = 0;
            i2 = 0;
        }
        long j2 = ewlVar.f;
        if (ewlVar.eR()) {
            this.n = true;
            int i6 = ewx.a;
            if (this.h) {
                ByteBuffer byteBuffer2 = ewlVar.d;
                if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
                    z = false;
                }
                dzg.d(z);
                j2 = 0;
                i3 = 0;
                i5 = 0;
            } else {
                i3 = i;
                i5 = i2;
            }
            j = j2;
            i4 = 4;
        } else {
            i3 = i;
            i4 = 0;
            i5 = i2;
            j = j2;
        }
        try {
            this.b.queueInputBuffer(this.l, i3, i5, j, i4);
            int i7 = ewx.a;
            this.l = -1;
            ewlVar.d = null;
        } catch (RuntimeException e) {
            eub.h(e);
            throw c(e);
        }
    }

    public final void g() {
        this.k = null;
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
        this.b.release();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(boolean z, long j) {
        this.k = null;
        try {
            if (z) {
                this.b.releaseOutputBuffer(this.m, j * 1000);
                int i = ewx.a;
            } else {
                this.b.releaseOutputBuffer(this.m, false);
            }
            this.m = -1;
        } catch (RuntimeException e) {
            eub.h(e);
            throw c(e);
        }
    }

    public final boolean i() {
        if (this.o && this.m == -1) {
            return true;
        }
        return false;
    }

    public final boolean j(ewl ewlVar) {
        if (!this.n) {
            if (this.l < 0) {
                try {
                    int dequeueInputBuffer = this.b.dequeueInputBuffer(0L);
                    this.l = dequeueInputBuffer;
                    if (dequeueInputBuffer >= 0) {
                        try {
                            ewlVar.d = this.b.getInputBuffer(dequeueInputBuffer);
                            ewlVar.eO();
                        } catch (RuntimeException e) {
                            eub.h(e);
                            throw c(e);
                        }
                    } else {
                        return false;
                    }
                } catch (RuntimeException e2) {
                    eub.h(e2);
                    throw c(e2);
                }
            }
            dzg.g(ewlVar.d);
            return true;
        }
        return false;
    }

    public final void k() {
        h(false, this.f.presentationTimeUs);
    }
}
