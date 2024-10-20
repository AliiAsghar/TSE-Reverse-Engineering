package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahp {
    public static final ahp a;
    public static final ahp b;
    private static final /* synthetic */ ahp[] c;

    static {
        ahp ahpVar = new ahp("Vertical", 0);
        a = ahpVar;
        ahp ahpVar2 = new ahp("Horizontal", 1);
        b = ahpVar2;
        ahp[] ahpVarArr = {ahpVar, ahpVar2};
        c = ahpVarArr;
        arhi.f(ahpVarArr);
    }

    private ahp(String str, int i) {
    }

    public static ahp[] values() {
        return (ahp[]) c.clone();
    }
}
