package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqz extends arrp implements arqr<Float, Float> {
    final /* synthetic */ dqv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqz(dqv dqvVar) {
        super(1);
        this.a = dqvVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ((Number) obj).floatValue();
        return Float.valueOf(this.a.em(56.0f));
    }
}
