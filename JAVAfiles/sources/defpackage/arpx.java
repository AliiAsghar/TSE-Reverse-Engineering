package defpackage;

import j$.util.List;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arpx extends arnj implements Serializable, List, java.util.List, arse {
    private final Enum[] a;

    public arpx(Enum[] enumArr) {
        this.a = enumArr;
    }

    private final Object writeReplace() {
        return new arpy(this.a);
    }

    @Override // defpackage.arne
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.arne, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        r4.getClass();
        if (((Enum) aqil.n(this.a, r4.ordinal())) != r4) {
            return false;
        }
        return true;
    }

    @Override // defpackage.arnj, java.util.List
    public final /* synthetic */ Object get(int i) {
        a.N(i, this.a.length);
        return this.a[i];
    }

    @Override // defpackage.arnj, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        r4.getClass();
        Enum[] enumArr = this.a;
        int ordinal = r4.ordinal();
        if (((Enum) aqil.n(enumArr, ordinal)) != r4) {
            return -1;
        }
        return ordinal;
    }

    @Override // defpackage.arnj, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        r2.getClass();
        return indexOf(r2);
    }
}
