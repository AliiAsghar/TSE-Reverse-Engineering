package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afhx {
    public static final afhx a;
    public static final afhx b;
    public static final afhx c;
    private static final /* synthetic */ afhx[] d;

    static {
        afhx afhxVar = new afhx("NONE", 0);
        a = afhxVar;
        afhx afhxVar2 = new afhx("PARTIAL", 1);
        b = afhxVar2;
        afhx afhxVar3 = new afhx("FULL", 2);
        c = afhxVar3;
        afhx[] afhxVarArr = {afhxVar, afhxVar2, afhxVar3};
        d = afhxVarArr;
        arhi.f(afhxVarArr);
    }

    private afhx(String str, int i) {
    }

    public static afhx[] values() {
        return (afhx[]) d.clone();
    }
}
