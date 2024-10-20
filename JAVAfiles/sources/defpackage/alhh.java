package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alhh extends alfe {
    final /* synthetic */ algc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alhh(anna annaVar, CharSequence charSequence, algc algcVar) {
        super(annaVar, charSequence);
        this.g = algcVar;
    }

    @Override // defpackage.alfe
    public final int a(int i) {
        return i + 1;
    }

    @Override // defpackage.alfe
    public final int b(int i) {
        return this.g.e(this.b, i);
    }
}
