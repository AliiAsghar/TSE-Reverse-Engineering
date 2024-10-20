package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class whx extends arrp implements arqr {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whx(adiv adivVar, boolean z, int i) {
        super(1);
        this.c = i;
        this.b = adivVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, adiv] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, arqg] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        zxy zxyVar;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ((Number) obj).floatValue();
                if (this.a) {
                    this.b.a();
                }
                return arnb.a;
            }
            dre dreVar = (dre) obj;
            if (this.a && dreVar != null && (zxyVar = (zxy) arsd.k((Optional) ((mlt) this.b).d)) != null) {
                zxyVar.d.f(dreVar);
            }
            return arnb.a;
        }
        aozy builder = ((wie) obj).toBuilder();
        builder.ae(adom.n(this.b).a, this.a);
        return (wie) builder.s();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whx(boolean z, Object obj, int i) {
        super(1);
        this.c = i;
        this.a = z;
        this.b = obj;
    }
}
