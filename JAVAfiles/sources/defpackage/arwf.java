package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arwf {
    public static final arwf a;
    public static final arwf b;
    public static final arwf c;
    public static final arwf d;
    private static final /* synthetic */ arwf[] e;

    static {
        arwf arwfVar = new arwf("DEFAULT", 0);
        a = arwfVar;
        arwf arwfVar2 = new arwf("LAZY", 1);
        b = arwfVar2;
        arwf arwfVar3 = new arwf("ATOMIC", 2);
        c = arwfVar3;
        arwf arwfVar4 = new arwf("UNDISPATCHED", 3);
        d = arwfVar4;
        arwf[] arwfVarArr = {arwfVar, arwfVar2, arwfVar3, arwfVar4};
        e = arwfVarArr;
        arhi.f(arwfVarArr);
    }

    private arwf(String str, int i) {
    }

    public static arwf[] values() {
        return (arwf[]) e.clone();
    }

    public final void a(arqv arqvVar, Object obj, arpe arpeVar) {
        Object a2;
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            arpi u = arpeVar.u();
                            Object b2 = asfq.b(u, null);
                            try {
                                if (!(arqvVar instanceof arpq)) {
                                    a2 = arhi.g(arqvVar, obj, arpeVar);
                                } else {
                                    arsd.g(arqvVar, 2);
                                    a2 = arqvVar.a(obj, arpeVar);
                                }
                                if (a2 != arpl.a) {
                                    arpeVar.w(a2);
                                    return;
                                }
                                return;
                            } finally {
                                asfq.c(u, b2);
                            }
                        } catch (Throwable th) {
                            arpeVar.w(aqil.O(th));
                            return;
                        }
                    }
                    throw new armm();
                }
                arqvVar.getClass();
                arhi.i(arhi.h(arqvVar, obj, arpeVar)).w(arnb.a);
                return;
            }
            return;
        }
        arro.u(arqvVar, obj, arpeVar);
    }

    public final boolean b() {
        if (this == b) {
            return true;
        }
        return false;
    }
}
