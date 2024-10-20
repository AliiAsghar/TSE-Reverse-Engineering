package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alop extends alom {
    final /* synthetic */ alor a;

    public alop(alor alorVar) {
        this.a = alorVar;
    }

    @Override // defpackage.alom
    public final aluq a() {
        return new aloo(this.a.entrySet().listIterator());
    }

    @Override // defpackage.alor, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.alom, defpackage.alor
    public final alpt g() {
        return this.a.keySet();
    }

    @Override // defpackage.alor
    public final boolean gY() {
        return this.a.gY();
    }

    @Override // defpackage.alor, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 == null) {
            return null;
        }
        return new altx(obj2);
    }

    @Override // defpackage.alor, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.alom, defpackage.alor
    public Object writeReplace() {
        return super.writeReplace();
    }
}
