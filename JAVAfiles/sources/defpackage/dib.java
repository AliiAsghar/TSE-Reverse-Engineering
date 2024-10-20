package defpackage;

import android.graphics.Path;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dib extends arrp implements arqr<dif, arnb> {
    final /* synthetic */ clr a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dib(clr clrVar, int i, int i2) {
        super(1);
        this.a = clrVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        dif difVar = (dif) obj;
        die dieVar = difVar.a;
        int e = difVar.e(this.b);
        int e2 = difVar.e(this.c);
        if (e < 0 || e > e2 || e2 > ((dhu) dieVar).c.length()) {
            doz.b("start(" + e + ") or end(" + e2 + ") is out of range [0.." + ((dhu) dieVar).c.length() + "], or start > end!");
        }
        Path path = new Path();
        djx djxVar = ((dhu) dieVar).b;
        djxVar.e.getSelectionPath(e, e2, path);
        if (djxVar.g != 0 && !path.isEmpty()) {
            path.offset(brg.a, djxVar.g);
        }
        clr clrVar = this.a;
        cke ckeVar = new cke(path);
        float f = difVar.f;
        ckeVar.n((Float.floatToRawIntBits(brg.a) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        ((cke) clrVar).a.addPath(ckeVar.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        return arnb.a;
    }
}
