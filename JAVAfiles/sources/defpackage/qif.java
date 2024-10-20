package defpackage;

import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qif {
    public static final xze a = xze.g("BugleCms", "CmsSettingsDataService");
    public final alhr b;
    public final armf c;
    public final AtomicReference d;
    public final ahiy e;
    public final ahjj f;
    private final ansy g;

    static {
        uuh.e(uuh.b, "previous_session_ids_including_current_to_count", 5);
    }

    public qif(armf armfVar, ansy ansyVar, Optional optional, ahiy ahiyVar, armf armfVar2, AtomicReference atomicReference) {
        this.g = ansyVar;
        this.e = ahiyVar;
        this.c = armfVar2;
        this.b = new nfd(armfVar, 14);
        this.d = atomicReference;
        this.f = new ahjj(this, (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wul] */
    public final qid a() {
        return (qid) this.b.get().l();
    }

    public final akfb b() {
        return new akfk(this.g, new ikn(this, 5), "CMS_SETTINGS_DATA_SOURCE_CONTENT_KEY", 2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wul] */
    public final akul c() {
        return this.b.get().h().h(new qda(8), andi.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wul] */
    public final akul d() {
        return this.b.get().h();
    }

    public final void e() {
        this.e.q(aktp.ag(null), "CMS_SETTINGS_DATA_SOURCE_CONTENT_KEY");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wul] */
    public final void f(qic qicVar) {
        aiut.b();
        this.b.get().m(new puy(qicVar, 17));
        this.f.w(qicVar);
        e();
        if (!xxy.a()) {
            return;
        }
        if (((agnq) this.c.b()).j()) {
            ((agnq) this.c.b()).h(new mla(8), "CmsSettingsDataService#notifyBnrSettingsUi", new nau(this, 7));
        } else {
            this.e.q(aktp.ag(null), xxt.a);
            a.o("Notify Bnr Settings Ui called");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wul] */
    @Deprecated
    public final boolean g() {
        aiut.b();
        return ((qid) this.b.get().l()).d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wul] */
    public final boolean h() {
        aiut.b();
        return ((qid) this.b.get().l()).m;
    }
}
