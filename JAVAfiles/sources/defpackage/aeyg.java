package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aeyg extends arrp implements arqr {
    final /* synthetic */ byn a;
    final /* synthetic */ aov b;
    final /* synthetic */ byn c;
    final /* synthetic */ float d;
    final /* synthetic */ aeyi e;
    final /* synthetic */ byn f;
    final /* synthetic */ long g;
    final /* synthetic */ long h;
    final /* synthetic */ long i;
    final /* synthetic */ long j;
    final /* synthetic */ long k;
    final /* synthetic */ boolean l;
    final /* synthetic */ arqr m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeyg(byn bynVar, aov aovVar, byn bynVar2, float f, aeyi aeyiVar, byn bynVar3, long j, long j2, long j3, long j4, long j5, boolean z, arqr arqrVar) {
        super(1);
        this.a = bynVar;
        this.b = aovVar;
        this.c = bynVar2;
        this.d = f;
        this.e = aeyiVar;
        this.f = bynVar3;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = j4;
        this.k = j5;
        this.l = z;
        this.m = arqrVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        float f;
        long j;
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2;
        float f2;
        float f3;
        cnt cntVar = (cnt) obj;
        cntVar.getClass();
        if (!a.bB(((cjt) this.a.a()).a, cntVar.o())) {
            this.a.h(new cjt(cntVar.o()));
        }
        cntVar.p();
        aov aovVar = this.b;
        boolean booleanValue = ((Boolean) this.c.a()).booleanValue();
        float f4 = this.d;
        byn bynVar = this.f;
        aeyi aeyiVar = this.e;
        long j3 = this.g;
        long j4 = this.h;
        long j5 = this.i;
        long j6 = this.j;
        long j7 = this.k;
        boolean z = this.l;
        arqr arqrVar = this.m;
        anw anwVar = (anw) aqjn.Z(aovVar.d().i());
        if (anwVar != null && (aovVar.i() || booleanValue || f4 > brg.a)) {
            Float f5 = aeyiVar.a;
            float intBitsToFloat3 = Float.intBitsToFloat((int) (cntVar.o() & 4294967295L));
            float em = cntVar.em(2.0f);
            float f6 = intBitsToFloat3 - (em + em);
            int d = aovVar.d().d() - aovVar.d().i().size();
            bynVar.h(Float.valueOf(Math.max(f5.floatValue() * f6, (f6 * f6) / (((aovVar.d().e() - aovVar.d().f()) / aovVar.d().i().size()) * r20))));
            if (d > 0) {
                f = anwVar.a() / d;
            } else {
                f = 1.0f;
            }
            float em2 = (f6 + cntVar.em(2.0f)) - ((Number) bynVar.a()).floatValue();
            if (z) {
                intBitsToFloat = cntVar.em(1.0f) + (cntVar.em(2.0f) / 2.0f);
                j = j5;
            } else {
                j = j5;
                intBitsToFloat = ((Float.intBitsToFloat((int) (cntVar.o() >> 32)) - cntVar.em(2.0f)) - cntVar.em(1.0f)) - (cntVar.em(2.0f) / 2.0f);
            }
            float em3 = cntVar.em(2.0f);
            long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            float em4 = cntVar.em(2.0f);
            float intBitsToFloat4 = Float.intBitsToFloat((int) (cntVar.o() & 4294967295L));
            float em5 = cntVar.em(2.0f);
            long floatToRawIntBits2 = Float.floatToRawIntBits(em4);
            float em6 = cntVar.em(1.0f);
            float em7 = cntVar.em(1.0f);
            long j8 = j;
            cnw.f(cntVar, j8, (floatToRawIntBits << 32) | (Float.floatToRawIntBits(em3) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat4 - (em5 + em5)) & 4294967295L) | (floatToRawIntBits2 << 32), (Float.floatToRawIntBits(em6) << 32) | (Float.floatToRawIntBits(em7) & 4294967295L), null, f4, 208);
            if (z) {
                intBitsToFloat2 = cntVar.em(1.0f);
            } else {
                intBitsToFloat2 = (Float.intBitsToFloat((int) (cntVar.o() >> 32)) - cntVar.em(4.0f)) - cntVar.em(1.0f);
            }
            float f7 = intBitsToFloat2;
            float f8 = f * em2;
            if (true != booleanValue) {
                j2 = j3;
            } else {
                j2 = j4;
            }
            long floatToRawIntBits3 = Float.floatToRawIntBits(f7);
            float em8 = cntVar.em(4.0f);
            float floatValue = ((Number) bynVar.a()).floatValue();
            long floatToRawIntBits4 = Float.floatToRawIntBits(em8);
            long floatToRawIntBits5 = Float.floatToRawIntBits(floatValue);
            float em9 = cntVar.em(2.0f);
            float em10 = cntVar.em(2.0f);
            cnw.f(cntVar, j2, (floatToRawIntBits3 << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), (floatToRawIntBits4 << 32) | (floatToRawIntBits5 & 4294967295L), (Float.floatToRawIntBits(em9) << 32) | (Float.floatToRawIntBits(em10) & 4294967295L), null, f4, 208);
            String str = (String) arqrVar.a(anwVar);
            if (booleanValue && str != null) {
                float el = cntVar.el(drn.c(45));
                Paint paint = new Paint();
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setTextSize(el);
                paint.setColor(ckw.b(j7));
                paint.setAntiAlias(true);
                float em11 = cntVar.em(8.0f);
                float em12 = cntVar.em(16.0f);
                float em13 = cntVar.em(32.0f);
                float f9 = el + em12 + em12;
                float f10 = f9 / 2.0f;
                float max = Math.max(paint.measureText(str) + em13 + em13, f9);
                float em14 = cntVar.em(2.0f);
                if (z) {
                    f2 = f7 + cntVar.em(4.0f) + em11;
                } else {
                    f2 = (f7 - em11) - max;
                }
                float max2 = Math.max(cntVar.em(2.0f), (f8 + (((Number) bynVar.a()).floatValue() / 2.0f)) - f9);
                cke ckeVar = new cke((byte[]) null);
                float f11 = f2 + max;
                float f12 = max2 + f9;
                long floatToRawIntBits6 = Float.floatToRawIntBits(f10) << 32;
                long floatToRawIntBits7 = Float.floatToRawIntBits(f10) & 4294967295L;
                float f13 = em14;
                long floatToRawIntBits8 = Float.floatToRawIntBits(f10) << 32;
                long floatToRawIntBits9 = Float.floatToRawIntBits(f10) & 4294967295L;
                if (true != z) {
                    f3 = f13;
                } else {
                    f3 = f10;
                }
                long floatToRawIntBits10 = Float.floatToRawIntBits(f3) << 32;
                long floatToRawIntBits11 = Float.floatToRawIntBits(f3) & 4294967295L;
                if (true != z) {
                    f13 = f10;
                }
                float f14 = f2;
                clq.c(ckeVar, new cjr(f14, max2, f11, f12, floatToRawIntBits6 | floatToRawIntBits7, floatToRawIntBits8 | floatToRawIntBits9, floatToRawIntBits10 | floatToRawIntBits11, (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L)));
                cnw.d(cntVar, ckeVar, j6, null, 60);
                cjx.a(cntVar.q().b()).drawText(str, f14 + (max / 2.0f), (max2 + f10) - ((paint.descent() + paint.ascent()) / 2.0f), paint);
            }
        }
        return arnb.a;
    }
}
