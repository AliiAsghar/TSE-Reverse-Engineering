package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akbh extends ance {
    private akbj a;
    private final int b;

    public akbh(akbj akbjVar, int i) {
        this.a = akbjVar;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ance
    public final String gs() {
        Object obj;
        akbj akbjVar = this.a;
        if (akbjVar == null || (obj = akbjVar.d.a) == null) {
            return null;
        }
        String bX = a.bX(obj, "callable=[", "]");
        akbi akbiVar = (akbi) this.a.b.get();
        if (akbiVar != null) {
            return bX + ", trial=[" + akbiVar.toString() + "]";
        }
        return bX;
    }

    @Override // defpackage.ance
    protected final void gt() {
        long j;
        int i;
        int a;
        boolean z;
        akbi akbiVar;
        akbj akbjVar = this.a;
        this.a = null;
        if (akbjVar == null) {
            return;
        }
        do {
            j = akbjVar.a.get();
            i = (int) j;
            a = akbj.a(j);
            if (i != Integer.MIN_VALUE) {
                if (i == -2147483647) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    a++;
                }
            } else {
                throw new AssertionError(a.ck(j, "Refcount is: "));
            }
        } while (!akbjVar.a.compareAndSet(j, akbj.b(a, i - 1)));
        if (!z) {
            return;
        }
        do {
            akbiVar = (akbi) akbjVar.b.get();
            if (akbiVar != null) {
                if (akbiVar.a <= this.b) {
                    akbiVar.cancel(true);
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!a.bD(akbjVar.b, akbiVar));
    }
}
