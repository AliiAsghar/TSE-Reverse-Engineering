package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjx extends HandlerThread implements Handler.Callback {
    public eto a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public fjy e;

    public fjx() {
        super("ExoPlayer:PlaceholderSurface");
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        boolean z2;
        int[] iArr;
        boolean z3;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        boolean z4;
        int i = message.what;
        boolean z5 = false;
        try {
            if (i != 1) {
                if (i == 2) {
                    try {
                        dzg.g(this.a);
                        eto etoVar = this.a;
                        etoVar.b.removeCallbacks(etoVar);
                        try {
                            SurfaceTexture surfaceTexture = etoVar.g;
                            if (surfaceTexture != null) {
                                surfaceTexture.release();
                                GLES20.glDeleteTextures(1, etoVar.c, 0);
                            }
                            EGLDisplay eGLDisplay = etoVar.d;
                            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                                EGL14.eglMakeCurrent(etoVar.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                            }
                            EGLSurface eGLSurface = etoVar.f;
                            if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                                EGL14.eglDestroySurface(etoVar.d, etoVar.f);
                            }
                            EGLContext eGLContext = etoVar.e;
                            if (eGLContext != null) {
                                EGL14.eglDestroyContext(etoVar.d, eGLContext);
                            }
                            EGL14.eglReleaseThread();
                            EGLDisplay eGLDisplay2 = etoVar.d;
                            if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                                EGL14.eglTerminate(etoVar.d);
                            }
                            etoVar.d = null;
                            etoVar.e = null;
                            etoVar.f = null;
                            etoVar.g = null;
                        } catch (Throwable th) {
                            EGLDisplay eGLDisplay3 = etoVar.d;
                            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                                EGL14.eglMakeCurrent(etoVar.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                            }
                            EGLSurface eGLSurface2 = etoVar.f;
                            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                                EGL14.eglDestroySurface(etoVar.d, etoVar.f);
                            }
                            EGLContext eGLContext2 = etoVar.e;
                            if (eGLContext2 != null) {
                                EGL14.eglDestroyContext(etoVar.d, eGLContext2);
                            }
                            EGL14.eglReleaseThread();
                            EGLDisplay eGLDisplay4 = etoVar.d;
                            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                                EGL14.eglTerminate(etoVar.d);
                            }
                            etoVar.d = null;
                            etoVar.e = null;
                            etoVar.f = null;
                            etoVar.g = null;
                            throw th;
                        }
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    return true;
                }
            } else {
                try {
                    int i2 = message.arg1;
                    dzg.g(this.a);
                    eto etoVar2 = this.a;
                    EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    if (eglGetDisplay != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ett.n(z, "eglGetDisplay failed");
                    int[] iArr3 = new int[2];
                    ett.n(EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1), "eglInitialize failed");
                    etoVar2.d = eglGetDisplay;
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr4 = new int[1];
                    boolean eglChooseConfig = EGL14.eglChooseConfig(etoVar2.d, eto.a, 0, eGLConfigArr, 0, 1, iArr4, 0);
                    if (eglChooseConfig && iArr4[0] > 0 && eGLConfigArr[0] != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ett.n(z2, eul.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]));
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    EGLDisplay eGLDisplay5 = etoVar2.d;
                    if (i2 == 0) {
                        iArr = new int[]{12440, 2, 12344};
                    } else {
                        iArr = new int[]{12440, 2, 12992, 1, 12344};
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay5, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    if (eglCreateContext != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ett.n(z3, "eglCreateContext failed");
                    etoVar2.e = eglCreateContext;
                    EGLDisplay eGLDisplay6 = etoVar2.d;
                    EGLContext eGLContext3 = etoVar2.e;
                    if (i2 == 1) {
                        eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                    } else {
                        if (i2 == 2) {
                            iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                        } else {
                            iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                        }
                        eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay6, eGLConfig, iArr2, 0);
                        if (eglCreatePbufferSurface != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        ett.n(z4, "eglCreatePbufferSurface failed");
                    }
                    ett.n(EGL14.eglMakeCurrent(eGLDisplay6, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext3), "eglMakeCurrent failed");
                    etoVar2.f = eglCreatePbufferSurface;
                    GLES20.glGenTextures(1, etoVar2.c, 0);
                    ett.m();
                    etoVar2.g = new SurfaceTexture(etoVar2.c[0]);
                    etoVar2.g.setOnFrameAvailableListener(etoVar2);
                    SurfaceTexture surfaceTexture2 = this.a.g;
                    dzg.g(surfaceTexture2);
                    if (i2 != 0) {
                        z5 = true;
                    }
                    this.e = new fjy(this, surfaceTexture2, z5);
                    synchronized (this) {
                        notify();
                    }
                } catch (ets e) {
                    eub.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.d = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    eub.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    eub.d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.d = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
