package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeln {
    public static final aeln a;
    public static final aeln b;
    private static final /* synthetic */ aeln[] c;

    static {
        aeln aelnVar = new aeln("EXPANDED", 0);
        a = aelnVar;
        aeln aelnVar2 = new aeln("COLLAPSED", 1);
        b = aelnVar2;
        aeln[] aelnVarArr = {aelnVar, aelnVar2};
        c = aelnVarArr;
        arhi.f(aelnVarArr);
    }

    private aeln(String str, int i) {
    }

    public static aeln[] values() {
        return (aeln[]) c.clone();
    }
}
