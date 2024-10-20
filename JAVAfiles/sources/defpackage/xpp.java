package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileOutputStream;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class xpp {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final armf b;
    public final anen c;
    public final Context d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public xpp(armf armfVar, anen anenVar, Context context) {
        this.b = armfVar;
        this.c = anenVar;
        this.d = context;
    }

    public final void a(String str, FileOutputStream fileOutputStream) {
        fileOutputStream.close();
        this.e.remove(str);
    }
}
