package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aub implements agq {
    private final avc b;
    private final agq c;

    public aub(avc avcVar, agq agqVar) {
        this.b = avcVar;
        this.c = agqVar;
    }

    @Override // defpackage.agq
    public final float a(float f, float f2, float f3) {
        float a = this.c.a(f, f2, f3);
        if (a == brg.a) {
            avc avcVar = this.b;
            int i = avcVar.e;
            if (i == 0) {
                return brg.a;
            }
            float f4 = -i;
            if (avcVar.w()) {
                f4 += this.b.l();
            }
            return arrn.q(f4, -f3, f3);
        }
        float f5 = -this.b.e;
        while (a > brg.a && f5 < a) {
            f5 += this.b.l();
        }
        float f6 = f5;
        while (a < brg.a && f6 > a) {
            f6 -= this.b.l();
        }
        return f6;
    }
}
