package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fer implements ffb {
    public final MediaCodec a;
    public final fev b;
    public final ffc c;
    public final fez d;
    public int e = 0;
    private boolean f;

    public fer(MediaCodec mediaCodec, HandlerThread handlerThread, ffc ffcVar, fez fezVar) {
        this.a = mediaCodec;
        this.b = new fev(handlerThread);
        this.c = ffcVar;
        this.d = fezVar;
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.ffb
    public final int a() {
        int i;
        this.c.b();
        fev fevVar = this.b;
        synchronized (fevVar.a) {
            fevVar.b();
            i = -1;
            if (!fevVar.c()) {
                if (!fevVar.j.F()) {
                    i = fevVar.j.C();
                }
            }
        }
        return i;
    }

    @Override // defpackage.ffb
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int i;
        this.c.b();
        fev fevVar = this.b;
        synchronized (fevVar.a) {
            fevVar.b();
            i = -1;
            if (!fevVar.c()) {
                if (!fevVar.k.F()) {
                    int C = fevVar.k.C();
                    if (C >= 0) {
                        dzg.h(fevVar.f);
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) fevVar.d.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (C == -2) {
                        fevVar.f = (MediaFormat) fevVar.e.remove();
                        i = -2;
                    }
                    i = C;
                }
            }
        }
        return i;
    }

    @Override // defpackage.ffb
    public final MediaFormat c() {
        MediaFormat mediaFormat;
        fev fevVar = this.b;
        synchronized (fevVar.a) {
            mediaFormat = fevVar.f;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.ffb
    public final ByteBuffer e(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.ffb
    public final ByteBuffer f(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.ffb
    public final void g() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.ffb
    public final void h() {
        this.c.a();
        this.a.flush();
        fev fevVar = this.b;
        synchronized (fevVar.a) {
            fevVar.g++;
            Handler handler = fevVar.c;
            int i = eul.a;
            handler.post(new exl(fevVar, 19));
        }
        this.a.start();
    }

    @Override // defpackage.ffb
    public final void i() {
        fez fezVar;
        fez fezVar2;
        try {
            try {
                if (this.e == 1) {
                    this.c.d();
                    fev fevVar = this.b;
                    synchronized (fevVar.a) {
                        fevVar.h = true;
                        fevVar.b.quit();
                        fevVar.a();
                    }
                }
                this.e = 2;
            } finally {
                if (!this.f) {
                    if (eul.a >= 30 && eul.a < 33) {
                        this.a.stop();
                    }
                    if (eul.a >= 35 && (fezVar2 = this.d) != null) {
                        fezVar2.b(this.a);
                    }
                    this.a.release();
                    this.f = true;
                }
            }
        } catch (Throwable th) {
            if (eul.a >= 35 && (fezVar = this.d) != null) {
                fezVar.b(this.a);
            }
            this.a.release();
            this.f = true;
            throw th;
        }
    }

    @Override // defpackage.ffb
    public final void j(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.ffb
    public final void k(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.ffb
    public final void l(Bundle bundle) {
        this.c.c(bundle);
    }

    @Override // defpackage.ffb
    public final void m(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.ffb
    public final void n(int i, int i2, long j, int i3) {
        this.c.f(i, i2, j, i3);
    }

    @Override // defpackage.ffb
    public final void o(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.ffb
    public final void p(int i, ewh ewhVar, long j) {
        this.c.g(i, ewhVar, j);
    }

    @Override // defpackage.ffb
    public final void q() {
        synchronized (this.b.a) {
        }
    }
}
