package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alnz extends alpt {
    private final transient EnumSet a;
    private transient int b;

    public alnz(EnumSet enumSet) {
        this.a = enumSet;
    }

    public static alpt a(EnumSet enumSet) {
        int size = enumSet.size();
        if (size != 0) {
            if (size != 1) {
                return new alnz(enumSet);
            }
            return new altx((Enum) alzz.aP(enumSet));
        }
        return altg.a;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.alpt
    public final boolean b() {
        return true;
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof alnz) {
            collection = ((alnz) collection).a;
        }
        return this.a.containsAll(collection);
    }

    @Override // defpackage.alpt, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alnz) {
            obj = ((alnz) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.alpt, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int hashCode = this.a.hashCode();
            this.b = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.alpt, defpackage.alnu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final aluq listIterator() {
        return alzz.ax(this.a.iterator());
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.alpt, defpackage.alnu
    public Object writeReplace() {
        return new alny(this.a);
    }
}
