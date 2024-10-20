package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rxe {
    public static final rxe a;
    public static final rxe b;
    public static final rxe c;
    private static final /* synthetic */ rxe[] e;
    public final long d;

    static {
        rxe rxeVar = new rxe("NO_TRACE_STORAGE", 0, 0L);
        a = rxeVar;
        rxe rxeVar2 = new rxe("LOCAL_TRACE_STORAGE", 1, 1L);
        b = rxeVar2;
        rxe rxeVar3 = new rxe("UPLOAD_TRACE_DATA", 2, 2L);
        c = rxeVar3;
        rxe[] rxeVarArr = {rxeVar, rxeVar2, rxeVar3};
        e = rxeVarArr;
        arhi.f(rxeVarArr);
    }

    private rxe(String str, int i, long j) {
        this.d = j;
    }

    public static rxe[] values() {
        return (rxe[]) e.clone();
    }
}
