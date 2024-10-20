package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agid extends arrp implements arqv {
    final /* synthetic */ boolean a;
    final /* synthetic */ float b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agid(aenp aenpVar, aeoo aeooVar, float f, boolean z, int i, int i2, int i3) {
        super(2);
        this.g = i3;
        this.e = aenpVar;
        this.f = aeooVar;
        this.b = f;
        this.a = z;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [amt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, aenp] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, arqg] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.g != 0) {
            bwj bwjVar = (bwj) obj;
            ((Number) obj2).intValue();
            adom.aS(this.e, (aeoo) this.f, this.b, this.a, bwjVar, bzh.a(this.c | 1), this.d);
            return arnb.a;
        }
        ((Number) obj2).intValue();
        int a = bzh.a(this.c | 1);
        int i = this.d;
        ?? r3 = this.f;
        float f = this.b;
        boolean z = this.a;
        agiz.t(this.e, z, f, r3, (bwj) obj, a, i);
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agid(amt amtVar, boolean z, float f, arqg arqgVar, int i, int i2, int i3) {
        super(2);
        this.g = i3;
        this.e = amtVar;
        this.a = z;
        this.b = f;
        this.f = arqgVar;
        this.c = i;
        this.d = i2;
    }
}
