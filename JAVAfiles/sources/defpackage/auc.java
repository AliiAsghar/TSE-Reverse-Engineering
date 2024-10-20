package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class auc extends arrp implements arqw<Float, Float, Float, Float> {
    final /* synthetic */ avc a;
    final /* synthetic */ drk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auc(avc avcVar, drk drkVar) {
        super(3);
        this.a = avcVar;
        this.b = drkVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean z;
        float a;
        int i;
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        float floatValue3 = ((Number) obj3).floatValue();
        avc avcVar = this.a;
        if (avcVar.p().f() == ahp.a) {
            z = aja.b(avcVar);
        } else if (this.b == drk.a) {
            z = aja.b(avcVar);
        } else if (!aja.b(avcVar)) {
            z = true;
        } else {
            z = false;
        }
        int c = avcVar.p().c();
        if (c == 0) {
            a = 0.0f;
        } else {
            a = aja.a(avcVar) / c;
        }
        if (Math.abs(floatValue) < avcVar.m.em(400.0f)) {
            i = 0;
        } else if (floatValue > brg.a) {
            i = 1;
        } else {
            i = 2;
        }
        if (!a.bA(i, 0)) {
            if (!a.bA(i, 1)) {
                if (!a.bA(i, 2)) {
                    floatValue2 = 0.0f;
                }
            }
        } else {
            floatValue2 = Math.abs(a - ((float) ((int) a))) > 0.5f ? floatValue3 : floatValue3;
        }
        return Float.valueOf(floatValue2);
    }
}
