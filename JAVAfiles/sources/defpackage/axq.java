package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class axq {
    public static final axq a;
    public static final axq b;
    public static final axq c;
    private static final /* synthetic */ axq[] d;

    static {
        axq axqVar = new axq("None", 0);
        a = axqVar;
        axq axqVar2 = new axq("Selection", 1);
        b = axqVar2;
        axq axqVar3 = new axq("Cursor", 2);
        c = axqVar3;
        axq[] axqVarArr = {axqVar, axqVar2, axqVar3};
        d = axqVarArr;
        arhi.f(axqVarArr);
    }

    private axq(String str, int i) {
    }

    public static axq[] values() {
        return (axq[]) d.clone();
    }
}
