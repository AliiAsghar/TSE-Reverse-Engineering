package defpackage;

import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aoxr extends Thread {
    public boolean m;
    public boolean n;
    public final Object o = new Object();
    protected EGLSurface p = null;
    public Handler q = null;
    public Looper r = null;
    protected int s = 0;
    protected volatile asmg t;

    public aoxr(Object obj) {
        this.t = new asmg(obj, (byte[]) null);
        setName("drishti.glutil.GlThread");
    }

    public void c() {
        this.p = this.t.l();
        asmg asmgVar = this.t;
        EGLSurface eGLSurface = this.p;
        asmgVar.h(eGLSurface, eGLSurface);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.s = iArr[0];
    }

    public void d() {
        int i = this.s;
        if (i != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.s = 0;
        }
        this.t.i();
        if (this.p != null) {
            this.t.k(this.p);
            this.p = null;
        }
    }

    public final void h(int i, int i2, int i3) {
        GLES20.glBindFramebuffer(36160, this.s);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLES20.glViewport(0, 0, i2, i3);
            aoxt.c("glViewport");
            return;
        }
        throw new aoxs(a.bV(glCheckFramebufferStatus, "Framebuffer not complete, status="));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            try {
                Looper.prepare();
                this.q = new Handler();
                this.r = Looper.myLooper();
                Log.d("GlThread", String.format("Starting GL thread %s", getName()));
                c();
                this.n = true;
                synchronized (this.o) {
                    this.m = true;
                    this.o.notify();
                }
                try {
                    Looper.loop();
                    this.r = null;
                    d();
                    this.t.j();
                    Log.d("GlThread", String.format("Stopping GL thread %s", getName()));
                } catch (Throwable th) {
                    this.r = null;
                    d();
                    this.t.j();
                    Log.d("GlThread", String.format("Stopping GL thread %s", getName()));
                    throw th;
                }
            } catch (RuntimeException e) {
                d();
                this.t.j();
                throw e;
            }
        } catch (Throwable th2) {
            synchronized (this.o) {
                this.m = true;
                this.o.notify();
                throw th2;
            }
        }
    }
}
