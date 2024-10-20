package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajce {
    public static final ajce a;
    public static final ajce b;
    public static final ajce c;
    public static final ajce d;
    public static final ajce e;
    public static final ajce f;
    private static final /* synthetic */ ajce[] g;

    static {
        ajce ajceVar = new ajce("UNKNOWN", 0);
        a = ajceVar;
        ajce ajceVar2 = new ajce("LOAD_FAILED", 1);
        b = ajceVar2;
        ajce ajceVar3 = new ajce("ACCEPTED", 2);
        c = ajceVar3;
        ajce ajceVar4 = new ajce("ACCEPTED_SAVE_FAILED", 3);
        d = ajceVar4;
        ajce ajceVar5 = new ajce("DECLINED_DISMISSED", 4);
        e = ajceVar5;
        ajce ajceVar6 = new ajce("DECLINED_EXPLICITLY", 5);
        f = ajceVar6;
        ajce[] ajceVarArr = {ajceVar, ajceVar2, ajceVar3, ajceVar4, ajceVar5, ajceVar6};
        g = ajceVarArr;
        arhi.f(ajceVarArr);
    }

    private ajce(String str, int i) {
    }

    public static ajce[] values() {
        return (ajce[]) g.clone();
    }
}
