package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdz extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdz(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v46, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [afqd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r1v7, types: [arwe, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new Object[((asai[]) this.a).length];
            case 1:
                return jxv.p((aevp) this.a, null, 6);
            case 2:
                return this.a;
            case 3:
                return this.a;
            case 4:
                return (lga) this.a.b();
            case 5:
                ((kep) this.a).m.a();
                return arnb.a;
            case 6:
                return new kew(((kev) this.a).a);
            case 7:
                return new aetv[((asai[]) this.a).length];
            case 8:
                this.a.a();
                return arnb.a;
            case 9:
                return ((kfs) this.a).c.i();
            case 10:
                akul k = ((kfs) this.a).c.k();
                k.getClass();
                return k;
            case 11:
                kgg kggVar = (kgg) this.a;
                return lga.at(kggVar.c.f(), kggVar.b).a();
            case 12:
                kgj kgjVar = (kgj) this.a;
                return lga.at(kgjVar.c.f(), kgjVar.b).a();
            case 13:
                return (jsm) this.a.b();
            case 14:
                ((eog) ((mgu) this.a).e).c("emotify_result_message_id", null);
                return arnb.a;
            case 15:
                asai a = ((mgu) this.a).g.a();
                int i = ascp.a;
                Object obj = this.a;
                return arrn.S(a, ((mgu) obj).j, asco.b, 1);
            case 16:
                Object obj2 = this.a;
                ((khw) obj2).l.c(new kbt(obj2, 13));
                return arnb.a;
            case 17:
                this.a.a();
                return arnb.a;
            case 18:
                hwr.aq((kkc) this.a, cku.g, true);
                return arnb.a;
            case 19:
                hwr.ap((kkc) this.a, cku.g, true);
                return arnb.a;
            default:
                ((kit) this.a).c.a();
                ((kit) this.a).b.a();
                return arnb.a;
        }
    }
}
