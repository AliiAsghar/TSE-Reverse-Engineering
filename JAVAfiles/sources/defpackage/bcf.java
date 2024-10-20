package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bcf extends arrp implements arqg<Boolean> {
    final /* synthetic */ bcv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcf(bcv bcvVar) {
        super(0);
        this.a = bcvVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        boolean z;
        if ((this.a.a() & 9223372034707292159L) != 9205357640488583168L) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
