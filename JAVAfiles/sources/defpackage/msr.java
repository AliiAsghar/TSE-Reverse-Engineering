package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msr implements msk {
    public final apwt b;
    private final apwt c;
    private final apwt d;

    public msr(apwt apwtVar, apwt apwtVar2, apwt apwtVar3) {
        this.c = apwtVar;
        this.d = apwtVar2;
        this.b = apwtVar3;
    }

    @Override // defpackage.mre
    public final msh a(String str) {
        return ((msb) this.c.b()).a(str);
    }

    @Override // defpackage.mre
    public final msh b(qei qeiVar) {
        return ((msb) this.c.b()).b(qeiVar);
    }

    @Override // defpackage.mre
    public final msh c(String str, alhr alhrVar) {
        return ((msb) this.c.b()).c(str, alhrVar);
    }

    @Override // defpackage.mre
    public final msh d(adit aditVar) {
        return ((msb) this.c.b()).l(((msq) this.d.b()).d(aditVar), new msp(this, aditVar, 6));
    }

    @Override // defpackage.mre
    public final msh e(String str, String str2, String str3, boolean z, String str4, alhr alhrVar) {
        return ((msb) this.c.b()).e(str, str2, str3, z, str4, alhrVar);
    }

    @Override // defpackage.mre
    public final msh f() {
        return ((msb) this.c.b()).f();
    }

    @Override // defpackage.mre
    public final msh g(msh mshVar, alhr alhrVar) {
        return ((msb) this.c.b()).g(mshVar, alhrVar);
    }

    @Override // defpackage.mre
    @Deprecated
    public final msh h(msh mshVar, String str) {
        return ((msb) this.c.b()).h(mshVar, str);
    }

    @Override // defpackage.mre
    public final msh i(msh mshVar, boolean z) {
        return ((msb) this.c.b()).i(mshVar, z);
    }

    @Override // defpackage.mre
    public final msh j(msh mshVar, int i) {
        return ((msb) this.c.b()).j(mshVar, i);
    }

    @Override // defpackage.mre
    public final msh k(msh mshVar) {
        return ((msb) this.c.b()).k(mshVar);
    }

    @Override // defpackage.msk
    public final msh l() {
        return ((msb) this.c.b()).l(((msq) this.d.b()).l(), new msi(this, 19));
    }

    @Override // defpackage.msk
    public final msh m() {
        return ((msb) this.c.b()).l(((msq) this.d.b()).m(), new msi(this, 20));
    }

    @Override // defpackage.msk
    public final msh n(String str) {
        return ((msb) this.c.b()).l(((msq) this.d.b()).n(str), new msp(this, str, 8));
    }

    @Override // defpackage.msk
    public final msh o(ParticipantsTable.BindData bindData) {
        return ((msb) this.c.b()).l(((msq) this.d.b()).o(bindData), new msp(this, bindData, 3));
    }

    @Override // defpackage.msk
    public final msh p(String str) {
        return ((msb) this.c.b()).l(((msq) this.d.b()).p(str), new msp(this, str, 5));
    }

    @Override // defpackage.msk
    public final msh q(ParticipantsTable.BindData bindData) {
        return ((msb) this.c.b()).l(((msq) this.d.b()).q(bindData), new msp(this, bindData, 10));
    }

    @Override // defpackage.msk
    public final msh r(String str) {
        return ((msb) this.c.b()).l(((msq) this.d.b()).r(str), new msp(this, str, 9));
    }

    @Override // defpackage.msk
    public final msh s(ParticipantsTable.BindData bindData) {
        return ((msb) this.c.b()).l(((msq) this.d.b()).s(bindData), new msp(this, bindData, 4));
    }

    @Override // defpackage.msk
    public final msh t(String str, int i) {
        return ((msb) this.c.b()).l(((msq) this.d.b()).t(str, i), new mrm(this, str, i, 3));
    }

    @Override // defpackage.msk
    public final msh u(msh mshVar) {
        return ((msb) this.c.b()).l(((msq) this.d.b()).v(mshVar), new msp(this, mshVar, 2, null));
    }

    @Override // defpackage.msk
    public final msh v(msh mshVar) {
        return ((msb) this.c.b()).l(((msq) this.d.b()).v(mshVar), new msp(this, mshVar, 7, null));
    }

    @Override // defpackage.msk
    public final alog w(List list) {
        alob alobVar = new alob();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            alobVar.h(q((ParticipantsTable.BindData) it.next()));
        }
        return alobVar.g();
    }

    @Override // defpackage.msk
    public final Optional x(ParticipantsTable.BindData bindData) {
        if (d.ao(mrw.t(bindData.P(), bindData.O()))) {
            return Optional.empty();
        }
        return Optional.of(q(bindData));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.msk
    public final alog y(aoia aoiaVar) {
        alob alobVar = new alob();
        if (aoiaVar.e()) {
            alog d = aoiaVar.d();
            int i = ((alsx) d).c;
            for (int i2 = 0; i2 < i; i2++) {
                alobVar.h(((msb) this.c.b()).b((qei) d.get(i2)));
            }
        } else {
            alobVar.h(((msb) this.c.b()).b(aoiaVar.b()));
        }
        return alobVar.g();
    }
}
