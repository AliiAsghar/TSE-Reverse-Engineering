package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aenw implements aeny {
    public static final aenw a;
    public static final aenw b;
    public static final aenw c;
    public static final aenw d;
    public static final aenw e;
    public static final aenw f;
    private static final /* synthetic */ aenw[] g;

    static {
        aenw aenwVar = new aenw("AI_REWRITE", 0);
        a = aenwVar;
        aenw aenwVar2 = new aenw("AI_SUGGEST", 1);
        b = aenwVar2;
        aenw aenwVar3 = new aenw("GALLERY", 2);
        c = aenwVar3;
        aenw aenwVar4 = new aenw("EMOTIVE", 3);
        d = aenwVar4;
        aenw aenwVar5 = new aenw("SHORTCUTS", 4);
        e = aenwVar5;
        aenw aenwVar6 = new aenw(VCardConstants.PARAM_TYPE_VOICE, 5);
        f = aenwVar6;
        aenw[] aenwVarArr = {aenwVar, aenwVar2, aenwVar3, aenwVar4, aenwVar5, aenwVar6};
        g = aenwVarArr;
        arhi.f(aenwVarArr);
    }

    private aenw(String str, int i) {
    }

    public static aenw[] values() {
        return (aenw[]) g.clone();
    }
}
