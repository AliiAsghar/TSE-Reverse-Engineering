package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhn {
    public static final jhn a;
    public static final jhn b;
    public static final jhn c;
    public static final jhn d;
    private static final /* synthetic */ jhn[] e;

    static {
        jhn jhnVar = new jhn("CONVERSATION_COMPOSE_ROW", 0);
        a = jhnVar;
        jhn jhnVar2 = new jhn("DIRECT_SEND", 1);
        b = jhnVar2;
        jhn jhnVar3 = new jhn("SMART_REPLY", 2);
        c = jhnVar3;
        jhn jhnVar4 = new jhn("MEDIA_VIEWER", 3);
        d = jhnVar4;
        jhn[] jhnVarArr = {jhnVar, jhnVar2, jhnVar3, jhnVar4};
        e = jhnVarArr;
        arhi.f(jhnVarArr);
    }

    private jhn(String str, int i) {
    }

    public static jhn[] values() {
        return (jhn[]) e.clone();
    }
}
