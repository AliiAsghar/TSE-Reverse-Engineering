package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sfy extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(Function... functionArr) {
        Object apply;
        sfy[] sfyVarArr = new sfy[2];
        for (int i = 0; i < 2; i++) {
            apply = functionArr[i].apply(new sfy());
            sfyVarArr[i] = (sfy) apply;
        }
        V(sfyVarArr);
    }

    public final void c(long j) {
        U(new agoi("backup_id_map.status", 1, Long.valueOf(j)));
    }

    public final void d(long... jArr) {
        U(new agmf("backup_id_map.status", 3, alzz.as(agnc.m(jArr, Long.class), new abes(16)), true));
    }

    public final void e(agpj agpjVar) {
        U(new agme("backup_id_map.table_name", 1, agpjVar));
    }

    public final void f(String str) {
        U(new agmd("backup_id_map.table_name", 1, str));
    }

    public final void g() {
        U(new agmg("backup_id_map.table_name", 5));
    }
}
