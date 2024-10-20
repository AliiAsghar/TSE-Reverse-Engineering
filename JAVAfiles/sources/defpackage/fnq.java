package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fnq extends fmb {
    final /* synthetic */ fmk a;
    final /* synthetic */ fnr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnq(fnr fnrVar, fmk fmkVar, fmk fmkVar2) {
        super(fmkVar);
        this.a = fmkVar2;
        this.b = fnrVar;
    }

    @Override // defpackage.fmb, defpackage.fmk
    public final fmi b(long j) {
        fmi b = this.a.b(j);
        fml fmlVar = b.a;
        fml fmlVar2 = new fml(fmlVar.b, fmlVar.c + this.b.a);
        fml fmlVar3 = b.b;
        return new fmi(fmlVar2, new fml(fmlVar3.b, fmlVar3.c + this.b.a));
    }
}
