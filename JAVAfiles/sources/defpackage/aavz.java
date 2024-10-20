package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavz extends Animation {
    final /* synthetic */ aawa a;
    private final float b = 1.0f;
    private final float c = 1.0f;

    public aavz(aawa aawaVar) {
        this.a = aawaVar;
        setFillAfter(true);
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        aawa aawaVar = this.a;
        float f2 = this.c;
        float f3 = this.b;
        aawaVar.i = (int) (f3 + ((f2 - f3) * f));
    }
}
