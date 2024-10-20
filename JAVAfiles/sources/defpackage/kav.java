package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kav extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kav(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v39, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, arxm] */
    /* JADX WARN: Type inference failed for: r0v46, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [ascv, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        miz mizVar;
        aeuh aeuhVar;
        aerb aerbVar;
        miz mizVar2 = null;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ((kaw) obj).b.e(true, new jsv(obj, 16));
                return true;
            case 1:
                kam kamVar = (kam) this.a;
                miz mizVar3 = kamVar.c;
                hmk hmkVar = kamVar.f;
                if (mizVar3 != null) {
                    mizVar = hmkVar.i(mizVar3);
                } else {
                    mizVar = null;
                }
                miz mizVar4 = kamVar.b;
                if (mizVar4 != null) {
                    mizVar2 = hmkVar.i(mizVar4);
                }
                miz mizVar5 = kamVar.a;
                if (!lga.ci(mizVar5, mizVar) && lga.ci(mizVar5, mizVar2)) {
                    aeuhVar = aeuh.b;
                } else if (lga.ci(mizVar5, mizVar) && lga.ci(mizVar5, mizVar2)) {
                    aeuhVar = aeuh.c;
                } else if (lga.ci(mizVar5, mizVar) && !lga.ci(mizVar5, mizVar2)) {
                    aeuhVar = aeuh.d;
                } else {
                    aeuhVar = aeuh.a;
                }
                if (lga.cg(mizVar5)) {
                    if (aeuhVar == aeuh.b) {
                        aeuhVar = aeuh.a;
                    } else if (aeuhVar == aeuh.c) {
                        aeuhVar = aeuh.d;
                    }
                }
                if (mizVar != null && lga.cg(mizVar)) {
                    if (aeuhVar == aeuh.c) {
                        return aeuh.b;
                    }
                    if (aeuhVar == aeuh.d) {
                        return aeuh.a;
                    }
                    return aeuhVar;
                }
                return aeuhVar;
            case 2:
                kay kayVar = (kay) this.a;
                String str = kayVar.c;
                return new aeki(new aeje(str), new aekh((byte[]) null), str, kayVar.b, (arqg) null, 48);
            case 3:
                iew iewVar = (iew) this.a;
                Boolean bool = (Boolean) iewVar.a.c();
                bool.booleanValue();
                iewVar.a.f(bool);
                return arnb.a;
            case 4:
                this.a.w(true);
                return arnb.a;
            case 5:
                this.a.w(false);
                return arnb.a;
            case 6:
                this.a.w(false);
                return arnb.a;
            case 7:
                this.a.w(true);
                return arnb.a;
            case 8:
                this.a.w(false);
                return arnb.a;
            case 9:
                this.a.w(false);
                return arnb.a;
            case 10:
                return new Object[((asai[]) this.a).length];
            case 11:
                return ((aers) this.a).p;
            case 12:
                return this.a;
            case 13:
                Object obj2 = this.a;
                ((kcr) obj2).w.f(new kbt(obj2, 2));
                return arnb.a;
            case 14:
                return (lga) this.a.b();
            case 15:
                ?? r0 = this.a;
                if (r0 != 0) {
                    r0.v(null);
                }
                return arnb.a;
            case 16:
                ((zfh) ((rae) this.a).c.b()).c();
                return arnb.a;
            case 17:
                return lga.bv((kdc) this.a, null);
            case 18:
                kdc kdcVar = (kdc) this.a;
                if (kdcVar.c) {
                    aerbVar = aerb.v;
                } else {
                    aerbVar = aerb.aC;
                }
                return new aewi(kdcVar.e, aerbVar, 60);
            case 19:
                return this.a;
            default:
                return new aexv[((asai[]) this.a).length];
        }
    }
}
