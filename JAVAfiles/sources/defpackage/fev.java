package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fev extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat f;
    public long g;
    public boolean h;
    public IllegalStateException i;
    private MediaFormat l;
    private MediaCodec.CodecException m;
    private MediaCodec.CryptoException n;
    public final Object a = new Object();
    public final fjl j = new fjl((byte[]) null, (char[]) null);
    public final fjl k = new fjl((byte[]) null, (char[]) null);
    public final ArrayDeque d = new ArrayDeque();
    public final ArrayDeque e = new ArrayDeque();

    public fev(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    private final void d(MediaFormat mediaFormat) {
        this.k.D(-2);
        this.e.add(mediaFormat);
    }

    public final void a() {
        if (!this.e.isEmpty()) {
            this.l = (MediaFormat) this.e.getLast();
        }
        this.j.E();
        this.k.E();
        this.d.clear();
        this.e.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.i;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.m;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.n;
                if (cryptoException == null) {
                    return;
                }
                this.n = null;
                throw cryptoException;
            }
            this.m = null;
            throw codecException;
        }
        this.i = null;
        throw illegalStateException;
    }

    public final boolean c() {
        if (this.g <= 0 && !this.h) {
            return false;
        }
        return true;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.n = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.m = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            this.j.D(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            MediaFormat mediaFormat = this.l;
            if (mediaFormat != null) {
                d(mediaFormat);
                this.l = null;
            }
            this.k.D(i);
            this.d.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            d(mediaFormat);
            this.l = null;
        }
    }
}
