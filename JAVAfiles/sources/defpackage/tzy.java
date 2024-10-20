package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzy {
    public static final arml a;
    public static final tzy b;
    public static final tzy c;
    public static final tzy d;
    public static final tzy e;
    public static final tzy f;
    public static final tzy g;
    public static final /* synthetic */ arpx i;
    private static final /* synthetic */ tzy[] j;
    public final int h;

    static {
        tzy tzyVar = new tzy("SWITCH_TO_RCS", 0, 215);
        b = tzyVar;
        tzy tzyVar2 = new tzy("SWITCH_TO_ENCRYPTED_RCS", 1, 216);
        c = tzyVar2;
        tzy tzyVar3 = new tzy("SWITCH_TO_ENCRYPTED_RCS_INFO", 2, 219);
        d = tzyVar3;
        tzy tzyVar4 = new tzy("GROUP_PROTOCOL_SWITCH_RCS_TO_E2EE", 3, 233);
        e = tzyVar4;
        tzy tzyVar5 = new tzy("GROUP_PROTOCOL_SWITCH_E2EE_TO_RCS", 4, 234);
        f = tzyVar5;
        tzy tzyVar6 = new tzy("GROUP_PROTOCOL_SWITCH_TO_MMS", 5, 252);
        g = tzyVar6;
        tzy[] tzyVarArr = {tzyVar, tzyVar2, tzyVar3, tzyVar4, tzyVar5, tzyVar6};
        j = tzyVarArr;
        i = arhi.f(tzyVarArr);
        a = armd.a(tzt.e);
    }

    private tzy(String str, int i2, int i3) {
        this.h = i3;
    }

    public static tzy[] values() {
        return (tzy[]) j.clone();
    }

    public final tzf a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        return tzf.b;
                    }
                    throw null;
                }
            } else {
                return tzf.d;
            }
        }
        return tzf.c;
    }
}
