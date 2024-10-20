package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjg {
    public static final kjg a;
    public static final kjg b;
    public static final kjg c;
    private static final /* synthetic */ kjg[] d;

    static {
        kjg kjgVar = new kjg("STARTED", 0);
        a = kjgVar;
        kjg kjgVar2 = new kjg("STOPPED", 1);
        b = kjgVar2;
        kjg kjgVar3 = new kjg("CANCELLED", 2);
        c = kjgVar3;
        kjg[] kjgVarArr = {kjgVar, kjgVar2, kjgVar3};
        d = kjgVarArr;
        arhi.f(kjgVarArr);
    }

    private kjg(String str, int i) {
    }

    public static kjg[] values() {
        return (kjg[]) d.clone();
    }
}
