package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfr {
    public static final zfr a;
    public static final zfr b;
    public static final zfr c;
    public static final zfr d;
    private static final /* synthetic */ zfr[] e;

    static {
        zfr zfrVar = new zfr("SAMSUNG_DYNAMIC", 0);
        a = zfrVar;
        zfr zfrVar2 = new zfr("MATERIAL_NEXT", 1);
        b = zfrVar2;
        zfr zfrVar3 = new zfr("SAMSUNG", 2);
        c = zfrVar3;
        zfr zfrVar4 = new zfr("SYSTEM_FONT", 3);
        d = zfrVar4;
        zfr[] zfrVarArr = {zfrVar, zfrVar2, zfrVar3, zfrVar4};
        e = zfrVarArr;
        arhi.f(zfrVarArr);
    }

    private zfr(String str, int i) {
    }

    public static zfr[] values() {
        return (zfr[]) e.clone();
    }
}
