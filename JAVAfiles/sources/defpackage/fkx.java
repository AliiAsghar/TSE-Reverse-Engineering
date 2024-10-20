package defpackage;

import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkx implements GLSurfaceView.Renderer, fkr {
    final /* synthetic */ fky a;
    private final fkw b;
    private final float[] e;
    private final float[] f;
    private final float[] g;
    private float h;
    private float i;
    private final float[] c = new float[16];
    private final float[] d = new float[16];
    private final float[] j = new float[16];
    private final float[] k = new float[16];

    public fkx(fky fkyVar, fkw fkwVar) {
        this.a = fkyVar;
        float[] fArr = new float[16];
        this.e = fArr;
        float[] fArr2 = new float[16];
        this.f = fArr2;
        float[] fArr3 = new float[16];
        this.g = fArr3;
        this.b = fkwVar;
        ett.w(fArr);
        ett.w(fArr2);
        ett.w(fArr3);
        this.i = 3.1415927f;
    }

    private final void c() {
        Matrix.setRotateM(this.f, 0, -this.h, (float) Math.cos(this.i), (float) Math.sin(this.i), brg.a);
    }

    @Override // defpackage.fkr
    public final synchronized void a(float[] fArr, float f) {
        System.arraycopy(fArr, 0, this.e, 0, 16);
        this.i = -f;
        c();
    }

    public final synchronized void b(PointF pointF) {
        this.h = pointF.y;
        c();
        Matrix.setRotateM(this.g, 0, -pointF.x, brg.a, 1.0f, brg.a);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        synchronized (this) {
            Matrix.multiplyMM(this.k, 0, this.e, 0, this.g, 0);
            Matrix.multiplyMM(this.j, 0, this.f, 0, this.k, 0);
        }
        Matrix.multiplyMM(this.d, 0, this.c, 0, this.j, 0);
        fkw fkwVar = this.b;
        float[] fArr2 = this.d;
        GLES20.glClear(16384);
        try {
            ett.m();
        } catch (ets e) {
            eub.d("SceneRenderer", "Failed to draw a frame", e);
        }
        if (fkwVar.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = fkwVar.g;
            dzg.g(surfaceTexture);
            surfaceTexture.updateTexImage();
            try {
                ett.m();
            } catch (ets e2) {
                eub.d("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (fkwVar.b.compareAndSet(true, false)) {
                ett.w(fkwVar.d);
            }
            long timestamp = fkwVar.g.getTimestamp();
            Long l = (Long) fkwVar.h.e(timestamp);
            if (l != null) {
                akju akjuVar = fkwVar.j;
                float[] fArr3 = fkwVar.d;
                float[] fArr4 = (float[]) ((fxg) akjuVar.d).g(l.longValue());
                if (fArr4 != null) {
                    Object obj = akjuVar.b;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != brg.a) {
                        Matrix.setRotateM((float[]) obj, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        ett.w((float[]) obj);
                    }
                    if (!akjuVar.a) {
                        akju.e((float[]) akjuVar.c, (float[]) akjuVar.b);
                        akjuVar.a = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) akjuVar.c, 0, (float[]) akjuVar.b, 0);
                }
            }
            anna annaVar = (anna) fkwVar.i.g(timestamp);
            if (annaVar != null) {
                fku fkuVar = fkwVar.c;
                if (fku.a(annaVar)) {
                    fkuVar.d = annaVar.a;
                    fkuVar.e = new fkt(((efu) annaVar.c).v());
                    if (!annaVar.b) {
                        new fkt(((efu) annaVar.d).v());
                    }
                }
            }
        }
        Matrix.multiplyMM(fkwVar.e, 0, fArr2, 0, fkwVar.d, 0);
        fku fkuVar2 = fkwVar.c;
        int i = fkwVar.f;
        float[] fArr5 = fkwVar.e;
        fkt fktVar = fkuVar2.e;
        if (fktVar == null) {
            return;
        }
        int i2 = fkuVar2.d;
        if (i2 == 1) {
            fArr = fku.b;
        } else if (i2 == 2) {
            fArr = fku.c;
        } else {
            fArr = fku.a;
        }
        GLES20.glUniformMatrix3fv(fkuVar2.h, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(fkuVar2.g, 1, false, fArr5, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(fkuVar2.k, 0);
        try {
            ett.m();
        } catch (ets e3) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e3);
        }
        GLES20.glVertexAttribPointer(fkuVar2.i, 3, 5126, false, 12, (Buffer) fktVar.c);
        try {
            ett.m();
        } catch (ets e4) {
            Log.e("ProjectionRenderer", "Failed to load position data", e4);
        }
        GLES20.glVertexAttribPointer(fkuVar2.j, 2, 5126, false, 8, (Buffer) fktVar.d);
        try {
            ett.m();
        } catch (ets e5) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e5);
        }
        GLES20.glDrawArrays(fktVar.b, 0, fktVar.a);
        try {
            ett.m();
        } catch (ets e6) {
            Log.e("ProjectionRenderer", "Failed to render", e6);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        float f;
        GLES20.glViewport(0, 0, i, i2);
        float f2 = i / i2;
        if (f2 > 1.0f) {
            double degrees = Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2));
            f = (float) (degrees + degrees);
        } else {
            f = 90.0f;
        }
        Matrix.perspectiveM(this.c, 0, f, f2, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        final fkw fkwVar = this.b;
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            ett.m();
            fku fkuVar = fkwVar.c;
            try {
                fkuVar.f = new etr("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
                fkuVar.g = fkuVar.f.c("uMvpMatrix");
                fkuVar.h = fkuVar.f.c("uTexMatrix");
                fkuVar.i = fkuVar.f.a("aPosition");
                fkuVar.j = fkuVar.f.a("aTexCoords");
                fkuVar.k = fkuVar.f.c("uTexture");
            } catch (ets e) {
                Log.e("ProjectionRenderer", "Failed to initialize the program", e);
            }
            ett.m();
            fkwVar.f = ett.a();
        } catch (ets e2) {
            eub.d("SceneRenderer", "Failed to initialize the renderer", e2);
        }
        fky fkyVar = this.a;
        fkwVar.g = new SurfaceTexture(fkwVar.f);
        fkwVar.g.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: fkv
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                fkw.this.a.set(true);
            }
        });
        fkyVar.b.post(new fhh((Object) fkyVar, (Object) fkwVar.g, 5, (byte[]) null));
    }
}
