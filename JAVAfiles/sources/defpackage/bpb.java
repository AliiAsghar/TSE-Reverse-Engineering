package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class bpb {
    public static final bpb a;
    public static final bpb b;
    public static final bpb c;
    public static final bpb d;
    public static final bpb e;
    private static final /* synthetic */ bpb[] f;

    static {
        bpb bpbVar = new bpb("TopBar", 0);
        a = bpbVar;
        bpb bpbVar2 = new bpb("MainContent", 1);
        b = bpbVar2;
        bpb bpbVar3 = new bpb("Snackbar", 2);
        c = bpbVar3;
        bpb bpbVar4 = new bpb("Fab", 3);
        d = bpbVar4;
        bpb bpbVar5 = new bpb("BottomBar", 4);
        e = bpbVar5;
        bpb[] bpbVarArr = {bpbVar, bpbVar2, bpbVar3, bpbVar4, bpbVar5};
        f = bpbVarArr;
        arhi.f(bpbVarArr);
    }

    private bpb(String str, int i) {
    }

    public static bpb[] values() {
        return (bpb[]) f.clone();
    }
}
