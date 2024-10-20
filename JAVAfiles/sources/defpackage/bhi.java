package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class bhi {
    public static final bhi a;
    public static final bhi b;
    public static final bhi c;
    public static final bhi d;
    public static final bhi e;
    private static final /* synthetic */ bhi[] f;

    static {
        bhi bhiVar = new bhi("TopBar", 0);
        a = bhiVar;
        bhi bhiVar2 = new bhi("MainContent", 1);
        b = bhiVar2;
        bhi bhiVar3 = new bhi("Snackbar", 2);
        c = bhiVar3;
        bhi bhiVar4 = new bhi("Fab", 3);
        d = bhiVar4;
        bhi bhiVar5 = new bhi("BottomBar", 4);
        e = bhiVar5;
        bhi[] bhiVarArr = {bhiVar, bhiVar2, bhiVar3, bhiVar4, bhiVar5};
        f = bhiVarArr;
        arhi.f(bhiVarArr);
    }

    private bhi(String str, int i) {
    }

    public static bhi[] values() {
        return (bhi[]) f.clone();
    }
}
