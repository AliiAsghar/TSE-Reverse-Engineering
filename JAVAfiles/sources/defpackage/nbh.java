package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbh {
    public static final nbh a;
    public static final nbh b;
    private static final /* synthetic */ nbh[] c;

    static {
        nbh nbhVar = new nbh("ADD", 0);
        a = nbhVar;
        nbh nbhVar2 = new nbh("REMOVE", 1);
        b = nbhVar2;
        nbh[] nbhVarArr = {nbhVar, nbhVar2};
        c = nbhVarArr;
        arhi.f(nbhVarArr);
    }

    private nbh(String str, int i) {
    }

    public static nbh[] values() {
        return (nbh[]) c.clone();
    }
}
