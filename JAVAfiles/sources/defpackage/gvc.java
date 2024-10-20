package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessSentMessageAction;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gvc implements arqg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gvc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [uuf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [apwt, java.lang.Object] */
    @Override // defpackage.arqg
    public final Object a() {
        boolean z = false;
        z = false;
        switch (this.b) {
            case 0:
                gvd gvdVar = (gvd) this.a;
                Context context = gvdVar.c;
                if (Build.VERSION.SDK_INT >= 34) {
                    gwe.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                List e = gwg.e(context, jobScheduler);
                if (e != null && !e.isEmpty()) {
                    Iterator it = e.iterator();
                    while (it.hasNext()) {
                        gwg.f(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                gyt A = gvdVar.e.A();
                gzn gznVar = (gzn) A;
                gznVar.a.k();
                gkp d = gznVar.h.d();
                try {
                    ((gzn) A).a.l();
                    try {
                        d.a();
                        ((gzn) A).a.o();
                        gznVar.h.f(d);
                        guh.a(gvdVar.d, gvdVar.e, gvdVar.f);
                        return arnb.a;
                    } finally {
                        ((gzn) A).a.m();
                    }
                } catch (Throwable th) {
                    gznVar.h.f(d);
                    throw th;
                }
            case 1:
                gzs.a((gup) this.a);
                return arnb.a;
            case 2:
                alwo alwoVar = ilw.a;
                return Boolean.valueOf(((okf) this.a.b()).a());
            case 3:
                inq inqVar = ((inh) this.a).h;
                inqVar.getClass();
                return Boolean.valueOf(inqVar.e().b());
            case 4:
                ixd ixdVar = (ixd) this.a;
                return Long.valueOf(ixdVar.R.a(ixdVar.a(), ixdVar.b()));
            case 5:
                return Long.valueOf(((rsr) ((ixd) this.a).cl.a()).z().mapToLong(new rsh(z ? 1 : 0)).sum());
            case 6:
                return Boolean.valueOf(((rsr) ((ixd) this.a).cl.a()).h);
            case 7:
                throw null;
            case 8:
                return (Boolean) this.a.e();
            case 9:
                ((ixd) this.a).L();
                return arnb.a;
            case 10:
                return Boolean.valueOf(((pqm) this.a.b()).a());
            case 11:
                ?? r0 = this.a;
                if (((Optional) r0.b()).isPresent() && ((kpb) ((Optional) r0.b()).get()).b()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                return ((ProcessSentMessageAction) this.a).b();
            default:
                return Boolean.valueOf(((pcx) ((zlz) this.a).a.b()).a());
        }
    }
}
