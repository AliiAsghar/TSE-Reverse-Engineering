package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeld extends arrp implements arqv {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ aeli c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;
    final /* synthetic */ float f;
    final /* synthetic */ float g;
    final /* synthetic */ arqw h;
    final /* synthetic */ int i;
    final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeld(int i, String str, aeli aeliVar, long j, long j2, float f, float f2, arqw arqwVar, int i2, int i3) {
        super(2);
        this.a = i;
        this.b = str;
        this.c = aeliVar;
        this.d = j;
        this.e = j2;
        this.f = f;
        this.g = f2;
        this.h = arqwVar;
        this.i = i2;
        this.j = i3;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = this.a;
        String str = this.b;
        aeli aeliVar = this.c;
        long j = this.d;
        long j2 = this.e;
        float f = this.f;
        float f2 = this.g;
        aetn.ai(i, str, aeliVar, j, j2, f, f2, this.h, (bwj) obj, bzh.a(this.i | 1), this.j);
        return arnb.a;
    }
}
