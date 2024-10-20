package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aizu {
    public static final aizu a;
    public static final aizu b;
    public static final aizu c;
    public static final aizu d;
    private static final /* synthetic */ aizu[] e;

    static {
        aizu aizuVar = new aizu(GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_LEFT, 0);
        a = aizuVar;
        aizu aizuVar2 = new aizu(GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_RIGHT, 1);
        b = aizuVar2;
        aizu aizuVar3 = new aizu("TOP", 2);
        c = aizuVar3;
        aizu aizuVar4 = new aizu("BOTTOM", 3);
        d = aizuVar4;
        aizu[] aizuVarArr = {aizuVar, aizuVar2, aizuVar3, aizuVar4};
        e = aizuVarArr;
        arhi.f(aizuVarArr);
    }

    private aizu(String str, int i) {
    }

    public static aizu[] values() {
        return (aizu[]) e.clone();
    }
}
