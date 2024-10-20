package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alpj extends alqh {
    private static final long serialVersionUID = 0;
    final /* synthetic */ alpl a;

    public alpj(alpl alplVar) {
        this.a = alplVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // defpackage.alqh
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return this.a.p(i);
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof alsk) {
            alsk alskVar = (alsk) obj;
            if (alskVar.a() > 0 && this.a.b(alskVar.a) == alskVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.alpt, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.i().size();
    }

    @Override // defpackage.alqh, defpackage.alpt, defpackage.alnu
    public Object writeReplace() {
        return new alpk(this.a);
    }
}
