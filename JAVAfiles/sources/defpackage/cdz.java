package defpackage;

import defpackage.cee;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdz<T> implements cek, bzt {
    public ceh a;
    public cee b;
    public String c;
    public Object d;
    public Object[] e;
    public cee.a f;
    private final arqg g = new AnonymousClass1();

    /* compiled from: PG */
    /* renamed from: cdz$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<Object> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final Object a() {
            cdz cdzVar = cdz.this;
            ceh cehVar = cdzVar.a;
            Object obj = cdzVar.d;
            if (obj != null) {
                return ((cej) cehVar).a.a(cdzVar, obj);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    }

    public cdz(ceh cehVar, cee ceeVar, String str, Object obj, Object[] objArr) {
        this.a = cehVar;
        this.b = ceeVar;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    public final void a() {
        String a;
        cee ceeVar = this.b;
        if (this.f == null) {
            if (ceeVar != null) {
                Object a2 = this.g.a();
                if (a2 != null && !ceeVar.g(a2)) {
                    if (a2 instanceof cey) {
                        cey ceyVar = (cey) a2;
                        if (ceyVar.i() != byo.a && ceyVar.i() != cav.a && ceyVar.i() != bzr.a) {
                            a = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        } else {
                            a = "MutableState containing " + ceyVar.a() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                        }
                    } else {
                        a = cdy.a(a2);
                    }
                    throw new IllegalArgumentException(a);
                }
                this.f = ceeVar.b(this.c, this.g);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("entry(" + this.f + ") is not null");
    }

    @Override // defpackage.cek
    public final boolean b(Object obj) {
        cee ceeVar = this.b;
        if (ceeVar != null && !ceeVar.g(obj)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.bzt
    public final void g() {
        cee.a aVar = this.f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // defpackage.bzt
    public final void h() {
        cee.a aVar = this.f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // defpackage.bzt
    public final void i() {
        a();
    }
}
