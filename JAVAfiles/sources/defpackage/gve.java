package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gve extends arrm implements arqz {
    public static final gve a = new gve();

    public gve() {
        super(6, gvf.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // defpackage.arqz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        gsb gsbVar = (gsb) obj2;
        gpx gpxVar = (gpx) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        gqg gqgVar = (gqg) obj5;
        gud gudVar = (gud) obj6;
        context.getClass();
        gsbVar.getClass();
        gpxVar.getClass();
        workDatabase.getClass();
        gqgVar.getClass();
        String str = guh.a;
        gwg gwgVar = new gwg(context, workDatabase, gsbVar);
        gzv.a(context, SystemJobService.class, true);
        gsy.a().c(guh.a, "Created SystemJobScheduler and enabled SystemJobService");
        return aqjn.B(gwgVar, new gvu(context, gsbVar, gqgVar, gudVar, new ico(gudVar, gpxVar), gpxVar));
    }
}
