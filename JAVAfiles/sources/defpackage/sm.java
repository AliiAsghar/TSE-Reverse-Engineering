package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sm extends se {
    @Override // defpackage.se
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        sd sdVar = (sd) obj;
        sdVar.getClass();
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", sdVar);
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.se
    public final /* synthetic */ Object b(int i, Intent intent) {
        return new ru(i, intent);
    }
}
