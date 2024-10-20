package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qpc {
    public static final qpc a;
    public static final qpc b;
    private static final /* synthetic */ qpc[] c;

    static {
        qpc qpcVar = new qpc("AUDIO", 0);
        a = qpcVar;
        qpc qpcVar2 = new qpc("CAMERA_GALLERY", 1);
        b = qpcVar2;
        qpc[] qpcVarArr = {qpcVar, qpcVar2};
        c = qpcVarArr;
        arhi.f(qpcVarArr);
    }

    private qpc(String str, int i) {
    }

    public static qpc[] values() {
        return (qpc[]) c.clone();
    }
}
