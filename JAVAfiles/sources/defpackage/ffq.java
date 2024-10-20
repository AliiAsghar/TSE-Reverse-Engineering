package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffq implements ffb {
    private final MediaCodec a;
    private final fez b;

    public ffq(MediaCodec mediaCodec, fez fezVar) {
        this.a = mediaCodec;
        this.b = fezVar;
        if (eul.a >= 35 && fezVar != null) {
            fezVar.a(mediaCodec);
        }
    }

    @Override // defpackage.ffb
    public final int a() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.ffb
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // defpackage.ffb
    public final MediaFormat c() {
        return this.a.getOutputFormat();
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
        this.a.flush();
    }

    @Override // defpackage.ffb
    public final void i() {
        fez fezVar;
        fez fezVar2;
        try {
            if (eul.a >= 30 && eul.a < 33) {
                this.a.stop();
            }
            if (eul.a >= 35 && (fezVar2 = this.b) != null) {
                fezVar2.b(this.a);
            }
            this.a.release();
        } catch (Throwable th) {
            if (eul.a >= 35 && (fezVar = this.b) != null) {
                fezVar.b(this.a);
            }
            this.a.release();
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
        this.a.setParameters(bundle);
    }

    @Override // defpackage.ffb
    public final void m(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.ffb
    public final void n(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.ffb
    public final void o(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.ffb
    public final void p(int i, ewh ewhVar, long j) {
        this.a.queueSecureInputBuffer(i, 0, ewhVar.i, j, 0);
    }

    @Override // defpackage.ffb
    public final /* synthetic */ void q() {
    }
}
