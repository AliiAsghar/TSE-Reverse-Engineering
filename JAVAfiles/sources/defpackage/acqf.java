package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acqf extends acqd {
    final /* synthetic */ acqi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acqf(acqi acqiVar, String str) {
        super(str);
        this.b = acqiVar;
    }

    @Override // defpackage.acqd
    protected final void a() {
        String str = this.a;
        acqi acqiVar = this.b;
        acqiVar.k(0L, str, acqiVar.f.a());
    }
}
