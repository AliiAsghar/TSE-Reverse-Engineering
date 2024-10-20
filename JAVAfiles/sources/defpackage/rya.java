package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rya {
    public static final rya a;
    public static final rya b;
    public static final rya c;
    public static final rya d;
    public static final rya e;
    public static final rya f;
    public static final rya g;
    public static final rya h;
    public static final rya i;
    public static final rya j;
    private static final /* synthetic */ rya[] k;

    static {
        rya ryaVar = new rya("TEST", 0);
        a = ryaVar;
        rya ryaVar2 = new rya("GET_OR_CREATE_CONVERSATION", 1);
        b = ryaVar2;
        rya ryaVar3 = new rya("UPDATE_BUGLE_PARTICIPANT_TO_MORE_CANONICAL", 2);
        c = ryaVar3;
        rya ryaVar4 = new rya("REFRESH_SELF_PARTICIPANT", 3);
        d = ryaVar4;
        rya ryaVar5 = new rya("SANITIZE_PARTICIPANTS_ACTION", 4);
        e = ryaVar5;
        rya ryaVar6 = new rya("SELF_PARTICIPANTS_DATA", 5);
        f = ryaVar6;
        rya ryaVar7 = new rya("PARTICIPANT_RECOVERY_OPERATIONS", 6);
        g = ryaVar7;
        rya ryaVar8 = new rya("PARTICIPANT_REFRESH_SELF", 7);
        h = ryaVar8;
        rya ryaVar9 = new rya("PARTICIPANT_REFRESH_OTHER", 8);
        i = ryaVar9;
        rya ryaVar10 = new rya("CMS_PARTICIPANT_MERGE", 9);
        j = ryaVar10;
        rya[] ryaVarArr = {ryaVar, ryaVar2, ryaVar3, ryaVar4, ryaVar5, ryaVar6, ryaVar7, ryaVar8, ryaVar9, ryaVar10};
        k = ryaVarArr;
        arhi.f(ryaVarArr);
    }

    private rya(String str, int i2) {
    }

    public static rya[] values() {
        return (rya[]) k.clone();
    }
}
