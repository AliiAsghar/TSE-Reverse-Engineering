package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abff {
    public static final abff a;
    public static final abff b;
    public static final abff c;
    public static final abff d;
    private static final /* synthetic */ abff[] e;

    static {
        abff abffVar = new abff("NO_ACTIVITY", 0);
        a = abffVar;
        abff abffVar2 = new abff("WELCOME_FLOW_ACTIVITY", 1);
        b = abffVar2;
        abff abffVar3 = new abff("WELCOME_FLOW_WITH_GAIA", 2);
        c = abffVar3;
        abff abffVar4 = new abff("IS_CURRENTLY_SHOWN", 3);
        d = abffVar4;
        abff[] abffVarArr = {abffVar, abffVar2, abffVar3, abffVar4};
        e = abffVarArr;
        arhi.f(abffVarArr);
    }

    private abff(String str, int i) {
    }

    public static abff[] values() {
        return (abff[]) e.clone();
    }
}
