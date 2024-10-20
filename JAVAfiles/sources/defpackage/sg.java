package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sg extends se {
    private final String a;

    public sg(String str) {
        this.a = str;
    }

    @Override // defpackage.se
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.a).putExtra("android.intent.extra.TITLE", str);
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.se
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        return intent.getData();
    }

    @Override // defpackage.se
    public final /* bridge */ /* synthetic */ efu c(Context context, Object obj) {
        ((String) obj).getClass();
        return null;
    }

    @armg
    public sg() {
        this("*/*");
    }
}
