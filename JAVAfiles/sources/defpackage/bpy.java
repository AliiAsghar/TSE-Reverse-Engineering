package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpy extends arrp implements arqr<Float, Boolean> {
    final /* synthetic */ bqb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpy(bqb bqbVar) {
        super(1);
        this.a = bqbVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        boolean z;
        float q = arrn.q(((Number) obj).floatValue(), ((Number) this.a.k.c()).floatValue(), ((Number) this.a.k.b()).floatValue());
        if (q == this.a.e()) {
            z = false;
        } else {
            if (q != this.a.e()) {
                bqb bqbVar = this.a;
                arqr arqrVar = bqbVar.b;
                if (arqrVar != null) {
                    arqrVar.a(Float.valueOf(q));
                } else {
                    bqbVar.j(q);
                }
            }
            arqg arqgVar = this.a.a;
            if (arqgVar != null) {
                arqgVar.a();
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
