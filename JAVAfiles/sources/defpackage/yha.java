package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yha implements SurfaceTexture.OnFrameAvailableListener {
    public static final int a = (int) TimeUnit.SECONDS.toMillis(5);
    public SurfaceTexture b;
    public Surface c;
    public final Object d = new Object();
    public final yhb e;
    public volatile boolean f;

    /* JADX WARN: Removed duplicated region for block: B:35:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private yha(float r8, float r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yha.<init>(float, float, boolean):void");
    }

    public static yha a(float f, float f2, boolean z) {
        yha yhaVar = new yha(f, f2, z);
        SurfaceTexture surfaceTexture = new SurfaceTexture(yhaVar.e.e);
        yhaVar.b = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(yhaVar);
        yhaVar.c = new Surface(yhaVar.b);
        return yhaVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.d) {
            if (!this.f) {
                this.f = true;
                this.d.notifyAll();
            } else {
                throw new RuntimeException("frameAvailable already set, frame could be dropped");
            }
        }
    }
}
