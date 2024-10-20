package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhz {
    public static final bhz a;
    public static final bhz b;
    private static final /* synthetic */ bhz[] c;

    static {
        bhz bhzVar = new bhz("Dismissed", 0);
        a = bhzVar;
        bhz bhzVar2 = new bhz("ActionPerformed", 1);
        b = bhzVar2;
        bhz[] bhzVarArr = {bhzVar, bhzVar2};
        c = bhzVarArr;
        arhi.f(bhzVarArr);
    }

    private bhz(String str, int i) {
    }

    public static bhz[] values() {
        return (bhz[]) c.clone();
    }
}
