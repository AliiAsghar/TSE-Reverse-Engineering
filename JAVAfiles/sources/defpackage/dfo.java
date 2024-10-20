package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfo {
    public static final dfo a;
    public static final dfo b;
    public static final dfo c;
    public static final dfo d;
    private static final /* synthetic */ dfo[] g;
    public final int e;
    public final int f;

    static {
        dfo dfoVar = new dfo("Copy", 0, 0);
        a = dfoVar;
        dfo dfoVar2 = new dfo("Paste", 1, 1);
        b = dfoVar2;
        dfo dfoVar3 = new dfo("Cut", 2, 2);
        c = dfoVar3;
        dfo dfoVar4 = new dfo("SelectAll", 3, 3);
        d = dfoVar4;
        dfo[] dfoVarArr = {dfoVar, dfoVar2, dfoVar3, dfoVar4};
        g = dfoVarArr;
        arhi.f(dfoVarArr);
    }

    private dfo(String str, int i, int i2) {
        this.e = i2;
        this.f = i2;
    }

    public static dfo[] values() {
        return (dfo[]) g.clone();
    }
}
