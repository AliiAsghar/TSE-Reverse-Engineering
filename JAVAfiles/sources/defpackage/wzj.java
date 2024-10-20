package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wzj {
    public static final wzj a;
    public static final wzj b;
    public static final wzj c;
    private static final /* synthetic */ wzj[] d;

    static {
        wzj wzjVar = new wzj("SUCCEEDED", 0);
        a = wzjVar;
        wzj wzjVar2 = new wzj("FAILED", 1);
        b = wzjVar2;
        wzj wzjVar3 = new wzj("SKIPPED", 2);
        c = wzjVar3;
        wzj[] wzjVarArr = {wzjVar, wzjVar2, wzjVar3};
        d = wzjVarArr;
        arhi.f(wzjVarArr);
    }

    private wzj(String str, int i) {
    }

    public static wzj[] values() {
        return (wzj[]) d.clone();
    }
}
