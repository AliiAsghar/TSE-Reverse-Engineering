package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vok {
    public static final vok a;
    public static final vok b;
    public static final vok c;
    private static final /* synthetic */ vok[] d;

    static {
        vok vokVar = new vok("TestPipeline", 0);
        a = vokVar;
        vok vokVar2 = new vok("SmsReceivePipeline", 1);
        b = vokVar2;
        vok vokVar3 = new vok("SendingPipeline", 2);
        c = vokVar3;
        vok[] vokVarArr = {vokVar, vokVar2, vokVar3};
        d = vokVarArr;
        arhi.f(vokVarArr);
    }

    private vok(String str, int i) {
    }

    public static vok[] values() {
        return (vok[]) d.clone();
    }
}
