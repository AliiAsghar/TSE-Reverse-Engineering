package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class acmn {
    public static ContentResolver a;
    protected final String b;
    protected final Object c;

    /* JADX INFO: Access modifiers changed from: protected */
    public acmn(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static void b(Context context) {
        a = context.getContentResolver();
    }

    public static acmn c(String str) {
        return new acml(str, false);
    }

    public abstract Object a();
}
