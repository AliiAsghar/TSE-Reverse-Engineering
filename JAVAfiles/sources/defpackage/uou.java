package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uou {
    public static final uou a;
    public static final uou b;
    private static final /* synthetic */ uou[] c;

    static {
        uou uouVar = new uou("V1", 0);
        a = uouVar;
        uou uouVar2 = new uou("V2", 1);
        b = uouVar2;
        uou[] uouVarArr = {uouVar, uouVar2};
        c = uouVarArr;
        arhi.f(uouVarArr);
    }

    private uou(String str, int i) {
    }

    public static uou[] values() {
        return (uou[]) c.clone();
    }
}
