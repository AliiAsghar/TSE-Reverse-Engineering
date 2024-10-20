package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcn {
    public static final bcn a;
    public static final bcn b;
    public static final bcn c;
    private static final /* synthetic */ bcn[] d;

    static {
        bcn bcnVar = new bcn("CROSSED", 0);
        a = bcnVar;
        bcn bcnVar2 = new bcn("NOT_CROSSED", 1);
        b = bcnVar2;
        bcn bcnVar3 = new bcn("COLLAPSED", 2);
        c = bcnVar3;
        bcn[] bcnVarArr = {bcnVar, bcnVar2, bcnVar3};
        d = bcnVarArr;
        arhi.f(bcnVarArr);
    }

    private bcn(String str, int i) {
    }

    public static bcn[] values() {
        return (bcn[]) d.clone();
    }
}
