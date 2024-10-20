package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjd {
    public static final anjd a;
    public static final anjd b;
    public static final anjd c;
    private static final /* synthetic */ anjd[] d;

    static {
        anjd anjdVar = new anjd("UNKNOWN_RENAMING_POLICY", 0);
        a = anjdVar;
        anjd anjdVar2 = new anjd("NO_RENAMING_ALLOWED", 1);
        b = anjdVar2;
        anjd anjdVar3 = new anjd("RENAMING_ALLOWED", 2);
        c = anjdVar3;
        anjd[] anjdVarArr = {anjdVar, anjdVar2, anjdVar3};
        d = anjdVarArr;
        arhi.f(anjdVarArr);
    }

    private anjd(String str, int i) {
    }

    public static anjd[] values() {
        return (anjd[]) d.clone();
    }
}
