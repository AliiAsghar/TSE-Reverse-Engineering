package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jla {
    public static final jla a;
    public static final jla b;
    public static final jla c;
    public static final jla d;
    public static final jla e;
    private static final /* synthetic */ jla[] f;

    static {
        jla jlaVar = new jla("NONE", 0);
        a = jlaVar;
        jla jlaVar2 = new jla("SUBJECT_URGENT", 1);
        b = jlaVar2;
        jla jlaVar3 = new jla("REPLY", 2);
        c = jlaVar3;
        jla jlaVar4 = new jla("SCHEDULED_SEND", 3);
        d = jlaVar4;
        jla jlaVar5 = new jla("EDIT", 4);
        e = jlaVar5;
        jla[] jlaVarArr = {jlaVar, jlaVar2, jlaVar3, jlaVar4, jlaVar5};
        f = jlaVarArr;
        arhi.f(jlaVarArr);
    }

    private jla(String str, int i) {
    }

    public static jla[] values() {
        return (jla[]) f.clone();
    }
}
