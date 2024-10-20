package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anis {
    public static final anis a;
    public static final anis b;
    public static final anis c;
    public static final anis d;
    public static final anis e;
    public static final anis f;
    public static final anis g;
    private static final /* synthetic */ anis[] h;

    static {
        anis anisVar = new anis("ERROR_NO_RETRY", 0);
        a = anisVar;
        anis anisVar2 = new anis("ERROR_RETRY_IMMEDIATE", 1);
        b = anisVar2;
        anis anisVar3 = new anis("ERROR_RETRY_REFRESH_REGISTRATION", 2);
        c = anisVar3;
        anis anisVar4 = new anis("ERROR_RETRY_NEEDS_REPROVISION", 3);
        d = anisVar4;
        anis anisVar5 = new anis("ERROR_RETRY_NEEDS_GROUP_RECREATION", 4);
        e = anisVar5;
        anis anisVar6 = new anis("ERROR_REMOVE_SELF_FROM_GROUP", 5);
        f = anisVar6;
        anis anisVar7 = new anis("ERROR_DESTINATION_NOT_TACHYGRAM", 6);
        g = anisVar7;
        anis[] anisVarArr = {anisVar, anisVar2, anisVar3, anisVar4, anisVar5, anisVar6, anisVar7};
        h = anisVarArr;
        arhi.f(anisVarArr);
    }

    private anis(String str, int i) {
    }

    public static anis[] values() {
        return (anis[]) h.clone();
    }
}
