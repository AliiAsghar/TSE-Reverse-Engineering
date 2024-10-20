package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjk implements abrm {
    public final UsageReportingOptInOptions a;
    private final Status b;

    public acjk(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        this.b = status;
        this.a = usageReportingOptInOptions;
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this.b;
    }

    public final String toString() {
        boolean z;
        abhg.m(this.a);
        if (this.a.a == 1) {
            z = true;
        } else {
            z = false;
        }
        return String.format("OptInOptionsResultImpl[%s]", Boolean.valueOf(z));
    }
}
