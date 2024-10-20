package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arya extends arwb {
    /* JADX INFO: Access modifiers changed from: protected */
    public final String g() {
        arya aryaVar;
        arwb arwbVar = arws.a;
        arya aryaVar2 = asfh.a;
        if (this == aryaVar2) {
            return "Dispatchers.Main";
        }
        try {
            aryaVar = aryaVar2.i();
        } catch (UnsupportedOperationException unused) {
            aryaVar = null;
        }
        if (this != aryaVar) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    public abstract arya i();

    @Override // defpackage.arwb
    public String toString() {
        String g = g();
        if (g == null) {
            return arwi.a(this) + "@" + arwi.b(this);
        }
        return g;
    }
}
