package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqq {
    public static final eqq a = new eqq(-1, -1, -1, -1);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public eqq(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final void a() {
        int i = this.b;
        if (i != -1) {
            ett.q(i);
        }
        int i2 = this.c;
        if (i2 != -1) {
            int[] iArr = ett.a;
            GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
            ett.m();
        }
    }
}
