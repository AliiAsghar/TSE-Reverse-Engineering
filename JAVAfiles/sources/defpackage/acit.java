package defpackage;

import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acit<TResult> {
    public final Object a;

    public acit() {
        this.a = new aciv();
    }

    public final void a(Exception exc) {
        ((aciv) this.a).t(exc);
    }

    public final void b(Object obj) {
        ((aciv) this.a).u(obj);
    }

    public final boolean c(Exception exc) {
        d.aC(exc, "Exception must not be null");
        Object obj = this.a;
        aciv acivVar = (aciv) obj;
        synchronized (acivVar.a) {
            if (((aciv) obj).b) {
                return false;
            }
            ((aciv) obj).b = true;
            ((aciv) obj).d = exc;
            acivVar.e.d((acir) obj);
            return true;
        }
    }

    public final boolean d(Object obj) {
        return ((aciv) this.a).v(obj);
    }

    public final void e() {
        ((adae) this.a).f();
    }

    public final synchronized void f() {
        ((Vector) this.a).clear();
    }

    public final synchronized void g() {
    }

    public final synchronized void h() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final acso i() {
        return new acso((ahlp) this.a.b());
    }

    public acit(armf armfVar) {
        this.a = armfVar;
    }

    public acit(byte[] bArr) {
        this.a = new adae(null, null);
    }

    public acit(adae adaeVar) {
        this.a = new aciv();
        adaeVar.g(new acdp((acit) this, 2));
    }

    public acit(char[] cArr) {
        this.a = new Vector();
    }

    public acit(aczh aczhVar) {
        this.a = aczhVar.i("enable_imdn_display_receipt_serialization_xml_extension", false);
    }

    public acit(aczi acziVar) {
        this.a = acziVar.i("enable_instance_id_in_provisioning", false);
    }

    public acit(aczm aczmVar) {
        this.a = aczmVar.i("ensure_sim_change_intent_is_for_default_subscription", true);
    }

    public acit(aczq aczqVar) {
        this.a = aczqVar.h("rcs_profile", "");
    }
}
