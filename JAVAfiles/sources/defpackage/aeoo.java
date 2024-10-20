package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeoo {
    public static final aeoo a;
    public static final aeoo b;
    public static final aeoo c;
    private static final /* synthetic */ aeoo[] d;

    static {
        aeoo aeooVar = new aeoo("NEUTRAL", 0);
        a = aeooVar;
        aeoo aeooVar2 = new aeoo("TONAL", 1);
        b = aeooVar2;
        aeoo aeooVar3 = new aeoo("WHITE", 2);
        c = aeooVar3;
        aeoo[] aeooVarArr = {aeooVar, aeooVar2, aeooVar3};
        d = aeooVarArr;
        arhi.f(aeooVarArr);
    }

    private aeoo(String str, int i) {
    }

    public static aeoo[] values() {
        return (aeoo[]) d.clone();
    }
}
