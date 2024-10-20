package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.internal.IFeedbackService;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyh extends abyk {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Context e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abyh(abrg abrgVar, FeedbackOptions feedbackOptions, Context context, long j) {
        super(abrgVar);
        this.a = feedbackOptions;
        this.e = context;
        this.f = j;
    }

    @Override // defpackage.abry
    protected final /* bridge */ /* synthetic */ void b(abqu abquVar) {
        String str;
        abyr abyrVar = (abyr) abquVar;
        abmr abmrVar = this.a.t;
        if (abmrVar != null) {
            Context context = this.e;
            long j = this.f;
            abmr.s(new abys(context, abmrVar, j, 1));
            abmr.s(new abys(context, abmrVar, j, 0));
        }
        FeedbackOptions feedbackOptions = this.a;
        long j2 = this.f;
        abmr.r(feedbackOptions);
        aozy createBuilder = acbf.a.createBuilder();
        String str2 = feedbackOptions.g;
        if (!TextUtils.isEmpty(str2)) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            acbf acbfVar = (acbf) createBuilder.b;
            str2.getClass();
            acbfVar.b |= 2;
            acbfVar.d = str2;
        } else {
            String packageName = abyrVar.a.getApplicationContext().getPackageName();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            acbf acbfVar2 = (acbf) createBuilder.b;
            packageName.getClass();
            acbfVar2.b |= 2;
            acbfVar2.d = packageName;
        }
        try {
            str = abyrVar.a.getPackageManager().getPackageInfo(((acbf) createBuilder.b).d, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (str != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            acbf acbfVar3 = (acbf) createBuilder.b;
            acbfVar3.c |= 2;
            acbfVar3.k = str;
        }
        String str3 = feedbackOptions.a;
        if (!TextUtils.isEmpty(str3) && !str3.equals("anonymous")) {
            String num = Integer.toString(new Account(str3, "com.google").name.toLowerCase(Locale.ENGLISH).hashCode());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            acbf acbfVar4 = (acbf) createBuilder.b;
            num.getClass();
            acbfVar4.b |= 4;
            acbfVar4.e = num;
        }
        String str4 = feedbackOptions.n;
        if (str4 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            acbf acbfVar5 = (acbf) createBuilder.b;
            acbfVar5.b |= 64;
            acbfVar5.g = str4;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        acbf acbfVar6 = (acbf) createBuilder.b;
        acbfVar6.b |= 16;
        acbfVar6.f = "feedback.android";
        int i = abqa.b;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        acbf acbfVar7 = (acbf) createBuilder.b;
        acbfVar7.b |= 1073741824;
        acbfVar7.j = i;
        long currentTimeMillis = System.currentTimeMillis();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        acbf acbfVar8 = (acbf) apagVar;
        acbfVar8.b |= 16777216;
        acbfVar8.i = currentTimeMillis;
        if (feedbackOptions.m != null || feedbackOptions.f != null) {
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            acbf acbfVar9 = (acbf) createBuilder.b;
            acbfVar9.c |= 16;
            acbfVar9.n = true;
        }
        Bundle bundle = feedbackOptions.b;
        if (bundle != null && !bundle.isEmpty()) {
            int size = feedbackOptions.b.size();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            acbf acbfVar10 = (acbf) createBuilder.b;
            acbfVar10.c |= 4;
            acbfVar10.l = size;
        }
        List list = feedbackOptions.h;
        if (list != null && !list.isEmpty()) {
            int size2 = feedbackOptions.h.size();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            acbf acbfVar11 = (acbf) createBuilder.b;
            acbfVar11.c |= 8;
            acbfVar11.m = size2;
        }
        aozy builder = ((acbf) createBuilder.s()).toBuilder();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        acbf acbfVar12 = (acbf) builder.b;
        acbfVar12.h = 164;
        acbfVar12.b |= 256;
        acbf acbfVar13 = (acbf) builder.s();
        Context context2 = abyrVar.a;
        if (acbfVar13.d.isEmpty()) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires appPackageName to be set");
        }
        if (acbfVar13.g.isEmpty()) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires sessionId to be set");
        }
        if (acbfVar13.f.isEmpty()) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires flow to be set");
        }
        if (acbfVar13.j <= 0) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires clientVersion to be set");
        }
        if (acbfVar13.i <= 0) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires timestamp to be set");
        }
        int p = apsd.p(acbfVar13.h);
        if (p == 0 || p == 1) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires user action type to be set");
        }
        context2.sendBroadcast(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$GmsExternalReceiver").setAction("com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.LOG_METRIC").putExtra("EXTRA_METRIC_DATA", acbfVar13.toByteArray()));
        ((IFeedbackService) abyrVar.w()).startFeedbackWithTimestamp(new ErrorReport(feedbackOptions, abyrVar.a.getCacheDir()), j2);
        j(Status.a);
    }
}
