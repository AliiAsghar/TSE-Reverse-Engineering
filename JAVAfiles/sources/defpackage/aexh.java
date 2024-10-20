package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexh {
    public static final aexh a;
    public static final aexh b;
    public static final aexh c;
    public static final aexh d;
    private static final /* synthetic */ aexh[] f;
    public final aerb e;

    static {
        aexh aexhVar = new aexh("Image", 0, aerb.bq);
        a = aexhVar;
        aexh aexhVar2 = new aexh("Video", 1, aerb.cv);
        b = aexhVar2;
        aexh aexhVar3 = new aexh("PDF", 2, aerb.aF);
        c = aexhVar3;
        aexh aexhVar4 = new aexh("GenericFile", 3, aerb.aE);
        d = aexhVar4;
        aexh[] aexhVarArr = {aexhVar, aexhVar2, aexhVar3, aexhVar4};
        f = aexhVarArr;
        arhi.f(aexhVarArr);
    }

    private aexh(String str, int i, aerb aerbVar) {
        this.e = aerbVar;
    }

    public static aexh[] values() {
        return (aexh[]) f.clone();
    }
}
