package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadm {
    public static final aadm a;
    public static final aadm b;
    public static final aadm c;
    private static final /* synthetic */ aadm[] d;

    static {
        aadm aadmVar = new aadm("NOT_QUALIFIED", 0);
        a = aadmVar;
        aadm aadmVar2 = new aadm("QUALIFIED_INCOMING", 1);
        b = aadmVar2;
        aadm aadmVar3 = new aadm("QUALIFIED_OUTGOING", 2);
        c = aadmVar3;
        aadm[] aadmVarArr = {aadmVar, aadmVar2, aadmVar3};
        d = aadmVarArr;
        arhi.f(aadmVarArr);
    }

    private aadm(String str, int i) {
    }

    public static aadm[] values() {
        return (aadm[]) d.clone();
    }
}
