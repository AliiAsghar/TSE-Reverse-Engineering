package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aghz extends arrp implements arqw {
    final /* synthetic */ cor a;
    final /* synthetic */ String b;
    final /* synthetic */ float c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghz(cor corVar, String str, float f, String str2) {
        super(3);
        this.a = corVar;
        this.b = str;
        this.c = f;
        this.d = str2;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bwj bwjVar = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        ((amt) obj).getClass();
        if ((intValue & 81) == 16 && bwjVar.L()) {
            bwjVar.v();
        } else {
            bmd.a(this.a, this.b, amv.h(cga.e, this.c), 0L, bwjVar, 8, 8);
            if (this.d != null) {
                brx.b(this.d, amh.j(cga.e, 8.0f, brg.a, brg.a, brg.a, 14), 0L, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, bwjVar, 48, 3120, 120828);
            }
        }
        return arnb.a;
    }
}
