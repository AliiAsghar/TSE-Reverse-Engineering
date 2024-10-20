package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajkw extends ajla {
    private final ajky a;
    private final float b;
    private final float e;

    public ajkw(ajky ajkyVar, float f, float f2) {
        this.a = ajkyVar;
        this.b = f;
        this.e = f2;
    }

    @Override // defpackage.ajla
    public final void a(Matrix matrix, ajkc ajkcVar, int i, Canvas canvas) {
        ajky ajkyVar = this.a;
        RectF rectF = new RectF(brg.a, brg.a, (float) Math.hypot(ajkyVar.b - this.e, ajkyVar.a - this.b), brg.a);
        this.d.set(matrix);
        this.d.preTranslate(this.b, this.e);
        this.d.preRotate(b());
        rectF.bottom += i;
        rectF.offset(brg.a, -i);
        int[] iArr = ajkc.a;
        iArr[0] = ajkcVar.j;
        iArr[1] = ajkcVar.i;
        iArr[2] = ajkcVar.h;
        ajkcVar.g.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, ajkc.a, ajkc.b, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(this.d);
        canvas.drawRect(rectF, ajkcVar.g);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float b() {
        ajky ajkyVar = this.a;
        return (float) Math.toDegrees(Math.atan((ajkyVar.b - this.e) / (ajkyVar.a - this.b)));
    }
}
