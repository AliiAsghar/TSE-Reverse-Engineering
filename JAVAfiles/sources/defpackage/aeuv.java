package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeuv extends arrp implements arqv {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeuv(aeuy aeuyVar, long j, cga cgaVar, aeux aeuxVar, int i, int i2) {
        super(2);
        this.f = i2;
        this.c = aeuyVar;
        this.a = j;
        this.d = cgaVar;
        this.e = aeuxVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, cga] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            bwj bwjVar = (bwj) obj;
            ((Number) obj2).intValue();
            int i = this.b;
            Object obj3 = this.c;
            Object obj4 = this.e;
            adom.at((Character) this.d, this.a, (String) obj4, (String) obj3, bwjVar, bzh.a(i | 1));
            return arnb.a;
        }
        bwj bwjVar2 = (bwj) obj;
        ((Number) obj2).intValue();
        int i2 = this.b;
        Object obj5 = this.e;
        ?? r3 = this.d;
        adcx.bR((aeuy) this.c, this.a, r3, (aeux) obj5, bwjVar2, bzh.a(i2 | 1));
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeuv(Character ch, long j, String str, String str2, int i, int i2) {
        super(2);
        this.f = i2;
        this.d = ch;
        this.a = j;
        this.e = str;
        this.c = str2;
        this.b = i;
    }
}
