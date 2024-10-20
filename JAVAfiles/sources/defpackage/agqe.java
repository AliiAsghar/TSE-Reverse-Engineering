package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.TextureView;
import com.google.common.util.concurrent.SettableFuture;
import com.google.mediapipe.framework.TextureFrame;
import java.util.ArrayDeque;
import java.util.Deque;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agqe implements TextureView.SurfaceTextureListener, aoxl {
    public static final String a = "agqe";
    public final EGLContext b;
    public final Deque c = new ArrayDeque(10);
    public final SettableFuture d = SettableFuture.create();
    public SurfaceTexture e;
    public Surface f;
    public int g;
    public int h;
    public aoxl i;
    public EGLSurface j;
    public aoxu k;
    public asmg l;
    private final float[] m;
    private HandlerThread n;
    private Handler o;

    public agqe(EGLContext eGLContext, TextureView textureView) {
        float[] fArr = new float[16];
        this.m = fArr;
        this.b = eGLContext;
        Matrix.setIdentityM(fArr, 0);
        this.e = textureView.getSurfaceTexture();
        c();
        textureView.setSurfaceTextureListener(this);
    }

    private final void c() {
        HandlerThread handlerThread = new HandlerThread(a);
        this.n = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.n.getLooper());
        this.o = handler;
        handler.post(new agqd(this, 1));
    }

    @Override // defpackage.aoxl
    public final void a(TextureFrame textureFrame) {
        if (this.n.isAlive() && this.o != null) {
            synchronized (this.c) {
                if (!this.c.offerLast(textureFrame)) {
                    textureFrame.release();
                }
            }
            this.o.post(new agqd(this, 2));
            return;
        }
        textureFrame.release();
    }

    public final synchronized void b() {
        Handler handler;
        if (this.n.isAlive() && (handler = this.o) != null) {
            handler.post(new agqd(this, 0));
            this.n.quitSafely();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.e = surfaceTexture;
        this.g = i;
        this.h = i2;
        if (!this.n.isAlive()) {
            c();
        }
        this.o.post(new agqd(this, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.g = i;
        this.h = i2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
