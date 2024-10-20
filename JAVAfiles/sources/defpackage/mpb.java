package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpb {
    public static final mpb a;
    public static final mpb b;
    public static final mpb c;
    public static final mpb d;
    public static final mpb e;
    public static final mpb f;
    public static final mpb g;
    public static final mpb h;
    public static final mpb i;
    public static final mpb j;
    public static final mpb k;
    public static final mpb l;
    public static final mpb m;
    public static final mpb n;
    private static final /* synthetic */ mpb[] o;

    static {
        mpb mpbVar = new mpb("GROUP_UPGRADE_ELIGIBLE_SELF_ACTIVE_UPGRADER", 0);
        a = mpbVar;
        mpb mpbVar2 = new mpb("SELF_NOT_ACTIVE_UPGRADER", 1);
        b = mpbVar2;
        mpb mpbVar3 = new mpb("CONVERSATION_NOT_ACTIVE", 2);
        c = mpbVar3;
        mpb mpbVar4 = new mpb("ACTIVE_SELF_NOT_FOUND", 3);
        d = mpbVar4;
        mpb mpbVar5 = new mpb("MAX_GROUP_SIZE_EXCEEDED", 4);
        e = mpbVar5;
        mpb mpbVar6 = new mpb("SELF_NOT_RCS_CAPABLE", 5);
        f = mpbVar6;
        mpb mpbVar7 = new mpb("SELF_NOT_REGISTERED", 6);
        g = mpbVar7;
        mpb mpbVar8 = new mpb("PARTICIPANT_NOT_RCS_CAPABLE", 7);
        h = mpbVar8;
        mpb mpbVar9 = new mpb("PARTICIPANT_NOT_UPGRADE_CAPABLE", 8);
        i = mpbVar9;
        mpb mpbVar10 = new mpb("REMOTE_PARTICIPANT_NOT_NORMALIZED", 9);
        j = mpbVar10;
        mpb mpbVar11 = new mpb("GROUP_SIZE_TOO_LARGE", 10);
        k = mpbVar11;
        mpb mpbVar12 = new mpb("PARTICIPANT_NOT_GOOGLE_MESSAGES", 11);
        l = mpbVar12;
        mpb mpbVar13 = new mpb("DUPLICATE_RCS_GROUP_EXISTS", 12);
        m = mpbVar13;
        mpb mpbVar14 = new mpb("SELF_IDENTITY_IN_PARTICIPANTS", 13);
        n = mpbVar14;
        mpb[] mpbVarArr = {mpbVar, mpbVar2, mpbVar3, mpbVar4, mpbVar5, mpbVar6, mpbVar7, mpbVar8, mpbVar9, mpbVar10, mpbVar11, mpbVar12, mpbVar13, mpbVar14};
        o = mpbVarArr;
        arhi.f(mpbVarArr);
    }

    private mpb(String str, int i2) {
    }

    public static mpb[] values() {
        return (mpb[]) o.clone();
    }
}
