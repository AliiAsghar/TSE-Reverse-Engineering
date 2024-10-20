package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aftm implements afru<aftm, afrx> {
    private static final afsv a;
    public static final arml b;
    private final String d;

    static {
        new afth("*");
        a = afsv.a;
        b = armd.a(afrg.f);
    }

    public aftm(String str) {
        this.d = str;
    }

    @Override // defpackage.afru
    public String a() {
        return this.d;
    }

    @Override // defpackage.afru
    public final afsw b() {
        return a;
    }

    @Override // defpackage.afru
    public final /* synthetic */ afsx c() {
        return afwv.L(this);
    }
}
