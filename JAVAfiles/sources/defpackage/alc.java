package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alc extends arrp implements arqw<ctc, Integer, Integer, Integer> {
    final /* synthetic */ int[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alc(int[] iArr) {
        super(3);
        this.a = iArr;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        return Integer.valueOf(this.a[intValue]);
    }
}
