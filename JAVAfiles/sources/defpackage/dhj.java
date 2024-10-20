package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhj extends arrp implements arqv<dgn, dgn, dgn> {
    public static final dhj a = new dhj();

    public dhj() {
        super(2);
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        String str;
        armh armhVar;
        dgn dgnVar = (dgn) obj;
        dgn dgnVar2 = (dgn) obj2;
        if (dgnVar == null || (str = dgnVar.a) == null) {
            str = dgnVar2.a;
        }
        if (dgnVar == null || (armhVar = dgnVar.b) == null) {
            armhVar = dgnVar2.b;
        }
        return new dgn(str, armhVar);
    }
}
