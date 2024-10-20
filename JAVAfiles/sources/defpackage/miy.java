package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class miy {
    public static final miy a;
    public static final miy b;
    private static final /* synthetic */ miy[] c;

    static {
        miy miyVar = new miy("SIMPLE", 0);
        a = miyVar;
        miy miyVar2 = new miy("RICH", 1);
        b = miyVar2;
        miy[] miyVarArr = {miyVar, miyVar2};
        c = miyVarArr;
        arhi.f(miyVarArr);
    }

    private miy(String str, int i) {
    }

    public static miy[] values() {
        return (miy[]) c.clone();
    }
}
