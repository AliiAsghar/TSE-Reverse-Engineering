package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeco {
    public static final aeco a;
    public static final aeco b;
    public static final aeco c;
    public static final aeco d;
    private static final /* synthetic */ aeco[] e;

    static {
        aeco aecoVar = new aeco("RESULT_UNKNOWN", 0);
        a = aecoVar;
        aeco aecoVar2 = new aeco("RESULT_MODEL_INFERENCE", 1);
        b = aecoVar2;
        aeco aecoVar3 = new aeco("RESULT_BLOCKLIST_PROCESS", 2);
        c = aecoVar3;
        aeco aecoVar4 = new aeco("RESULT_HEURISTIC_SCORE", 3);
        d = aecoVar4;
        aeco[] aecoVarArr = {aecoVar, aecoVar2, aecoVar3, aecoVar4};
        e = aecoVarArr;
        arhi.f(aecoVarArr);
    }

    private aeco(String str, int i) {
    }

    public static aeco[] values() {
        return (aeco[]) e.clone();
    }
}
