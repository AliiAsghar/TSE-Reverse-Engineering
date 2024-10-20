package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class awa implements cmb {
    public final awb a;
    public final awb b;
    public final awb c;
    public final awb d;

    public awa(awb awbVar, awb awbVar2, awb awbVar3, awb awbVar4) {
        this.a = awbVar;
        this.b = awbVar2;
        this.c = awbVar3;
        this.d = awbVar4;
    }

    public static /* synthetic */ awa c(awa awaVar, awb awbVar, awb awbVar2, awb awbVar3, awb awbVar4, int i) {
        if ((i & 1) != 0) {
            awbVar = awaVar.a;
        }
        if ((i & 2) != 0) {
            awbVar2 = awaVar.b;
        }
        if ((i & 4) != 0) {
            awbVar3 = awaVar.c;
        }
        if ((i & 8) != 0) {
            awbVar4 = awaVar.d;
        }
        return new awg(awbVar, awbVar2, awbVar3, awbVar4);
    }

    @Override // defpackage.cmb
    public final cln a(long j, drk drkVar, dqv dqvVar) {
        awb awbVar = this.d;
        awb awbVar2 = this.c;
        awb awbVar3 = this.b;
        float a = this.a.a(j, dqvVar);
        float a2 = awbVar3.a(j, dqvVar);
        float a3 = awbVar2.a(j, dqvVar);
        float a4 = awbVar.a(j, dqvVar);
        float f = a + a4;
        float b = cjt.b(j);
        if (f > b) {
            float f2 = b / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a;
        float f4 = a4;
        float f5 = a2 + a3;
        if (f5 > b) {
            float f6 = b / f5;
            a2 *= f6;
            a3 *= f6;
        }
        float f7 = a2;
        float f8 = a3;
        if (f3 < brg.a || f7 < brg.a || f8 < brg.a || f4 < brg.a) {
            aju.c("Corner size in Px can't be negative(topStart = " + f3 + ", topEnd = " + f7 + ", bottomEnd = " + f8 + ", bottomStart = " + f4 + ")!");
        }
        return b(j, f3, f7, f8, f4, drkVar);
    }

    public abstract cln b(long j, float f, float f2, float f3, float f4, drk drkVar);
}
