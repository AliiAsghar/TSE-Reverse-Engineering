package defpackage;

import com.google.communication.synapse.security.scytale.MediaEncryptor;
import com.google.media.webrtc.common.StatusOr;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anie extends InputStream implements InputStreamRetargetInterface {
    private final InputStream a;
    private final boolean b;
    private boolean c;
    private int d;
    private final byte[] e;
    private byte[] f;
    private final MediaEncryptor g;
    private final int h;
    private final int i;

    public anie(InputStream inputStream, MediaEncryptor mediaEncryptor) {
        this(inputStream, mediaEncryptor, 1, a(), true);
    }

    public static int a() {
        boolean z;
        int blockSize = MediaEncryptor.getBlockSize();
        if (blockSize <= 102400) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        return (102400 / blockSize) * blockSize;
    }

    private final StatusOr b(byte[] bArr, boolean z) {
        if (this.i == 1) {
            return this.g.encrypt(bArr, z);
        }
        return this.g.decrypt(bArr, z);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            this.a.close();
        }
        super.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream
    public final int read() {
        int i;
        byte[] bArr = this.f;
        if (bArr == null || bArr.length == (i = this.d)) {
            i = 0;
            if (this.c) {
                this.f = new byte[0];
            } else {
                int read = this.a.read(this.e, 0, this.h);
                int i2 = 0;
                while (true) {
                    if (read != -1) {
                        i2 += read;
                        byte[] bArr2 = this.e;
                        if (i2 == bArr2.length) {
                            StatusOr b = b(bArr2, false);
                            if (b.hasValue) {
                                this.f = (byte[]) b.value;
                            } else {
                                throw new aqwb(b.status);
                            }
                        } else {
                            read = this.a.read(bArr2, i2, this.h - i2);
                        }
                    } else {
                        this.c = true;
                        StatusOr b2 = b(Arrays.copyOf(this.e, i2), true);
                        if (b2.hasValue) {
                            this.f = (byte[]) b2.value;
                        } else {
                            throw new IOException("Unable to process chunk", b2.status.asException());
                        }
                    }
                }
            }
            this.d = 0;
        }
        byte[] bArr3 = this.f;
        if (bArr3 == null || bArr3.length == 0) {
            return -1;
        }
        byte b3 = bArr3[i];
        this.d = i + 1;
        return b3 & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public anie(InputStream inputStream, MediaEncryptor mediaEncryptor, int i, int i2, boolean z) {
        this.c = false;
        this.d = 0;
        d.t(i2 % MediaEncryptor.getBlockSize() == 0, "bockSize must be a multiple of MediaEncryptor.getBlockSize()");
        this.a = inputStream;
        this.g = mediaEncryptor;
        this.i = i;
        this.h = i2;
        this.e = new byte[i2];
        this.b = z;
    }
}
