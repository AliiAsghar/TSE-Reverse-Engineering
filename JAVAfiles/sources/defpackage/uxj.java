package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uxj {
    public static final uxj a;
    public static final uxj b;
    public static final uxj c;
    public static final /* synthetic */ arpx d;
    private static final /* synthetic */ uxj[] e;

    static {
        uxj uxjVar = new uxj("UNKNOWN", 0);
        a = uxjVar;
        uxj uxjVar2 = new uxj("UNDER_SUPERVISION", 1);
        b = uxjVar2;
        uxj uxjVar3 = new uxj("SUPERVISION_DISABLED", 2);
        c = uxjVar3;
        uxj[] uxjVarArr = {uxjVar, uxjVar2, uxjVar3};
        e = uxjVarArr;
        d = arhi.f(uxjVarArr);
    }

    private uxj(String str, int i) {
    }

    public static uxj[] values() {
        return (uxj[]) e.clone();
    }
}
