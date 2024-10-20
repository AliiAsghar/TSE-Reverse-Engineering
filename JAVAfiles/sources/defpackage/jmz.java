package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmz {
    public static final jmz a;
    public static final jmz b;
    public static final jmz c;
    public static final jmz d;
    public static final jmz e;
    public static final jmz f;
    public static final jmz g;
    private static final /* synthetic */ jmz[] i;
    public final boolean h;

    static {
        jmz jmzVar = new jmz("DUPLICATE", 0, true);
        a = jmzVar;
        jmz jmzVar2 = new jmz("REJECTED_ATTACHMENTS_NOT_SUPPORTED", 1, false);
        b = jmzVar2;
        jmz jmzVar3 = new jmz("REJECTED_EXCEED_MAX_ATTACHMENT_COUNT", 2, false);
        c = jmzVar3;
        jmz jmzVar4 = new jmz("REJECTED_VIDEO_ATTACHMENT_DURATION_TOO_LONG", 3, false);
        d = jmzVar4;
        jmz jmzVar5 = new jmz("REJECTED_EXCEED_MAX_MESSAGE_SIZE_SINGLE_ATTACHMENT", 4, false);
        e = jmzVar5;
        jmz jmzVar6 = new jmz("REJECTED_EXCEED_MAX_MESSAGE_SIZE_MULTIPLE_ATTACHMENTS", 5, false);
        f = jmzVar6;
        jmz jmzVar7 = new jmz("ACCEPTED", 6, true);
        g = jmzVar7;
        jmz[] jmzVarArr = {jmzVar, jmzVar2, jmzVar3, jmzVar4, jmzVar5, jmzVar6, jmzVar7};
        i = jmzVarArr;
        arhi.f(jmzVarArr);
    }

    private jmz(String str, int i2, boolean z) {
        this.h = z;
    }

    public static jmz[] values() {
        return (jmz[]) i.clone();
    }
}
