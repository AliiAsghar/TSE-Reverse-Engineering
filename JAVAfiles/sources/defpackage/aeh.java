package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aeh extends ddb implements chn {
    private final ade a;
    private final ael b;
    private final afj c;

    public aeh(ade adeVar, ael aelVar, afj afjVar) {
        this.a = adeVar;
        this.b = aelVar;
        this.c = afjVar;
    }

    private static final boolean e(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // defpackage.cga
    public final /* synthetic */ cga a(cga cgaVar) {
        return cfz.a(this, cgaVar);
    }

    @Override // defpackage.cga
    public final /* synthetic */ Object b(Object obj, arqv arqvVar) {
        return cgb.a(this, obj, arqvVar);
    }

    @Override // defpackage.cga
    public final /* synthetic */ boolean c(arqr arqrVar) {
        return cgb.b(this, arqrVar);
    }

    @Override // defpackage.chn
    public final void d(cnt cntVar) {
        boolean z;
        this.a.f(cntVar.o());
        if (cjt.f(cntVar.o())) {
            cntVar.p();
            return;
        }
        cntVar.p();
        this.a.b.a();
        Canvas a = cjx.a(cntVar.q().b());
        ael aelVar = this.b;
        boolean z2 = false;
        if (aelVar.l()) {
            EdgeEffect c = aelVar.c();
            float f = -Float.intBitsToFloat((int) (cntVar.o() & 4294967295L));
            float em = cntVar.em(this.c.b.b(cntVar.r()));
            z = e(270.0f, (Float.floatToRawIntBits(em) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), c, a);
        } else {
            z = false;
        }
        if (aelVar.r()) {
            EdgeEffect g = aelVar.g();
            float em2 = cntVar.em(((amk) this.c.b).a);
            if (!e(brg.a, (Float.floatToRawIntBits(em2) & 4294967295L) | (Float.floatToRawIntBits(brg.a) << 32), g, a) && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        if (aelVar.o()) {
            EdgeEffect e = aelVar.e();
            int g2 = arsk.g(Float.intBitsToFloat((int) (cntVar.o() >> 32)));
            float f2 = -g2;
            float em3 = f2 + cntVar.em(this.c.b.c(cntVar.r()));
            if (!e(90.0f, (Float.floatToRawIntBits(em3) & 4294967295L) | (Float.floatToRawIntBits(brg.a) << 32), e, a) && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        if (aelVar.i()) {
            EdgeEffect a2 = aelVar.a();
            float em4 = cntVar.em(((amk) this.c.b).b);
            float f3 = -Float.intBitsToFloat((int) (cntVar.o() >> 32));
            float f4 = (-Float.intBitsToFloat((int) (cntVar.o() & 4294967295L))) + em4;
            if (e(180.0f, (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), a2, a) || z) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            this.a.e();
        }
    }
}
