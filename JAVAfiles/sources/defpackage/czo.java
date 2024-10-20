package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class czo {
    public static final czo a;
    public static final czo b;
    public static final czo c;
    private static final /* synthetic */ czo[] d;

    static {
        czo czoVar = new czo("ContinueTraversal", 0);
        a = czoVar;
        czo czoVar2 = new czo("SkipSubtreeAndContinueTraversal", 1);
        b = czoVar2;
        czo czoVar3 = new czo("CancelTraversal", 2);
        c = czoVar3;
        czo[] czoVarArr = {czoVar, czoVar2, czoVar3};
        d = czoVarArr;
        arhi.f(czoVarArr);
    }

    private czo(String str, int i) {
    }

    public static czo[] values() {
        return (czo[]) d.clone();
    }
}
