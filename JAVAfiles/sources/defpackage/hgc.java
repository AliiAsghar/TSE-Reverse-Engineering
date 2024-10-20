package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgc extends hfw {
    private final RectF j;
    private final Paint k;
    private final float[] l;
    private final Path m;
    private final hfz n;
    private hcw o;

    public hgc(hbl hblVar, hfz hfzVar) {
        super(hblVar, hfzVar);
        this.j = new RectF();
        hbx hbxVar = new hbx();
        this.k = hbxVar;
        this.l = new float[8];
        this.m = new Path();
        this.n = hfzVar;
        hbxVar.setAlpha(0);
        hbxVar.setStyle(Paint.Style.FILL);
        hbxVar.setColor(hfzVar.k);
    }

    @Override // defpackage.hfw, defpackage.hep
    public final void a(Object obj, hig higVar) {
        super.a(obj, higVar);
        if (obj == hbq.K) {
            if (higVar == null) {
                this.o = null;
            } else {
                this.o = new hdn(higVar);
            }
        }
    }

    @Override // defpackage.hfw, defpackage.hcb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        hfz hfzVar = this.n;
        this.j.set(brg.a, brg.a, hfzVar.i, hfzVar.j);
        this.a.mapRect(this.j);
        rectF.set(this.j);
    }

    @Override // defpackage.hfw
    public final void j(Canvas canvas, Matrix matrix, int i) {
        int intValue;
        int alpha = Color.alpha(this.n.k);
        if (alpha != 0) {
            hcw hcwVar = this.g.e;
            if (hcwVar == null) {
                intValue = 100;
            } else {
                intValue = ((Integer) hcwVar.e()).intValue();
            }
            int i2 = (int) ((i / 255.0f) * (((alpha / 255.0f) * intValue) / 100.0f) * 255.0f);
            this.k.setAlpha(i2);
            hcw hcwVar2 = this.o;
            if (hcwVar2 != null) {
                this.k.setColorFilter((ColorFilter) hcwVar2.e());
            }
            if (i2 > 0) {
                float[] fArr = this.l;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                hfz hfzVar = this.n;
                float f = hfzVar.i;
                fArr[2] = f;
                fArr[3] = 0.0f;
                fArr[4] = f;
                float f2 = hfzVar.j;
                fArr[5] = f2;
                fArr[6] = 0.0f;
                fArr[7] = f2;
                matrix.mapPoints(fArr);
                this.m.reset();
                Path path = this.m;
                float[] fArr2 = this.l;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.m;
                float[] fArr3 = this.l;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.m;
                float[] fArr4 = this.l;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.m;
                float[] fArr5 = this.l;
                path4.lineTo(fArr5[6], fArr5[7]);
                Path path5 = this.m;
                float[] fArr6 = this.l;
                path5.lineTo(fArr6[0], fArr6[1]);
                this.m.close();
                canvas.drawPath(this.m, this.k);
            }
        }
    }
}
