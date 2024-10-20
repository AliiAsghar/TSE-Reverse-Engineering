package defpackage;

import android.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayp {
    public static final ayp a;
    public static final ayp b;
    public static final ayp c;
    public static final ayp d;
    private static final /* synthetic */ ayp[] f;
    public final int e;

    static {
        ayp aypVar = new ayp("Cut", 0, R.string.cut);
        a = aypVar;
        ayp aypVar2 = new ayp("Copy", 1, R.string.copy);
        b = aypVar2;
        ayp aypVar3 = new ayp("Paste", 2, R.string.paste);
        c = aypVar3;
        ayp aypVar4 = new ayp("SelectAll", 3, R.string.selectAll);
        d = aypVar4;
        ayp[] aypVarArr = {aypVar, aypVar2, aypVar3, aypVar4};
        f = aypVarArr;
        arhi.f(aypVarArr);
    }

    private ayp(String str, int i, int i2) {
        this.e = i2;
    }

    public static ayp[] values() {
        return (ayp[]) f.clone();
    }
}
