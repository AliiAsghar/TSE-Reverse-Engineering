package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afbv {
    public static final afbv a;
    public static final afbv b;
    public static final afbv c;
    private static final /* synthetic */ afbv[] d;

    static {
        afbv afbvVar = new afbv("POSITION_1", 0);
        a = afbvVar;
        afbv afbvVar2 = new afbv("POSITION_2", 1);
        b = afbvVar2;
        afbv afbvVar3 = new afbv("POSITION_3", 2);
        c = afbvVar3;
        afbv[] afbvVarArr = {afbvVar, afbvVar2, afbvVar3};
        d = afbvVarArr;
        arhi.f(afbvVarArr);
    }

    private afbv(String str, int i) {
    }

    public static afbv[] values() {
        return (afbv[]) d.clone();
    }
}
