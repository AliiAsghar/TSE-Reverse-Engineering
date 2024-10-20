package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vvh {
    public static final vvh a;
    public static final vvh b;
    public static final vvh c;
    public static final vvh d;
    public static final vvh e;
    public static final vvh f;
    public static final vvh g;
    public static final vvh h;
    public static final vvh i;
    public static final vvh j;
    private static final /* synthetic */ vvh[] k;

    static {
        vvh vvhVar = new vvh("UNKNOWN", 0);
        a = vvhVar;
        vvh vvhVar2 = new vvh("NOT_ELIGIBLE_BECAUSE_INACTIVE", 1);
        b = vvhVar2;
        vvh vvhVar3 = new vvh("NOT_ELIGIBLE_NOT_EVERYONE_RCS", 2);
        c = vvhVar3;
        vvh vvhVar4 = new vvh("NOT_ELIGIBLE_WAITING_FOR_OUTDATED_GM_CLIENT", 3);
        d = vvhVar4;
        vvh vvhVar5 = new vvh("ELIGIBLE_FOR_UPGRADE_BUT_NOT_ACTIVE_UPGRADER", 4);
        e = vvhVar5;
        vvh vvhVar6 = new vvh("UPGRADE_STARTED", 5);
        f = vvhVar6;
        vvh vvhVar7 = new vvh("RCS_GROUP_CREATION_FAILED", 6);
        g = vvhVar7;
        vvh vvhVar8 = new vvh("RCS_GROUP_CREATION_SUCCEEDED", 7);
        h = vvhVar8;
        vvh vvhVar9 = new vvh("UPGRADE_FAILED", 8);
        i = vvhVar9;
        vvh vvhVar10 = new vvh("UPGRADE_COMPLETE", 9);
        j = vvhVar10;
        vvh[] vvhVarArr = {vvhVar, vvhVar2, vvhVar3, vvhVar4, vvhVar5, vvhVar6, vvhVar7, vvhVar8, vvhVar9, vvhVar10};
        k = vvhVarArr;
        arhi.f(vvhVarArr);
    }

    private vvh(String str, int i2) {
    }

    public static vvh[] values() {
        return (vvh[]) k.clone();
    }
}
