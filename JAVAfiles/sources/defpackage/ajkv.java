package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajkv extends ajla {
    private final ajkx a;

    public ajkv(ajkx ajkxVar) {
        this.a = ajkxVar;
    }

    @Override // defpackage.ajla
    public final void a(Matrix matrix, ajkc ajkcVar, int i, Canvas canvas) {
        boolean z;
        ajkx ajkxVar = this.a;
        float f = ajkxVar.e;
        float f2 = ajkxVar.f;
        RectF rectF = new RectF(ajkxVar.a, ajkxVar.b, ajkxVar.c, ajkxVar.d);
        if (f2 < brg.a) {
            z = true;
        } else {
            z = false;
        }
        Path path = ajkcVar.k;
        if (z) {
            int[] iArr = ajkc.c;
            iArr[0] = 0;
            iArr[1] = ajkcVar.j;
            iArr[2] = ajkcVar.i;
            iArr[3] = ajkcVar.h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = ajkc.c;
            iArr2[0] = 0;
            iArr2[1] = ajkcVar.h;
            iArr2[2] = ajkcVar.i;
            iArr2[3] = ajkcVar.j;
        }
        float width = rectF.width() / 2.0f;
        if (width <= brg.a) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = ajkc.d;
        fArr[1] = f4;
        fArr[2] = f4 + ((1.0f - f4) / 2.0f);
        ajkcVar.f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, ajkc.c, ajkc.d, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, ajkcVar.l);
        }
        canvas.drawArc(rectF, f, f2, true, ajkcVar.f);
        canvas.restore();
    }
}
