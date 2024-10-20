package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjg {
    public static final jjg a;
    public static final jjg b;
    public static final jjg c;
    public static final jjg d;
    private static final /* synthetic */ jjg[] e;

    static {
        jjg jjgVar = new jjg("PROCESSING_ATTACHMENTS", 0);
        a = jjgVar;
        jjg jjgVar2 = new jjg("EDIT_MESSAGE_TEXT_NOT_CHANGED", 1);
        b = jjgVar2;
        jjg jjgVar3 = new jjg("NO_SENDABLE_DRAFT_CONTENTS", 2);
        c = jjgVar3;
        jjg jjgVar4 = new jjg("LONGER_THAN_MAX_MESSAGE_SIZE", 3);
        d = jjgVar4;
        jjg[] jjgVarArr = {jjgVar, jjgVar2, jjgVar3, jjgVar4};
        e = jjgVarArr;
        arhi.f(jjgVarArr);
    }

    private jjg(String str, int i) {
    }

    public static jjg[] values() {
        return (jjg[]) e.clone();
    }
}
