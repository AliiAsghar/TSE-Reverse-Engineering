package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aipw {
    public static final aipw a;
    public static final aipw b;
    public final boolean c;
    public final boolean d;
    public final alog e;
    public final alog f;

    static {
        boolean z;
        aipv aipvVar = new aipv();
        aipvVar.c();
        a = aipvVar.a();
        aipv aipvVar2 = new aipv();
        aipvVar2.c();
        aipvVar2.b(new aipu());
        aipvVar2.a();
        aipv aipvVar3 = new aipv();
        if (aipvVar3.a == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "A SourcePolicy can only set internal() or external() once.");
        aipvVar3.a = true;
        b = aipvVar3.a();
    }

    public aipw(boolean z, boolean z2, alog alogVar, alog alogVar2) {
        this.c = z;
        this.d = z2;
        this.e = alogVar;
        this.f = alogVar2;
    }

    public static aipw a(String str) {
        aipv aipvVar = new aipv();
        aipvVar.c();
        aipvVar.b = true;
        aipvVar.b(new aipt(str));
        return aipvVar.a();
    }
}
