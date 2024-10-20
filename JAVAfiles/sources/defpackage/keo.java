package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class keo {
    public static final keo a;
    public static final keo b;
    public static final keo c;
    public static final keo d;
    public static final keo e;
    private static final /* synthetic */ keo[] f;

    static {
        keo keoVar = new keo("PROCESSING_NO_CONTENT", 0);
        a = keoVar;
        keo keoVar2 = new keo("DOWNLOADABLE_NO_CONTENT", 1);
        b = keoVar2;
        keo keoVar3 = new keo("NO_CONNECTION_NO_CONTENT", 2);
        c = keoVar3;
        keo keoVar4 = new keo("MANUAL_DOWNLOADING_NO_CONTENT", 3);
        d = keoVar4;
        keo keoVar5 = new keo("NORMAL", 4);
        e = keoVar5;
        keo[] keoVarArr = {keoVar, keoVar2, keoVar3, keoVar4, keoVar5};
        f = keoVarArr;
        arhi.f(keoVarArr);
    }

    private keo(String str, int i) {
    }

    public static keo[] values() {
        return (keo[]) f.clone();
    }
}
