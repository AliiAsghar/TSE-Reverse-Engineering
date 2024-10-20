package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afiq extends si {
    final /* synthetic */ cj a;
    final /* synthetic */ afip b;

    public afiq(cj cjVar, afip afipVar) {
        this.a = cjVar;
        this.b = afipVar;
    }

    @Override // defpackage.si, defpackage.se
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        return a(context, (String) obj);
    }

    @Override // defpackage.si
    /* renamed from: d */
    public final Intent a(Context context, String str) {
        str.getClass();
        cj cjVar = this.a;
        Intent a = super.a(context, str);
        cjVar.getPackageManager().getClass();
        a.putExtra("android.intent.extra.MIME_TYPES", (String[]) this.b.a.toArray(new String[0]));
        return a;
    }
}
