package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aelt {
    public static final aelt a;
    public static final aelt b;
    public static final aelt c;
    private static final /* synthetic */ aelt[] d;

    static {
        aelt aeltVar = new aelt("HORIZONTAL_EDGES", 0);
        a = aeltVar;
        aelt aeltVar2 = new aelt("HORIZONTAL_END", 1);
        b = aeltVar2;
        aelt aeltVar3 = new aelt(GeneralPurposeRichCardLayoutInfo.ORIENTATION_VERTICAL, 2);
        c = aeltVar3;
        aelt[] aeltVarArr = {aeltVar, aeltVar2, aeltVar3};
        d = aeltVarArr;
        arhi.f(aeltVarArr);
    }

    private aelt(String str, int i) {
    }

    public static aelt[] values() {
        return (aelt[]) d.clone();
    }
}
