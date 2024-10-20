package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apvt extends UploadDataProvider {
    public final long b;
    public gul e;
    private final ExecutorService f;
    private final apus g;
    private final aegu h;
    private final boolean j;
    private long l;
    public int c = 0;
    public int d = 0;
    private int k = 0;
    public final AtomicLong a = new AtomicLong(0);
    private final byte[] i = new byte[65536];

    public apvt(ExecutorService executorService, apus apusVar, aegu aeguVar) {
        this.f = executorService;
        this.g = apusVar;
        this.h = aeguVar;
        this.l = aeguVar.a();
        boolean z = apusVar.e() == -1;
        this.j = z;
        this.b = z ? 0L : apusVar.e() - apusVar.d();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        if (this.j) {
            return -1L;
        }
        apus apusVar = this.g;
        long e = apusVar.e() - apusVar.d();
        apus apusVar2 = this.g;
        return Math.min(e, (apusVar2.b() + apusVar2.c()) - apusVar2.d());
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        boolean z = false;
        int a = this.g.a(this.i, 0, Math.min(65536, byteBuffer.capacity()));
        if (a > 0) {
            byteBuffer.put(this.i, 0, a);
            int i = this.k + a;
            this.k = i;
            if (i >= this.c) {
                if (this.d > 0) {
                    long a2 = this.h.a();
                    if (a2 - this.l >= this.d) {
                        this.l = a2;
                    }
                }
                this.a.getAndAdd(this.k);
                gul gulVar = this.e;
                if (gulVar != null) {
                    this.f.execute(gulVar);
                }
                this.k = 0;
            }
        }
        if (this.j && !this.g.i()) {
            z = true;
        }
        uploadDataSink.onReadSucceeded(z);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.g.h();
        uploadDataSink.onRewindSucceeded();
    }
}
