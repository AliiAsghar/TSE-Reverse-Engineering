package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jna {
    public static final jna a;
    public static final jna b;
    public static final jna c;
    public static final jna d;
    public static final jna e;
    public static final jna f;
    public static final jna g;
    private static final /* synthetic */ jna[] h;

    static {
        jna jnaVar = new jna("REJECTED_ATTACHMENTS_NOT_SUPPORTED", 0);
        a = jnaVar;
        jna jnaVar2 = new jna("REJECTED_EXCEED_MAX_ATTACHMENT_COUNT", 1);
        b = jnaVar2;
        jna jnaVar3 = new jna("REJECTED_VIDEO_ATTACHMENT_DURATION_TOO_LONG", 2);
        c = jnaVar3;
        jna jnaVar4 = new jna("REJECTED_EXCEED_MAX_MESSAGE_SIZE_SINGLE_ATTACHMENT", 3);
        d = jnaVar4;
        jna jnaVar5 = new jna("REJECTED_EXCEED_MAX_MESSAGE_SIZE_MULTIPLE_ATTACHMENTS", 4);
        e = jnaVar5;
        jna jnaVar6 = new jna("REJECTED_EXCEED_MAX_VIDEO_COUNT", 5);
        f = jnaVar6;
        jna jnaVar7 = new jna("ACCEPTED", 6);
        g = jnaVar7;
        jna[] jnaVarArr = {jnaVar, jnaVar2, jnaVar3, jnaVar4, jnaVar5, jnaVar6, jnaVar7};
        h = jnaVarArr;
        arhi.f(jnaVarArr);
    }

    private jna(String str, int i) {
    }

    public static jna[] values() {
        return (jna[]) h.clone();
    }
}
