package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aih extends arrp implements arqr<Float, Float> {
    final /* synthetic */ cas a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aih(cas casVar) {
        super(1);
        this.a = casVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return (Float) ((arqr) this.a.a()).a(Float.valueOf(((Number) obj).floatValue()));
    }
}
