package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anlt {
    public static final anlt a;
    public static final anlt b;
    public static final anlt c;
    public static final anlt d;
    private static final /* synthetic */ anlt[] e;

    static {
        anlt anltVar = new anlt("UNKNOWN", 0);
        a = anltVar;
        anlt anltVar2 = new anlt("OFFLINE", 1);
        b = anltVar2;
        anlt anltVar3 = new anlt("ONLINE", 2);
        c = anltVar3;
        anlt anltVar4 = new anlt("NOT_RCS", 3);
        d = anltVar4;
        anlt[] anltVarArr = {anltVar, anltVar2, anltVar3, anltVar4};
        e = anltVarArr;
        arhi.f(anltVarArr);
    }

    private anlt(String str, int i) {
    }

    public static anlt[] values() {
        return (anlt[]) e.clone();
    }
}
