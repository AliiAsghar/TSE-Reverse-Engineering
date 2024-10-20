package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvq {
    public static final yvq a;
    public static final yvq b;
    public static final yvq c;
    private static final /* synthetic */ yvq[] e;
    public final String d;

    static {
        yvq yvqVar = new yvq("CallButton", 0, "messages_callButton");
        a = yvqVar;
        yvq yvqVar2 = new yvq("InvitePrompt", 1, "messages_invitePrompt");
        b = yvqVar2;
        yvq yvqVar3 = new yvq("TombstoneInserter", 2, "messages.tombstoneInserter");
        c = yvqVar3;
        yvq[] yvqVarArr = {yvqVar, yvqVar2, yvqVar3};
        e = yvqVarArr;
        arhi.f(yvqVarArr);
    }

    private yvq(String str, int i, String str2) {
        this.d = str2;
    }

    public static yvq[] values() {
        return (yvq[]) e.clone();
    }
}
