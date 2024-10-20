package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdg extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdg(Object obj, Object obj2, int i) {
        super(0);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, miz] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                Object obj = this.b;
                return new aeve(kdh.c(((kde) obj).a), new aevi(new kbp(this.a, obj, 20, null)));
            case 1:
                return ((kdh) this.a).b((kde) this.b, null, null);
            case 2:
                ?? r0 = this.a;
                if (r0 != 0) {
                    r0.a(((qdq) this.b).a.b());
                }
                return arnb.a;
            case 3:
                ((kdn) this.b).j.a(this.a);
                return arnb.a;
            case 4:
                ((kdn) this.b).i.a(this.a);
                return arnb.a;
            case 5:
                ((kdn) this.b).j.a(this.a);
                return arnb.a;
            case 6:
                ((kdn) this.b).h.a(this.a);
                return arnb.a;
            case 7:
                Object obj2 = this.a;
                kdn kdnVar = (kdn) this.b;
                qjh.l(kdnVar.c, null, new kca(kdnVar, (mxr) obj2, (arpe) null, 5), 3);
                return arnb.a;
            case 8:
                Object obj3 = this.a;
                kdn kdnVar2 = (kdn) this.b;
                qjh.l(kdnVar2.c, null, new kca(kdnVar2, (mxr) obj3, (arpe) null, 6, (byte[]) null), 3);
                return arnb.a;
            case 9:
                Object obj4 = this.a;
                kdn kdnVar3 = (kdn) this.b;
                qjh.l(kdnVar3.c, null, new kca(kdnVar3, (mxr) obj4, (arpe) null, 7, (char[]) null), 3);
                return arnb.a;
            case 10:
                Uri parse = Uri.parse((String) this.a);
                parse.getClass();
                ((kdu) this.b).i.a(parse);
                return arnb.a;
            case 11:
                Object obj5 = this.a;
                ndk ndkVar = (ndk) this.b;
                return new kef(ndkVar.g(), ndkVar.e(), ndkVar.f(), (String) obj5, ndkVar.e(), kac.s);
            case 12:
                ((ked) this.b).g.a(this.a);
                return arnb.a;
            case 13:
                ((ked) this.b).g.a(this.a);
                return arnb.a;
            case 14:
                keg kegVar = (keg) this.b;
                if (!kegVar.b) {
                    Object obj6 = this.a;
                    ((ken) obj6).h.r(kegVar.a, 2);
                }
                return arnb.a;
            case 15:
                ((ken) this.b).k.a(this.a);
                return true;
            case 16:
                ((ken) this.b).l.a(this.a);
                return true;
            case 17:
                ((ken) this.b).l.a(this.a);
                return true;
            case 18:
                ((ken) this.b).k.a(this.a);
                return true;
            case 19:
                ((ken) this.b).l.a(this.a);
                return true;
            default:
                if (((kfh) this.b).b.a == 3) {
                    Object obj7 = this.a;
                    ((lre) ((kjp) obj7).c).e(true, new kbt(obj7, 10));
                }
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdg(Object obj, Object obj2, int i, byte[] bArr) {
        super(0);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
