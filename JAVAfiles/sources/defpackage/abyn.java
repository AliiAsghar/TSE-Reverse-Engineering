package defpackage;

import android.app.ApplicationErrorReport;
import android.text.TextUtils;
import com.google.android.gms.feedback.FeedbackOptions;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyn extends abym {
    public abyn() {
        this.h = new ApplicationErrorReport();
        this.h.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.h.crashInfo.throwLineNumber = -1;
    }

    @Override // defpackage.abym
    public final FeedbackOptions a() {
        abhg.m(this.h.crashInfo.exceptionClassName);
        abhg.m(this.h.crashInfo.throwClassName);
        abhg.m(this.h.crashInfo.throwMethodName);
        abhg.m(this.h.crashInfo.stackTrace);
        if (TextUtils.isEmpty(this.h.crashInfo.throwFileName)) {
            this.h.crashInfo.throwFileName = "unknown";
        }
        FeedbackOptions a = super.a();
        a.d.crashInfo = this.h.crashInfo;
        a.g = null;
        return a;
    }

    public abyn(Throwable th) {
        this.h = new ApplicationErrorReport();
        this.h.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.h.crashInfo.throwLineNumber = -1;
        this.h.crashInfo = new ApplicationErrorReport.CrashInfo(th);
    }
}
