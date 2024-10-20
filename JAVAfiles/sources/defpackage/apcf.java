package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apcf extends aoyv {
    final apcg a;
    aoyx b = b();
    final /* synthetic */ apci c;

    public apcf(apci apciVar) {
        this.c = apciVar;
        this.a = new apcg(apciVar);
    }

    private final aoyx b() {
        apcg apcgVar = this.a;
        if (apcgVar.hasNext()) {
            return apcgVar.next().iterator();
        }
        return null;
    }

    @Override // defpackage.aoyx
    public final byte a() {
        aoyx aoyxVar = this.b;
        if (aoyxVar != null) {
            byte a = aoyxVar.a();
            if (!this.b.hasNext()) {
                this.b = b();
            }
            return a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        return false;
    }
}
