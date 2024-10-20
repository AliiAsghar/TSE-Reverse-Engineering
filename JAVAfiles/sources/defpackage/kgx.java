package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgx implements cpz {
    private final arqg a;
    private final lfl b;

    public kgx(lfl lflVar, arqg arqgVar) {
        this.b = lflVar;
        this.a = arqgVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, ascd] */
    @Override // defpackage.cpz
    public final long a(long j, long j2, int i) {
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) == brg.a && Float.intBitsToFloat((int) (j2 & 4294967295L)) < brg.a) {
            this.b.d(brg.a);
            return 0L;
        }
        lfl lflVar = this.b;
        lflVar.d(((jyz) lflVar.a.c()).b + Float.intBitsToFloat(i2));
        return 0L;
    }

    @Override // defpackage.cpz
    public final long b(long j, int i) {
        if (Float.intBitsToFloat((int) (j & 4294967295L)) > brg.a && a.bA(i, 1)) {
            this.a.a();
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.cpz
    public final /* synthetic */ Object c(long j, long j2, arpe arpeVar) {
        return new drp(0L);
    }

    @Override // defpackage.cpz
    public final /* synthetic */ Object d(long j, arpe arpeVar) {
        return new drp(0L);
    }
}
