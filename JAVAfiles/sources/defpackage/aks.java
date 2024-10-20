package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aks {
    public static final aks a;
    public static final aks b;
    public static final aks c;
    private static final /* synthetic */ aks[] d;

    static {
        aks aksVar = new aks("Vertical", 0);
        a = aksVar;
        aks aksVar2 = new aks("Horizontal", 1);
        b = aksVar2;
        aks aksVar3 = new aks("Both", 2);
        c = aksVar3;
        aks[] aksVarArr = {aksVar, aksVar2, aksVar3};
        d = aksVarArr;
        arhi.f(aksVarArr);
    }

    private aks(String str, int i) {
    }

    public static aks[] values() {
        return (aks[]) d.clone();
    }
}
