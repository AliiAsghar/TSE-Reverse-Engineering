package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzk {
    public static final zzk a;
    public static final zzk b;
    public static final zzk c;
    public static final zzk d;
    public static final zzk e;
    private static final /* synthetic */ zzk[] f;

    static {
        zzk zzkVar = new zzk("DO_NOT_RENDER", 0);
        a = zzkVar;
        zzk zzkVar2 = new zzk("DATA_LOADING", 1);
        b = zzkVar2;
        zzk zzkVar3 = new zzk("VISIBLE", 2);
        c = zzkVar3;
        zzk zzkVar4 = new zzk("IN_EXIT_TRANSITION", 3);
        d = zzkVar4;
        zzk zzkVar5 = new zzk("HIDDEN", 4);
        e = zzkVar5;
        zzk[] zzkVarArr = {zzkVar, zzkVar2, zzkVar3, zzkVar4, zzkVar5};
        f = zzkVarArr;
        arhi.f(zzkVarArr);
    }

    private zzk(String str, int i) {
    }

    public static zzk[] values() {
        return (zzk[]) f.clone();
    }
}
