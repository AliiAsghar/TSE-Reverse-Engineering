package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aklw implements apxq {
    private static final alvi a = alvi.m("com/google/apps/tiktok/inject/processor/generateaccount/FragmentAccountComponentManager");
    private volatile Object b;
    private final Object c = new Object();
    private final cg d;
    private final boolean e;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        akkw t();
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface b {
        grn e();
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface c {
        aoij M();
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface d {
        algw hM();
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface e {
        algw w();
    }

    public aklw(cg cgVar, boolean z) {
        this.d = cgVar;
        this.e = z;
    }

    public static final void b(cg cgVar, ajwt ajwtVar) {
        boolean z;
        ajwtVar.getClass();
        int i = ajwtVar.a;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        albo.V(z, "AccountId is invalid: %s", i);
        apxh.e(cgVar);
        cgVar.m.putInt("TIKTOK_FRAGMENT_ACCOUNT_ID", i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(cg cgVar) {
        if (cgVar.m != null) {
            defpackage.d.t(!r2.getBoolean("TIKTOK_FRAGMENT_NO_ACCOUNT_ONLY"), "Account-scoped Fragment cannot be instantiated with an argument bundle marking it as no-Account only. If you are using NoAccountNavigation, you must switch to AccountNavigation to navigate to this fragment.");
        }
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.apxq
    public final Object aS() {
        Object obj;
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    cg cgVar = this.d;
                    cgVar.R().getClass();
                    albo.X(cgVar.R() instanceof apxq, "Sting Fragments must be attached to an @Sting Activity. Found: %s", cgVar.R().getClass());
                    a(this.d);
                    Bundle bundle = this.d.m;
                    ajwt ajwtVar = null;
                    if (bundle != null && bundle.containsKey("TIKTOK_FRAGMENT_ACCOUNT_ID")) {
                        ajwtVar = ajwt.a(bundle.getInt("TIKTOK_FRAGMENT_ACCOUNT_ID"));
                    }
                    if (this.e && ajwtVar == null) {
                        aklv aklvVar = new aklv("Exception while injecting account Fragment bindings because of missing AccountId in account Fragment's arguments");
                        if (((Boolean) ((d) aovp.m(this.d.x().getApplicationContext(), d.class)).hM().d(false)).booleanValue()) {
                            ((alvg) ((alvg) ((alvg) a.h()).g(aklvVar)).h("com/google/apps/tiktok/inject/processor/generateaccount/FragmentAccountComponentManager", "createComponent", (char) 141, "FragmentAccountComponentManager.java")).q("Fragment AccountId check failed.");
                        } else {
                            throw new aklv("Account id is not set in the account Fragment. Possible causes:\n\t1. This account Fragment is @GenerateAccountFragment and was created without calling setBundledAccountId on itself after creation.\n\t2. This account Fragment's arguments were overridden without preserving the previous arguments.\n\t3. This account Fragment is declared in an XML but not as a navigation destination.\n\t4. This account Fragment is declared in an XML as a navigation destination, but the account navigation is not correctly setup with AccountNavigation (go/tiktok-navigation#navigating)");
                        }
                    }
                    if (((algw) ((c) aovp.m(this.d.R(), c.class)).M().a).f()) {
                        algw w = ((e) aovp.m(this.d.R(), e.class)).w();
                        if (ajwtVar == null) {
                            ajwtVar = (ajwt) w.e();
                            if (ajwtVar != null && ajwtVar.a != -1) {
                                b(this.d, ajwtVar);
                            }
                        } else {
                            albo.U(w.f(), "There is no propagated account id. Did you forget to add one of the account modules:\n\t\"//java/com/google/apps/tiktok/account:module\",\n\t\"//java/com/google/apps/tiktok/account/testing:module\",");
                            if (((ajwt) w.b()).a != -1) {
                                albo.Z(((ajwt) w.b()).equals(ajwtVar), "The given account id does not match the propagated account id.\n\tPropagated AccountId: %s\n\tGiven AccountId: %s", w.b(), ajwtVar);
                            }
                        }
                    }
                    akkw t = ((a) aovp.m(this.d.R(), a.class)).t();
                    synchronized (t.a) {
                        if (!t.c.containsKey(ajwtVar)) {
                            t.c.put(ajwtVar, t.a(ajwtVar));
                        }
                        obj = t.c.get(ajwtVar);
                    }
                    grn e2 = ((b) aovp.m(obj, b.class)).e();
                    e2.e = this.d;
                    apzj.f(e2.e, cg.class);
                    Object obj2 = e2.c;
                    Object obj3 = e2.b;
                    Object obj4 = e2.a;
                    kqh kqhVar = (kqh) e2.d;
                    kqi kqiVar = (kqi) obj4;
                    krv krvVar = (krv) obj2;
                    this.b = new kql(krvVar, (kqp) obj3, kqiVar, kqhVar, (cg) e2.e);
                }
            }
        }
        return this.b;
    }
}
