package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfy extends hfw {
    private final Paint j;
    private final Rect k;
    private final Rect l;
    private final hbm m;
    private hcw n;
    private hcw o;

    public hfy(hbl hblVar, hfz hfzVar) {
        super(hblVar, hfzVar);
        hbm hbmVar;
        this.j = new hbx(3);
        this.k = new Rect();
        this.l = new Rect();
        String str = hfzVar.f;
        hbb hbbVar = hblVar.a;
        if (hbbVar == null) {
            hbmVar = null;
        } else {
            hbmVar = (hbm) hbbVar.b.get(str);
        }
        this.m = hbmVar;
    }

    @Override // defpackage.hfw, defpackage.hep
    public final void a(Object obj, hig higVar) {
        super.a(obj, higVar);
        if (obj == hbq.K) {
            if (higVar == null) {
                this.n = null;
                return;
            } else {
                this.n = new hdn(higVar);
                return;
            }
        }
        if (obj == hbq.N) {
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
        hbm hbmVar = this.m;
        if (hbmVar != null) {
            float f = hbmVar.a;
            float a = hid.a();
            rectF.set(brg.a, brg.a, f * a, hbmVar.b * a);
            this.a.mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    @Override // defpackage.hfw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r11, android.graphics.Matrix r12, int r13) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfy.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
