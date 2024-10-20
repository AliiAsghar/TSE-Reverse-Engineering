package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.reportissue.ReportIssueReceiver;
import j$.util.Map;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class luj {
    private static final xze d = xze.g("Bugle", "ReportIssueIntentsImpl");
    public final Context a;
    public final armf b;
    public final armf c;

    public luj(Context context, armf armfVar, armf armfVar2) {
        this.a = context;
        this.b = armfVar;
        this.c = armfVar2;
    }

    public static ksp b(amme ammeVar, Throwable th, alor alorVar) {
        ksw kswVar = new ksw(null, null);
        kswVar.b = Optional.ofNullable(th);
        kswVar.c = Optional.ofNullable(alorVar);
        kswVar.f(amek.BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_GENERIC);
        kswVar.a = Optional.of(ammeVar);
        return kswVar.e();
    }

    public static boolean c(amme ammeVar) {
        if (((Boolean) ktf.a.e()).booleanValue() && !ammeVar.equals(amme.SILENT_CRASH)) {
            return true;
        }
        return false;
    }

    private static aozy f(int i, amme ammeVar) {
        aozy createBuilder = ammf.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ammf ammfVar = (ammf) apagVar;
        ammfVar.c = 2;
        ammfVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        ammf ammfVar2 = (ammf) apagVar2;
        ammfVar2.e = i - 1;
        ammfVar2.b |= 4;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        ammf ammfVar3 = (ammf) createBuilder.b;
        ammfVar3.d = ammeVar.o;
        ammfVar3.b |= 2;
        return createBuilder;
    }

    public final PendingIntent a(amme ammeVar) {
        Context context = this.a;
        lqn f = lqn.f(context, ReportIssueReceiver.class, "android.intent.action.VIEW");
        f.c(context.getPackageName());
        Intent a = f.a();
        a.setAction("com.google.android.apps.messaging.shared.reportissue.DISMISS_NOTIFICATION");
        aozy createBuilder = ammf.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ammf ammfVar = (ammf) apagVar;
        ammfVar.c = 4;
        ammfVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ammf ammfVar2 = (ammf) createBuilder.b;
        ammfVar2.d = ammeVar.o;
        ammfVar2.b |= 2;
        aowt.h(a, "report_issue_event_type", (ammf) createBuilder.s());
        return PendingIntent.getBroadcast(this.a, 0, a, 201326592);
    }

    public final PendingIntent d(String str, int i, amme ammeVar, Throwable th, alor alorVar) {
        int i2 = 0;
        if (c(ammeVar) && ((Boolean) ktf.d.e()).booleanValue()) {
            Intent b = kor.b(this.a, b(ammeVar, th, alorVar));
            b.setAction(str);
            aowt.h(b, "report_issue_event_type", (ammf) f(i, ammeVar).s());
            return PendingIntent.getActivity(this.a, 0, b, 201326592);
        }
        Context context = this.a;
        lqn f = lqn.f(context, ReportIssueReceiver.class, "android.intent.action.VIEW");
        f.c(context.getPackageName());
        f.b(str);
        Intent a = f.a();
        if (th != null) {
            a.putExtra("throwable", th);
        }
        if (alorVar != null) {
            Bundle bundle = new Bundle();
            Map.EL.forEach(alorVar, new lui(bundle, i2));
            a.putExtra("psd_map", bundle);
        }
        aowt.h(a, "report_issue_event_type", (ammf) f(i, ammeVar).s());
        return PendingIntent.getBroadcast(this.a, 0, a, 201326592);
    }

    public final ammf e(Intent intent, String str, int i) {
        try {
            return (ammf) aowt.c(intent, str, ammf.a, aozs.a());
        } catch (apba e) {
            d.r("Failed to parse ReportIssueEvent", e);
            aozy createBuilder = ammf.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ammf ammfVar = (ammf) createBuilder.b;
            ammfVar.c = i - 1;
            ammfVar.b |= 1;
            return (ammf) createBuilder.s();
        }
    }
}
