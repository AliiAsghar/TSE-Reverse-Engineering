package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahje implements ahiw {
    final /* synthetic */ algw a;
    final /* synthetic */ Context b;

    public ahje(algw algwVar, Context context) {
        this.a = algwVar;
        this.b = context;
    }

    @Override // defpackage.ahiw
    public final void a(String str, int i) {
        if (i == 1) {
            Context context = this.b;
            Intent intent = new Intent(context, (Class<?>) ((alha) this.a).a);
            intent.putExtra("key", str);
            context.startForegroundService(intent);
        }
    }

    @Override // defpackage.ahiw
    public final void b(String str, int i) {
        if (i == 0) {
            Context context = this.b;
            Intent intent = new Intent(context, (Class<?>) ((alha) this.a).a);
            intent.putExtra("stop-service", true);
            intent.putExtra("key", str);
            context.startForegroundService(intent);
        }
    }
}
