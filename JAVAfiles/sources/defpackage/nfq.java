package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class nfq implements nfw {
    public static final alwo a = alwo.o("BugleSelfIdentity");
    public final xyt b;
    public final armf c;
    public final armf d;
    private final ParticipantsTable.BindData e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final SelfIdentityId i;
    private final alhr j;
    private final alhr k;
    private final alhr l;
    private final Optional m;
    private final anen n;
    private final armf o;

    public nfq(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, xyt xytVar, anen anenVar, armf armfVar8, armf armfVar9, armf armfVar10, ParticipantsTable.BindData bindData) {
        boolean z;
        this.f = armfVar;
        this.g = armfVar5;
        this.h = armfVar7;
        if (bindData.p() != -2) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        this.e = bindData;
        this.i = lga.V(bindData.M());
        this.j = albo.D(new mri(armfVar2, armfVar, bindData, 13));
        this.k = albo.D(new mrf((Object) armfVar3, (Object) armfVar6, (Object) bindData, armfVar, 17));
        this.l = albo.D(new nfd(armfVar4, 2));
        this.m = Optional.of(((msk) armfVar6.b()).o(bindData));
        this.b = xytVar;
        this.n = anenVar;
        this.c = armfVar8;
        this.d = armfVar9;
        this.o = armfVar10;
    }

    @Override // defpackage.nfw
    public final int a() {
        return this.e.q();
    }

    @Override // defpackage.nfw
    public final int b() {
        int p = this.e.p();
        if (p == -1) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/DefaultSelfIdentity", "getSubId", 195, "DefaultSelfIdentity.java")).t("SelfIdentity %s wraps a subId = -1", f());
            return -1;
        }
        return p;
    }

    @Override // defpackage.nfw
    public final Uri c() {
        return ((qya) this.g.b()).a(this.e);
    }

    @Override // defpackage.nfw
    public final ncq d() {
        return (ncq) this.j.get();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [alhr, java.lang.Object] */
    @Override // defpackage.nfw
    public final ncq e() {
        return (ncq) ((hgi) this.k.get()).a.get();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfq)) {
            return false;
        }
        return r(((nfq) obj).f());
    }

    @Override // defpackage.nfw
    public final SelfIdentityId f() {
        return lga.V(this.e.M());
    }

    @Override // defpackage.nfw
    public final ngi g() {
        return (ngi) i().filter(new nfp(0)).filter(new ncc(this, 2)).map(new nfc(this, 7)).orElseGet(new nfz(1));
    }

    @Override // defpackage.nfw
    public final akul h(mjq mjqVar) {
        return akul.g(this.n.submit(akto.k(new mzn(this, mjqVar, 7))));
    }

    public final int hashCode() {
        return f().hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [msh, java.lang.Object] */
    @Override // defpackage.nfw
    public final Optional i() {
        this.m.isPresent();
        if (this.m.get().E()) {
            return this.m;
        }
        return ((jat) this.h.b()).z(b());
    }

    @Override // defpackage.nfw
    public final String j() {
        return this.e.J();
    }

    @Override // defpackage.nfw
    public final String k() {
        return albo.ag(this.e.Q());
    }

    @Override // defpackage.nfw
    public final String l() {
        String k = k();
        String j = j();
        if (j != null) {
            return a.co(j, k, " ");
        }
        return k;
    }

    @Override // defpackage.nfw
    public final String m() {
        return this.e.L();
    }

    @Override // defpackage.nfw
    public final String n() {
        return this.e.O();
    }

    @Override // defpackage.nfw
    public final boolean o() {
        return ((yjy) this.f.b()).h(this.e.p()).G();
    }

    @Override // defpackage.nfw
    public final boolean p() {
        int c = ((yjy) this.f.b()).c();
        if (c < 0 || b() != c) {
            return false;
        }
        return true;
    }

    @Override // defpackage.nfw
    public final boolean q() {
        return ((yjy) this.f.b()).h(this.e.p()).F();
    }

    @Override // defpackage.nfw
    public final boolean r(SelfIdentityId selfIdentityId) {
        return ((SelfIdentityIdImpl) this.i).a.equals(((SelfIdentityIdImpl) selfIdentityId).a);
    }

    @Override // defpackage.nfw
    public final hgi s() {
        return (hgi) this.l.get();
    }

    public final String toString() {
        return String.format("SelfIdentity{id:%s, subId: %s} has rows {%s}", f(), Integer.valueOf(b()), this.i);
    }
}
