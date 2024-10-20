package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
@armg
/* loaded from: classes2.dex */
public final class jhm implements jhe {
    public static final jhm a;
    public static final jhm b;
    public static final jhm c;
    public static final jhm d;
    private static final /* synthetic */ jhm[] e;
    private final amgj f;

    static {
        jhm jhmVar = new jhm("CONVERSATION_FULLSCREEN", 0, amgj.CONVERSATION_ACTIVITY);
        a = jhmVar;
        jhm jhmVar2 = new jhm("CONVERSATION_BUBBLE", 1, amgj.BUBBLE);
        b = jhmVar2;
        jhm jhmVar3 = new jhm("SMART_REPLY", 2, amgj.PHONE_SMART_REPLY);
        c = jhmVar3;
        jhm jhmVar4 = new jhm("MEDIA_VIEWER_FULLSCREEN", 3, amgj.MEDIA_FULL_SCREEN);
        d = jhmVar4;
        jhm[] jhmVarArr = {jhmVar, jhmVar2, jhmVar3, jhmVar4};
        e = jhmVarArr;
        arhi.f(jhmVarArr);
    }

    private jhm(String str, int i, amgj amgjVar) {
        this.f = amgjVar;
    }

    public static jhm[] values() {
        return (jhm[]) e.clone();
    }

    @Override // defpackage.jhe
    public final amgj a() {
        return this.f;
    }
}
