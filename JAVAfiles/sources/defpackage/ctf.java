package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctf {
    public static final ctf a;
    public static final ctf b;
    private static final /* synthetic */ ctf[] c;

    static {
        ctf ctfVar = new ctf("Width", 0);
        a = ctfVar;
        ctf ctfVar2 = new ctf("Height", 1);
        b = ctfVar2;
        ctf[] ctfVarArr = {ctfVar, ctfVar2};
        c = ctfVarArr;
        arhi.f(ctfVarArr);
    }

    private ctf(String str, int i) {
    }

    public static ctf[] values() {
        return (ctf[]) c.clone();
    }
}
