package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aemu extends arrp implements arqr {
    final /* synthetic */ aenk a;
    final /* synthetic */ boolean b;
    final /* synthetic */ aeoo c;
    final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemu(aenk aenkVar, boolean z, aeoo aeooVar, float f) {
        super(1);
        this.a = aenkVar;
        this.b = z;
        this.c = aeooVar;
        this.d = f;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aos aosVar = (aos) obj;
        aosVar.getClass();
        aenk aenkVar = this.a;
        int i = 0;
        for (Object obj2 : aenkVar.a) {
            int i2 = i + 1;
            if (i < 0) {
                aqjn.G();
            }
            aejt aejtVar = (aejt) obj2;
            aor.a(aosVar, null, new cdj(1102229348, true, new aemt(aejtVar, aenkVar, i, this.b, this.c, this.d)), 3);
            i = i2;
        }
        return arnb.a;
    }
}
