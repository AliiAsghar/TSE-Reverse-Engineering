package defpackage;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyj implements eqp {
    public EGLContext a;
    private final eqp b = new ewy();

    @Override // defpackage.eqp
    public final EGLContext a(EGLDisplay eGLDisplay, int i, int[] iArr) {
        if (this.a == null) {
            this.a = this.b.a(eGLDisplay, i, iArr);
        }
        return this.a;
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
        return this.b.d(i, i2, i3);
    }

    @Override // defpackage.eqp
    public final void e(EGLDisplay eGLDisplay) {
    }
}
