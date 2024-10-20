package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import com.google.mediapipe.framework.GlSyncToken;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoxj extends aoxr implements SurfaceTexture.OnFrameAvailableListener {
    public volatile SurfaceTexture a;
    public final List b;
    public volatile boolean c;
    public final Queue d;
    public int e;
    public aoxq f;
    public final boolean g;
    public long h;
    public long i;
    public boolean j;
    public int k;
    public int l;
    private volatile SurfaceTexture u;
    private int[] v;
    private final int w;

    public aoxj(EGLContext eGLContext) {
        super(eGLContext);
        this.a = null;
        this.u = null;
        this.v = null;
        this.c = false;
        this.d = new ArrayDeque();
        this.e = 0;
        this.f = null;
        this.g = true;
        this.h = 0L;
        this.i = 0L;
        this.j = false;
        this.k = 0;
        this.l = 0;
        this.w = 2;
        this.f = new aoxq();
        this.b = new ArrayList();
    }

    public static void f(aoxm aoxmVar) {
        GLES20.glDeleteTextures(1, new int[]{aoxmVar.b}, 0);
    }

    public static final void g(aoxm aoxmVar) {
        GlSyncToken glSyncToken;
        try {
            if (Log.isLoggable("ExternalTextureConv", 2)) {
                Log.v("ExternalTextureConv", String.format("Waiting for tex: %d width: %d height: %d timestamp: %d", Integer.valueOf(aoxmVar.b), Integer.valueOf(aoxmVar.c), Integer.valueOf(aoxmVar.d), Long.valueOf(aoxmVar.e)));
            }
            synchronized (aoxmVar) {
                while (aoxmVar.f && aoxmVar.g == null) {
                    aoxmVar.wait();
                }
                glSyncToken = aoxmVar.g;
                if (glSyncToken != null) {
                    aoxmVar.f = false;
                    aoxmVar.g = null;
                } else {
                    glSyncToken = null;
                }
            }
            if (glSyncToken != null) {
                glSyncToken.waitOnGpu();
                glSyncToken.release();
            }
            if (Log.isLoggable("ExternalTextureConv", 2)) {
                Log.v("ExternalTextureConv", String.format("Finished waiting for tex: %d width: %d height: %d timestamp: %d", Integer.valueOf(aoxmVar.b), Integer.valueOf(aoxmVar.c), Integer.valueOf(aoxmVar.d), Long.valueOf(aoxmVar.e)));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e("ExternalTextureConv", "thread was unexpectedly interrupted: ".concat(String.valueOf(e.getMessage())));
            throw new RuntimeException(e);
        }
    }

    public final aoxi a() {
        int i = this.k;
        int i2 = this.l;
        int[] iArr = {0};
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        aoxt.c("glTexImage2D");
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        aoxt.c("texture setup");
        int i3 = iArr[0];
        Log.d("ExternalTextureConv", String.format("Created output texture: %d width: %d height: %d", Integer.valueOf(i3), Integer.valueOf(this.k), Integer.valueOf(this.l)));
        h(i3, this.k, this.l);
        return new aoxi(this, i3, this.k, this.l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void b(aoxi aoxiVar) {
        this.d.offer(aoxiVar);
        int i = this.e - 1;
        this.e = i;
        int max = Math.max(this.w - i, 0);
        while (this.d.size() > max) {
            this.q.post(new aomp((aoxi) this.d.remove(), 3));
        }
    }

    @Override // defpackage.aoxr
    public final void c() {
        super.c();
        GLES20.glClearColor(brg.a, brg.a, brg.a, 1.0f);
        aoxq aoxqVar = this.f;
        HashMap hashMap = new HashMap();
        hashMap.put("position", 1);
        hashMap.put("texture_coordinate", 2);
        int d = aoxt.d("#extension GL_OES_EGL_image_external : require\nvarying mediump vec2 sample_coordinate;\nuniform samplerExternalOES video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}", hashMap);
        aoxqVar.c = d;
        aoxqVar.d = GLES20.glGetUniformLocation(d, "video_frame");
        aoxqVar.e = GLES20.glGetUniformLocation(aoxqVar.c, "texture_transform");
        aoxt.c("glGetUniformLocation");
        int[] iArr = new int[1];
        this.v = iArr;
        GLES20.glGenTextures(1, iArr, 0);
        this.u = new SurfaceTexture(this.v[0]);
        e(this.u, 0, 0);
    }

    @Override // defpackage.aoxr
    public final void d() {
        e(null, 0, 0);
        while (!this.d.isEmpty()) {
            f((aoxm) this.d.remove());
        }
        this.u.release();
        int[] iArr = this.v;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
        }
        GLES20.glDeleteProgram(this.f.c);
        super.d();
    }

    public final void e(SurfaceTexture surfaceTexture, int i, int i2) {
        this.c = false;
        if (this.a != null) {
            this.a.setOnFrameAvailableListener(null);
        }
        this.a = surfaceTexture;
        if (this.a != null) {
            this.a.setOnFrameAvailableListener(this);
        }
        this.k = i;
        this.l = i2;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.q.post(new aofk(this, surfaceTexture, 20, null));
    }
}
