package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class athr extends atgd implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    public final atgf d;

    /* JADX INFO: Access modifiers changed from: protected */
    public athr(atgf atgfVar) {
        this.d = atgfVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long c = ((atgd) obj).c();
        long c2 = c();
        if (c2 == c) {
            return 0;
        }
        if (c2 < c) {
            return -1;
        }
        return 1;
    }

    @Override // defpackage.atgd
    public final atgf d() {
        return this.d;
    }

    @Override // defpackage.atgd
    public final boolean f() {
        return true;
    }

    public final String toString() {
        return "DurationField[" + this.d.m + "]";
    }
}
