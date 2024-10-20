package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aerp {
    public static final aerp a;
    public static final aerp b;
    public static final aerp c;
    public static final aerp d;
    public static final aerp e;
    private static final /* synthetic */ aerp[] f;

    static {
        aerp aerpVar = new aerp("PROCESSING_NO_CONTENT", 0);
        a = aerpVar;
        aerp aerpVar2 = new aerp("DOWNLOADABLE_NO_CONTENT", 1);
        b = aerpVar2;
        aerp aerpVar3 = new aerp("NO_CONNECTION_NO_CONTENT", 2);
        c = aerpVar3;
        aerp aerpVar4 = new aerp("MANUAL_DOWNLOADING_NO_CONTENT", 3);
        d = aerpVar4;
        aerp aerpVar5 = new aerp("NORMAL", 4);
        e = aerpVar5;
        aerp[] aerpVarArr = {aerpVar, aerpVar2, aerpVar3, aerpVar4, aerpVar5};
        f = aerpVarArr;
        arhi.f(aerpVarArr);
    }

    private aerp(String str, int i) {
    }

    public static aerp[] values() {
        return (aerp[]) f.clone();
    }
}
