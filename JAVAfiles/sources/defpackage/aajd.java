package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajd {
    public static final aajd a;
    public static final aajd b;
    public static final aajd c;
    public static final aajd d;
    private static final /* synthetic */ aajd[] f;
    public final long e;

    static {
        aajd aajdVar = new aajd("UNKNOWN", 0, 0L);
        a = aajdVar;
        aajd aajdVar2 = new aajd("INSERT", 1, 1L);
        b = aajdVar2;
        aajd aajdVar3 = new aajd("UPDATE", 2, 2L);
        c = aajdVar3;
        aajd aajdVar4 = new aajd("DELETE", 3, 3L);
        d = aajdVar4;
        aajd[] aajdVarArr = {aajdVar, aajdVar2, aajdVar3, aajdVar4};
        f = aajdVarArr;
        arhi.f(aajdVarArr);
    }

    private aajd(String str, int i, long j) {
        this.e = j;
    }

    public static aajd[] values() {
        return (aajd[]) f.clone();
    }
}
