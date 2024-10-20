package defpackage;

import android.content.Intent;
import com.google.android.ims.rcsservice.events.Event;
import j$.util.Optional;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mac implements mek {
    static final uuf a = uuh.f(uuh.b, "AppEventMaxRows", 300);
    public static final /* synthetic */ int c = 0;
    public final Executor b;
    private final xnv d;
    private final armf e;
    private sne f;

    public mac(anen anenVar, xnv xnvVar, armf armfVar) {
        this.b = new anew(anenVar);
        this.d = xnvVar;
        this.e = armfVar;
    }

    @Override // defpackage.mek
    public final int a() {
        if (!((Boolean) utw.Y.e()).booleanValue()) {
            return 0;
        }
        sxj sxjVar = new sxj(sxl.a);
        sxjVar.w("AppEventLoggerImpl#cleanup-messages");
        long l = sxjVar.b().l((agmh) sxl.d.f);
        sqb sqbVar = new sqb(sqd.a);
        sqbVar.w("AppEventLoggerImpl#cleanup-events");
        long max = Math.max(sqbVar.b().k((agmh) sqd.d.d) - ((Long) a.e()).longValue(), 0L);
        spz spzVar = new spz();
        spzVar.f("AppEventLoggerImpl#cleanup#events1");
        spzVar.b(new ilg(max, 9));
        int d = spzVar.d();
        spz spzVar2 = new spz();
        spzVar2.f("AppEventLoggerImpl#cleanup#events2");
        spzVar2.b(new ilg(l, 10));
        int d2 = d + spzVar2.d();
        ((ykw) this.e.b()).j("events_cleaup_rows_deleted", d2);
        ((ykw) this.e.b()).k("message_status_cleaup_time_millis", this.d.f().toEpochMilli());
        return d2;
    }

    @Override // defpackage.mek
    public final meo b() {
        meo meoVar = new meo();
        sqb sqbVar = new sqb(sqd.a);
        sqbVar.w("AppEventLoggerImpl#getRowCount");
        sqbVar.q();
        meoVar.a = sqbVar.b().i();
        sqb sqbVar2 = new sqb(sqd.a);
        sqbVar2.w("AppEventLoggerImpl#getSizeEstimate");
        sqbVar2.q();
        spy spyVar = (spy) sqbVar2.b().n();
        int i = 0;
        while (true) {
            try {
                spw spwVar = (spw) spyVar.cM();
                if (spwVar != null) {
                    i += spwVar.a().length();
                } else {
                    spyVar.close();
                    meoVar.b = i;
                    sqb sqbVar3 = new sqb(sqd.a);
                    sqbVar3.w("AppEventLoggerImpl-getEarliestTimestamp");
                    meoVar.c = sqbVar3.b().l((agmh) sqd.d.c);
                    meoVar.d = ((ykw) this.e.b()).e("message_status_cleaup_time_millis", 0L);
                    meoVar.e = ((ykw) this.e.b()).d("events_cleaup_rows_deleted", 0);
                    return meoVar;
                }
            } catch (Throwable th) {
                try {
                    spyVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.mek
    public final void c() {
        snf e = sni.e();
        e.w("AppEventLoggerImpl#init");
        e.e(new lvo(6));
        sne b = e.b();
        this.f = b;
        b.E(new mab(this));
    }

    @Override // defpackage.mek
    public final void d(Intent intent) {
        String uri;
        mej mejVar;
        if (intent.getBooleanExtra("noConnectivity", false)) {
            mejVar = mej.NO_CONNECTIVITY;
            uri = null;
        } else {
            uri = intent.toUri(0);
            mejVar = mej.CONNECTIVITY_CHANGED;
        }
        e(mejVar, Optional.ofNullable(uri));
    }

    @Override // defpackage.mek
    public final void e(mej mejVar, Optional optional) {
        qiu.h(utw.Y.b().i(new actl(this, mejVar, this.d.f().toEpochMilli(), optional, 1), andi.a));
    }

    @Override // defpackage.mek
    public final void f(Event event) {
        int i = event.h;
        if (i != 50050 && i != 50070) {
            e(mej.RCS_EVENT, Optional.of(i + " " + event.i));
        }
    }

    @Override // defpackage.mek
    public final byte[] g() {
        Object apply;
        aoza aozaVar = new aoza();
        PrintWriter printWriter = new PrintWriter((OutputStream) aozaVar, true);
        sqb sqbVar = new sqb(sqd.a);
        sqbVar.w("AppEventLoggerImpl-dump");
        apply = new lvo(5).apply(sqd.d);
        spx[] spxVarArr = (spx[]) apply;
        int c2 = a.bp().c();
        Integer.valueOf(c2).getClass();
        for (spx spxVar : spxVarArr) {
            if (((Integer) sqd.b.getOrDefault(spxVar.toString(), -1)).intValue() > c2) {
                agnc.t("columnReference.toString()", c2);
            }
        }
        sqbVar.m(spxVarArr);
        sqbVar.q();
        spy spyVar = (spy) sqbVar.b().n();
        while (spyVar.moveToNext()) {
            try {
                printWriter.append((CharSequence) Long.toString(spyVar.e())).append('\t').append((CharSequence) Integer.toString(spyVar.f().p)).append('\t');
                if (spyVar.g() != null) {
                    printWriter.append((CharSequence) spyVar.g());
                }
                printWriter.append('\n');
            } catch (Throwable th) {
                try {
                    spyVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        spyVar.close();
        printWriter.flush();
        byte[] H = aozaVar.b().H();
        printWriter.close();
        return advr.x(H, 524288);
    }
}
