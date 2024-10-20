package defpackage;

import android.content.pm.ProviderInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akcn extends akci {
    public akcn(ProviderInfo providerInfo, Throwable th) {
        super("Provider exists, but could not be obtained: ".concat(providerInfo.toString()), th);
    }
}
