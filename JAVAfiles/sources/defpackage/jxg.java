package defpackage;

import defpackage.cga;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxg extends arrp implements arqv {
    final /* synthetic */ int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxg(int i, String str, boolean z, jxb jxbVar, arqr arqrVar, int i2) {
        super(2);
        this.f = i2;
        this.a = i;
        this.c = str;
        this.b = z;
        this.d = jxbVar;
        this.e = arqrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, ake] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, aerq] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, aerq] */
    /* JADX WARN: Type inference failed for: r14v5, types: [cga] */
    /* JADX WARN: Type inference failed for: r15v20, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, ake] */
    /* JADX WARN: Type inference failed for: r2v9, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, arqw] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r4v14, types: [byn, java.lang.Object] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        boolean z;
        switch (this.f) {
            case 0:
                bwj bwjVar = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    int i = this.a;
                    cga.a aVar = cga.e;
                    if (i <= 2) {
                        aVar = amh.j(cga.e, brg.a, 28.0f, brg.a, brg.a, 13);
                    }
                    Object obj3 = this.c;
                    boolean z2 = this.b;
                    if (this.d == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hwr.ab(aVar, (String) obj3, z2, z, "ThemeHolder " + (this.a + 1), new jkq(this.e, this.d, 7, null), bwjVar, 0);
                }
                return arnb.a;
            case 1:
                ((Number) obj2).intValue();
                hwr.Z((aeul) this.c, this.d, this.b, this.e, (bwj) obj, bzh.a(this.a | 1));
                return arnb.a;
            case 2:
                ((Number) obj2).intValue();
                adom.aU(this.c, this.b, (bma) this.d, this.e, (bwj) obj, bzh.a(1 | this.a));
                return arnb.a;
            case 3:
                ((Number) obj2).intValue();
                aeke.aU(this.c, this.e, (awg) this.d, this.b, (bwj) obj, bzh.a(1 | this.a));
                return arnb.a;
            case 4:
                ((Number) obj2).intValue();
                aeke.aU(this.c, this.e, (awg) this.d, this.b, (bwj) obj, bzh.a(1 | this.a));
                return arnb.a;
            case 5:
                ((Number) obj2).intValue();
                aetn.j((String) this.c, this.e, this.b, (dje) this.d, (bwj) obj, bzh.a(this.a | 1));
                return arnb.a;
            case 6:
                bwj bwjVar2 = (bwj) obj;
                ((Number) obj2).intValue();
                int i2 = this.a;
                adcx.cn(this.d, (aeul) this.e, this.c, this.b, bwjVar2, bzh.a(i2 | 1));
                return arnb.a;
            case 7:
                bwj bwjVar3 = (bwj) obj;
                ((Number) obj2).intValue();
                int i3 = this.a;
                adcx.cn(this.d, (aeul) this.e, this.c, this.b, bwjVar3, bzh.a(i3 | 1));
                return arnb.a;
            default:
                ((Number) obj2).intValue();
                afzv.v(this.d, this.b, (String) this.c, this.e, (bwj) obj, bzh.a(1 | this.a));
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxg(aerq aerqVar, Object obj, awg awgVar, boolean z, int i, int i2) {
        super(2);
        this.f = i2;
        this.c = aerqVar;
        this.e = obj;
        this.d = awgVar;
        this.b = z;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxg(aeul aeulVar, cga cgaVar, boolean z, arqw arqwVar, int i, int i2) {
        super(2);
        this.f = i2;
        this.c = aeulVar;
        this.d = cgaVar;
        this.b = z;
        this.e = arqwVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxg(ake akeVar, aeul aeulVar, byn bynVar, boolean z, int i, int i2) {
        super(2);
        this.f = i2;
        this.d = akeVar;
        this.e = aeulVar;
        this.c = bynVar;
        this.b = z;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxg(cga cgaVar, boolean z, bma bmaVar, arqv arqvVar, int i, int i2) {
        super(2);
        this.f = i2;
        this.c = cgaVar;
        this.b = z;
        this.d = bmaVar;
        this.e = arqvVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxg(cga cgaVar, boolean z, String str, arqg arqgVar, int i, int i2) {
        super(2);
        this.f = i2;
        this.d = cgaVar;
        this.b = z;
        this.c = str;
        this.e = arqgVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxg(String str, List list, boolean z, dje djeVar, int i, int i2) {
        super(2);
        this.f = i2;
        this.c = str;
        this.e = list;
        this.b = z;
        this.d = djeVar;
        this.a = i;
    }
}
