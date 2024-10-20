package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class utk {
    public static final utk a;
    public static final utk b;
    public static final utk c;
    public static final utk d;
    private static final /* synthetic */ utk[] e;

    static {
        utk utkVar = new utk("DEFAULT", 0);
        a = utkVar;
        utk utkVar2 = new utk("SCYTALE", 1);
        b = utkVar2;
        utk utkVar3 = new utk("MLS", 2);
        c = utkVar3;
        utk utkVar4 = new utk("MLS_SCYTALE", 3);
        d = utkVar4;
        utk[] utkVarArr = {utkVar, utkVar2, utkVar3, utkVar4};
        e = utkVarArr;
        arhi.f(utkVarArr);
    }

    private utk(String str, int i) {
    }

    public static utk[] values() {
        return (utk[]) e.clone();
    }
}
