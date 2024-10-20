package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iel {
    public static final iel a;
    public static final iel b;
    private static final /* synthetic */ iel[] c;

    static {
        iel ielVar = new iel("UNKNOWN", 0);
        a = ielVar;
        iel ielVar2 = new iel("HIDDEN", 1);
        b = ielVar2;
        iel[] ielVarArr = {ielVar, ielVar2};
        c = ielVarArr;
        arhi.f(ielVarArr);
    }

    private iel(String str, int i) {
    }

    public static iel[] values() {
        return (iel[]) c.clone();
    }
}
