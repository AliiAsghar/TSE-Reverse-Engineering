package defpackage;

import android.content.Context;
import android.database.Cursor;
import com.google.android.apps.messaging.R;
import java.io.File;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qtq extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtq(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object, arqg] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                qtr qtrVar = (qtr) this.a;
                for (Object obj : qtrVar.a) {
                    if (qtrVar.b.values().contains(((qtp) obj).a)) {
                        arrayList.add(obj);
                    }
                }
                return aqjn.aE(arrayList);
            case 1:
                ArrayList arrayList2 = new ArrayList();
                qtr qtrVar2 = (qtr) this.a;
                for (Object obj2 : qtrVar2.a) {
                    if (!qtrVar2.b.values().contains(((qtp) obj2).a)) {
                        arrayList2.add(obj2);
                    }
                }
                return aqjn.aE(arrayList2);
            case 2:
                return Boolean.valueOf(((qva) this.a).a.a.isEmpty());
            case 3:
                ((rkb) ((rjx) this.a).i.b()).a().z("VACUUM");
                return arnb.a;
            case 4:
                return "File " + ((File) this.a).getPath() + " does not exist";
            case 5:
                return String.valueOf(this.a).concat(" is not located in the app database directory");
            case 6:
                return qjh.g((akul) this.a);
            case 7:
                return ((uaj) this.a).a.getString(R.string.tombstone_details_text);
            case 8:
                return yyb.bs(((uaj) this.a).a);
            case 9:
                ((agnw) ((uck) this.a).b.b()).z("ANALYZE");
                return arnb.a;
            case 10:
                alvw g = uck.a.g();
                g.X(alwp.a, "BugleDatabase");
                ((alvg) g.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin$checkpointWal$checkpointTimeMs$1", "invoke", 144, "DatabaseMaintenancePlugin.kt")).q("Checkpointing the Write Ahead Log");
                Cursor g2 = ((agnw) ((uck) this.a).b.b()).g("pragma wal_checkpoint(FULL)", null);
                g2.moveToFirst();
                if (g2.getInt(0) == 1) {
                    alvw h = uck.a.h();
                    h.X(alwp.a, "BugleDatabase");
                    ((alvg) h.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin$checkpointWal$checkpointTimeMs$1", "invoke", 151, "DatabaseMaintenancePlugin.kt")).q("DB was busy during checkpoint.");
                }
                return arnb.a;
            case 11:
                ((uck) this.a).c.readLock().lock();
                return arnb.a;
            case 12:
                alvw g3 = uck.a.g();
                g3.X(alwp.a, "BugleDatabase");
                ((alvg) g3.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "analyze", 158, "DatabaseMaintenancePlugin.kt")).q("Analyzing the database");
                Object obj3 = this.a;
                qtq qtqVar = new qtq(obj3, 9);
                uck uckVar = (uck) obj3;
                long f = uckVar.f(qtqVar);
                alvw g4 = uck.a.g();
                g4.X(alwp.a, "BugleDatabase");
                ((alvg) g4.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "analyze", 160, "DatabaseMaintenancePlugin.kt")).s("sqlite_stat1 updated in %dms.", f);
                ((agnw) uckVar.b.b()).z("DROP TABLE IF EXISTS foo_for_testing");
                ((agnw) uckVar.b.b()).z("CREATE TABLE foo_for_testing (foo, bar)");
                ((agnw) uckVar.b.b()).z("ANALYZE foo_for_testing");
                ((agnw) uckVar.b.b()).z("DROP TABLE IF EXISTS foo_for_testing");
                return arnb.a;
            case 13:
                Object obj4 = this.a;
                long f2 = ((uck) obj4).f(new qtq(obj4, 10));
                alvw g5 = uck.a.g();
                g5.X(alwp.a, "BugleDatabase");
                ((alvg) g5.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "checkpointWal", 154, "DatabaseMaintenancePlugin.kt")).s("Checkpoint completed in %dms.", f2);
                return arnb.a;
            case 14:
                ((uck) this.a).c.writeLock().lock();
                return arnb.a;
            case 15:
                this.a.a();
                return arnb.a;
            case 16:
                ((alvg) uet.a.d().h("com/google/android/apps/messaging/shared/datamodel/media/VCardCallbackFlow$get$1$2", "invoke", 36, "VCardCallbackFlow.kt")).q("Unbinding listener to vcard");
                ((rqz) this.a).f("createVCardContentUiData");
                return arnb.a;
            case 17:
                ascd a = ascy.a(arnw.a);
                uoz uozVar = (uoz) this.a;
                qjh.l(uozVar.e, null, new tyi(uozVar, a, (arpe) null, 11), 3);
                return a;
            case 18:
                aiut.b();
                znj znjVar = (znj) ((uoz) this.a).c.b();
                aiwl a2 = wus.a();
                a2.i(wuk.PWQ_SCHEDULER_MIGRATION);
                a2.k(upc.a);
                return znjVar.ab(a2.f());
            case 19:
                return new File(((Context) this.a).getApplicationContext().getFilesDir(), "datastore/emotify.pb");
            default:
                return new uya((uyc) this.a);
        }
    }
}
