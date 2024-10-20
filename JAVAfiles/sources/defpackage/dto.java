package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dto {
    public static final dto a;
    public static final dto b;
    public static final dto c;
    private static final /* synthetic */ dto[] d;

    static {
        dto dtoVar = new dto("Inherit", 0);
        a = dtoVar;
        dto dtoVar2 = new dto("SecureOn", 1);
        b = dtoVar2;
        dto dtoVar3 = new dto("SecureOff", 2);
        c = dtoVar3;
        dto[] dtoVarArr = {dtoVar, dtoVar2, dtoVar3};
        d = dtoVarArr;
        arhi.f(dtoVarArr);
    }

    private dto(String str, int i) {
    }

    public static dto[] values() {
        return (dto[]) d.clone();
    }
}
