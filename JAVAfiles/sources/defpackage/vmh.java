package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vmh implements vkc {
    final /* synthetic */ Context a;
    final /* synthetic */ armf b;
    private final /* synthetic */ int c;

    public vmh(Context context, armf armfVar, int i) {
        this.c = i;
        this.a = context;
        this.b = armfVar;
    }

    @Override // defpackage.vkc
    public final akul a(wng wngVar, Intent intent, Bundle bundle, vkv vkvVar) {
        if (this.c != 0) {
            return vmg.a(this.a, wngVar, bundle, intent, this.b);
        }
        return vmg.a(this.a, wngVar, bundle, intent, this.b);
    }
}
