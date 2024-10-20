package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzu {
    public static final zzu a;
    public static final zzu b;
    public static final zzu c;
    public static final zzu d;
    private static final /* synthetic */ zzu[] e;

    static {
        zzu zzuVar = new zzu("DO_NOT_RENDER", 0);
        a = zzuVar;
        zzu zzuVar2 = new zzu("CLICKED_FROM_CDP", 1);
        b = zzuVar2;
        zzu zzuVar3 = new zzu("CLICKED_FROM_MINI_CDP", 2);
        c = zzuVar3;
        zzu zzuVar4 = new zzu("DISMISSED", 3);
        d = zzuVar4;
        zzu[] zzuVarArr = {zzuVar, zzuVar2, zzuVar3, zzuVar4};
        e = zzuVarArr;
        arhi.f(zzuVarArr);
    }

    private zzu(String str, int i) {
    }

    public static zzu[] values() {
        return (zzu[]) e.clone();
    }
}
