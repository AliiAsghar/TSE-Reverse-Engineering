package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kaf implements asai {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public kaf(asai asaiVar, jzf jzfVar, obu obuVar, arwe arweVar, asai asaiVar2, int i) {
        this.f = i;
        this.a = asaiVar;
        this.e = jzfVar;
        this.c = obuVar;
        this.d = arweVar;
        this.b = asaiVar2;
    }

    /* JADX WARN: Type inference failed for: r14v3, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [obu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [asai, java.lang.Object] */
    @Override // defpackage.asai
    public final Object a(asaj asajVar, arpe arpeVar) {
        if (this.f != 0) {
            ?? r6 = this.b;
            ?? r5 = this.d;
            Object a = this.a.a(new jzc(asajVar, (jzf) this.e, this.c, r5, r6), arpeVar);
            if (a == arpl.a) {
                return a;
            }
            return arnb.a;
        }
        Object obj = this.a;
        jyb jybVar = new jyb(obj, 14);
        Object obj2 = this.e;
        Object obj3 = this.d;
        asai[] asaiVarArr = (asai[]) obj;
        Object N = arrn.N(asajVar, asaiVarArr, jybVar, new kae(null, (qkg[]) this.b, (jzz) this.c, (kag) obj3, (jzx) obj2), arpeVar);
        if (N == arpl.a) {
            return N;
        }
        return arnb.a;
    }

    public kaf(asai[] asaiVarArr, qkg[] qkgVarArr, jzz jzzVar, kag kagVar, jzx jzxVar, int i) {
        this.f = i;
        this.a = asaiVarArr;
        this.b = qkgVarArr;
        this.c = jzzVar;
        this.d = kagVar;
        this.e = jzxVar;
    }
}
