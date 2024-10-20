package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msq implements msk {
    public static final /* synthetic */ int l = 0;
    public final apwt b;
    public final apwt c;
    public final apwt d;
    public final apwt e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    private final /* synthetic */ int m;
    private final Object n;

    public msq(apwt apwtVar, apwt apwtVar2, apwt apwtVar3, apwt apwtVar4, apwt apwtVar5, apwt apwtVar6, apwt apwtVar7, apwt apwtVar8, apwt apwtVar9, apwt apwtVar10, apwt apwtVar11, int i) {
        this.m = i;
        this.g = apwtVar;
        this.b = apwtVar2;
        this.n = apwtVar3;
        this.c = apwtVar4;
        this.f = apwtVar5;
        this.h = apwtVar6;
        this.d = apwtVar7;
        this.e = apwtVar8;
        this.i = apwtVar9;
        this.j = apwtVar10;
        this.k = apwtVar11;
    }

    private final msh A(ParticipantsTable.BindData bindData, String str) {
        boolean z;
        mrw mrwVar = (mrw) this.e.b();
        String P = bindData.P();
        String O = bindData.O();
        String J = bindData.J();
        int n = bindData.n();
        msi msiVar = new msi(this, 13);
        if (n == 1) {
            z = true;
        } else {
            z = false;
        }
        return mrwVar.e(P, O, J, z, str, msiVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [mre, java.lang.Object] */
    private final msh B(ParticipantsTable.BindData bindData, String str) {
        boolean z;
        ?? b = this.d.b();
        String P = bindData.P();
        String O = bindData.O();
        String J = bindData.J();
        int n = bindData.n();
        msi msiVar = new msi(this, 4);
        if (n == 1) {
            z = true;
        } else {
            z = false;
        }
        return b.e(P, O, J, z, str, msiVar);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh a(String str) {
        if (this.m != 0) {
            return this.d.b().a(str);
        }
        return ((mrw) this.e.b()).a(str);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh b(qei qeiVar) {
        if (this.m != 0) {
            return this.d.b().b(qeiVar);
        }
        return ((mrw) this.e.b()).b(qeiVar);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh c(String str, alhr alhrVar) {
        if (this.m != 0) {
            return this.d.b().c(str, alhrVar);
        }
        return ((mrw) this.e.b()).c(albo.ag(str), alhrVar);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh d(adit aditVar) {
        if (this.m != 0) {
            return this.d.b().d(aditVar);
        }
        return ((mrw) this.e.b()).d(aditVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh e(String str, String str2, String str3, boolean z, String str4, alhr alhrVar) {
        if (this.m != 0) {
            return this.d.b().e(str, str2, str3, z, str4, alhrVar);
        }
        return ((mrw) this.e.b()).e(str, str2, str3, z, str4, alhrVar);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh f() {
        if (this.m != 0) {
            return this.d.b().f();
        }
        return ((mrw) this.e.b()).f();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh g(msh mshVar, alhr alhrVar) {
        if (this.m != 0) {
            return this.d.b().g(mshVar, alhrVar);
        }
        return ((mrw) this.e.b()).g(mshVar, alhrVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh h(msh mshVar, String str) {
        if (this.m != 0) {
            return this.d.b().h(mshVar, str);
        }
        return g(mshVar, new msi(str, 12));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh i(msh mshVar, boolean z) {
        if (this.m != 0) {
            return this.d.b().i(mshVar, z);
        }
        return ((mrw) this.e.b()).i(mshVar, z);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh j(msh mshVar, int i) {
        if (this.m != 0) {
            return this.d.b().j(mshVar, i);
        }
        return ((mrw) this.e.b()).j(mshVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh k(msh mshVar) {
        if (this.m != 0) {
            return this.d.b().k(mshVar);
        }
        return ((mrw) this.e.b()).k(mshVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    @Override // defpackage.msk
    public final msh l() {
        if (this.m != 0) {
            return ((lxe) this.g.b()).j(new mrs(14), new mrs(15), new mrs(16), new mrs(17), new mrs(18), new mrs(13), new mrs(19), new mrs(4), new mrs(13), new mrs(13));
        }
        return ((lxe) this.j.b()).j(new msn(1), new msn(0), new msn(2), new msn(3), new msn(4), new msn(14), new msn(5), new msn(6), new msn(14), new msn(14));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    @Override // defpackage.msk
    public final msh m() {
        if (this.m != 0) {
            return ((lxe) this.g.b()).j(new mrs(5), new mrs(6), new mrs(7), new mrs(8), new mrs(9), new mrs(13), new mrs(10), new mrs(11), new mrs(13), new mrs(13));
        }
        return ((lxe) this.j.b()).j(new msn(7), new msn(8), new msn(9), new msn(10), new msn(11), new msn(14), new msn(12), new msn(13), new msn(14), new msn(14));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [mre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [mre, java.lang.Object] */
    @Override // defpackage.msk
    public final msh n(String str) {
        if (this.m != 0) {
            if (((orj) this.k.b()).a() && lgc.C(str)) {
                return l();
            }
            if (((orj) this.k.b()).a() && lgc.D(str)) {
                return m();
            }
            if (((Optional) this.n.b()).isPresent() && ((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && TextUtils.equals(str, ((vni) ((Optional) this.n.b()).get()).m())) {
                return z();
            }
            if (aczf.O()) {
                return this.d.b().c(str, new msi(this, 2));
            }
            return this.d.b().c(str, albo.D(new msi(this, 3)));
        }
        if (((orj) this.i.b()).a() && lgc.C(str)) {
            return l();
        }
        if (((orj) this.i.b()).a() && lgc.D(str)) {
            return m();
        }
        if (((Optional) this.n.b()).isPresent() && ((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && TextUtils.equals(str, ((vni) ((Optional) this.n.b()).get()).m())) {
            return z();
        }
        if (aczf.O()) {
            return ((mrw) this.e.b()).c(str, new msi(this, 14));
        }
        return ((mrw) this.e.b()).c(str, albo.D(new msi(this, 15)));
    }

    @Override // defpackage.msk
    public final msh o(ParticipantsTable.BindData bindData) {
        if (this.m != 0) {
            return B(bindData, bindData.J());
        }
        return A(bindData, bindData.J());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [mre, java.lang.Object] */
    @Override // defpackage.msk
    public final msh p(String str) {
        if (this.m != 0) {
            if (((orj) this.k.b()).a() && lgc.C(str)) {
                return l();
            }
            if (((orj) this.k.b()).a() && lgc.D(str)) {
                return m();
            }
            if (((Optional) this.n.b()).isPresent() && ((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && TextUtils.equals(str, ((vni) ((Optional) this.n.b()).get()).m())) {
                return z();
            }
            return this.d.b().c(str, albo.D(new msi(this, 9)));
        }
        if (((orj) this.i.b()).a() && lgc.C(str)) {
            return l();
        }
        if (((orj) this.i.b()).a() && lgc.D(str)) {
            return m();
        }
        if (((Optional) this.n.b()).isPresent() && TextUtils.equals(str, ((vni) ((Optional) this.n.b()).get()).m())) {
            return z();
        }
        return ((mrw) this.e.b()).c(str, albo.D(new msi(this, 16)));
    }

    @Override // defpackage.msk
    public final msh q(ParticipantsTable.BindData bindData) {
        if (this.m != 0) {
            return B(bindData, bindData.O());
        }
        return A(bindData, bindData.O());
    }

    @Override // defpackage.msk
    public final msh r(String str) {
        if (this.m != 0) {
            return c(str, new msi(this, 5));
        }
        return ((mrw) this.e.b()).c(str, new msi(this, 10));
    }

    @Override // defpackage.msk
    public final msh s(ParticipantsTable.BindData bindData) {
        if (this.m != 0) {
            return B(bindData, bindData.P());
        }
        return A(bindData, bindData.P());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [apwt, java.lang.Object] */
    @Override // defpackage.msk
    public final msh t(String str, int i) {
        if (this.m != 0) {
            return c(str, new mso(this, i, 1));
        }
        if (((orj) this.i.b()).a() && lgc.C(str)) {
            return l();
        }
        if (((orj) this.i.b()).a() && lgc.D(str)) {
            return m();
        }
        if (((Optional) this.n.b()).isPresent() && ((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && TextUtils.equals(str, ((vni) ((Optional) this.n.b()).get()).m())) {
            return z();
        }
        return c(str, new mso(this, i, 0));
    }

    @Override // defpackage.msk
    public final msh u(msh mshVar) {
        if (this.m != 0) {
            return h(mshVar, ((yjr) this.b.b()).h(albo.ag(mshVar.m())));
        }
        return h(mshVar, ((yjr) this.b.b()).h(albo.ag(mshVar.m())));
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [apwt, java.lang.Object] */
    @Override // defpackage.msk
    public final msh v(msh mshVar) {
        byte[] bArr = null;
        if (this.m != 0) {
            mrl mrlVar = new mrl(this, mshVar, 19, bArr);
            if (((Boolean) mrk.c.e()).booleanValue()) {
                return ((lxe) this.g.b()).h(mshVar, mrlVar);
            }
            return ((lxe) this.g.b()).i(mshVar, (String) mrlVar.get());
        }
        msp mspVar = new msp(this, mshVar, 1, bArr);
        if (((Boolean) mrk.c.e()).booleanValue()) {
            return ((lxe) this.j.b()).h(mshVar, mspVar);
        }
        return ((lxe) this.j.b()).i(mshVar, (String) mspVar.get());
    }

    @Override // defpackage.msk
    public final alog w(List list) {
        if (this.m != 0) {
            alob alobVar = new alob();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                alobVar.h(B(bindData, bindData.O()));
            }
            return alobVar.g();
        }
        alob alobVar2 = new alob();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) it2.next();
            alobVar2.h(A(bindData2, bindData2.O()));
        }
        return alobVar2.g();
    }

    @Override // defpackage.msk
    public final Optional x(ParticipantsTable.BindData bindData) {
        if (this.m != 0) {
            if (d.ao(mrk.t(bindData.P(), bindData.O()))) {
                return Optional.empty();
            }
            return Optional.of(B(bindData, bindData.O()));
        }
        if (d.ao(mrw.t(bindData.P(), bindData.O()))) {
            return Optional.empty();
        }
        return Optional.of(A(bindData, bindData.O()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [mre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [mre, java.lang.Object] */
    @Override // defpackage.msk
    public final alog y(aoia aoiaVar) {
        int i = 0;
        if (this.m != 0) {
            alob alobVar = new alob();
            if (aoiaVar.e()) {
                alog d = aoiaVar.d();
                int i2 = ((alsx) d).c;
                while (i < i2) {
                    alobVar.h(this.d.b().b((qei) d.get(i)));
                    i++;
                }
            } else {
                alobVar.h(this.d.b().b(aoiaVar.b()));
            }
            return alobVar.g();
        }
        alob alobVar2 = new alob();
        if (aoiaVar.e()) {
            alog d2 = aoiaVar.d();
            int i3 = ((alsx) d2).c;
            while (i < i3) {
                alobVar2.h(((mrw) this.e.b()).b((qei) d2.get(i)));
                i++;
            }
        } else {
            alobVar2.h(((mrw) this.e.b()).b(aoiaVar.b()));
        }
        return alobVar2.g();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    public final msh z() {
        int i = 20;
        if (this.m != 0) {
            if (!((Optional) this.n.b()).isEmpty()) {
                vni vniVar = (vni) ((Optional) this.n.b()).get();
                return ((lxe) this.g.b()).j(new msi(vniVar, 6), new msi(vniVar, 6), new msi(vniVar, 7), new msi(vniVar, 6), new msi(vniVar, 6), new mrl(this, vniVar, i), new msi(vniVar, 8), new mrs(12), new mrs(13), new mrs(13));
            }
            throw new UnsupportedOperationException("Penpal bot is not supported.");
        }
        if (!((Optional) this.n.b()).isEmpty()) {
            vni vniVar2 = (vni) ((Optional) this.n.b()).get();
            return ((lxe) this.j.b()).j(new msi(vniVar2, 17), new msi(vniVar2, 17), new msi(vniVar2, 18), new msi(vniVar2, 17), new msi(vniVar2, 17), new msp(this, vniVar2, 0), new msi(vniVar2, 11), new mrs(20), new msn(14), new msn(14));
        }
        throw new UnsupportedOperationException("Penpal bot is not supported.");
    }

    public msq(apwt apwtVar, apwt apwtVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, final armf armfVar5, final apwt apwtVar3, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, apwt apwtVar4, final armf armfVar10, int i) {
        this.m = i;
        msl mslVar = new msl(0);
        this.e = apwtVar;
        this.b = apwtVar2;
        this.j = new mip(mslVar, armfVar);
        this.f = new mip(mslVar, armfVar2);
        this.h = new mip(mslVar, armfVar3);
        this.i = armfVar4;
        this.d = new apwt() { // from class: msm
            @Override // defpackage.apwt
            public final Object b() {
                int i2 = msq.l;
                if (((plp) armf.this.b()).a()) {
                    return (mre) apwtVar3.b();
                }
                return (mre) armfVar5.b();
            }
        };
        this.k = new mip(mslVar, armfVar6);
        this.g = new mip(mslVar, armfVar7);
        new mip(mslVar, armfVar8);
        this.n = new mip(mslVar, armfVar9);
        this.c = apwtVar4;
    }
}
