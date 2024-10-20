package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jms {
    public static final jms a;
    public static final jms b;
    public static final jms c;
    public static final jms d;
    public static final jms e;
    public static final jms f;
    private static final /* synthetic */ jms[] i;
    public final jmz g;
    public final jna h;

    static {
        jms jmsVar = new jms("REJECTED_ATTACHMENTS_NOT_SUPPORTED", 0, jmz.b, jna.a);
        a = jmsVar;
        jms jmsVar2 = new jms("REJECTED_EXCEED_ATTACHMENT_COUNT_LIMIT", 1, jmz.c, jna.b);
        b = jmsVar2;
        jms jmsVar3 = new jms("REJECTED_VIDEO_ATTACHMENT_TOO_LONG", 2, jmz.d, jna.c);
        c = jmsVar3;
        jms jmsVar4 = new jms("REJECTED_SINGLE_ATTACHMENT_TOO_BIG", 3, jmz.e, jna.d);
        d = jmsVar4;
        jms jmsVar5 = new jms("REJECTED_MULTIPLE_ATTACHMENTS_TOO_BIG", 4, jmz.f, jna.e);
        e = jmsVar5;
        jms jmsVar6 = new jms("ACCEPTED", 5, jmz.g, jna.g);
        f = jmsVar6;
        jms[] jmsVarArr = {jmsVar, jmsVar2, jmsVar3, jmsVar4, jmsVar5, jmsVar6};
        i = jmsVarArr;
        arhi.f(jmsVarArr);
    }

    private jms(String str, int i2, jmz jmzVar, jna jnaVar) {
        this.g = jmzVar;
        this.h = jnaVar;
    }

    public static jms[] values() {
        return (jms[]) i.clone();
    }
}
