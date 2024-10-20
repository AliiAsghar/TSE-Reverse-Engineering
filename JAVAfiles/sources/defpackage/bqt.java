package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqt {
    public static final bqt a;
    public static final bqt b;
    private static final /* synthetic */ bqt[] c;

    static {
        bqt bqtVar = new bqt("Dismissed", 0);
        a = bqtVar;
        bqt bqtVar2 = new bqt("ActionPerformed", 1);
        b = bqtVar2;
        bqt[] bqtVarArr = {bqtVar, bqtVar2};
        c = bqtVarArr;
        arhi.f(bqtVarArr);
    }

    private bqt(String str, int i) {
    }

    public static bqt[] values() {
        return (bqt[]) c.clone();
    }
}
