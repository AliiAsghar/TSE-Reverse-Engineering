package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhl implements jhe {
    public static final jhl a;
    public static final jhl b;
    public static final jhl c;
    public static final jhl d;
    public static final jhl e;
    private static final /* synthetic */ jhl[] f;
    private final amgj g;

    static {
        jhl jhlVar = new jhl("CONVERSATION_FULLSCREEN", 0, amgj.CONVERSATION_ACTIVITY);
        a = jhlVar;
        jhl jhlVar2 = new jhl("CONVERSATION_BUBBLE", 1, amgj.BUBBLE);
        b = jhlVar2;
        jhl jhlVar3 = new jhl("DIRECT_SEND", 2, amgj.DIRECT_SEND_FULL_SCREEN);
        c = jhlVar3;
        jhl jhlVar4 = new jhl("SMART_REPLY", 3, amgj.PHONE_SMART_REPLY);
        d = jhlVar4;
        jhl jhlVar5 = new jhl("MEDIA_VIEWER", 4, amgj.MEDIA_FULL_SCREEN);
        e = jhlVar5;
        jhl[] jhlVarArr = {jhlVar, jhlVar2, jhlVar3, jhlVar4, jhlVar5};
        f = jhlVarArr;
        arhi.f(jhlVarArr);
    }

    private jhl(String str, int i, amgj amgjVar) {
        this.g = amgjVar;
    }

    public static jhl[] values() {
        return (jhl[]) f.clone();
    }

    @Override // defpackage.jhe
    public final amgj a() {
        return this.g;
    }
}
