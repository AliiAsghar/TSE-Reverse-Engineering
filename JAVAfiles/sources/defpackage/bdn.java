package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdn {
    public static final bdn a;
    public static final bdn b;
    public static final bdn c;
    private static final /* synthetic */ bdn[] d;

    static {
        bdn bdnVar = new bdn("Left", 0);
        a = bdnVar;
        bdn bdnVar2 = new bdn("Middle", 1);
        b = bdnVar2;
        bdn bdnVar3 = new bdn("Right", 2);
        c = bdnVar3;
        bdn[] bdnVarArr = {bdnVar, bdnVar2, bdnVar3};
        d = bdnVarArr;
        arhi.f(bdnVarArr);
    }

    private bdn(String str, int i) {
    }

    public static bdn[] values() {
        return (bdn[]) d.clone();
    }
}
