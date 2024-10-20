package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aimm extends aimh {
    public aila e;

    /* JADX INFO: Access modifiers changed from: protected */
    public aimm() {
        this.e = new aila();
    }

    @Override // defpackage.aimh
    public aila d() {
        return this.e;
    }

    @Override // defpackage.aimh
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof aimm) && this.e.equals(((aimm) obj).e)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.aimh
    public int hashCode() {
        return (super.hashCode() * 37) + 187654;
    }

    public final String i(String str) {
        return this.e.d(str);
    }

    public final void j(aikz aikzVar) {
        this.e.g(aikzVar);
    }

    public final void k(String str, String str2) {
        aikz a = this.e.a(str);
        if (a != null) {
            a.e = str2;
        } else {
            this.e.g(new aikz(str, str2));
        }
    }

    public final boolean l(String str) {
        if (this.e.a(str) != null) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        aila ailaVar = this.e;
        if (ailaVar != null && !ailaVar.h()) {
            return true;
        }
        return false;
    }

    public final void n(String str) {
        aikz a = this.e.a("boundary");
        if (a != null) {
            a.e = str;
            a.b();
        } else {
            aikz aikzVar = new aikz("boundary", str);
            aikzVar.b();
            this.e.g(aikzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public aimm(String str) {
        super(str);
        this.e = new aila();
    }
}
