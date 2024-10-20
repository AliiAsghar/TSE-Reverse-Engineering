package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnk {
    public static final lnk a;
    public static final lnk b;
    private static final /* synthetic */ lnk[] c;

    static {
        lnk lnkVar = new lnk("DIALOG_CLOSED", 0);
        a = lnkVar;
        lnk lnkVar2 = new lnk("DIALOG_NOT_SHOWN", 1);
        b = lnkVar2;
        lnk[] lnkVarArr = {lnkVar, lnkVar2};
        c = lnkVarArr;
        arhi.f(lnkVarArr);
    }

    private lnk(String str, int i) {
    }

    public static lnk[] values() {
        return (lnk[]) c.clone();
    }
}
