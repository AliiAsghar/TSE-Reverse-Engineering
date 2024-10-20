package defpackage;

import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjc extends acjf {
    final /* synthetic */ UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener a;
    final /* synthetic */ abrc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acjc(abrc abrcVar, acit acitVar, UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener) {
        super(acitVar);
        this.a = usageReportingOptInOptionsChangedListener;
        this.b = abrcVar;
    }

    @Override // defpackage.abrz
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ((acjg) this.b.e).a = this.a;
        this.c.b(null);
    }
}
