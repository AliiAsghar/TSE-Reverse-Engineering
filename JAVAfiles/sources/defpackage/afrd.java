package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afrd {
    public static final afrd a;
    public static final afrd b;
    public static final afrd c;
    private static final /* synthetic */ afrd[] d;

    static {
        afrd afrdVar = new afrd("LOADING", 0);
        a = afrdVar;
        afrd afrdVar2 = new afrd("ONBOARDED", 1);
        b = afrdVar2;
        afrd afrdVar3 = new afrd("NOT_ONBOARDED", 2);
        c = afrdVar3;
        afrd[] afrdVarArr = {afrdVar, afrdVar2, afrdVar3};
        d = afrdVarArr;
        arhi.f(afrdVarArr);
    }

    private afrd(String str, int i) {
    }

    public static afrd[] values() {
        return (afrd[]) d.clone();
    }
}
