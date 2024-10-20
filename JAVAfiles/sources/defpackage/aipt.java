package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aipt extends aiqa {
    final /* synthetic */ String a;

    public aipt(String str) {
        this.a = str;
    }

    @Override // defpackage.aiqa
    protected final int a(Context context, agrk agrkVar, boolean z) {
        if (context.getPackageName().equals(((ProviderInfo) agrkVar.b).packageName)) {
            if (!z) {
                return 2;
            }
            return 1;
        }
        if (z) {
            return 2;
        }
        if (!this.a.equals(((ProviderInfo) agrkVar.b).packageName)) {
            return 3;
        }
        return 1;
    }
}
