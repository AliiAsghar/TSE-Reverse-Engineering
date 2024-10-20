package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gld extends glm {
    private static final String[] v = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property w = new gkv(PointF.class);
    private static final Property x = new gkw(PointF.class);
    private static final Property y = new gkx(PointF.class);
    private static final Property z = new gky(PointF.class);
    private static final Property A = new gkz(PointF.class);

    private static final void e(glw glwVar) {
        View view = glwVar.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        glwVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        glwVar.a.put("android:changeBounds:parent", glwVar.b.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125 A[RETURN] */
    @Override // defpackage.glm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator a(android.view.ViewGroup r20, defpackage.glw r21, defpackage.glw r22) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gld.a(android.view.ViewGroup, glw, glw):android.animation.Animator");
    }

    @Override // defpackage.glm
    public final void b(glw glwVar) {
        e(glwVar);
    }

    @Override // defpackage.glm
    public final void c(glw glwVar) {
        e(glwVar);
    }

    @Override // defpackage.glm
    public final String[] d() {
        return v;
    }
}
