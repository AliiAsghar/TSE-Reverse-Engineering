package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aemv extends arrp implements arqv {
    final /* synthetic */ boolean a;
    final /* synthetic */ aeoo b;
    final /* synthetic */ float c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemv(aenk aenkVar, boolean z, aeoo aeooVar, float f, String str, int i, int i2, int i3) {
        super(2);
        this.h = i3;
        this.f = aenkVar;
        this.a = z;
        this.b = aeooVar;
        this.c = f;
        this.g = str;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, aenp] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, arqv] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.h != 0) {
            ((Number) obj2).intValue();
            aeke.M(this.f, this.b, this.c, this.a, this.g, (bwj) obj, bzh.a(this.d | 1), this.e);
            return arnb.a;
        }
        bwj bwjVar = (bwj) obj;
        ((Number) obj2).intValue();
        Object obj3 = this.f;
        aenk aenkVar = (aenk) obj3;
        adom.aK(aenkVar, this.a, this.b, this.c, (String) this.g, bwjVar, bzh.a(this.d | 1), this.e);
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemv(aenp aenpVar, aeoo aeooVar, float f, boolean z, arqv arqvVar, int i, int i2, int i3) {
        super(2);
        this.h = i3;
        this.f = aenpVar;
        this.b = aeooVar;
        this.c = f;
        this.a = z;
        this.g = arqvVar;
        this.d = i;
        this.e = i2;
    }
}
