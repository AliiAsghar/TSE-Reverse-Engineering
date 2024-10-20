package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rpm implements rpi {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/datamodel/backup/restore/DefaultBatchedRestoreTableWriterWorkflowSteps");
    public final rpj a;
    private final rpe c;
    private final armf d;
    private final Map e;
    private final Map f;
    private final Set g;
    private final int h;

    public /* synthetic */ rpm(rpe rpeVar, rpj rpjVar, armf armfVar, Map map, Map map2, Set set, int i, int i2) {
        map2 = (i2 & 16) != 0 ? arnw.a : map2;
        set = (i2 & 32) != 0 ? arnx.a : set;
        i = (i2 & 64) != 0 ? 2 : i;
        armfVar.getClass();
        map.getClass();
        map2.getClass();
        set.getClass();
        if (i != 0) {
            this.c = rpeVar;
            this.a = rpjVar;
            this.d = armfVar;
            this.e = map;
            this.f = map2;
            this.g = set;
            this.h = i;
            return;
        }
        throw null;
    }

    private final agpc h(agpc agpcVar, sfs... sfsVarArr) {
        sfw sfwVar = new sfw(sfz.a);
        if (sfsVarArr.length != 0 && this.h != 1) {
            sfwVar.c((sfs[]) Arrays.copyOf(sfsVarArr, 1));
        } else {
            sfwVar.s();
        }
        sfwVar.d(new rpf(this, 5));
        agog b2 = agoh.b(sfwVar.b(), (agmh) sfz.d.e, this.c.a());
        b2.f = "batch_limiter";
        return agpcVar.j(b2);
    }

    @Override // defpackage.rpi
    public final int a() {
        sfw sfwVar = new sfw(sfz.a);
        sfwVar.d(new rpf(this, 6));
        return sfwVar.b().i();
    }

    @Override // defpackage.rpi
    public final void b(agpc agpcVar) {
        if (agpcVar == null) {
            rpe rpeVar = this.c;
            agpc b2 = rpeVar.b();
            b2.s();
            b2.n(new agpk("$V", new Object[]{rpeVar.a()}), "backup_id");
            agpcVar = b2;
        }
        agpcVar.n(new agpk("-1", new Object[0]), "bugle_id");
        vom.u(agpcVar, this.a.b(), 0L, 4);
    }

    @Override // defpackage.rpi
    public final void c() {
        int u;
        int i = 0;
        for (agpc agpcVar : (Iterable) this.d.b()) {
            int i2 = aruw.a;
            long b2 = aruw.b();
            u = vom.u(h(agpcVar, new sfs[0]), this.a.b(), -1L, 5);
            long b3 = arux.b(b2);
            alvw d = b.d();
            d.X(alwp.a, "BugleBackup");
            ((alvg) d.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/DefaultBatchedRestoreTableWriterWorkflowSteps", "findAndMarkDuplicates", 133, "DefaultBatchedRestoreTableWriterWorkflowSteps.kt")).K("[%s] Duplicate query [%s] found [%s] dupes in [%d] ms", this.a.d(), Integer.valueOf(i), Integer.valueOf(u), Long.valueOf(arut.g(b3)));
            i++;
        }
    }

    @Override // defpackage.rpi
    public final void d() {
        rpe rpeVar = this.c;
        agpc b2 = rpeVar.b();
        if (this.e.isEmpty()) {
            b2.s();
        } else {
            b2 = rpeVar.c(b2, aqjn.ax(this.e.keySet()));
        }
        agpc h = h(b2, (sfs) sfz.d.f);
        for (arny arnyVar : aqjn.V(this.g)) {
            rpn rpnVar = (rpn) arnyVar.b;
            if (rpnVar.d) {
                h.C(vom.w(rpnVar.a, rpnVar.c, "fk_map_" + arnyVar.a, true, 8));
            } else {
                h.j(vom.w(rpnVar.a, rpnVar.c, "fk_map_" + arnyVar.a, false, 24));
            }
        }
        for (Map.Entry entry : this.f.entrySet()) {
            h.n((agpj) entry.getValue(), String.valueOf(((agmh) entry.getKey()).d()).concat("_expression"));
        }
        agoz b3 = h.b();
        agof c = this.a.c();
        aron aronVar = new aron((byte[]) null);
        aronVar.addAll(this.e.values());
        if (this.h == 2) {
            aronVar.add(this.c.a());
        }
        Set set = this.g;
        ArrayList arrayList = new ArrayList(aqjn.J(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((rpn) it.next()).b);
        }
        aronVar.addAll(arrayList);
        aronVar.addAll(this.f.keySet());
        agmh[] agmhVarArr = (agmh[]) aqjn.x(aronVar).toArray(new agmh[0]);
        c.b((agmh[]) Arrays.copyOf(agmhVarArr, agmhVarArr.length));
        c.c = b3;
        int a = c.a().a();
        alvw d = b.d();
        d.X(alwp.a, "BugleBackup");
        ((alvg) d.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/DefaultBatchedRestoreTableWriterWorkflowSteps", "performBugleInsert", 205, "DefaultBatchedRestoreTableWriterWorkflowSteps.kt")).B("[%s] Inserted [%d] rows.", this.a.d(), a);
    }

    @Override // defpackage.rpi
    public final void f() {
        Object apply;
        sfx sfxVar = new sfx();
        apply = new rpf(this, 7).apply(new sfy());
        sfxVar.Z(new agpw((sfy) apply));
        sfxVar.a.put("status", (Long) 2L);
        sfxVar.a().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, agpj] */
    @Override // defpackage.rpi
    public final void g(int i, agpj agpjVar) {
        String str;
        long a = this.a.a();
        int i2 = 2;
        if (agpjVar == null) {
            String d = this.a.d();
            rpo rpoVar = rpk.a;
            sfw sfwVar = new sfw(sfz.a);
            usk uskVar = sfz.d;
            sfwVar.c((sfs) uskVar.e, (sfs) uskVar.b);
            sfwVar.y(sfz.d.b);
            sfwVar.d(new rpf(d, i2));
            sfwVar.u(i);
            agpjVar = sfwVar.b();
        }
        Long valueOf = Long.valueOf(a);
        if (this.h - 1 != 1) {
            str = "ROW_NUMBER() OVER ()";
        } else {
            str = "ROW_NUMBER() OVER (ORDER BY _id)";
        }
        vom.v(new agpk("WITH batch AS $V SELECT batch.backup_id AS backup_id, $V + $R AS bugle_id, $V AS table_name, $V AS status FROM batch", new Object[]{agpjVar, valueOf, str, this.a.d(), 1L}), 5);
    }

    @Override // defpackage.rpi
    public final /* synthetic */ void e() {
    }
}
