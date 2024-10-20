package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aekp extends arrp implements arqr {
    final /* synthetic */ List a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ arqr d;
    final /* synthetic */ float e;
    final /* synthetic */ float f;
    final /* synthetic */ float g;
    final /* synthetic */ float h;
    final /* synthetic */ long i;
    final /* synthetic */ byn j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aekp(List list, float f, float f2, arqr arqrVar, float f3, float f4, float f5, float f6, long j, byn bynVar) {
        super(1);
        this.a = list;
        this.b = f;
        this.c = f2;
        this.d = arqrVar;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = j;
        this.j = bynVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cnt cntVar = (cnt) obj;
        cntVar.getClass();
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                aqjn.G();
            }
            byn bynVar = this.j;
            long j = this.i;
            float f = this.h;
            float f2 = this.g;
            float f3 = this.f;
            float f4 = this.e;
            arqr arqrVar = this.d;
            float f5 = this.c;
            float f6 = this.b;
            float f7 = ((aekn) next).a;
            float f8 = i;
            Iterator it2 = it;
            long j2 = ((cku) arqrVar.a(Float.valueOf(f8 / f4))).i;
            arsy av = aetn.av(bynVar);
            av.getClass();
            long floatToRawIntBits = Float.floatToRawIntBits(((Number) av.c()).floatValue() + (f8 * f3));
            float o = arrn.o((f7 * f6) / 100.0f, f5);
            cnw.f(cntVar, j2, (floatToRawIntBits << 32) | (Float.floatToRawIntBits(f2 - (o / 2.0f)) & 4294967295L), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(o) & 4294967295L), j, null, brg.a, 240);
            it = it2;
            i = i2;
        }
        return arnb.a;
    }
}
