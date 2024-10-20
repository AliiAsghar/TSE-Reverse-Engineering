package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kip {
    public static final kip a;
    public static final kip b;
    public static final kip c;
    private static final /* synthetic */ kip[] d;

    static {
        kip kipVar = new kip("TEXT", 0);
        a = kipVar;
        kip kipVar2 = new kip("AUDIO", 1);
        b = kipVar2;
        kip kipVar3 = new kip(VCardConstants.PARAM_TYPE_VIDEO, 2);
        c = kipVar3;
        kip[] kipVarArr = {kipVar, kipVar2, kipVar3};
        d = kipVarArr;
        arhi.f(kipVarArr);
    }

    private kip(String str, int i) {
    }

    public static kip[] values() {
        return (kip[]) d.clone();
    }
}
