package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ygy {
    public final MediaCodec a;
    public final MediaCodec.BufferInfo b = new MediaCodec.BufferInfo();
    public ByteBuffer[] c;
    public ByteBuffer[] d;
    public boolean e;

    public ygy(MediaCodec mediaCodec) {
        boolean z;
        this.a = mediaCodec;
        if (mediaCodec != null) {
            this.c = mediaCodec.getInputBuffers();
            this.d = mediaCodec.getOutputBuffers();
        }
        if (mediaCodec == null) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
    }
}
