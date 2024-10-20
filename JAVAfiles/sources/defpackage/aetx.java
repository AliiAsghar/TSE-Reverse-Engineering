package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aetx extends arrp implements arqv {
    final /* synthetic */ float a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aetx(aenr aenrVar, aeoo aeooVar, float f, cga cgaVar, cit citVar, aeop aeopVar, int i, int i2) {
        super(2);
        this.h = i2;
        this.d = aenrVar;
        this.e = aeooVar;
        this.a = f;
        this.c = cgaVar;
        this.f = citVar;
        this.g = aeopVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [amt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r3v0, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, cga] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                ((Number) obj2).intValue();
                ?? r2 = this.g;
                ?? r3 = this.e;
                ?? r4 = this.d;
                float f = this.a;
                ?? r6 = this.c;
                adcx.bb(r2, r3, r4, f, r6, (aewd) this.f, (bwj) obj, bzh.a(this.b | 1));
                return arnb.a;
            }
            bwj bwjVar = (bwj) obj;
            ((Number) obj2).intValue();
            Object obj3 = this.d;
            Object obj4 = this.e;
            float f2 = this.a;
            ?? r32 = this.c;
            Object obj5 = this.f;
            aeop aeopVar = (aeop) this.g;
            cit citVar = (cit) obj5;
            adom.M((aenr) obj3, (aeoo) obj4, f2, r32, citVar, aeopVar, bwjVar, bzh.a(this.b | 1));
            return arnb.a;
        }
        bwj bwjVar2 = (bwj) obj;
        ((Number) obj2).intValue();
        int i2 = this.b;
        ?? r5 = this.g;
        float f3 = this.a;
        ?? r33 = this.f;
        adcx.cg(this.c, (aeul) this.d, this.e, r33, f3, r5, bwjVar2, bzh.a(i2 | 1));
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aetx(amt amtVar, aeul aeulVar, arqg arqgVar, byn bynVar, float f, arqv arqvVar, int i, int i2) {
        super(2);
        this.h = i2;
        this.c = amtVar;
        this.d = aeulVar;
        this.e = arqgVar;
        this.f = bynVar;
        this.a = f;
        this.g = arqvVar;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aetx(arqv arqvVar, arqv arqvVar2, arqv arqvVar3, float f, cga cgaVar, aewd aewdVar, int i, int i2) {
        super(2);
        this.h = i2;
        this.g = arqvVar;
        this.e = arqvVar2;
        this.d = arqvVar3;
        this.a = f;
        this.c = cgaVar;
        this.f = aewdVar;
        this.b = i;
    }
}
