package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeob extends arrp implements arqv {
    final /* synthetic */ cga a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeob(cga cgaVar, aewd aewdVar, arqw arqwVar, int i, int i2, int i3) {
        super(2);
        this.f = i3;
        this.a = cgaVar;
        this.e = aewdVar;
        this.d = arqwVar;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [cmb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, arqw] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    bwj bwjVar = (bwj) obj;
                    ((Number) obj2).intValue();
                    adcx.aY(this.a, (aewd) this.e, this.d, bwjVar, bzh.a(this.b | 1), this.c);
                    return arnb.a;
                }
                bwj bwjVar2 = (bwj) obj;
                ((Number) obj2).intValue();
                agkx.Q((String) this.e, this.d, this.a, bwjVar2, bzh.a(this.b | 1), this.c);
                return arnb.a;
            }
            bwj bwjVar3 = (bwj) obj;
            ((Number) obj2).intValue();
            aetn.aA((aeki) this.d, this.a, this.e, bwjVar3, bzh.a(this.b | 1), this.c);
            return arnb.a;
        }
        bwj bwjVar4 = (bwj) obj;
        ((Number) obj2).intValue();
        Object obj3 = this.d;
        cga cgaVar = this.a;
        cit citVar = (cit) this.e;
        adom.aE((aeoq) obj3, cgaVar, citVar, bwjVar4, bzh.a(1 | this.b), this.c);
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeob(Object obj, cga cgaVar, Object obj2, int i, int i2, int i3) {
        super(2);
        this.f = i3;
        this.d = obj;
        this.a = cgaVar;
        this.e = obj2;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeob(String str, List list, cga cgaVar, int i, int i2, int i3) {
        super(2);
        this.f = i3;
        this.e = str;
        this.d = list;
        this.a = cgaVar;
        this.b = i;
        this.c = i2;
    }
}
