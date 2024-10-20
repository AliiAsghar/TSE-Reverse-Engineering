package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjm extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjm(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [khb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v84, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, ascd] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        enb enbVar = null;
        boolean z = false;
        switch (this.b) {
            case 0:
                ((kke) ((mgu) this.a).a).l.f(null);
                return arnb.a;
            case 1:
                ((kiu) this.a).b.a();
                ((kiu) this.a).a.a();
                return arnb.a;
            case 2:
                ((mgu) this.a).i.b();
                return arnb.a;
            case 3:
                Object obj = this.a;
                ((lkd) ((mgu) obj).f).b(llg.a);
                return arnb.a;
            case 4:
                ((kjx) this.a).c();
                Object obj2 = this.a;
                ((kjx) obj2).b.b(lof.a);
                return arnb.a;
            case 5:
                ((kjx) this.a).c();
                return arnb.a;
            case 6:
                return Integer.valueOf(yzc.r((Context) ((ktk) this.a).a));
            case 7:
                return (ktk) ((lex) this.a).t.b();
            case 8:
                if (qrl.a()) {
                    ((lex) this.a).k.isPresent();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                return lga.s(new kju(this.a, 7));
            case 10:
                return (lez) new eoy(((lex) this.a).b).a(lez.class);
            case 11:
                return this.a;
            case 12:
                return ((kjm) this.a).a;
            case 13:
                return dyt.d(this.a).aL();
            case 14:
                eoz d = dyt.d(this.a);
                if (d instanceof enb) {
                    enbVar = (enb) d;
                }
                if (enbVar != null) {
                    return enbVar.Q();
                }
                return epb.a;
            case 15:
                ((aehz) this.a).j.a();
                return arnb.a;
            case 16:
                return this.a;
            case 17:
                return ((kjm) this.a).a;
            case 18:
                return dyt.d(this.a).aL();
            case 19:
                eoz d2 = dyt.d(this.a);
                if (d2 instanceof enb) {
                    enbVar = (enb) d2;
                }
                if (enbVar != null) {
                    return enbVar.Q();
                }
                return epb.a;
            default:
                ljn.d((ljn) ((izz) this.a).h.b(), 12, 0, 0, 6);
                ((izz) this.a).c.f(false);
                return arnb.a;
        }
    }
}
