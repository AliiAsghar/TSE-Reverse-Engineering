package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class brd {
    public static final brd a;
    public static final brd b;
    public static final brd c;
    private static final /* synthetic */ brd[] d;

    static {
        brd brdVar = new brd("StartToEnd", 0);
        a = brdVar;
        brd brdVar2 = new brd("EndToStart", 1);
        b = brdVar2;
        brd brdVar3 = new brd("Settled", 2);
        c = brdVar3;
        brd[] brdVarArr = {brdVar, brdVar2, brdVar3};
        d = brdVarArr;
        arhi.f(brdVarArr);
    }

    private brd(String str, int i) {
    }

    public static brd[] values() {
        return (brd[]) d.clone();
    }
}
