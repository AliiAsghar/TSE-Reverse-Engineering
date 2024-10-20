package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewy implements eqp {
    private final EGLContext a = EGL14.EGL_NO_CONTEXT;
    private final List b = new ArrayList();

    @Override // defpackage.eqp
    public final EGLContext a(EGLDisplay eGLDisplay, int i, int[] iArr) {
        List list = this.b;
        EGLContext g = ett.g(this.a, eGLDisplay, i, iArr);
        list.add(g);
        return g;
    }

    @Override // defpackage.eqp
    public final EGLSurface b(EGLDisplay eGLDisplay, Object obj, int i, boolean z) {
        return ett.i(eGLDisplay, obj, i, z);
    }

    @Override // defpackage.eqp
    public final EGLSurface c(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        return ett.j(eGLContext, eGLDisplay);
    }

    @Override // defpackage.eqp
    public final eqq d(int i, int i2, int i3) {
        int[] iArr = ett.a;
        int[] iArr2 = new int[1];
        GLES20.glGenFramebuffers(1, iArr2, 0);
        ett.m();
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        ett.m();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        ett.m();
        return new eqq(i, iArr2[0], i2, i3);
    }

    @Override // defpackage.eqp
    public final void e(EGLDisplay eGLDisplay) {
        for (int i = 0; i < this.b.size(); i++) {
            ett.r(eGLDisplay, (EGLContext) this.b.get(i));
        }
    }
}
