package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class feu implements ffc {
    public static final ArrayDeque a = new ArrayDeque();
    public static final Object b = new Object();
    public final MediaCodec c;
    public final AtomicReference d;
    public final aqws e;
    private final HandlerThread f;
    private Handler g;
    private boolean h;

    public feu(MediaCodec mediaCodec, HandlerThread handlerThread) {
        aqws aqwsVar = new aqws((char[]) null);
        this.c = mediaCodec;
        this.f = handlerThread;
        this.e = aqwsVar;
        this.d = new AtomicReference();
    }

    private static fet h() {
        ArrayDeque arrayDeque = a;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new fet();
            }
            return (fet) arrayDeque.removeFirst();
        }
    }

    private static byte[] i(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= (length = bArr.length)) {
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] j(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= (length = iArr.length)) {
            System.arraycopy(iArr, 0, iArr2, 0, length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // defpackage.ffc
    public final void a() {
        if (this.h) {
            try {
                Handler handler = this.g;
                dzg.g(handler);
                handler.removeCallbacksAndMessages(null);
                this.e.i();
                Handler handler2 = this.g;
                dzg.g(handler2);
                handler2.obtainMessage(3).sendToTarget();
                this.e.e();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.ffc
    public final void b() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
        } else {
            throw runtimeException;
        }
    }

    @Override // defpackage.ffc
    public final void c(Bundle bundle) {
        b();
        Handler handler = this.g;
        int i = eul.a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.ffc
    public final void d() {
        if (this.h) {
            a();
            this.f.quit();
        }
        this.h = false;
    }

    @Override // defpackage.ffc
    public final void e() {
        if (!this.h) {
            this.f.start();
            this.g = new fes(this, this.f.getLooper());
            this.h = true;
        }
    }

    @Override // defpackage.ffc
    public final void f(int i, int i2, long j, int i3) {
        b();
        fet h = h();
        h.a(i, i2, j, i3);
        Handler handler = this.g;
        int i4 = eul.a;
        handler.obtainMessage(1, h).sendToTarget();
    }

    @Override // defpackage.ffc
    public final void g(int i, ewh ewhVar, long j) {
        b();
        fet h = h();
        h.a(i, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = h.d;
        cryptoInfo.numSubSamples = ewhVar.f;
        cryptoInfo.numBytesOfClearData = j(ewhVar.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = j(ewhVar.e, cryptoInfo.numBytesOfEncryptedData);
        byte[] i2 = i(ewhVar.b, cryptoInfo.key);
        dzg.g(i2);
        cryptoInfo.key = i2;
        byte[] i3 = i(ewhVar.a, cryptoInfo.iv);
        dzg.g(i3);
        cryptoInfo.iv = i3;
        cryptoInfo.mode = ewhVar.c;
        int i4 = eul.a;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(ewhVar.g, ewhVar.h));
        this.g.obtainMessage(2, h).sendToTarget();
    }
}
