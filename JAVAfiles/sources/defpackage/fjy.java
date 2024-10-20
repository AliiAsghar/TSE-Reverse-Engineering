package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjy extends Surface {
    public static int a;
    private static boolean c;
    public final boolean b;
    private final fjx d;
    private boolean e;

    public fjy(fjx fjxVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.d = fjxVar;
        this.b = z;
    }

    public static synchronized boolean a() {
        int i;
        int i2;
        synchronized (fjy.class) {
            if (!c) {
                int[] iArr = ett.a;
                int i3 = eul.a;
                if (ett.x("EGL_EXT_protected_content")) {
                    if (ett.y()) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 0;
                }
                a = i2;
                c = true;
            }
            i = a;
        }
        if (i == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.d) {
            if (!this.e) {
                fjx fjxVar = this.d;
                dzg.g(fjxVar.b);
                fjxVar.b.sendEmptyMessage(2);
                this.e = true;
            }
        }
    }
}
