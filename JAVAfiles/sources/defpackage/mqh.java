package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqh extends arrp implements arqr {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqh(Object obj, Object obj2, int i, int i2) {
        super(1);
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, jzj] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, adiv] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        wjc wjcVar = (wjc) obj;
                        wjcVar.getClass();
                        aozy builder = wjcVar.toBuilder();
                        wiy wiyVar = wjcVar.d;
                        if (wiyVar == null) {
                            wiyVar = wiy.a;
                        }
                        Object obj2 = this.b;
                        ?? r3 = this.c;
                        int i2 = this.a;
                        aozy builder2 = wiyVar.toBuilder();
                        String A = ((wiv) obj2).A(r3);
                        if (!builder2.b.isMutable()) {
                            builder2.u();
                        }
                        wiy wiyVar2 = (wiy) builder2.b;
                        apbo apboVar = wiyVar2.c;
                        if (!apboVar.b) {
                            wiyVar2.c = apboVar.a();
                        }
                        wiyVar2.c.put(A, Integer.valueOf(i2));
                        if (!builder.b.isMutable()) {
                            builder.u();
                        }
                        wjc wjcVar2 = (wjc) builder.b;
                        wiy wiyVar3 = (wiy) builder2.s();
                        wiyVar3.getClass();
                        wjcVar2.d = wiyVar3;
                        wjcVar2.b |= 1;
                        apag s = builder.s();
                        s.getClass();
                        return (wjc) s;
                    }
                    String str = (String) obj;
                    str.getClass();
                    return Boolean.valueOf(((mqi) this.b).e((alpt) this.c, str, this.a));
                }
                String str2 = (String) obj;
                str2.getClass();
                return Boolean.valueOf(((mqi) this.b).e((alpt) this.c, str2, this.a));
            }
            ((bxi) obj).getClass();
            return new jyq((jym) this.b, this.a, this.c);
        }
        String str3 = (String) obj;
        str3.getClass();
        return Boolean.valueOf(((mqi) this.b).e((alpt) this.c, str3, this.a));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqh(jym jymVar, int i, jzj jzjVar, int i2) {
        super(1);
        this.d = i2;
        this.b = jymVar;
        this.a = i;
        this.c = jzjVar;
    }
}
