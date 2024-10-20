package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjc {
    public static final anjc a;
    public static final anjc b;
    public static final anjc c;
    private static final /* synthetic */ anjc[] d;

    static {
        anjc anjcVar = new anjc("UNKNOWN_GROUP_ICON_MODIFICATION_POLICY", 0);
        a = anjcVar;
        anjc anjcVar2 = new anjc("NO_GROUP_ICON_MODIFICATION_ALLOWED", 1);
        b = anjcVar2;
        anjc anjcVar3 = new anjc("GROUP_ICON_MODIFICATION_ALLOWED", 2);
        c = anjcVar3;
        anjc[] anjcVarArr = {anjcVar, anjcVar2, anjcVar3};
        d = anjcVarArr;
        arhi.f(anjcVarArr);
    }

    private anjc(String str, int i) {
    }

    public static anjc[] values() {
        return (anjc[]) d.clone();
    }
}
