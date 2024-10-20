package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bco {
    public static final bco a;
    public static final bco b;
    public static final bco c;
    private static final /* synthetic */ bco[] d;

    static {
        bco bcoVar = new bco("BEFORE", 0);
        a = bcoVar;
        bco bcoVar2 = new bco("ON", 1);
        b = bcoVar2;
        bco bcoVar3 = new bco("AFTER", 2);
        c = bcoVar3;
        bco[] bcoVarArr = {bcoVar, bcoVar2, bcoVar3};
        d = bcoVarArr;
        arhi.f(bcoVarArr);
    }

    private bco(String str, int i) {
    }

    public static bco[] values() {
        return (bco[]) d.clone();
    }
}
