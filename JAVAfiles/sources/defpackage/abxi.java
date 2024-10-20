package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.wearable.WearableBindService;
import com.google.android.gms.duokit.SetupDuoResponse;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abxi implements acil {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ abxi(Context context, acak acakVar, acit acitVar, SetupDuoResponse setupDuoResponse, int i) {
        this.e = i;
        this.a = context;
        this.b = acakVar;
        this.c = acitVar;
        this.d = setupDuoResponse;
    }

    @Override // defpackage.acil
    public final void d(Exception exc) {
        if (this.e != 0) {
            alhp alhpVar = (alhp) this.b;
            alhpVar.f();
            Duration c = alhpVar.c();
            Object obj = this.c;
            ((WearableBindService) this.a).h("Failed to handle RPC for path", exc, (String) this.d, (String) obj, c);
            return;
        }
        abhx.i(this.a, (acak) this.b, alfd.a);
        ((acit) this.c).b(this.d);
    }

    public /* synthetic */ abxi(WearableBindService wearableBindService, alhp alhpVar, String str, String str2, int i) {
        this.e = i;
        this.a = wearableBindService;
        this.b = alhpVar;
        this.d = str;
        this.c = str2;
    }
}
