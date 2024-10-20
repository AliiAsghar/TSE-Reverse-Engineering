package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arsm implements arsn {
    private Object a;

    public arsm(Object obj) {
        this.a = obj;
    }

    protected void a(artm artmVar, Object obj, Object obj2) {
        throw null;
    }

    protected boolean b(Object obj, Object obj2) {
        return true;
    }

    @Override // defpackage.arsn
    public final Object c(artm artmVar) {
        artmVar.getClass();
        return this.a;
    }

    @Override // defpackage.arsn
    public final void d(artm artmVar, Object obj) {
        artmVar.getClass();
        Object obj2 = this.a;
        if (!b(obj2, obj)) {
            return;
        }
        this.a = obj;
        a(artmVar, obj2, obj);
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.a + ")";
    }
}
